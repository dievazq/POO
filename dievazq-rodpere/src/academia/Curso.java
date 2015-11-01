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
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}

	public int getNivel() {
		return nivel;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	
	// SETTERS
	public void setMatriculas(ArrayList<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
