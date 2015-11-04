package academia;

import java.util.ArrayList;
import java.util.Date;

public class Academia {

	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	public Academia(){
		
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public void anadirAlumno(Alumno alumno) {
		
		int i = 0;
		
		while (i < alumnos.size()) {
			if (alumnos.get(i).getDNI() == alumno.getDNI())
				break;
			i++;
		}
		
		if (i == alumnos.size())
			alumnos.add(alumno);
		else
			System.err.println("El alumno ya existe.");
	}
	
	public void anadirCurso(Curso curso) {
		
		int i = 0;
		
		while (i < cursos.size()) {
			if (cursos.get(i).getID() == curso.getID())
				break;
			i++;
		}
		
		if (i == cursos.size())
			cursos.add(curso);
		else
			System.err.println("El curso ya existe.");
	}
	
	public void anadirMatricula(Matricula matricula) {
		
		// Comprueba si ya existe un alumno en el curso y si supera el max de alumnos
		if (comprobarDuplicadoMatricula(matricula.getAlumno(), matricula.getCurso()) == true)
			System.err.println("El alumno ya existe en ese curso.");
		else if (comprobarMaxAlumnos(matricula.getCurso()) == true)
			System.err.println("Curso completo. No caben más alumnos.");
		else
			matriculas.add(matricula);
	}
	
	public Boolean comprobarDuplicadoMatricula(Alumno alumno, Curso curso) {
		
		for (int i=0; i < curso.getAlumnos().size(); i++) {
			if (alumno.getDNI() == curso.getAlumnos().get(i).getDNI())
				return true;
		}
		return false;
	}
	
	public Boolean comprobarMaxAlumnos(Curso curso) {
		
		if ( (curso.getNumAlumnos() + 1) <= curso.getNumMaxAlumnos() )
			return false;
		else
			return true;
	}
			
	public void cambiarnivel(Alumno alumno, Curso curso, int nivel){
		
		if (nivel == (curso.getNivel() + 1) || nivel == (curso.getNivel() - 1) &&
				comprobarMaxAlumnos(curso) == false)
			curso.setNivel(nivel);
	}
	
	public void pagarMatricula(Alumno alumno, Curso curso) {
		
		for (int i=0; i < matriculas.size(); i++) {
			if ( (alumno.getDNI() == matriculas.get(i).getAlumno().getDNI()) && 
					(curso.getID() == matriculas.get(i).getCurso().getID()) )
				matriculas.get(i).setPagado(true);
		}
	}

}
