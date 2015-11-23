package academia;

import java.util.ArrayList;

/**
 * Clase abstracta cada uno de los alumnos de una academia. Mantiene informacion sobre la lista de los cursos en que se inscribe, 
 * ademas del nombre, apellidos y DNI.
 *  
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public abstract class Alumno {
	
	private String nombre;
	private String apellidos;
	private int deuda;

	private ArrayList<Curso> cursos_inscritos;
	
	/**
	 * Constructor de la clase. Crea una lista de cursos con inscripcion vacia e 
	 * inicializa la deuda con valor 0.
	 * 
	 * @param nombre inicializa el atributo 'nombre' al valor pasado por este parametro.
	 * @param apellidos inicializa el atributo 'apellidos' al valor pasado por este parametro.
	 * @param dni inicializa el atributo 'dni' al valor pasado por este parametro.
	 */
	public Alumno(String nombre, String apellidos) {
		cursos_inscritos = new ArrayList<Curso>();
		this.nombre = nombre;
		this.apellidos = apellidos;
		deuda = 0;
	}

	// GETTERS
	/**
	 * Metodo getter para obtener nombre existente.
	 * 
	 * @return devuelve el nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método abstracto que tiene como parámetro de entrada una lista de matrículas.
	 * 
	 * @param matriculas son todas las matriculas que hay en la academia.
	 */
	public abstract int getDeuda(ArrayList<Matricula> matriculas);
	
	/**
	 * Devuelve la lista de cursos en los que esta matriculado un alumno. Recorre la lista de matriculas 
	 * realizadas en la academia y si encuentra una matricula del alumno, identificada por comparacion con su DNI, 
	 * añade el curso a la lista de cursos en los que se ha matriculado el alumno.
	 * 
	 * @param matriculas son todas las matriculas que hay en la academia.
	 * @return devuelve la lista de cursos en los que esta matriculado un alumno.
	 */
	
	public ArrayList<Curso> getCursos(ArrayList<Matricula> matriculas) {
		
		cursos_inscritos.clear();
		
		for(int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getAlumno().equals(this))
				cursos_inscritos.add(matriculas.get(i).getCurso());
		}
		
		return cursos_inscritos;
	}
	
	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	public String toString() {
		
		return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni;
	}
}
