package academia;

import java.util.ArrayList;
import java.util.Date;
/**
 * @author Rodrigo Pérez Hidalgo y Diego Vázquez Blanco.
 * 
 * Implementa cada uno de los cursos que organiza la academia. Cada curso tiene un código identificador único 
 * e información sobre el idioma, nivel, fechas de inicio y final, así como la hora en que se imparte. 
 * Tiene un número de alumnos máximo, un precio de matrícula y mantiene una lista de los alumnos inscritos.  
 */
public class Curso {
	/**
	 * @param id guarda el identificador único del curso
	 * @param idioma guarda el idioma del curso que se imparte
	 * @param nivel guarda el nivel del curso
	 * @param fechaInicio guarda la fecha de inicio del curso
	 * @param fechaFinal guarda la fecha final del curso
	 * @param hora guarda la hora a la que se imparte el curso
	 * @param num_max_alumnos guarda el número máximo de alumnos que puede contener un determinado curso
	 * @param precio guarda el precio del curso
	 * @param alumnos_inscritos es un objeto de tipo ArrayList que guarda la lista de alumnos matriculados 
	 * en un curso
	 */	
	private String id;
	private String idioma;
	private int nivel;
	private Date fechaInicio;
	private Date fechaFinal;
	private int hora;
	private int num_max_alumnos;
	private int precio;

	private ArrayList<Alumno> alumnos_inscritos;
	/**
	 * Constructor de la clase. Crea una lista de alumnos inscritos vacia.
	 * @param id inicializa el atributo 'id' al valor pasado por este parámetro.
	 * @param idioma inicializa el atributo 'idioma' al valor pasado por este parámetro.
	 * @param nivel inicializa el atributo 'nivel' al valor pasado por este parámetro.
	 * @param fechaInicio inicializa el atributo 'fechaInicio' al valor pasado por este parámetro.
	 * @param fechaFinal inicializa el atributo 'fechaFinal' al valor pasado por este parámetro.
	 * @param hora inicializa el atributo 'hora' al valor pasado por este parámetro.
	 * @param num_max_alumnos inicializa el atributo 'num_max_alumnos' al valor pasado por este parámetro.
	 * @param precio inicializa el atributo 'precio' al valor pasado por este parámetro.
	 */
	public Curso(String id, String idioma, int nivel, Date fechaInicio, Date fechaFinal, int hora,
					int num_max_alumnos, int precio) {
		alumnos_inscritos = new ArrayList<Alumno>();
		this.id = id;
		this.idioma = idioma;
		this.nivel = nivel;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.hora = hora;
		this.num_max_alumnos = num_max_alumnos;
		this.precio = precio;
	}

	
	// GETTERS
	/**
	 * método getter para obtener el identificador único del curso.
	 * @return devuelve el identificador del curso
	 */
	public String getID() {
		return id;
	}
	/**
	 * método getter para obtener el idioma del curso que se imparte.
	 * @return devuelve el idioma del curso que se imparte
	 */
	public String getIdioma() {
		return idioma;
	}
	/**
	 * método getter para obtener el nivel del curso.
	 * @return devuelve el nivel del curso
	 */	
	public int getNivel() {
		return nivel;
	}
	/**
	 * método getter para obtener el número máximo de alumnos que puede contener un determinado curso.
	 * @return devuelve el número máximo de alumnos que puede contener un determinado curso
	 */	
	public int getNumMaxAlumnos() {
		return num_max_alumnos;
	}
	/**
	 * método getter para obtener el precio de un curso.
	 * @return devuelve el precio del curso
	 */	
	public int getPrecio() {
		return precio;
	}
	/**
	 * Devuelve la lista de alumnos matriculados en un curso. Recorre la lista de matrículas 
	 * realizadas en la academia y si encuentra una matrícula del curso, identificada por comparación con su identificador, 
	 * añade al alumno a la lista de alumnos que se han matriculado en el curso
	 * @return devuelve la lista de alumnos matriculados en un curso.
	 */	
	public ArrayList<Alumno> getAlumnos() {
		
		Academia academia = new Academia();
		
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			if (academia.getMatriculas().get(i).getCurso().getID() == id)
				alumnos_inscritos.add(academia.getMatriculas().get(i).getAlumno());
		}
		 
		return alumnos_inscritos;
	}
	/**
	 * Devuelve el número de alumnos matriculados en un curso. Recorre la lista de matrículas 
	 * realizadas en la academia y si encuentra una matrícula del curso, identificada por comparación con su identificador, 
	 * añade al alumno a la lista de alumnos que se han matriculado en el curso. El tamaño de esa lista
	 * es el número de alumnos matriculados en un curso.
	 * @return devuelve el número de alumnos matriculados en un curso.
	 */	
	public int getNumAlumnos() {
		
		Academia academia = new Academia();
		
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			if (academia.getMatriculas().get(i).getCurso().getID() == id)
				alumnos_inscritos.add(academia.getMatriculas().get(i).getAlumno());
		}
		 
		return alumnos_inscritos.size();
	}
	
	
	// SETTERS
	/**
	 * método setter para modificar el nivel del curso.
	 * @param nivel modifica el atributo 'nivel' al valor pasado por este parámetro.
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
