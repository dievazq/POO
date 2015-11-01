package academia;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private int deuda;

	// lista de cursos en los que se inscribe
	private ArrayList<Curso> cursos_inscritos = new ArrayList<Curso>();

	public Alumno(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		deuda = 0;
	}

	// GETTERS
	public String getDNI() {
		return dni;
	}

	// SETTERS

	
	
	
	public ArrayList<Curso> getCursos(String dni, ArrayList<Matricula> matriculas) {
		
		for(int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getAlumno().getDNI() == dni)
				cursos_inscritos.add(matriculas.get(i).getCurso());
		}
		
		return cursos_inscritos;
	}
}
