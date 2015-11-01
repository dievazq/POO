package academia;

import java.util.Random;

public class Matricula {
	private int num;
	private Boolean pagado;
	private Alumno alumno;
	private Curso curso;
	
	// inscribir(Alumno, Curso)-> comprobarmatricula(Alumno),
	// comprobaralumnos(Curso)
	// pagar(matricula)
	// cambiarnivel(matricula)-> comprobaralumnos(Curso)
	public Matricula(int numero, Alumno alumno, Curso curso) {
		
		// Comprueba si ya existe una matrícula igual (duplicada) y si supera el max de alumnos
		if (comprobarDuplicado(alumno, curso) == false && comprobarMaxAlumnos(curso) == false) {
			
			this.alumno = alumno;
			this.curso = curso;
			this.num = numero;
			this.pagado = false;
		}
	}

	// GETTERS
	public Boolean getPagado() {
		return pagado;
	}

	// SETTERS
	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
	}

			
	public void cambiarnivel(int nivel, String idioma, Alumno alumno){
		if (nivel == (curso.getNivel() + 1) || nivel == (curso.getNivel() - 1) && comprobarMaxAlumnos(curso) == false) {
			
		}
	    
	}
}
