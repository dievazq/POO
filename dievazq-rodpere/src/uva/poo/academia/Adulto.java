package uva.poo.academia;

import java.util.ArrayList;

public class Adulto extends Alumno {
	
	private String dni;
	
	private ArrayList<Junior> juniors;

	/**
	 * 
	 * @param nombre Atributo heredado de la superclase Alumno.
	 * @param apellidos Atributo heredado de la superclase Alumno.
	 * @param dni inicializa el atributo 'dni' al valor pasado por este parametro.
	 */
	public Adulto(String nombre, String apellidos, String dni) {
		super(nombre, apellidos);
		juniors = new ArrayList<Junior>();
		this.dni = dni;
	}
	
	/**
	 * Añade un alumno junior a la lista de los junior de los que es responsable el adulto.
	 * 
	 * @param junior Alumno junior al que se le ha asignado como responsable el adulto que 
	 * llama a este metodo.
	 */
	public void anadirJunior(Junior junior) {
		
		juniors.add(junior);
	}
	
	/**
	 * Devuelve la lista de alumnos junior de los que es responsable el adulto.
	 * 
	 * @param juniors Alumnos junior de los que se responsable el adulto que 
	 * llama a este metodo.
	 */
	public ArrayList<Junior> getJuniors() {
		
		return juniors;
	}
	
	/**
	 * Metodo getter para obtener DNI existente.
	 * 
	 * @return devuelve el DNI.
	 */
	public String getDNI() {
		return dni;
	}

	/**
	 * Devuelve la deuda adquirida por un alumno. Recorre la lista de matriculas realizadas en la 
	 * academia y si encuentra una matricula del alumno, identificada por comparacion con su DNI, y
	 * que no haya sido pagada, siendo el valor de su atributo Pagado false,añade el valor de tal matricula
	 * al contador de la deuda. En este caso, el alumno es un adulto, se incluye el calculo de la deuda de 
	 * los junior de los que es responsable.
	 * 
	 * @return devuelve el valor de la deuda adquirida por el adulto y sus junior.
	 */
	@Override
	public int getDeuda(){
		
		int deuda = 0;
		
		for(int i=0; i < getMatriculasAlumno().size(); i++) {
			if (getMatriculasAlumno().get(i).getPagado() == false)
				deuda += getMatriculasAlumno().get(i).getCurso().getPrecio();
		}
		
		
		
		return deuda;
	}
	
	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	@Override
	public String toString() {
		
		return "Nombre: " + super.getNombre() + ", Apellidos: " + super.getApellidos() + ", DNI: " + dni;
	}
	
}