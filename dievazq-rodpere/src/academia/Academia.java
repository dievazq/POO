package academia;

import java.util.ArrayList;
import java.util.Date;
/**
 * @author Rodrigo Pérez Hidalgo y Diego Vázquez Blanco.
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
	
	public Academia(){
		
	}
	/**
	 * Método getter para obtener la lista de alumnos en la academia.
	 * @return devuelve la lista de alumnos.
	 */	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	/**
	 * Método getter para obtener la lista de cursos en la academia.
	 * @return devuelve la lista de cursos.
	 */	
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	/**
	 * Método getter para obtener la lista de matrículas en la academia.
	 * @return devuelve la lista de matrículas.
	 */	
	public ArrayList<Matricula> getMatriculas() {
		return matriculas;
	}
	/**
	 * Añade un alumno a la lista de alumnos en la academia. Recorre la lista de alumnos en la academia 
	 * y si el DNI de alguno de ellos coincide con el del alumno que se quiere añadir se informa de su existencia en la lista, 
	 * en caso contrario se añade el alumno a la lista.
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
	 * @param matricula es la matrícula que queremos añadir a la lista de matriculas en la academia.
	 */	
	public void anadirMatricula(Matricula matricula) {
		
		// Comprueba si ya existe un alumno en el curso y si supera el max de alumnos
		if (comprobarDuplicadoMatricula(matricula.getAlumno(), matricula.getCurso()) == true)
			System.err.println("El alumno ya existe en ese curso.");
		else if (comprobarMaxAlumnos(matricula.getCurso()) == true)
			System.err.println("Curso completo. No caben más alumnos.");
		else
			matriculas.add(matricula);
	}
	/**
	 * Comprueba si un alumno se encuentra matrículado en curso. Si en la lista de alumnos del curso dado se encuentra 
	 * un alumno con el mismo valor de DNI que el alumno dado se considera que el alumno dado ya se encuentra matriculado
	 * y devuelve true, en caso contrario, no se encuentra matriculado en tal curso y devuelve false.
	 * @param alumno es el alumno que se quiere comprobar si está matriculado en un determinado curso.
	 * @param curso es el curso en el que se quiere comprobar si un alumno determinado ya está matriculado.
	 * @return true si el alumno dado ya se encuentra matriculado en el curso, false si no lo está.
	 */
	public Boolean comprobarDuplicadoMatricula(Alumno alumno, Curso curso) {
		
		for (int i=0; i < curso.getAlumnos().size(); i++) {
			if (alumno.getDNI() == curso.getAlumnos().get(i).getDNI())
				return true;
		}
		return false;
	}
	/**
	 * Comprueba si la matrícula de un nuevo alumno en un determinado curso sobrepasaría el número máximo de alumnos 
	 * de ese curso. Devuelve true si lo sobrepasase y false si no lo hace.
	 * @param curso es el curso del que se quiere comprobar si la inscripción de un nuevo alumno sobrepasaría su número máximo de alumnos permitido.
	 * @return true si el numero maximo de alumnos en el curso es sobrepasado, false si no lo es.
	 */
	public Boolean comprobarMaxAlumnos(Curso curso) {
		
		if ( (curso.getNumAlumnos() + 1) <= curso.getNumMaxAlumnos() )
			return false;
		else
			return true;
	}
	/**
	 * Cambia de nivel a un alumno dado, dentro de un mismo idioma. Antes de realizar el cambio se comprueba que cumple
	 * con las siguiente restricciones: solo se puede subir o bajar un nivel y no se puede superar el número máximo de alumnos del nuevo nivel.
	 * @param alumno es el alumno al que se quiere cambiar de nivel.
	 * @param curso es el curso en el que se encuentra matriculado el alumno antes del cambio de nivel
	 * @param nivel es el nuevo nivel en el que se quiere incribir al alumno
	 */			
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
