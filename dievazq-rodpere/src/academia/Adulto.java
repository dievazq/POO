package academia;

import java.util.ArrayList;

public class Adulto extends Alumno {
	
	private String dni;

	/**
	 * 
	 * @param nombre Atributo heredado de la superclase Alumno.
	 * @param apellidos Atributo heredado de la superclase Alumno.
	 * @param dni inicializa el atributo 'dni' al valor pasado por este parametro.
	 */
	public Adulto(String nombre, String apellidos, String dni) {
		super(nombre, apellidos);
		this.dni = dni;
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
	 * que no haya sido pagada, siendo el valor de su atributo Pagado false, añade el valor de tal matricula
	 * al contador de la deuda.
	 * 
	 * @param matriculas son todas las matriculas que hay en la academia.
	 * @return devuelve el valor de la deuda adquirida por un alumno.
	 */
	public int getDeuda(){
		
		int deuda = 0;
		
		for(int i=0; i < getMatriculasAlumno().size(); i++) {
			if (getMatriculasAlumno().get(i).getPagado() == false)
				deuda += getMatriculasAlumno().get(i).getCurso().getPrecio();
		}
		
		// Incluir el calculo de los junior que dependen del adulto
		
		return deuda;
	}
	
	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	public String toString() {
		
		return "Nombre: " + super.getNombre() + ", Apellidos: " + super.getApellidos() + ", DNI: " + dni;
	}
	
}