package academia;

public class Curso {
	private String identificador;
	private String idioma;
	private int nivel;
	private String fechainicio;
	private String fechafinal;
	private String hora;
	private int numeroalumnosmaximo;
	private int precio;

//lista de alumnos inscritos	
	private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	public Curso(String identificador, String idioma, int nivel, String fechainicio, String fechafinal, String hora, int numeroalumnosmaximo, int precio){
		this.identificador = identificador;
		this.idioma = idioma;
		this.nivel = nivel;
		this.fechainicio = fechainicio;
		this.fechafinal = fechafinal;
		this.hora = hora;
		this.numeroalumnosmaximo = numeroalumnosmaximo;
		this.precio = precio;
	}
	
	public ArrayList<Matricula> getMatriculas(){
		return matriculas;
	}
    public int getNumeroalumnosmaximo(){
    	return numeroalumnosmaximo;
    }
    public int getNivel(){
    	return nivel;
    }
}
