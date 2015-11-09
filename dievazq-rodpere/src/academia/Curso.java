package academia;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 * 
 * Implementa cada uno de los cursos que organiza la academia. Cada curso tiene un codigo identificador unico 
 * e informacion sobre el idioma, nivel, fechas de inicio y final, asi como la hora en que se imparte. 
 * Tiene un numero de alumnos maximo, un precio de matricula y mantiene una lista de los alumnos inscritos.  
 */
public class Curso {
	
	/**
	 * @param id guarda el identificador unico del curso.
	 * @param idioma guarda el idioma del curso que se imparte.
	 * @param nivel guarda el nivel del curso.
	 * @param fechaInicio guarda la fecha de inicio del curso.
	 * @param fechaFinal guarda la fecha final del curso.
	 * @param hora guarda la hora a la que se imparte el curso.
	 * @param num_max_alumnos guarda el numero maximo de alumnos que puede contener un determinado curso.
	 * @param precio guarda el precio del curso.
	 * @param alumnos_inscritos es un objeto de tipo ArrayList que guarda la lista de alumnos matriculados 
	 * en un curso.
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
	 * 
	 * @param id inicializa el atributo 'id' al valor pasado por este parametro.
	 * @param idioma inicializa el atributo 'idioma' al valor pasado por este parametro.
	 * @param nivel inicializa el atributo 'nivel' al valor pasado por este parametro.
	 * @param fechaInicio inicializa el atributo 'fechaInicio' al valor pasado por este parametro.
	 * @param fechaFinal inicializa el atributo 'fechaFinal' al valor pasado por este parametro.
	 * @param hora inicializa el atributo 'hora' al valor pasado por este parametro.
	 * @param num_max_alumnos inicializa el atributo 'num_max_alumnos' al valor pasado por este parametro.
	 * @param precio inicializa el atributo 'precio' al valor pasado por este parametro.
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
	 * Metodo getter para obtener el identificador unico del curso.
	 * 
	 * @return devuelve el identificador del curso.
	 */
	public String getID() {
		return id;
	}
	
	/**
	 * Metodo getter para obtener el idioma del curso que se imparte.
	 * 
	 * @return devuelve el idioma del curso que se imparte.
	 */
	public String getIdioma() {
		return idioma;
	}
	
	/**
	 * Metodo getter para obtener el nivel del curso.
	 * 
	 * @return devuelve el nivel del curso.
	 */	
	public int getNivel() {
		return nivel;
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
	 * @param matriculas son todas las matriculas que hay en la academia.
	 * @return devuelve la lista de alumnos matriculados en un curso.
	 */	
	public ArrayList<Alumno> getAlumnos(ArrayList<Matricula> matriculas) {
		
		alumnos_inscritos.clear();
		
		for(int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getCurso().getID() == id) 
				alumnos_inscritos.add(matriculas.get(i).getAlumno());
		}
		
		return alumnos_inscritos;
	}
	
	/**
	 * Devuelve el numero de alumnos matriculados en un curso. Recorre la lista de matriculas 
	 * realizadas en la academia y si encuentra una matricula del curso, identificada por comparacion con su identificador, 
	 * añade al alumno a la lista de alumnos que se han matriculado en el curso. El tamaño de esa lista
	 * es el numero de alumnos matriculados en un curso.
	 * 
	 * @param matriculas son todas las matriculas que hay en la academia.
	 * @return devuelve el numero de alumnos matriculados en un curso.
	 */	
	public int getNumAlumnos(ArrayList<Matricula> matriculas) {
		
		alumnos_inscritos.clear();
		
		for(int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getCurso().getID() == id)
				alumnos_inscritos.add(matriculas.get(i).getAlumno());
		}
		 
		return alumnos_inscritos.size();
	}
	
	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	public String toString() {
		
		return "ID: " + id + ", Idioma: " + idioma + ", Nivel: " + nivel + ", Precio: " + precio;
	}
}
