package aulaVector;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int telefono;
	private Asignatura calificaciones[];
	public Alumno(String nombre, String apellidos) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		telefono = generaTel();
		calificaciones = new Asignatura[4];
	}
	
	private int generaTel() {
		
		int devolver = (int)(Math.random()*1000000000+100000000);
		
		return devolver;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Asignatura[] getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(Asignatura[] calificaciones) {
		this.calificaciones = calificaciones;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", calificaciones="
				+ Arrays.toString(calificaciones) + "]";
	}
}
