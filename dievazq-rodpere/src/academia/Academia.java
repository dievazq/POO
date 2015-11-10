package academia;

import java.util.ArrayList;
import java.util.Date;

/**
 * Implementa una academia donde se imparten cursos. Comprueba el buen funcionamiento de las clases Alumno, Curso y Matricula.
 * Crea y mantiene la lista de cursos, alumnos y matriculas. 
 * Permite marcar una matricula como pagada y cambiar de nivel a un alumno.
 * Comprueba si se dan las condiciones previas para las matriculas y si es posible crearlas. 
 * Prueba el resto de metodos publicos de las clases Alumno, Curso y Matricula.
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class Academia {
	
	private ArrayList<Alumno> alumnos;
	private ArrayList<Curso> cursos;
	private ArrayList<Matricula> matriculas;
	private ArrayList<Matricula> matriculas_sin_pagar;
	
	/**
	 * Constructor vacio de la clase que nos va a permitir utilizar los metodos publicos de Academia en otras clases.
	 */
	public Academia(){
		alumnos = new ArrayList<Alumno>();
		cursos = new ArrayList<Curso>();
		matriculas = new ArrayList<Matricula>();
		matriculas_sin_pagar = new ArrayList<Matricula>();
	}

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		// Construimos los objetos
		Academia academia = new Academia();
		
		Alumno alumno1 = new Alumno("Rodrigo", "Perez Hidalgo", "14348131P");
		Alumno alumno2 = new Alumno("Diego", "Vazquez Blanco", "29831381K");
		Alumno alumno3 = new Alumno("Felix", "Prieto Arambillet", "35323239D");
		Alumno alumno4 = new Alumno("Pedro", "Gonzalez Herrera", "49365827H");
		Alumno alumno5 = new Alumno("Juan", "del Valle Perez", "51656157E");
		
		Curso curso1 = new Curso("F1", "Frances", 1, new Date(115, 9, 31), new Date(116, 6, 30), 10, 30, 100);
		Curso curso2 = new Curso("F2", "Frances", 2, new Date(115, 9, 31), new Date(116, 6, 30), 10, 1, 200);
		Curso curso3 = new Curso("F3", "Frances", 3, new Date(115, 9, 31), new Date(116, 6, 30), 10, 30, 300);
		Curso curso4 = new Curso("I1", "Ingles", 1, new Date(115, 10, 6), new Date(116, 5, 20), 12, 3, 100);
		
		Matricula matricula1 = new Matricula(1, alumno1, curso1);
		Matricula matricula2 = new Matricula(2, alumno2, curso1);
		Matricula matricula3 = new Matricula(3, alumno3, curso3);
		Matricula matricula4 = new Matricula(4, alumno4, curso4);
		Matricula matricula5 = new Matricula(5, alumno5, curso4);
		Matricula matricula6 = new Matricula(6, alumno2, curso4);
		
		// Añadimos los cursos a la lista de cursos
		academia.anadirCurso(curso1);
		academia.anadirCurso(curso2);
		academia.anadirCurso(curso3);
		academia.anadirCurso(curso4);
		
		System.out.println("\nCURSOS:");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println(academia.getCursos().get(i).toString());
		}
		
		System.out.println("\nAlumnos matriculados en los cursos (Cuando no hay alumnos):");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println("Curso: " + academia.getCursos().get(i).getID());
			if (academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size(); j++){
					System.out.println("   Alumno:" + academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).get(j).getNombre());
				}
			}
			else{
				System.out.println("   No hay alumnos en el curso " + academia.getCursos().get(i).getID());
			}
		}
		
		// Añadimos los alumnos a la lista de alumnos
		academia.anadirAlumno(alumno1);
		academia.anadirAlumno(alumno2);
		academia.anadirAlumno(alumno3);
		academia.anadirAlumno(alumno4);
		academia.anadirAlumno(alumno5);
		
		System.out.println("\nALUMNOS:");
		for(int i = 0; i < academia.getAlumnos().size(); i++) {
			System.out.println(academia.getAlumnos().get(i).toString());
		}
		
		System.out.println("\nIntentamos añadir alumno y curso ya existentes:");
		academia.anadirAlumno(alumno3);
		academia.anadirCurso(curso1);
		
		// Añadimos las matriculas a la lista de matriculas
		academia.anadirMatricula(matricula1);
		academia.anadirMatricula(matricula2);
		academia.anadirMatricula(matricula3);
		academia.anadirMatricula(matricula4);
		academia.anadirMatricula(matricula5);
		academia.anadirMatricula(matricula6);
		
		System.out.println("\nMATRICULAS:");
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			System.out.println(academia.getMatriculas().get(i).toString());
		}
		
		System.out.println("\nAlumnos matriculados en los cursos:");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println("Curso: " + academia.getCursos().get(i).getID());
			if (academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size(); j++){
					System.out.println("   Alumno:" + academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).get(j).getNombre());
				}
			}
			else{
				System.out.println("   No hay alumnos en el curso " + academia.getCursos().get(i).getID());
			}
		}
		
		System.out.println("\nCursos en los que estan matriculados los alumnos:");
		for(int i = 0; i < academia.getAlumnos().size(); i++) {
			System.out.println("Alumno: " + academia.getAlumnos().get(i).getNombre());
			if (academia.getAlumnos().get(i).getCursos(academia.getMatriculas()).size() > 0){
				for(int j = 0; j < academia.getAlumnos().get(i).getCursos(academia.getMatriculas()).size(); j++){
					System.out.println("   Curso:" + academia.getAlumnos().get(i).getCursos(academia.getMatriculas()).get(j).getID());
				}
			}
			else{
				System.out.println("   No tiene cursos el alumno " + academia.getAlumnos().get(i).getNombre());
			}
			System.out.println("   Deuda: " + academia.getAlumnos().get(i).getDeuda(academia.getMatriculas()));
		}
		
		System.out.println("\nIntento de matricular alumno en curso lleno:");
		Matricula matricula7 = new Matricula(7, alumno1, curso4);
		academia.anadirMatricula(matricula7);
		
		System.out.println("\nIntento de matricular alumno en un curso en el que ya esta:");
		Matricula matricula8 = new Matricula(8, alumno1, curso1);
		academia.anadirMatricula(matricula8);
		
		System.out.println("\nPagar matricula2");
		matricula2.setPagado();
		
		System.out.println("\nMatriculas con matricula2 pagada:");
		for(int i = 0; i < academia.getMatriculas().size(); i++) {
			System.out.println(academia.getMatriculas().get(i).toString());
		}
		
		System.out.println("\nMatriculas sin pagar:");
		for(int i = 0; i < academia.getMatriculasSinPagar().size(); i++) {
			System.out.println(academia.getMatriculasSinPagar().get(i).toString());
		}
		
		System.out.println("\nCambiamos de nivel alumno2 (Diego) del curso F1 al F2:");
		academia.cambiarNivel(alumno2, curso1, curso2);
		
		System.out.println("\nAlumnos matriculados en los cursos:");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println("Curso: " + academia.getCursos().get(i).getID());
			if (academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size(); j++){
					System.out.println("   Alumno:" + academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).get(j).getNombre());
				}
			}
			else{
				System.out.println("   No hay alumnos en el curso " + academia.getCursos().get(i).getID());
			}
		}
		
		System.out.println("\nCursos en los que estan matriculados los alumnos:");
		for(int i = 0; i < academia.getAlumnos().size(); i++) {
			System.out.println("Alumno: " + academia.getAlumnos().get(i).getNombre());
			if (academia.getAlumnos().get(i).getCursos(academia.getMatriculas()).size() > 0){
				for(int j = 0; j < academia.getAlumnos().get(i).getCursos(academia.getMatriculas()).size(); j++){
					System.out.println("   Curso:" + academia.getAlumnos().get(i).getCursos(academia.getMatriculas()).get(j).getID());
				}
			}
			else{
				System.out.println("   No tiene cursos el alumno " + academia.getAlumnos().get(i).getNombre());
			}
			System.out.println("   Deuda: " + academia.getAlumnos().get(i).getDeuda(academia.getMatriculas()));
		}
		
		System.out.println("\nCambiamos de nivel alumno1 (Rodrigo) del curso F1 al F3 (Mas de 1 nivel):");
		academia.cambiarNivel(alumno1, curso1, curso3);
		
		System.out.println("\nCambiamos de nivel alumno1 (Rodrigo) del curso F1 al I1 (Distinto idioma):");
		academia.cambiarNivel(alumno1, curso1, curso4);
		
		System.out.println("\nCambiamos de nivel alumno1 (Rodrigo) del curso F1 al F2 (Supera max alumnos):");
		academia.cambiarNivel(alumno1, curso1, curso2);
		
		System.out.println("\nAlumnos matriculados en los cursos:");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println("Curso: " + academia.getCursos().get(i).getID());
			if (academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size(); j++){
					System.out.println("   Alumno:" + academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).get(j).getNombre());
				}
			}
			else{
				System.out.println("   No hay alumnos en el curso " + academia.getCursos().get(i).getID());
			}
		}
	}
	
	
	
	/**
	 * Metodo getter para obtener la lista de alumnos en la academia.
	 * 
	 * @return devuelve la lista de alumnos.
	 */	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	/**
	 * Metodo getter para obtener la lista de cursos en la academia.
	 * 
	 * @return devuelve la lista de cursos.
	 */	
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	
	/**
	 * Metodo getter para obtener la lista de matriculas en la academia.
	 * 
	 * @return devuelve la lista de matriculas.
	 */	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	
	/**
	 * Devuelve la lista de matriculas sin pagar. Recorre la lista de matriculas realizadas en la academia 
	 * y si encuentra una matricula no pagada, siendo el valor se su atributo 'pagado' false, 
	 * la añade a la lista de matriculas sin pagar.
	 * 
	 * @return devuelve la lista de matriculas sin pagar.
	 */
	public ArrayList<Matricula> getMatriculasSinPagar() {
		
		matriculas_sin_pagar.clear();
		
		for (int i=0; i < getMatriculas().size(); i++) {
			if (getMatriculas().get(i).getPagado() == false)
				matriculas_sin_pagar.add(getMatriculas().get(i));
		}
		return matriculas_sin_pagar;
	}
	
	/**
	 * Añade un alumno a la lista de alumnos en la academia. Recorre la lista de alumnos en la academia 
	 * y si el DNI de alguno de ellos coincide con el del alumno que se quiere añadir se informa de su existencia en la lista, 
	 * en caso contrario se añade el alumno a la lista.
	 * 
	 * @param alumno es el alumno que queremos añadir a la lista de alumnos en la academia.
	 */
	public void anadirAlumno(Alumno alumno) {
		
		int i = 0;
		
		while (i < getAlumnos().size()) {
			if (getAlumnos().get(i).getDNI() == alumno.getDNI())
				break;
			i++;
		}
		
		if (i == getAlumnos().size())
			getAlumnos().add(alumno);
		else
			System.out.println("ERROR. El alumno ya existe.");
	}
	
	/**
	 * Añade un curso a la lista de cursos en la academia. Recorre la lista de cursos en la academia 
	 * y si el identificador de alguno de ellos coincide con el del curso que se quiere añadir se informa de su existencia en la lista, 
	 * en caso contrario se añade el curso a la lista.
	 * 
	 * @param curso es el curso que queremos añadir a la lista de cursos en la academia.
	 */	
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
			System.out.println("ERROR. El curso ya existe.");
	}
	
	/**
	 * Añade una matricula a la lista de matriculas en la academia. Comprueba tanto que un alumno no se matricula dos veces en un mismo curso 
	 * como que el curso no tendria mas alumnos que los maximos autorizados antes de añadir una matricula.
	 * 
	 * @param matricula es la matricula que queremos añadir a la lista de matriculas en la academia.
	 */	
	public void anadirMatricula(Matricula matricula) {
		
		// Comprueba si ya existe un alumno en el curso
		if (comprobarDuplicadoMatricula(matricula.getAlumno(), matricula.getCurso()) == true)
			System.out.println("ERROR. El alumno ya existe en ese curso.");
		else {
			// Comprueba si supera el max de alumnos
			if (comprobarMaxAlumnos(matricula.getCurso()) == true) {
				System.out.println("ERROR. Curso completo. No caben mas alumnos.");
			}
			else {
				getMatriculas().add(matricula);
			}
		}
	}
	
	/**
	 * Comprueba si un alumno se encuentra matriculado en curso. Si en la lista de alumnos del curso dado se encuentra 
	 * un alumno con el mismo valor de DNI que el alumno dado se considera que el alumno dado ya se encuentra matriculado
	 * y devuelve true, en caso contrario, no se encuentra matriculado en tal curso y devuelve false.
	 * 
	 * @param alumno es el alumno que se quiere comprobar si esta matriculado en un determinado curso.
	 * @param curso es el curso en el que se quiere comprobar si un alumno determinado ya esta matriculado.
	 * @return true si el alumno dado ya se encuentra matriculado en el curso, false si no lo esta.
	 */
	public Boolean comprobarDuplicadoMatricula(Alumno alumno, Curso curso) {
		
		for (int i=0; i < curso.getAlumnos(getMatriculas()).size(); i++) {
			if (alumno.getDNI() == curso.getAlumnos(getMatriculas()).get(i).getDNI())
				return true;
		}
		return false;
	}
	
	/**
	 * Comprueba si la matricula de un nuevo alumno en un determinado curso sobrepasaria el numero maximo de alumnos 
	 * de ese curso. Devuelve true si lo sobrepasase y false si no lo hace.
	 * 
	 * @param curso es el curso del que se quiere comprobar si la inscripcion de un nuevo alumno sobrepasaria su numero maximo de alumnos permitido.
	 * @return true si el numero maximo de alumnos en el curso es sobrepasado, false si no lo es.
	 */
	public Boolean comprobarMaxAlumnos(Curso curso) {
		
		if ( (curso.getNumAlumnos(getMatriculas()) + 1) <= curso.getNumMaxAlumnos() )
			return false;
		else
			return true;
	}
	
	/**
	 * Cambia de nivel a un alumno dado, dentro de un mismo idioma. Antes de realizar el cambio se comprueba que cumple
	 * con las siguiente restricciones: solo se puede subir o bajar un nivel, el curso antiguo y nuevo son del mismo idioma, 
	 * y no se supera el numero maximo de alumnos del nuevo nivel.
	 * 
	 * @param alumno es el alumno al que se quiere cambiar de nivel.
	 * @param curso es el curso en el que se encuentra matriculado el alumno antes del cambio de nivel
	 * @param nuevoCurso es el nuevo curso en el que se quiere incribir al alumno
	 */			
	public void cambiarNivel(Alumno alumno, Curso curso, Curso nuevoCurso){
		
		Matricula matricula;
		int numero;
		
		// Comprueba si el nivel del nuevo curso es como mucho 1 nivel superior o inferior.
		if (nuevoCurso.getNivel() > (curso.getNivel() + 1) || nuevoCurso.getNivel() < (curso.getNivel() - 1)){
			System.out.println("ERROR. No se puede subir o bajar mas de 1 nivel.");
		}
		else {
			// Comprueba si el nuevo curso es del mismo idioma que el anterior.
			if (nuevoCurso.getIdioma() != curso.getIdioma()) {
				System.out.println("ERROR. El nuevo curso debe ser del mismo idioma.");
			}
			else {
				// Comprueba si el nuevo curso está completo. 
				if (comprobarMaxAlumnos(nuevoCurso) == true) {
					System.out.println("ERROR. Curso completo. No caben mas alumnos.");
				}
				else {
					for(int i = 0; i < getMatriculas().size(); i++){
						if (alumno.equals(getMatriculas().get(i).getAlumno()) && curso.equals(getMatriculas().get(i).getCurso())){
							numero = getMatriculas().get(i).getNum();
							getMatriculas().remove(i);
							matricula = new Matricula(numero, alumno, nuevoCurso);
							anadirMatricula(matricula);
						}
					}
				}
			}
		}
	}
	
}
