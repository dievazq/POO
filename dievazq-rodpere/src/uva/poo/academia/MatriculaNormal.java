package uva.poo.academia;

/**
 * Clase que hereda de Matricula. Implementa las matriculas normales que se crean en Academia. 
 * 
 * @author Rodrigo Perez Hidalgo y Diego Vazquez Blanco.
 */
public class MatriculaNormal extends Matricula {

	/**
	 * Constructor de la clase.
	 * 
	 * @param numero Atributo heredado de la clase Curso.
	 * @param alumno Alumno a incluir en la matricula. Puede ser Adulto o Junior.
	 * @param curso_normal Curso normal a incluir en la matricula.
	 */
	public MatriculaNormal(int numero, Alumno alumno, CursoNormal curso_normal) {
		super(numero, alumno, curso_normal);
		// pagado = false; En el constructor del padre
	}
	
	/**
     * Constructor Vacio para poder hacer uso de los metodos publicos de la clase.
     */
	public MatriculaNormal() {
		
	}
	
	/**
	 * Cambia de nivel a un alumno dado, dentro de un mismo idioma. Antes de realizar el cambio se comprueba que cumple
	 * con las siguiente restricciones: solo se puede subir o bajar un nivel, el curso antiguo y nuevo son del mismo idioma, 
	 * y no se supera el numero maximo de alumnos del nuevo nivel.
	 * 
	 * @assert.pre Los niveles entre curso y nuevoCurso no deben distar mas de 1 nivel. 
	 * 				 El idioma de curso y nuevoCurso debe ser el mismo.
	 * 				 El numero de alumnos de nuevoCurso contando el cambio de nivel, no debe 
	 * 					sobrepasar el numero maximo de alumnos.
	 * @assert.post Se cambia el curso normal de la matricula normal del alumno que solicita el cambio.
	 * 
	 * @param alumno Es el alumno al que se quiere cambiar de nivel.
	 * @param curso Es el curso normal en el que se encuentra matriculado el alumno antes del cambio de nivel.
	 * @param nuevoCurso Es el nuevo curso normal en el que se quiere incribir al alumno.
	 */			
	public void cambiarNivel(Alumno alumno, CursoNormal curso, CursoNormal nuevoCurso){
		
		assert(nuevoCurso.getNivel() > (curso.getNivel() + 1) || 
				nuevoCurso.getNivel() < (curso.getNivel() - 1)): 
					"ERROR. No se puede subir o bajar mas de 1 nivel.";
		assert(nuevoCurso.getIdioma() != curso.getIdioma()): 
				"ERROR. El nuevo curso debe ser del mismo idioma.";
		assert(comprobarMaxAlumnos(nuevoCurso) == true): 
				"ERROR. Curso completo. No caben mas alumnos.";
		
		for(int i = 0; i < alumno.getMatriculasAlumno().size(); i++){
			if (alumno.getMatriculasAlumno().get(i).getCurso().equals(curso))
			{
				alumno.getMatriculasAlumno().get(i).setCurso(nuevoCurso);
			}
		}
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
