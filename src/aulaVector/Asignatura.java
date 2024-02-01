package aulaVector;

public class Asignatura {

	private String nombre;
	private int primera;
	private int segunda;
	private int tercera;
	
	public Asignatura(String nombre, int primera, int segunda, int tercera) {
	
		this.nombre = nombre;
		this.primera = primera;
		this.segunda = segunda;
		this.tercera = tercera;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", primera=" + primera + ", segunda=" + segunda + ", tercera=" + tercera
				+ "]";
	}
	
	

	
}
