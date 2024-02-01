package aulaVector;

public class Start {
	public static void main(String[] args) {

		
		Aula uno = new Aula();
		
		Alumno blete = new Alumno("blete","tuna");
		Alumno dogo = new Alumno("dogo","casero");
		Alumno layuco = new Alumno("pela","rdeguez");
		Alumno checa = new Alumno("checa","blanco");
		Alumno marcos = new Alumno("marcos","marcus");
		
		uno.add(blete);
		uno.add(dogo);
		uno.add(layuco);
		uno.add(checa);
		uno.add(marcos);
		
		Asignatura mate = new Asignatura("Mates");
		Asignatura lengua = new Asignatura("Lengua");
		Asignatura ingles = new Asignatura("Inglés");
		
		uno.añadirAsig(mate, lengua, ingles);
		
		System.out.println(uno);
		
	}

}
