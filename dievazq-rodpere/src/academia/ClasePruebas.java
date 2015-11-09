package academia;

import java.util.Date;

public class ClasePruebas {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Academia academia = new Academia();
		
		Alumno alumno1 = new Alumno("Rodrigo", "Perez Hidalgo", "14348131P");
		Alumno alumno2 = new Alumno("Diego", "Vazquez Blanco", "29831381K");
		Alumno alumno3 = new Alumno("Felix", "Prieto Arambillet", "35323239D");
		Alumno alumno4 = new Alumno("Pedro", "Gonzalez Herrera", "49365827H");
		
		academia.anadirAlumno(alumno1);
		academia.anadirAlumno(alumno2);
		academia.anadirAlumno(alumno3);
		academia.anadirAlumno(alumno4);
		
		Curso curso1 = new Curso("F1", "Frances", 1, new Date(115, 9, 31), new Date(116, 6, 30), 12, 30, 100);
		Curso curso2 = new Curso("F2", "Frances", 2, new Date(115, 9, 31), new Date(116, 6, 30), 12, 30, 200);
		Curso curso3 = new Curso("F3", "Frances", 3, new Date(115, 9, 31), new Date(116, 6, 30), 12, 30, 300);
		Curso curso4 = new Curso("I1", "Ingles", 1, new Date(115, 10, 6), new Date(116, 5, 20), 13, 40, 100);
		
		academia.anadirCurso(curso1);
		academia.anadirCurso(curso2);
		academia.anadirCurso(curso3);
		academia.anadirCurso(curso4);
		
		System.out.println("\nAlumnos matriculados en los cursos (Cuando no hay):");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			if (academia.getCursos().get(i).getAlumnos().size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos().size(); j++){
					System.out.print("Curso: " + academia.getCursos().get(i).getID() +
									"Alumno:" + academia.getCursos().get(i).getAlumnos().get(j));
				}
			}
			else{
				System.out.println("No Hay Alumnos en el curso" + academia.getCursos().get(i).getID());
			}
		}
		
		Matricula matricula1 = new Matricula(1, alumno1, curso1);
		Matricula matricula2 = new Matricula(2, alumno2, curso1);
		Matricula matricula3 = new Matricula(3, alumno3, curso3);
		Matricula matricula4 = new Matricula(4, alumno4, curso4);
		
		academia.anadirMatricula(matricula1);
		academia.anadirMatricula(matricula2);
		academia.anadirMatricula(matricula3);
		academia.anadirMatricula(matricula4);
		
		System.out.println("\nAlumnos matriculados en los cursos:");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			if (academia.getCursos().get(i).getAlumnos().size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos().size(); j++){
					System.out.println("Curso: " + academia.getCursos().get(i).getID() +
									", Alumno:" + academia.getCursos().get(i).getAlumnos().get(j));
				}
			}
			else{
				System.out.println("No Hay Alumnos en el curso" + academia.getCursos().get(i).getID());
			}
		}
		
		System.out.println("\nAlumnos:");
		for(int i=0; i < academia.getAlumnos().size(); i++) {
			System.out.println(academia.getAlumnos().get(i).getDNI());
		}
		
		System.out.println("\nCursos:");
		for(int i=0; i < academia.getCursos().size(); i++) {
			System.out.println(academia.getCursos().get(i).getID());
		}
		
		System.out.println("\nMatriculas:");
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			System.out.print(academia.getMatriculas().get(i).getNum() + " ");
			System.out.print(academia.getMatriculas().get(i).getAlumno().getNombre() + " ");
			System.out.print(academia.getMatriculas().get(i).getCurso().getID() + " ");
			System.out.println(academia.getMatriculas().get(i).getPagado() + " ");
		}
		
		System.out.println("\nPagar matricula2(alumno2, curso1)");
		academia.pagarMatricula(alumno2, curso1);
		
		System.out.println("\nMatriculas con matricula2 pagada:");
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			System.out.print(academia.getMatriculas().get(i).getNum() + " ");
			System.out.print(academia.getMatriculas().get(i).getAlumno().getNombre() + " ");
			System.out.print(academia.getMatriculas().get(i).getCurso().getID() + " ");
			System.out.println(academia.getMatriculas().get(i).getPagado() + " ");
		}
		
		System.out.println("\nIntentamos añadir alumno y curso ya existentes:");
		academia.anadirAlumno(alumno3);
		academia.anadirCurso(curso1);

	}
}
