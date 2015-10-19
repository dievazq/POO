package academia;

import java.util.ArrayList;

public class Alumno {
private String nombre;
private String apellidos;
private String dni;
private int deuda;

//lista de cursos en los que se inscribe
private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	public Alumno(String nombre, String apellidos, String dni){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	public ArrayList<Matricula> getMatriculas(){
		return matriculas;
	}
}
