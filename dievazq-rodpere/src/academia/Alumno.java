package academia;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private int deuda;

	private ArrayList<Curso> cursos_inscritos = new ArrayList<Curso>();
	
	private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

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
		
		matriculas.addAll(matricula.getMatriculas());

		deuda = 0;
		
		for(int i=0; i < matriculas.size(); i++) {
			if ( (dni == matriculas.get(i).getAlumno().getDNI()) &&
					(matriculas.get(i).getPagado() == false) )
				deuda += matriculas.get(i).getCurso().getPrecio();
		}
		
		return deuda;
	}
	
	public ArrayList<Curso> getCursos(String dni) {
		
		Matricula matricula = new Matricula();
		
		matriculas.addAll(matricula.getMatriculas());
		
		for(int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getAlumno().getDNI() == dni)
				cursos_inscritos.add(matriculas.get(i).getCurso());
		}
		
		return cursos_inscritos;
	}
}
