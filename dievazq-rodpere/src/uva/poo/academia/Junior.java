package uva.poo.academia;

import java.util.Date;

public class Junior extends Alumno {

	private Date fechaNac;
	private Adulto responsable;
	
	public Junior(String nombre, String apellidos, Date fechaNac, Adulto responsable) {
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
	public Date getFechaNac(){
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

}
