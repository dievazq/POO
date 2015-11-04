package academia;

import java.util.ArrayList;

public class Matricula {
	private int num;
	private Alumno alumno;
	private Curso curso;
	private Boolean pagado;
	
	private ArrayList<Matricula> matriculas_sin_pagar = new ArrayList<Matricula>();

	public Matricula(int numero, Alumno alumno, Curso curso) {
		
			this.num = numero;
			this.alumno = alumno;
			this.curso = curso;
			pagado = false;
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
	
	public ArrayList<Matricula> getMatriculasSinPagar() {
		
		Academia academia = new Academia();
		
		for (int i=0; i < academia.getMatriculas().size(); i++) {
			if (academia.getMatriculas().get(i).getPagado() == false)
				matriculas_sin_pagar.add(academia.getMatriculas().get(i));
		}
		return matriculas_sin_pagar;
	}
	

	// SETTERS
	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
	}
	
}
