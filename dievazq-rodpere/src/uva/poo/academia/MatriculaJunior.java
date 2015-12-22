package uva.poo.academia;

import java.util.GregorianCalendar;

/**
 * Clase que hereda de Matricula. Implementa las matriculas junior que se crean en Academia. 
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class MatriculaJunior extends Matricula {

	private int tfno_contacto;
	
	public MatriculaJunior(int numero, Junior alumno_junior, Curso curso, int tfno_contacto) {
		super(numero, alumno_junior, curso);
		// pagado = false; En el constructor del padre
		this.tfno_contacto = tfno_contacto;
	}
	
	/**
	 * Comprueba si el junior está dentro de la edad del curso. Devuelve {@code False} si se encuentra en el rango 
	 * y {@code True} si no está dentro de la edad.
	 * Hace el calculo de la edad de un junior tomando la fecha de nacimineto y restandosela 
	 * a la fecha actual. Si aun no es el mes de su cumpleanos (resta de los meses menor que 0), se 
	 * resta uno al resultado de la resta de los años. Del mismo modo si es el mismo mes (resta 
	 * de los meses == 0), si la resta de los dias es menor que 0 tambien se le resta uno a los años.
	 * 
	 * @param curso_junior Es el curso del que se quiere comprobar si la inscripcion de un nuevo junior se encuentra 
	 * 			dentro del rango de edad.
	 * @param junior Es el alumno
	 * @return {@code True} si no está dentro de la edad, {@code False} si se encuentra en el rango.
	 */
	public Boolean comprobarEdad(CursoJunior curso_junior, Junior junior) {
		
	    // Calculamos las diferencias.
	    int anios = curso_junior.getFechaInicio().get(GregorianCalendar.YEAR) - junior.getFechaNac().get(GregorianCalendar.YEAR);
	    int meses = curso_junior.getFechaInicio().get(GregorianCalendar.MONTH) - junior.getFechaNac().get(GregorianCalendar.MONTH);
	    int dias = curso_junior.getFechaInicio().get(GregorianCalendar.DAY_OF_MONTH) - junior.getFechaNac().get(GregorianCalendar.DAY_OF_MONTH);
	 
	    // Hay que comprobar si el dia de su cumpleaños es posterior
	    // a la fecha actual, para restar 1 a la diferencia de años,
	    // pues aun no ha sido su cumpleaños.
	 
	    if(meses < 0 // Aun no es el mes de su cumpleaños
	       || (meses==0 && dias < 0)) { // o es el mes pero no ha llegado el dia.
	 
	        anios--;
	    }
		
		if (anios >= curso_junior.getEdadMinima() && anios <= curso_junior.getEdadMaxima())
			return false;
		else
			return true;
	}

	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer 
	 * imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	@Override
	public String toString() {
		
		return "nº: " + super.getNum() + ", Alumno: " + super.getAlumno().getNombre() + ", Curso: "
				+ super.getCurso().getID() + ", Pagado: " + super.getPagado() + ", Tfno: " + tfno_contacto;
	}
}
