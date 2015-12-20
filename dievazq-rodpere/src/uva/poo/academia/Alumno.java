package uva.poo.academia;

import java.util.ArrayList;

/**
 * Clase abstracta que mantiene informacion sobre la lista de los cursos en que se inscribe el alumno 
 * ademas del nombre, apellidos y deuda.
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public abstract class Alumno {
	
	private String nombre;
	private String apellidos;

	private ArrayList<Matricula> matriculas_alumno;
	
	/**
	 * Constructor de la clase. Crea una lista de cursos con inscripcion vacia e 
	 * inicializa la deuda con valor 0.
	 * 
	 * @param nombre inicializa el atributo 'nombre' al valor pasado por este parametro.
	 * @param apellidos inicializa el atributo 'apellidos' al valor pasado por este parametro.
	 */
	public Alumno(String nombre, String apellidos) {
		matriculas_alumno = new ArrayList<Matricula>();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	/**
	 * Añade una matricula de un alumno a la lista de matriculas del alumno que llama 
	 * a este metodo.
	 * 
	 * @param matricula Matricula que se añade a la lista de matriculas del alumno que 
	 * llama a este metodo.
	 */
	public void anadirMatricula(Matricula matricula) {
		
		matriculas_alumno.add(matricula);
	}
	
	/**
	 * Metodo getter para obtene la lista de matriculas del alumno.
	 * 
	 * @return devuelve la lista de matriculas del alumno.
	 */
	public ArrayList<Matricula> getMatriculasAlumno() {
		return matriculas_alumno;
	}
	
	/**
	 * Metodo getter para obtene atributo nombre.
	 * 
	 * @return devuelve el nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Metodo getter para obtener atributo apellidos.
	 * 
	 * @return devuelve los apellidos.
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Devuelve la lista de cursos en los que esta matriculado un alumno. 
	 * Recorre la lista de matriculas del alumno realizadas en la academia y 
	 * las añade en un array solo de cursos en los que se ha matriculado el alumno.
	 * 
	 * @return devuelve la lista de cursos en los que esta matriculado el alumno.
	 */
	
	public ArrayList<Curso> getCursos() {
		
		ArrayList<Curso> cursos_alumno = new ArrayList<Curso>();
		
		for(int i=0; i < matriculas_alumno.size(); i++) {
			cursos_alumno.add(matriculas_alumno.get(i).getCurso());
		}
		
		return cursos_alumno;
	}
	
	/**
	 * Metodo abstracto que tiene como parametro de entrada una lista de matriculas.
	 */
	public abstract int getDeuda();

}
