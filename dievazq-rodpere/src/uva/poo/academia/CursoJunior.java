package uva.poo.academia;

import java.util.GregorianCalendar;

/**
 * Clase que hereda de Curso. Implementa los cursos junior que se crean en Academia y mantiene 
 * la edad minima t maxima del curso junior. Este tipo de curso solo admite juniors.
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class CursoJunior extends Curso {
	
	private int edad_minima;
	private int edad_maxima;

	public CursoJunior(String id, String idioma, GregorianCalendar fechaInicio, GregorianCalendar fechaFinal, int hora,
			int num_max_alumnos, int precio, int edad_minima, int edad_maxima) {
		super(id, idioma, fechaInicio, fechaFinal, hora, num_max_alumnos, precio);
		// matriculas_curso = new ArrayList<Matricula>(); En el constructor del padre.
		this.edad_minima = edad_minima;
		this.edad_maxima = edad_maxima;
	}
	
	/**
	 * Metodo getter para obtener la edad minima del curso.
	 * 
	 * @return nivel Devuelve la edad minima del curso.
	 */	
	public int getEdadMinima() {
		return edad_minima;
	}
	
	/**
	 * Metodo getter para obtener la edad maxima del curso.
	 * 
	 * @return nivel Devuelve la edad maxima del curso.
	 */	
	public int getEdadMaxima() {
		return edad_maxima;
	}

	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer 
	 * imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	@Override
	public String toString() {
		
		return "ID: " + super.getID() + ", Idioma: " + super.getIdioma() + ", Precio: " + super.getPrecio() +
				", De " + edad_minima + " a " + edad_maxima + " años";
	}
}
