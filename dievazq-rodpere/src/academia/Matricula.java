package academia;

import java.util.ArrayList;

/**
 * @author Rodrigo Pérez Hidalgo y Diego Vázquez Blanco.
 * 
 * Implementa la inscripción de un alumno en un curso concreto. Cada matrícula tiene un número único 
 * y puede estar pagada o pendiente de pago (estado inicial). Mantiene la lista de inscripciones sin pagar.
 */
public class Matricula {
	
	/**
	 * @param num guarda el número único de la matrícula
	 * @param alumno es un objeto de tipo Alumno que guarda el alumno al que corresponde la matrícula
	 * @param curso es un objeto de tipo Curso que guarda el curso al que corresponde la matrícula
	 * @param pagado guarda el estado del pago de la matrícula. Si está pagado será true, si está pendiente de pago será false
	 * @param matriculas_sin_pagar es un objeto de tipo ArrayList que guarda la lista de matrículas sin pagar
	 */
	private int num;
	private Alumno alumno;
	private Curso curso;
	private Boolean pagado;
	
	private ArrayList<Matricula> matriculas_sin_pagar = new ArrayList<Matricula>();
	
	/**
	 * Constructor de la clase. Inicializa el valor del atributo 'pagado' a false, siendo el estado de pago 
	 * de la matrícula el de 'pendiente'.
	 * 
	 * @param num inicializa el atributo 'num' al valor pasado por este parámetro.
	 * @param alumno inicializa el atributo 'alumno' al valor pasado por este parámetro.
	 * @param curso inicializa el atributo 'curso' al valor pasado por este parámetro.
	 */
    public Matricula(int numero, Alumno alumno, Curso curso) {
	
		this.num = numero;
		this.alumno = alumno;
		this.curso = curso;
		pagado = false;
    }


	// GETTERS
    /**
	 * Método getter para obtener el numero de matrícula.
	 * 
	 * @return devuelve el numero de matrícula 
	 */
	public int getNum() {
		return num;
	}
	
	/**
	 * Método getter para obtener el alumno matriculado.
	 * 
	 * @return devuelve el alumno 
	 */
	public Alumno getAlumno() {
		return alumno;
	}
	
	/**
	 * Método getter para obtener el curso de la matrícula.
	 * 
	 * @return devuelve el curso
	 */	
	public Curso getCurso() {
		return curso;
	}
	
	/**
	 * Método getter para obtener el estado de pago de la matrícula. 
	 * Será false si está pendiente y true si está pagada.
	 * 
	 * @return devuelve true si la matrícula ha sido pagada y false si no lo ha sido.
	 */	
	public Boolean getPagado() {
		return pagado;
	}
	
	/**
	 * Devuelve la lista de matrículas sin pagar. Recorre la lista de matrículas realizadas en la academia 
	 * y si encuentra una matrícula no pagada, siendo el valor se su atributo 'pagado' false, 
	 * la añade a la lista de matrículas sin pagar.
	 * 
	 * @param matriculas son todas las matriculas que hay en la academia.
	 * @return devuelve la lista de matrículas sin pagar.
	 */
	public ArrayList<Matricula> getMatriculasSinPagar(ArrayList<Matricula> matriculas) {
		
		for (int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getPagado() == false)
				matriculas_sin_pagar.add(matriculas.get(i));
		}
		return matriculas_sin_pagar;
	}
	

	// SETTERS
	/**
	 * Método setter para modificar el estado de pago de la matrícula. 
	 * Será false si está pendiente y true si está pagada.
	 * 
	 * @param pagado modifica el atributo 'pagado' al valor pasado por este parámetro. Será false si está pendiente y true si está pagada.
	 */
	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
	}
}
