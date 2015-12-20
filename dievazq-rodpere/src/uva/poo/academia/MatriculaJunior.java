package uva.poo.academia;

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
