package academia;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private int deuda;

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
	
	public int getDeuda() {
		
		Matricula matricula = new Matricula();

		deuda = 0;
		
		for(int i=0; i < matricula.getMatriculas().size(); i++) {
			if ( (dni == matricula.getMatriculas().get(i).getAlumno().getDNI()) &&
					(matricula.getMatriculas().get(i).getPagado() == false) )
				deuda += matricula.getMatriculas().get(i).getCurso().getPrecio();
		}
		
		return deuda;
	}
	
	public ArrayList<Curso> getCursos(String dni) {
		
		Matricula matricula = new Matricula();
		
		for(int i=0; i < matricula.getMatriculas().size(); i++) {
			if (matricula.getMatriculas().get(i).getAlumno().getDNI() == dni)
				cursos_inscritos.add(matricula.getMatriculas().get(i).getCurso());
		}
		
		return cursos_inscritos;
	}
}
