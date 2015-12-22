package uva.poo.academia;

import java.util.Calendar;
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
	
	/**
	 * Constructor de la clase.
	 * 
	 * @assert.pre El junior debe tener menos de 18 años.
	 * @assert.post Se crea el alumno junior.
	 * 
	 * @param nombre Atributo heredado de la clase Alumno.
	 * @param apellidos Atributo heredado de la clase Alumno.
	 * @param fechaNac Fecha en la que nacio el alumno junior.
	 * @param responsable Adulto responsable del junior.
	 */
	public Junior(String nombre, String apellidos, GregorianCalendar fechaNac, Adulto responsable) {
		super(nombre, apellidos);
		assert(calcularEdad(fechaNac) < 18): "ERROR. El junior " + nombre + " no es menor de edad.";
		// matriculas_alumno = new ArrayList<Matricula>(); En el constructor del padre.
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
	 * Calcula la edad a partir de la fecha de nacimiento hasta la fecha actual.
	 * 
	 * @param fechaNac Es la fecha de nacimiento de un alumno junior.
	 * @return anios Devuelve la edad del junior en años.
	 */
	public int calcularEdad(GregorianCalendar fechaNac) {
		
		Calendar fechaActual = Calendar.getInstance();
		 
	    // Calculo de las diferencias.
	    int anios = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
	    int meses = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
	    int dias = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
	 
	    // Hay que comprobar si el dia de su cumpleaños es posterior
	    // a la fecha actual, para restar 1 a la diferencia de años,
	    // pues aun no ha sido su cumpleaños.
	 
	    if(meses < 0 // Aun no es el mes de su cumpleaños
	       || (meses==0 && dias < 0)) { // o es el mes pero no ha llegado el dia.
	 
	        anios--;
	    }
	    return anios;
	}
	
	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer 
	 * imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	@Override
	public String toString() {
		
		return "Nombre: " + super.getNombre() + ", Apellidos: " + super.getApellidos() + ", Responsable: " + responsable.getNombre();
	}
}
