package uva.poo.academia;

import java.util.GregorianCalendar;

/**
 * Clase que hereda de Alumno. Mantiene los atributos referentes a la fecha de nacimiento del 
 * Junior y su adulto responsable. Redefine el metodo abstracto getDeuda() para que retorne 0.
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class Junior extends Alumno {

	private GregorianCalendar fechaNac;
	private Adulto responsable;
	
	public Junior(String nombre, String apellidos, GregorianCalendar fechaNac, Adulto responsable) {
		super(nombre, apellidos);
		this.fechaNac = fechaNac;
		this.responsable = responsable;
		this.responsable.anadirJunior(this);
	}
	
	/**
	 * Metodo getter para obtener el valor de la fecha de nacimiento del junior.
	 * 
	 * @return fechaNac Fecha de nacimiento del junior.
	 */
	public GregorianCalendar getFechaNac(){
		return fechaNac;
	}
	
	/**
	 * Metodo getter para obtener el adulto responsable del junior.
	 * 
	 * @return responsable Adulto responsable del junior. 
	 */
	public Adulto getResponsable(){
		return responsable;
	}
	
	/**
	 * Devuelve la deuda adquirida por el junior, la cual es siempre cero porque 
	 * corre a cuenta del adulto responsable.
	 * 
	 * @return devuelve cero.
	 */
	@Override
	public int getDeuda() {
		return 0;
	}
	
	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer 
	 * imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	@Override
	public String toString() {
		
		return "Nombre: " + super.getNombre() + ", Apellidos: " + super.getApellidos() + ", Responsable: " + responsable;
	}
}
