package academia;

import java.util.Date;

public class Academia {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("Rodrigo", "Perez Hidalgo", "24348131P");
		Alumno alumno2 = new Alumno("Diego", "Vazquez Blanco", "39831381K");
		Alumno alumno3 = new Alumno("Felix", "Prieto Arambillet", "45323239D");
		Curso curso1 = new Curso("F1", "Frances", 1, new Date(115, 9, 31), new Date(116, 6, 30), 12, 30, 200);
		Curso curso2 = new Curso("F2", "Frances", 2, new Date(115, 9, 31), new Date(116, 6, 30), 12, 30, 200);
		Curso curso3 = new Curso("I1", "Ingles", 1, new Date(115, 10, 6), new Date(116, 5, 20), 13, 40, 300);
		Matricula matricula1 = new Matricula(1, alumno1, curso3);
		Matricula matricula2 = new Matricula(2, alumno2, curso1);
		Matricula matricula3 = new Matricula(3, alumno3, curso1);

	}

}
