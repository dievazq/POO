package uva.poo.academia;

import java.util.ArrayList;

/**
 * Clase que hereda de Alumno. Implementa los Adultos que se crean en Academia y mantiene la lista 
 * de juniors de los que se encarga el Adulto además de el numero de DNI. En esta calse se redefine 
 * el método abstracto getDeuda() del padre.
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class Adulto extends Alumno {
	
	private String dni;
	
	private ArrayList<Junior> juniors;

	/**
	 * Constructor de la clase. Crea una lista de juniors vacia.
	 * 
	 * @assert.pre El DNI debe tener 9 caracteres.
	 * @assert.post Se crea el objeto Adulto.
	 * 
	 * @param nombre Atributo heredado de la lase Alumno.
	 * @param apellidos Atributo heredado de la clase Alumno.
	 * @param dni Inicializa el atributo 'dni' al valor pasado por este parametro.
	 */
	public Adulto(String nombre, String apellidos, String dni) {
		super(nombre, apellidos);
		assert(dni.length() == 9): "ERROR. El DNI de " + nombre + " debe tener 9 caracteres.";
		// matriculas_alumno = new ArrayList<Matricula>(); En el constructor del padre.
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
	 * @return juniors Alumnos junior de los que se responsable el adulto que llama a este metodo.
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
	 * Devuelve la deuda adquirida por un adulto y los junior a su cargo. Recorre la lista de matriculas realizadas en la 
	 * academia y si encuentra una matricula del alumno o alguno de sus junior y que no haya sido pagada, siendo el valor 
	 * de su atributo {@code pagado} false, añade el valor de tal matricula al contador de la deuda.
	 * 
	 * @return devuelve el valor de la deuda adquirida por el adulto y sus junior.
	 */
	@Override
	public int getDeuda(){
		
		int deuda = 0;
		
		for(int i = 0; i < getMatriculasAlumno().size(); i++) {
			if (getMatriculasAlumno().get(i).getPagado() == false)
				deuda += getMatriculasAlumno().get(i).getCurso().getPrecio();
		}
		
		for(int j = 0; j < juniors.size(); j++) {
			for(int i = 0; i < juniors.get(j).getMatriculasAlumno().size(); i++) {
				if (juniors.get(j).getMatriculasAlumno().get(i).getPagado() == false)
					deuda += juniors.get(j).getMatriculasAlumno().get(i).getCurso().getPrecio();
			}
		}
		
		return deuda;
	}
	
	/**
	 * Metodo toString sobreescrito para retornar los atributos de la clase a la hora de querer 
	 * imprimirlos por la salida estandar.
	 * 
	 * @return devuelve los atributos de la clase en forma de String
	 */
	@Override
	public String toString() {
		
		String junior = "";
		
		for (int i = 0; i < juniors.size(); i++)
			junior.concat(juniors.get(i).toString() + ", ");
		
		return "Nombre: " + super.getNombre() + ", Apellidos: " + super.getApellidos() + ", DNI: " + dni + ", Juniors: " + junior;
	}
}