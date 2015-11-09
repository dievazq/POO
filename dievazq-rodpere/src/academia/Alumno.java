package academia;

import java.util.ArrayList;

/**
 * @author Rodrigo Pérez Hidalgo y Diego Vázquez Blanco.
 * 
 * Implementa cada uno de los alumnos de una academia. Mantiene información sobre la lista de los cursos en que se inscribe, 
 * además del nombre, apellidos y DNI. Es capaz de informar de la deuda total del alumno. 
 */
public class Alumno {
	
	/**
	 * @param nombre guarda el nombre del alumno.
	 * @param apellidos guarda los apellidos del alumno.
	 * @param dni guarda el dni del alumno.
	 * @param deuda guarda la deuda del alumno.
	 * @param cursos_inscritos es un objeto de tipo ArrayList que guarda la lista de cursos.
	 * en los que está matriculado un alumno.
	 */
	private String nombre;
	private String apellidos;
	private String dni;
	private int deuda;

	private ArrayList<Curso> cursos_inscritos;
	
	/**
	 * Constructor de la clase. Crea una lista de cursos con inscripción vacia e 
	 * inicializa la deuda con valor 0.
	 * @param nombre inicializa el atributo 'nombre' al valor pasado por este parámetro.
	 * @param apellidos inicializa el atributo 'apellidos' al valor pasado por este parámetro.
	 * @param dni inicializa el atributo 'dni' al valor pasado por este parámetro.
	 */
	public Alumno(String nombre, String apellidos, String dni) {
		cursos_inscritos = new ArrayList<Curso>();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		deuda = 0;
	}

	// GETTERS
	/**
	 * Método getter para obtener nombre existente.
	 * 
	 * @return devuelve el nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método getter para obtener DNI existente.
	 * 
	 * @return devuelve el DNI.
	 */
	public String getDNI() {
		return dni;
	}
	
	/**
	 * Devuelve la deuda adquirida por un alumno. Recorre la lista de matrículas realizadas en la 
	 * academia y si encuentra una matrícula del alumno, identificada por comparación con su DNI, y
	 * que no haya sido pagada, siendo el valor de su atributo Pagado false, añade el valor de tal matrícula
	 * al contador de la deuda.
	 * 
	 * @return devuelve el valor de la deuda adquirida por un alumno.
	 */
	public int getDeuda(ArrayList<Matricula> matriculas) {
		
		deuda = 0;
		
		for(int i=0; i < matriculas.size(); i++) {
			if ( (dni == matriculas.get(i).getAlumno().getDNI()) &&
					(matriculas.get(i).getPagado() == false) )
				deuda += matriculas.get(i).getCurso().getPrecio();
		}
		
		return deuda;
	}
	
	/**
	 * Devuelve la lista de cursos en los que está matriculado un alumno. Recorre la lista de matrículas 
	 * realizadas en la academia y si encuentra una matrícula del alumno, identificada por comparación con su DNI, 
	 * añade el curso a la lista de cursos en los que se ha matriculado el alumno.
	 * 
	 * @return devuelve la lista de cursos en los que está matriculado un alumno.
	 */
	
	public ArrayList<Curso> getCursos(ArrayList<Matricula> matriculas) {
		
		cursos_inscritos.clear();
		
		for(int i=0; i < matriculas.size(); i++) {
			if (matriculas.get(i).getAlumno().getDNI() == dni)
				cursos_inscritos.add(matriculas.get(i).getCurso());
		}
		
		return cursos_inscritos;
	}
}
