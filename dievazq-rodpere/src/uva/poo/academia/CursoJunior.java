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

	/**
	 * Constructor de la clase.
	 * 
	 * @assert.pre  Las edades minima y maxima deben estar comprendidas entre 4 y 17 ambos incluidos.
	 * 				La edad maxima debe ser mayor que la edad minima.
	 * @assert.post Se crea el objeto CursoJunior.
	 * 
	 * @param id Atributo heredado de la clase Curso.
	 * @param idioma Atributo heredado de la clase Curso.
	 * @param fechaInicio Atributo heredado de la clase Curso.
	 * @param fechaFinal Atributo heredado de la clase Curso.
	 * @param hora Atributo heredado de la clase Curso.
	 * @param num_max_alumnos Atributo heredado de la clase Curso.
	 * @param precio Atributo heredado de la clase Curso.
	 * @param edad_minima Edad minima de ingreso a fecha de inicio del curso.
	 * @param edad_maxima Edad maxima de ingreso a fecha de inicio del curso
	 */
	public CursoJunior(String id, String idioma, GregorianCalendar fechaInicio, GregorianCalendar fechaFinal, int hora,
			int num_max_alumnos, int precio, int edad_minima, int edad_maxima) {
		super(id, idioma, fechaInicio, fechaFinal, hora, num_max_alumnos, precio);
		assert(4 <= edad_minima && edad_maxima <= 17): "ERROR. Las edades no estan entre 4 y 17 (ambos incluidos).";
		assert(edad_minima < edad_maxima): "ERROR. La edad maxima debe ser mayor que la edad minima.";
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
				", De " + edad_minima + " a " + edad_maxima + " años" + ", MaxAlumnos: " + super.getNumMaxAlumnos();
	}
}
