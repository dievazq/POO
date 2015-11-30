package academia;

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


	// GETTERS
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
	

	// SETTERS
	/**
	 * Metodo setter para modificar el estado de pago de la matricula. 
	 * Sera false si esta pendiente y true si esta pagada.
	 * 
	 * @param pagado modifica el atributo 'pagado' al valor pasado por este parametro. Sera false si esta pendiente y true si esta pagada.
	 */
	public void setPagado() {
		pagado = true;
	}
	
	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	public String toString() {
		
		return "nº: " + num + ", Alumno: " + alumno.getNombre() + ", Curso: " + curso.getID() + ", Pagado: " + pagado;
	}
}
