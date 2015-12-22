package uva.poo.academia;

import java.util.GregorianCalendar;

/**
 * Clase que hereda de Curso. Implementa los cursos normales que se crean en Academia y mantiene 
 * el nivel del curso normal. Este tipo de curso admite todo tipo de alumnos.
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class CursoNormal extends Curso {
	
	private int nivel;

	/**
	 * Constructor de la clase.
	 * 
	 * @param id Atributo heredado de la clase Curso.
	 * @param idioma Atributo heredado de la clase Curso.
	 * @param fechaInicio Atributo heredado de la clase Curso.
	 * @param fechaFinal Atributo heredado de la clase Curso.
	 * @param hora Atributo heredado de la clase Curso.
	 * @param num_max_alumnos Atributo heredado de la clase Curso.
	 * @param precio Atributo heredado de la clase Curso.
	 * @param nivel Nivel del curso normal.
	 */
	public CursoNormal(String id, String idioma, GregorianCalendar fechaInicio, GregorianCalendar fechaFinal, int hora,
			int num_max_alumnos, int precio, int nivel) {
		super(id, idioma, fechaInicio, fechaFinal, hora, num_max_alumnos, precio);
		// matriculas_curso = new ArrayList<Matricula>(); En el constructor del padre.
		this.nivel = nivel;
	}

	/**
	 * Metodo getter para obtener el nivel del curso.
	 * 
	 * @return nivel Devuelve el nivel del curso.
	 */	
	public int getNivel() {
		return nivel;
	}
	
	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer 
	 * imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	@Override
	public String toString() {
		
		return "ID: " + super.getID() + ", Idioma: " + super.getIdioma() + ", Nivel: " + nivel + 
				", Precio: " + super.getPrecio() + ", MaxAlumnos: " + super.getNumMaxAlumnos();
	}
}
