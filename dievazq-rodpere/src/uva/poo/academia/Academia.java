package uva.poo.academia;

import java.util.ArrayList;
import java.util.GregorianCalendar;

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
	
	/**
	 * Constructor de la clase que nos va a permitir utilizar los metodos publicos de Academia.
	 */
	public Academia(){
		alumnos = new ArrayList<Alumno>();
		cursos = new ArrayList<Curso>();
		matriculas = new ArrayList<Matricula>();
	}

	public static void main(String[] args) throws Exception {
		
		// Declaramos variables y construimos los objetos
		Academia academia = new Academia();
		MatriculaNormal matricula_normal = new MatriculaNormal();
		
		Adulto 	adulto1 = null, 
				adulto2 = null, 
				adulto3 = null, 
				adulto4 = null, 
				adulto5 = null;
		Junior 	junior1 = null, 
				junior2 = null, 
				junior3 = null, 
				junior4 = null, 
				junior5 = null, 
				junior6 = null;
		CursoNormal curso_normal1 = null, 
					curso_normal2 = null, 
					curso_normal3 = null, 
					curso_normal4 = null;
		CursoJunior curso_junior1 = null, 
					curso_junior2 = null, 
					curso_junior3 = null, 
					curso_junior4 = null, 
					curso_junior5 = null;
		MatriculaNormal matricula_normal1 = null, 
						matricula_normal2 = null, 
						matricula_normal3 = null, 
						matricula_normal4 = null, 
						matricula_normal5 = null, 
						matricula_normal6 = null, 
						matricula_normal7 = null, 
						matricula_normal8 = null;
		MatriculaJunior matricula_junior1 = null, 
						matricula_junior2 = null, 
						matricula_junior3 = null, 
						matricula_junior4 = null, 
						matricula_junior5 = null, 
						matricula_junior6 = null;
		
		try {
			adulto1 = new Adulto("Rodrigo", "Perez Hidalgo", "14348131P");
			adulto2= new Adulto("Diego", "Vazquez Blanco", "29831381K");
			adulto3 = new Adulto("Felix", "Prieto Arambillet", "35323239D");
			adulto4 = new Adulto("Pedro", "Gonzalez Herrera", "49365827H");
			adulto5 = new Adulto("Juan", "del Valle Perez", "51656157E");
			
			junior1 = new Junior("Alvaro (Junior)", "Herrera Gomez", new GregorianCalendar(2011, 4, 31), adulto1);
			junior2 = new Junior("Bertin (Junior)", "Garcia Gutierrez", new GregorianCalendar(2010, 3, 24), adulto1);
			junior3 = new Junior("Carlos (Junior)", "del Bosque Cuadrado", new GregorianCalendar(2010, 2, 10), adulto1);
			junior4 = new Junior("David (Junior)", "Iruela Pinto", new GregorianCalendar(2010, 10, 17), adulto2);
			junior5 = new Junior("Eric (Junior)", "Hergueta Jimenez", new GregorianCalendar(2009, 5, 29), adulto3);
			junior6 = new Junior("Ivan (Junior)", "Romero Pascual", new GregorianCalendar(2009, 11, 15), adulto3);
			
			curso_normal1 = new CursoNormal("F1", "Frances", new GregorianCalendar(2015, 8, 31), new GregorianCalendar(2016, 5, 30), 10, 30, 100, 1);
			curso_normal2 = new CursoNormal("F2", "Frances", new GregorianCalendar(2015, 8, 31), new GregorianCalendar(2016, 5, 30), 10, 1, 200, 2);
			curso_normal3 = new CursoNormal("F3", "Frances", new GregorianCalendar(2015, 8, 31), new GregorianCalendar(2016, 5, 30), 10, 30, 300, 3);
			curso_normal4 = new CursoNormal("I1", "Ingles", new GregorianCalendar(2015, 9, 6), new GregorianCalendar(2016, 6, 5), 12, 3, 100, 1);
			
			curso_junior1 = new CursoJunior("FJ1", "Frances Junior", new GregorianCalendar(2015, 8, 31), new GregorianCalendar(2016, 5, 30), 10, 30, 50, 4, 6);
			curso_junior2 = new CursoJunior("FJ2", "Frances Junior", new GregorianCalendar(2015, 8, 31), new GregorianCalendar(2016, 5, 30), 10, 1, 150, 4, 6);
			curso_junior3 = new CursoJunior("FJ3", "Frances Junior", new GregorianCalendar(2015, 8, 31), new GregorianCalendar(2016, 5, 30), 10, 30, 200, 4, 6);
			curso_junior4 = new CursoJunior("IJ1", "Ingles Junior", new GregorianCalendar(2015, 9, 6), new GregorianCalendar(2016, 6, 5), 12, 3, 50, 4, 6);
			curso_junior5 = new CursoJunior("IJ2", "Ingles Junior", new GregorianCalendar(2015, 9, 6), new GregorianCalendar(2016, 6, 5), 12, 3, 150, 7, 9);

			matricula_normal1 = new MatriculaNormal(1, adulto1, curso_normal1);
			matricula_normal2 = new MatriculaNormal(2, adulto2, curso_normal1);
			matricula_normal3 = new MatriculaNormal(3, adulto3, curso_normal3);
			matricula_normal4 = new MatriculaNormal(4, adulto4, curso_normal4);
			matricula_normal5 = new MatriculaNormal(5, adulto5, curso_normal4);
			matricula_normal6 = new MatriculaNormal(6, adulto2, curso_normal4);
			matricula_normal7 = new MatriculaNormal(7, junior2, curso_normal3);
			matricula_normal8 = new MatriculaNormal(8, junior6, curso_normal3);
			
			matricula_junior1 = new MatriculaJunior(1, junior1, curso_junior1, 678945613);
			matricula_junior2 = new MatriculaJunior(2, junior2, curso_junior1, 654987312);
			matricula_junior4 = new MatriculaJunior(4, junior4, curso_junior4, 654321987);
			matricula_junior3 = new MatriculaJunior(3, junior3, curso_junior3, 631265498);
			matricula_junior5 = new MatriculaJunior(5, junior5, curso_junior4, 675341289);
			matricula_junior6 = new MatriculaJunior(6, junior6, curso_junior4, 695187463);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		// Añadimos los cursos a la lista de cursos
		try {
			academia.anadirCurso(curso_normal1);
			academia.anadirCurso(curso_normal2);
			academia.anadirCurso(curso_normal3);
			academia.anadirCurso(curso_normal4);
	
			academia.anadirCurso(curso_junior1);
			academia.anadirCurso(curso_junior2);
			academia.anadirCurso(curso_junior3);
			academia.anadirCurso(curso_junior4);
			academia.anadirCurso(curso_junior5);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nCURSOS:");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println(academia.getCursos().get(i).toString());
		}
		
		System.out.println("\nAlumnos matriculados en los cursos (Cuando no hay alumnos):");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println("Curso: " + academia.getCursos().get(i).getID());
			if (academia.getCursos().get(i).getAlumnos().size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos().size(); j++){
					System.out.println("   Alumno:" + academia.getCursos().get(i).getAlumnos().get(j).getNombre());
				}
			}
			else{
				System.out.println("   No hay alumnos en el curso " + academia.getCursos().get(i).getID());
			}
		}
		
		// Añadimos los adultos y junior a la lista de alumnos
		try {
			academia.anadirAlumno(adulto1);
			academia.anadirAlumno(adulto2);
			academia.anadirAlumno(adulto3);
			academia.anadirAlumno(adulto4);
			academia.anadirAlumno(adulto5);
	
			academia.anadirAlumno(junior1);
			academia.anadirAlumno(junior2);
			academia.anadirAlumno(junior3);
			academia.anadirAlumno(junior4);
			academia.anadirAlumno(junior5);
			academia.anadirAlumno(junior6);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nALUMNOS:");
		for(int i = 0; i < academia.getAlumnos().size(); i++) {
			System.out.println(academia.getAlumnos().get(i).toString());
		}
		
		System.out.println("\nIntentamos añadir adulto, junior, curso normal y curso junior ya existentes:");
		try {
			academia.anadirAlumno(adulto3);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		try {
			academia.anadirAlumno(junior2);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		try {
			academia.anadirCurso(curso_normal1);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		try {
			academia.anadirCurso(curso_junior3);
		
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		// Añadimos las matriculas a la lista de matriculas
		try {
			academia.anadirMatricula(matricula_normal1);
			academia.anadirMatricula(matricula_normal2);
			academia.anadirMatricula(matricula_normal3);
			academia.anadirMatricula(matricula_normal4);
			academia.anadirMatricula(matricula_normal5);
			academia.anadirMatricula(matricula_normal6);
			academia.anadirMatricula(matricula_normal7);
			academia.anadirMatricula(matricula_normal8);
			
			academia.anadirMatricula(matricula_junior2);
			academia.anadirMatricula(matricula_junior3);
			academia.anadirMatricula(matricula_junior4);
			academia.anadirMatricula(matricula_junior5);
			academia.anadirMatricula(matricula_junior1);
			academia.anadirMatricula(matricula_junior6);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nMATRICULAS:");
		for(int i=0; i < academia.getMatriculas().size(); i++) {
			System.out.println(academia.getMatriculas().get(i).toString());
		}
		
		System.out.println("\nAlumnos matriculados en los cursos:");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println("Curso: " + academia.getCursos().get(i).getID());
			if (academia.getCursos().get(i).getAlumnos().size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos().size(); j++){
					System.out.println("   Alumno:" + academia.getCursos().get(i).getAlumnos().get(j).getNombre());
				}
			}
			else{
				System.out.println("   No hay alumnos en el curso " + academia.getCursos().get(i).getID());
			}
		}
		
		System.out.println("\nCursos en los que estan matriculados los alumnos:");
		for(int i = 0; i < academia.getAlumnos().size(); i++) {
			System.out.println("Alumno: " + academia.getAlumnos().get(i).getNombre());
			if (academia.getAlumnos().get(i).getCursos().size() > 0){
				for(int j = 0; j < academia.getAlumnos().get(i).getCursos().size(); j++){
					System.out.println("   Curso:" + academia.getAlumnos().get(i).getCursos().get(j).getID());
				}
			}
			else{
				System.out.println("   No tiene cursos el alumno " + academia.getAlumnos().get(i).getNombre());
			}
			System.out.println("   Deuda: " + academia.getAlumnos().get(i).getDeuda());
		}
		
		System.out.println("\nIntento de matricular adulto en curso normal lleno:");
		try {
			MatriculaNormal matricula_normal9 = new MatriculaNormal(9, adulto1, curso_normal4);
			academia.anadirMatricula(matricula_normal9);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nIntento de matricular adulto en un curso normal en el que ya esta:");
		try {
			Matricula matricula_normal10 = new MatriculaNormal(10, adulto1, curso_normal1);
			academia.anadirMatricula(matricula_normal10);
		} catch (AssertionError e){
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("\nIntento de matricular junior en curso junior lleno:");
		try {
			Matricula matricula_junior7 = new MatriculaJunior(7, junior1, curso_junior4, 614158519);
			academia.anadirMatricula(matricula_junior7);
		} catch (AssertionError e){
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("\nIntento de matricular junior en un curso junior en el que ya esta:");
		try {
			Matricula matricula_junior8 = new MatriculaJunior(8, junior1, curso_junior1, 674146167);
			academia.anadirMatricula(matricula_junior8);
		} catch (AssertionError e){
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("\nIntento de matricular junior cuya edad no esta en el rango del curso junior:");
		try {
			Matricula matricula_junior9 = new MatriculaJunior(9, junior1, curso_junior5, 612875519);
			academia.anadirMatricula(matricula_junior9);
		} catch (AssertionError e){
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("\nPagar matricula normal 2");
		try {
			matricula_normal2.pagarMatricula();
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nPagar matricula junior 3");
		try {
			matricula_junior3.pagarMatricula();
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nListado de Matriculas con matricula_normal2 y matricula_junior3 pagadas:");
		for(int i = 0; i < academia.getMatriculas().size(); i++) {
			System.out.println(academia.getMatriculas().get(i).toString());
		}
		
		System.out.println("\nMatriculas sin pagar:");
		for(int i = 0; i < academia.getMatriculasSinPagar().size(); i++) {
			System.out.println(academia.getMatriculasSinPagar().get(i).toString());
		}
		
		System.out.println("\nCambiamos de nivel adulto2 (Diego) del curso normal F1 al F2:");
		try {
			matricula_normal.cambiarNivel(adulto2, curso_normal1, curso_normal2);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nAlumnos matriculados en los cursos:");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println("Curso: " + academia.getCursos().get(i).getID());
			if (academia.getCursos().get(i).getAlumnos().size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos().size(); j++){
					System.out.println("   Alumno:" + academia.getCursos().get(i).getAlumnos().get(j).getNombre());
				}
			}
			else{
				System.out.println("   No hay alumnos en el curso " + academia.getCursos().get(i).getID());
			}
		}
		
		System.out.println("\nCursos en los que estan matriculados los alumnos:");
		for(int i = 0; i < academia.getAlumnos().size(); i++) {
			System.out.println("Alumno: " + academia.getAlumnos().get(i).getNombre());
			if (academia.getAlumnos().get(i).getCursos().size() > 0){
				for(int j = 0; j < academia.getAlumnos().get(i).getCursos().size(); j++){
					System.out.println("   Curso:" + academia.getAlumnos().get(i).getCursos().get(j).getID());
				}
			}
			else{
				System.out.println("   No tiene cursos el alumno " + academia.getAlumnos().get(i).getNombre());
			}
			System.out.println("   Deuda: " + academia.getAlumnos().get(i).getDeuda());
		}
		
		System.out.println("\nCambiamos de nivel adulto1 (Rodrigo) del curso normal F1 al F3 (Mas de 1 nivel):");
		try {
			matricula_normal.cambiarNivel(adulto1, curso_normal1, curso_normal3);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nCambiamos de nivel adulto1 (Rodrigo) del curso normal F1 al I1 (Distinto idioma):");
		try {
			matricula_normal.cambiarNivel(adulto1, curso_normal1, curso_normal4);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nCambiamos de nivel adulto1 (Rodrigo) del curso normal F1 al F2 (Supera max alumnos):");
		try {
			matricula_normal.cambiarNivel(adulto1, curso_normal1, curso_normal2);
		} catch (AssertionError e){
			 String message = e.getMessage();
		     System.out.println(message);
		}
		
		System.out.println("\nAlumnos matriculados en los cursos:");
		for(int i = 0; i < academia.getCursos().size(); i++) {
			System.out.println("Curso: " + academia.getCursos().get(i).getID());
			if (academia.getCursos().get(i).getAlumnos().size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos().size(); j++){
					System.out.println("   Alumno:" + academia.getCursos().get(i).getAlumnos().get(j).getNombre());
				}
			}
			else{
				System.out.println("   No hay alumnos en el curso " + academia.getCursos().get(i).getID());
			}
		}
		
	} // Fin Main
	
	
	
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
	 * Recorre la lista de matriculas realizadas en la academia 
	 * y si encuentra una matricula no pagada, siendo el valor se su atributo 'pagado' {@code False}, 
	 * la añade a la lista de matriculas sin pagar.
	 * 
	 * @return devuelve la lista de matriculas sin pagar.
	 */
	public ArrayList<Matricula> getMatriculasSinPagar() {
		
		ArrayList<Matricula> matriculas_sin_pagar = new ArrayList<Matricula>();
		
		for (int i=0; i < getMatriculas().size(); i++) {
			if (getMatriculas().get(i).getPagado() == false)
				matriculas_sin_pagar.add(getMatriculas().get(i));
		}
		return matriculas_sin_pagar;
	}
	
	/**
	 * Añade un alumno a la lista de alumnos en la academia. Recorre la lista de alumnos en la academia 
	 * y alguno de ellos coincide con el alumno que se quiere añadir se informa de su existencia en la lista, 
	 * en caso contrario se añade el alumno a la lista.
	 * 
	 * @assert.pre No debe haber un alumno ya existente en la lista de alumnos de la academia.
	 * @assert.post Se añade al alumno a la lista de alumnos de la academia. 
	 *  
	 * @param alumno Es el alumno que queremos añadir a la lista de alumnos en la academia.
	 */
	public void anadirAlumno(Alumno alumno) {
		
		assert(comprobarAlumnoExistente(alumno) == false): "ERROR. El alumno " + alumno.getNombre() + " ya existe.";
		getAlumnos().add(alumno);
	}
	
	/**
	 * Añade un curso a la lista de cursos en la academia. Recorre la lista de cursos en la academia 
	 * y si el identificador de alguno de ellos coincide con el del curso que se quiere añadir se informa de su existencia en la lista, 
	 * en caso contrario se añade el curso a la lista.
	 * 
	 * @assert.pre No debe haber un curso ya existente en la lista de cursos de la academia.
	 * @assert.post Se añade al curso a la lista de cursos de la academia. 
	 * 
	 * @param curso Es el curso que queremos añadir a la lista de cursos en la academia.
	 */	
	public void anadirCurso(Curso curso) {
		
		assert(comprobarCursoExistente(curso) == false): "ERROR. El curso " + curso.getID() + " ya existe.";
		cursos.add(curso);
	}
	
	/**
	 * Añade una matricula a la lista de matriculas en la academia.
	 * 
	 * @param matricula Es la matricula que queremos añadir a la lista de matriculas en la academia.
	 */	
	public void anadirMatricula(Matricula matricula) {
		
		getMatriculas().add(matricula);
	}
	
	/**
	 * Comprueba si un alumno se encuentra en la lista de todos los alumnos de la academia 
	 * recorriendo el array y verificando que no se encuentren coincidencias.
	 * 
	 * @param alumno Alumno del que se quiere comprobar si ya está en la academia.
	 * @return devuelve {@code False} si no esta el alumno en la academia y {@code True} si ya esta.
	 */
	public Boolean comprobarAlumnoExistente(Alumno alumno) {
			
		int i = 0;
		
		while (i < getAlumnos().size()) {
			if (getAlumnos().get(i).equals(alumno))
				break;
			i++;
		}
		
		if (i == getAlumnos().size())
			return false;
		else
			return true;
	}
	
	/**
	 * Comprueba si un curso se encuentra en la lista de todos los cursos de la academia 
	 * recorriendo el array y verificando que no se encuentren coincidencias.
	 * 
	 * @param curso Curso del que se quiere comprobar si ya está en la academia.
	 * @return devuelve {@code False} si no esta el curso en la academia y {@code True} si ya esta.
	 */
	public Boolean comprobarCursoExistente(Curso curso) {
			
		int i = 0;
		
		while (i < getCursos().size()) {
			if (getCursos().get(i).equals(curso))
				break;
			i++;
		}
		
		if (i == getCursos().size())
			return false;
		else
			return true;
	}
	
}
