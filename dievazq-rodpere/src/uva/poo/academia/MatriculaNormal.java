package uva.poo.academia;

import java.util.ArrayList;

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
	 * @assert.pre 	 El idioma de curso y nuevoCurso debe ser el mismo.
	 * 				 Los niveles entre curso y nuevoCurso no deben distar mas de 1 nivel y no debe ser el mismo nivel. 
	 * 				 El numero de alumnos de nuevoCurso contando el cambio de nivel, no debe 
	 * 					sobrepasar el numero maximo de alumnos.
	 * @assert.post Se cambia el curso normal de la matricula normal del alumno que solicita el cambio.
	 * 
	 * @param alumno Es el alumno al que se quiere cambiar de nivel.
	 * @param curso Es el curso normal en el que se encuentra matriculado el alumno antes del cambio de nivel.
	 * @param nuevoCurso Es el nuevo curso normal en el que se quiere incribir al alumno.
	 * @param matriculas Lista de todas las matriculas de la academia.
	 */			
	public void cambiarNivel(Alumno alumno, CursoNormal curso, CursoNormal nuevoCurso, ArrayList<Matricula> matriculas){
		
		MatriculaNormal matricula_normal;
		
		assert(nuevoCurso.getIdioma() == curso.getIdioma()): 
			"ERROR. El nuevo curso debe ser del mismo idioma.";
		assert(nuevoCurso.getNivel() == (curso.getNivel() + 1) || 
				nuevoCurso.getNivel() == (curso.getNivel() - 1)): 
					"ERROR. No se puede subir o bajar mas de 1 nivel.";
		assert(comprobarMaxAlumnos(nuevoCurso) == false): 
				"ERROR. Curso completo. No caben mas alumnos.";
		
		for(int i = 0; i < matriculas.size(); i++){
			if (matriculas.get(i).getAlumno().equals(alumno) && matriculas.get(i).getCurso().equals(curso))
			{
				alumno.getMatriculasAlumno().remove(matriculas.get(i));
				curso.getMatriculasCurso().remove(matriculas.get(i));
				matriculas.remove(i);
				matricula_normal = new MatriculaNormal(matriculas.size() + 1, alumno, nuevoCurso);
				matriculas.add(matricula_normal);
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
