package academia;

import java.util.ArrayList;
import java.util.Date;

public class Curso {
	private String id;
	private String idioma;
	private int nivel;
	private Date fechaInicio;
	private Date fechaFinal;
	private int hora;
	private int num_max_alumnos;
	private int precio;

	private ArrayList<Alumno> alumnos_inscritos = new ArrayList<Alumno>();
	
	private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

	public Curso(String id, String idioma, int nivel, Date fechaInicio, Date fechaFinal, int hora,
			int num_max_alumnos, int precio) {
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
	public String getID() {
		return id;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public int getNumMaxAlumnos() {
		return num_max_alumnos;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public ArrayList<Alumno> getAlumnos(String id) {
		
		Matricula matricula = new Matricula();
		
		matriculas.addAll(matricula.getMatriculas());
		
		for(int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getCurso().getID() == id)
				alumnos_inscritos.add(matriculas.get(i).getAlumno());
		}
		 
		return alumnos_inscritos;
	}
	
	public int getNumAlumnos(String id) {
		
		Matricula matricula = new Matricula();
		
		matriculas.addAll(matricula.getMatriculas());
		
		for(int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getCurso().getID() == id)
				alumnos_inscritos.add(matriculas.get(i).getAlumno());
		}
		 
		return alumnos_inscritos.size();
	}
	
	
	// SETTERS
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
