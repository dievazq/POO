package academia;

import java.util.ArrayList;

public class Matricula {
	private int num;
	private Alumno alumno;
	private Curso curso;
	private Boolean pagado;
	
	private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	private ArrayList<Matricula> matriculas_sin_pagar = new ArrayList<Matricula>();

	public Matricula(int numero, Alumno alumno, Curso curso) {
		
		// Comprueba si ya existe un alumno en el curso y si supera el max de alumnos
		if (comprobarDuplicado(alumno, curso) == false && comprobarMaxAlumnos(curso) == false) {
			this.num = numero;
			this.alumno = alumno;
			this.curso = curso;
			pagado = false;
		}
		else
			System.err.println("No se ha podido crear la matricula.");
	}
	
	public Matricula() {
		
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
		
		for (int i=0; i < curso.getAlumnos(curso.getID()).size(); i++) {
			if (alumno.getDNI() == curso.getAlumnos(curso.getID()).get(i).getDNI())
				return true;
		}
		return false;
	}
	
	public Boolean comprobarMaxAlumnos(Curso curso) {
		
		if ( (curso.getNumAlumnos(curso.getID()) + 1) <= curso.getNumMaxAlumnos() )
			return false;
		else
			return true;
	}
			
	public void cambiarnivel(Alumno alumno, Curso curso, int nivel){
		
		if (nivel == (curso.getNivel() + 1) || nivel == (curso.getNivel() - 1) &&
				comprobarMaxAlumnos(curso) == false)
			curso.setNivel(nivel);
	}
	
	public void anadirMatriculas(ArrayList<Matricula> matriculas) {
		
		matriculas.addAll(matriculas);
	}
	
	public void pagarMatricula(Alumno alumno, Curso curso) {
		
		for (int i=0; i < matriculas.size(); i++) {
			if ( (alumno.getDNI() == matriculas.get(i).getAlumno().getDNI()) && 
					(curso.getID() == matriculas.get(i).getCurso().getID()) )
				matriculas.get(i).setPagado(true);
		}
	}
	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	public ArrayList<Matricula> getMatriculasSinPagar() {
		
		for (int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getPagado() == false)
				matriculas_sin_pagar.add(matriculas.get(i));
		}
		return matriculas_sin_pagar;
	}
	
}
