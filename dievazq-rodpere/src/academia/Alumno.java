package academia;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private int deuda;

	private ArrayList<Curso> cursos_inscritos;
	
	public Alumno(String nombre, String apellidos, String dni) {
		cursos_inscritos = new ArrayList<Curso>();
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
		
		Academia academia = new Academia();

		deuda = 0;
		
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			if ( (dni == academia.getMatriculas().get(i).getAlumno().getDNI()) &&
					(academia.getMatriculas().get(i).getPagado() == false) )
				deuda += academia.getMatriculas().get(i).getCurso().getPrecio();
		}
		
		return deuda;
	}
	
	public ArrayList<Curso> getCursos(String dni) {
		
		Academia academia = new Academia();
		
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			if (academia.getMatriculas().get(i).getAlumno().getDNI() == dni)
				cursos_inscritos.add(academia.getMatriculas().get(i).getCurso());
		}
		
		return cursos_inscritos;
	}
}
