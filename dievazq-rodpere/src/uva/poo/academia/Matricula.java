package uva.poo.academia;

/**
 * Implementa la inscripcion de un alumno en un curso concreto. Cada matricula tiene un numero unico 
 * y puede estar pagada o pendiente de pago (estado inicial). Mantiene la lista de inscripciones sin pagar.
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class Matricula {
	
	private int num;
	private Alumno alumno;
	private Curso curso;
	private Boolean pagado;
	
	/**
	 * Constructor de la clase. Inicializa el valor del atributo 'pagado' a false, siendo el estado de pago 
	 * de la matricula el de 'pendiente'.
	 * 
	 * @param num inicializa el atributo 'num' al valor pasado por este parametro.
	 * @param alumno inicializa el atributo 'alumno' al valor pasado por este parametro.
	 * @param curso inicializa el atributo 'curso' al valor pasado por este parametro.
	 */
    public Matricula(int numero, Alumno alumno, Curso curso) {
	
		this.num = numero;
		this.alumno = alumno;
		this.curso = curso;
		pagado = false;
		alumno.anadirMatricula(this);
		curso.anadirMatricula(this);
    }

    /**
	 * Metodo getter para obtener el numero de matricula.
	 * 
	 * @return devuelve el numero de matricula 
	 */
	public int getNum() {
		return num;
	}
	
	/**
	 * Metodo getter para obtener el alumno matriculado.
	 * 
	 * @return devuelve el alumno 
	 */
	public Alumno getAlumno() {
		return alumno;
	}
	
	/**
	 * Metodo getter para obtener el curso de la matricula.
	 * 
	 * @return devuelve el curso
	 */	
	public Curso getCurso() {
		return curso;
	}
	
	/**
	 * Metodo getter para obtener el estado de pago de la matricula. 
	 * Sera false si esta pendiente y true si esta pagada.
	 * 
	 * @return devuelve true si la matricula ha sido pagada y false si no lo ha sido.
	 */	
	public Boolean getPagado() {
		return pagado;
	}

	/**
	 * Metodo setter para modificar el estado de pago de la matricula. 
	 * Sera false si esta pendiente y true si esta pagada.
	 * 
	 * @param pagado modifica el atributo 'pagado' al valor pasado por este parametro. Sera false si esta pendiente y true si esta pagada.
	 */
	public void pagarMatricula() {
		pagado = true;
	}
	
	// MODIFICAR LOS METODOS DE ABAJO
	/**
	 * Comprueba si un alumno se encuentra matriculado en curso. Si en la lista de alumnos del curso dado se encuentra 
	 * un alumno con el mismo valor de DNI que el alumno dado se considera que el alumno dado ya se encuentra matriculado
	 * y devuelve {@code True}, en caso contrario, no se encuentra matriculado en tal curso y devuelve {@code False}.
	 * 
	 * @param alumno es el alumno que se quiere comprobar si esta matriculado en un determinado curso.
	 * @param curso es el curso en el que se quiere comprobar si un alumno determinado ya esta matriculado.
	 * @return {@code True} si el alumno dado ya se encuentra matriculado en el curso, {@code False} si no lo esta.
	 */
	public Boolean comprobarDuplicadoMatricula(Alumno alumno, Curso curso) {

		for (int i=0; i < curso.getAlumnos(getMatriculas()).size(); i++) {
			if (alumno.getDNI() == curso.getAlumnos(getMatriculas()).get(i).getDNI())
				return true;
		}
		return false;
	}
	
	/**
	 * Comprueba si la matricula de un nuevo alumno en un determinado curso sobrepasaria el numero maximo de alumnos 
	 * de ese curso. Devuelve {@code True} si lo sobrepasase y {@code False} si no lo hace.
	 * 
	 * @param curso es el curso del que se quiere comprobar si la inscripcion de un nuevo alumno sobrepasaria su numero maximo de alumnos permitido.
	 * @return {@code True} si el numero maximo de alumnos en el curso es sobrepasado, {@code False} si no lo es.
	 */
	public Boolean comprobarMaxAlumnos(Curso curso) {
		
		if ( (curso.getNumAlumnos(getMatriculas()) + 1) <= curso.getNumMaxAlumnos() )
			return false;
		else
			return true;
	}
}
