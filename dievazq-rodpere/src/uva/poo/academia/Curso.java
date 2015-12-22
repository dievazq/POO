package uva.poo.academia;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Implementa cada uno de los cursos que organiza la academia. Cada curso tiene un codigo identificador unico 
 * e informacion sobre el idioma, nivel, fechas de inicio y final, asi como la hora en que se imparte. 
 * Tiene un numero de alumnos maximo, un precio de matricula y mantiene una lista de los alumnos inscritos.
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class Curso {
	
	private String id;
	private String idioma;
	private GregorianCalendar fechaInicio;
	private GregorianCalendar fechaFinal;
	private int hora;
	private int num_max_alumnos;
	private int precio;

	private ArrayList<Matricula> matriculas_curso;
	
	/**
	 * Constructor de la clase. Crea una lista de alumnos inscritos vacia.
	 * 
	 * @param id inicializa el atributo 'id' al valor pasado por este parametro.
	 * @param idioma inicializa el atributo 'idioma' al valor pasado por este parametro.
	 * @param fechaInicio inicializa el atributo 'fechaInicio' al valor pasado por este parametro.
	 * @param fechaFinal inicializa el atributo 'fechaFinal' al valor pasado por este parametro.
	 * @param hora inicializa el atributo 'hora' al valor pasado por este parametro.
	 * @param num_max_alumnos inicializa el atributo 'num_max_alumnos' al valor pasado por este parametro.
	 * @param precio inicializa el atributo 'precio' al valor pasado por este parametro.
	 */
	public Curso(String id, String idioma, GregorianCalendar fechaInicio, GregorianCalendar fechaFinal, int hora,
					int num_max_alumnos, int precio) {
		matriculas_curso = new ArrayList<Matricula>();
		this.id = id;
		this.idioma = idioma;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.hora = hora;
		this.num_max_alumnos = num_max_alumnos;
		this.precio = precio;
	}
	
	/**
	 * Añade una matricula de un curso a la lista de matriculas del curso que llama 
	 * a este metodo.
	 * 
	 * @param matricula Matricula que se añade a la lista de matriculas del curso que 
	 * llama a este metodo.
	 */
	public void anadirMatricula(Matricula matricula) {
		
		matriculas_curso.add(matricula);
	}
	
	/**
	 * Metodo getter para obtene la lista de matriculas del curso.
	 * 
	 * @return devuelve la lista de matriculas del curso.
	 */
	public ArrayList<Matricula> getMatriculasCurso() {
		return matriculas_curso;
	}
	
	/**
	 * Metodo getter para obtener el identificador unico del curso.
	 * 
	 * @return id Devuelve el identificador del curso.
	 */
	public String getID() {
		return id;
	}
	
	/**
	 * Metodo getter para obtener el idioma del curso que se imparte.
	 * 
	 * @return idioma Devuelve el idioma del curso que se imparte.
	 */
	public String getIdioma() {
		return idioma;
	}
	
	/**
	 * Metodo getter para obtener la fecha de inicio del curso.
	 * 
	 * @return fechaInicio Devuelve la fecha de inicio del curso.
	 */	
	public GregorianCalendar getFechaInicio() {
		return fechaInicio;
	}
	
	/**
	 * Metodo getter para obtener la fecha de fin del curso.
	 * 
	 * @return fechaInicio la fecha de fin del curso.
	 */	
	public GregorianCalendar getFechaFin() {
		return fechaFinal;
	}
	
	/**
	 * Metodo getter para obtener la hora a la que se imparte el curso.
	 * 
	 * @return hora Devuelve la hora a la que se imparte el curso.
	 */	
	public int getHora() {
		return hora;
	}
	
	/**
	 * Metodo getter para obtener el numero maximo de alumnos que puede contener un determinado curso.
	 * 
	 * @return devuelve el numero maximo de alumnos que puede contener un determinado curso.
	 */	
	public int getNumMaxAlumnos() {
		return num_max_alumnos;
	}
	
	/**
	 * Metodo getter para obtener el precio de un curso.
	 * 
	 * @return devuelve el precio del curso.
	 */	
	public int getPrecio() {
		return precio;
	}
	
	/**
	 * Devuelve la lista de alumnos matriculados en un curso. Recorre la lista de matriculas 
	 * realizadas en la academia y si encuentra una matricula del curso, identificada por comparacion con su identificador, 
	 * añade al alumno a la lista de alumnos que se han matriculado en el curso.
	 * 
	 * @return devuelve la lista de alumnos matriculados en un curso.
	 */	
	public ArrayList<Alumno> getAlumnos() {
		
		ArrayList<Alumno> alumnos_inscritos = new ArrayList<Alumno>();
		
		for(int i=0; i < matriculas_curso.size(); i++) {
			alumnos_inscritos.add(matriculas_curso.get(i).getAlumno());
		}
		
		return alumnos_inscritos;
	}
	
	/**
	 * Devuelve el numero de alumnos matriculados en un curso. Recorre la lista de matriculas 
	 * realizadas en la academia y si encuentra una matricula del curso, identificada por comparacion con su identificador, 
	 * añade al alumno a la lista de alumnos que se han matriculado en el curso. El tamaño de esa lista
	 * es el numero de alumnos matriculados en un curso.
	 * 
	 * @return devuelve el numero de alumnos matriculados en un curso.
	 */	
	public int getNumAlumnos() {

		return matriculas_curso.size();
	}
}
