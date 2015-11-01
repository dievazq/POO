package academia;

import java.util.ArrayList;
import java.util.Random;

public class Matricula {
	private int num;
	private Boolean pagado;
	private Alumno alumno;
	private Curso curso;

	public Matricula(int numero, Alumno alumno, Curso curso) {
		
		// Comprueba si ya existe un alumno en el curso y si supera el max de alumnos
		if (comprobarDuplicado(alumno, curso) == false && comprobarMaxAlumnos(curso) == false) {
			
			this.alumno = alumno;
			this.curso = curso;
			this.num = numero;
			pagado = false;
		}
	}

	// GETTERS
	public Alumno getAlumno() {
		return alumno;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public Boolean getPagado() {
		return pagado;
	}

	// SETTERS
	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
	}

	public Boolean comprobarDuplicado(Alumno alumno, Curso curso) {
		
	}
			
	public void cambiarnivel(Alumno alumno, Curso curso, int nivel){
		if (nivel == (curso.getNivel() + 1) || nivel == (curso.getNivel() - 1) && comprobarMaxAlumnos(curso) == false) {
			curso.setNivel(nivel);
		}
	    
	}
	
	public Boolean comprobarMaxAlumnos(Curso curso) {
		if ( (curso.getNumMaxAlumnos() + 1) <= curso.getNumMaxAlumnos() )
			return false;
		else
			return true;
	}
}
