package academia;

import java.util.Date;

public class ClasePruebas {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Academia academia = new Academia();
		
		Alumno alumno1 = new Alumno("Rodrigo", "Perez Hidalgo", "24348131P");
		Alumno alumno2 = new Alumno("Diego", "Vazquez Blanco", "39831381K");
		Alumno alumno3 = new Alumno("Felix", "Prieto Arambillet", "45323239D");
		
		academia.anadirAlumno(alumno1);
		academia.anadirAlumno(alumno2);
		academia.anadirAlumno(alumno3);
		
		Curso curso1 = new Curso("F1", "Frances", 1, new Date(115, 9, 31), new Date(116, 6, 30), 12, 30, 200);
		Curso curso2 = new Curso("F2", "Frances", 2, new Date(115, 9, 31), new Date(116, 6, 30), 12, 30, 200);
		Curso curso3 = new Curso("I1", "Ingles", 1, new Date(115, 10, 6), new Date(116, 5, 20), 13, 40, 300);
		
		academia.anadirCurso(curso1);
		academia.anadirCurso(curso2);
		academia.anadirCurso(curso3);
		
		Matricula matricula1 = new Matricula(1, alumno1, curso3);
		Matricula matricula2 = new Matricula(2, alumno2, curso1);
		Matricula matricula3 = new Matricula(3, alumno3, curso1);
		
		academia.anadirMatricula(matricula1);
		academia.anadirMatricula(matricula2);
		academia.anadirMatricula(matricula3);
		
		System.out.println("Alumnos:");
		for(int i=0; i < academia.getAlumnos().size(); i++) {
			System.out.println(academia.getAlumnos().get(i).getDNI());
		}
		
		System.out.println("Cursos:");
		for(int i=0; i < academia.getCursos().size(); i++) {
			System.out.println(academia.getCursos().get(i).getID());
		}
		
		System.out.println("Matriculas ¿pagadas?:");
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			System.out.println(academia.getMatriculas().get(i).getPagado());
		}
		
		System.out.println("Pagar matricula2(alumno2, curso1):");
		academia.pagarMatricula(alumno2, curso1);
		
		System.out.println("Matriculas:");
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			System.out.println(academia.getMatriculas().get(i).getPagado());
		}
		
		System.out.println("Intentamos añadir alumno ya existente en un curso:");
		academia.anadirMatricula(matricula1);
		
		System.out.println("Matriculas ¿pagadas?:");
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			System.out.println(academia.getMatriculas().get(i).getPagado());
		}

	}
	
}
