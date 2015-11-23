package academia;

import java.util.ArrayList;

public class Adulto extends Alumno {
	
	private String dni;

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
	public int getDeuda(ArrayList<Matricula> matriculas){
		
		this.deuda = 0;
		
		for(int i=0; i < matriculas.size(); i++) {
			if ( (matriculas.get(i).getAlumno().getDNI() == dni) &&
					(matriculas.get(i).getPagado() == false) )
				this.deuda += matriculas.get(i).getCurso().getPrecio();
		}
	}
	
	return deuda;
}