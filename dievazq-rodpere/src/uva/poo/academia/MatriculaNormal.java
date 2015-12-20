package uva.poo.academia;

/**
 * Clase que hereda de Matricula. Implementa las matriculas normales que se crean en Academia. 
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class MatriculaNormal extends Matricula {

	public MatriculaNormal(int numero, Alumno alumno, CursoNormal curso_normal) {
		super(numero, alumno, curso_normal);
		// pagado = false; En el constructor del padre
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
				+ super.getCurso().getID() + ", Pagado: " + super.getPagado();
	}
}
