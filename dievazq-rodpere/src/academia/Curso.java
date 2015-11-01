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

	// lista de alumnos inscritos
	private ArrayList<Alumno> alumnos_inscritos = new ArrayList<Alumno>();

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
	
	public ArrayList<Alumno> getAlumnos(String id, ArrayList<Matricula> matriculas) {
		
		for(int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getCurso().getID() == id)
				alumnos_inscritos.add(matriculas.get(i).getAlumno());
		}
		
		return alumnos_inscritos;
	}
	
	
	// SETTERS
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
}
