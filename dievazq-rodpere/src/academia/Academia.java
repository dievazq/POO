package academia;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Rodrigo Pérez Hidalgo y Diego Vázquez Blanco.
 * 
 * Implementa una academia donde se imparten cursos. Comprueba el buen funcionamiento de las clases Alumno, Curso y Matrícula.
 * Crea y mantiene la lista de cursos, alumnos y matrículas. 
 * Permite marcar una matrícula como pagada y cambiar de nivel a un alumno.
 * Comprueba si se dan las condiciones previas para las matrículas y si es posible crearlas. 
 * Prueba el resto de métodos públicos de las clases Alumno, Curso y Matrícula.
 */
public class Academia {
	
     /**
	 * @param alumnos es un objeto de tipo ArrayList que guarda la lista de alumnos en la academia.
	 * @param cursos es un objeto de tipo ArrayList que guarda la lista de cursos en la academia.
	 * @param matriculas es un objeto de tipo ArrayList que guarda la lista de matrículas en la academia.
	 */
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	private ArrayList<Curso> cursos = new ArrayList<Curso>();
	private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	/**
	 * Constructor vacío de la clase que nos va a permitir utilizar los métodos públicos de Academia en otras clases.
	 */
	public Academia(){
		
	}
	
	
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
			if (academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size(); j++){
					System.out.println("Curso: " + academia.getCursos().get(i).getID() +
									"Alumno:" + academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).get(j).getNombre());
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
			if (academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size() > 0){
				for(int j = 0; j < academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).size(); j++){
					System.out.println("Curso: " + academia.getCursos().get(i).getID() +
									", Alumno:" + academia.getCursos().get(i).getAlumnos(academia.getMatriculas()).get(j).getNombre());
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
	
	
	
	/**
	 * Método getter para obtener la lista de alumnos en la academia.
	 * 
	 * @return devuelve la lista de alumnos.
	 */	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	
	/**
	 * Método getter para obtener la lista de cursos en la academia.
	 * 
	 * @return devuelve la lista de cursos.
	 */	
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	
	/**
	 * Método getter para obtener la lista de matrículas en la academia.
	 * 
	 * @return devuelve la lista de matrículas.
	 */	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
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
			System.err.println("El curso ya existe.");
	}
	
	/**
	 * Añade una matrícula a la lista de matrículas en la academia. Comprueba tanto que un alumno no se matricula dos veces en un mismo curso 
	 * como que el curso no tendría más alumnos que los máximos autorizados antes de añadir una matrícula.
	 * 
	 * @param matricula es la matrícula que queremos añadir a la lista de matriculas en la academia.
	 */	
	public void anadirMatricula(Matricula matricula) {
		
		// Comprueba si ya existe un alumno en el curso y si supera el max de alumnos
		if (comprobarDuplicadoMatricula(matricula.getAlumno(), matricula.getCurso(), matriculas) == true)
			System.err.println("El alumno ya existe en ese curso.");
		else if (comprobarMaxAlumnos(matricula.getCurso(), matriculas) == true)
			System.err.println("Curso completo. No caben más alumnos.");
		else
			matriculas.add(matricula);
	}
	
	/**
	 * Comprueba si un alumno se encuentra matrículado en curso. Si en la lista de alumnos del curso dado se encuentra 
	 * un alumno con el mismo valor de DNI que el alumno dado se considera que el alumno dado ya se encuentra matriculado
	 * y devuelve true, en caso contrario, no se encuentra matriculado en tal curso y devuelve false.
	 * 
	 * @param alumno es el alumno que se quiere comprobar si está matriculado en un determinado curso.
	 * @param curso es el curso en el que se quiere comprobar si un alumno determinado ya está matriculado.
	 * @param matriculas son todas las matriculas que hay en la academia.
	 * @return true si el alumno dado ya se encuentra matriculado en el curso, false si no lo está.
	 */
	public Boolean comprobarDuplicadoMatricula(Alumno alumno, Curso curso, ArrayList<Matricula> matriculas) {
		
		for (int i=0; i < curso.getAlumnos(matriculas).size(); i++) {
			if (alumno.getDNI() == curso.getAlumnos(matriculas).get(i).getDNI())
				return true;
		}
		return false;
	}
	
	/**
	 * Comprueba si la matrícula de un nuevo alumno en un determinado curso sobrepasaría el número máximo de alumnos 
	 * de ese curso. Devuelve true si lo sobrepasase y false si no lo hace.
	 * 
	 * @param curso es el curso del que se quiere comprobar si la inscripción de un nuevo alumno sobrepasaría su número máximo de alumnos permitido.
	 * @param matriculas son todas las matriculas que hay en la academia.
	 * @return true si el numero maximo de alumnos en el curso es sobrepasado, false si no lo es.
	 */
	
	public Boolean comprobarMaxAlumnos(Curso curso, ArrayList<Matricula> matriculas) {
		
		if ( (curso.getNumAlumnos(matriculas) + 1) <= curso.getNumMaxAlumnos() )
			return false;
		else
			return true;
	}
	
	/**
	 * Cambia de nivel a un alumno dado, dentro de un mismo idioma. Antes de realizar el cambio se comprueba que cumple
	 * con las siguiente restricciones: solo se puede subir o bajar un nivel, el curso antiguo y nuevo son del mismo idioma, 
	 * y no se supera el número máximo de alumnos del nuevo nivel.
	 * 
	 * @param alumno es el alumno al que se quiere cambiar de nivel.
	 * @param curso es el curso en el que se encuentra matriculado el alumno antes del cambio de nivel
	 * @param nuevoCurso es el nuevo curso en el que se quiere incribir al alumno
	 */			
	public void cambiarNivel(Alumno alumno, Curso curso, Curso nuevoCurso){
		
		Matricula matricula;
		int numero;
		
		if ( (nuevoCurso.getNivel() == (curso.getNivel() + 1) || nuevoCurso.getNivel() == (curso.getNivel() - 1)) &&
				nuevoCurso.getIdioma() == curso.getIdioma() && comprobarMaxAlumnos(nuevoCurso, matriculas) == false ){
			for(int i = 0; i < matriculas.size(); i++){
				if (alumno.equals(matriculas.get(i).getAlumno()) && curso.equals(matriculas.get(i).getCurso())){
					numero = matriculas.get(i).getNum();
					matriculas.remove(i);
					matricula = new Matricula(numero, alumno, nuevoCurso);
					anadirMatricula(matricula);
				}
			}
		}
	}
	
	/**
	 * Paga la matrícula de un alumno en curso. Busca la matrícula del alumno y el curso dados 
	 * en la lista de matrículas de la academia, comparando sus atributos de dni del alumno e identificador de curso
	 * con aquellos en las matrículas en la lista de matrículas. Una vez ha sido encontrada cambia el estado de pago
	 * de esa matrícula a 'Pagada', asignando el valor true a su atibuto 'pagado'.
	 * 
	 * @param alumno es el alumno cuya matrícula en un curso determinado se quiere pagar.
	 * @param curso es el curso de la matrícula que se quiere pagar.
	 */
	public void pagarMatricula(Alumno alumno, Curso curso) {
		
		for (int i=0; i < matriculas.size(); i++) {
			if ( (alumno.getDNI() == matriculas.get(i).getAlumno().getDNI()) && 
					(curso.getID() == matriculas.get(i).getCurso().getID()) )
				matriculas.get(i).setPagado(true);
		}
	}
}
