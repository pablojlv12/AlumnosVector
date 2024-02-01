package aulaVector;

import java.util.Arrays;

public class Aula {

	private Alumno aula[];
	private int contador;

	public Aula() {

		aula = new Alumno[5];
		contador = 0;
	}

	public void add(Alumno alumno) {

		if (contador < 5) {

			aula[contador] = alumno;
			contador++;
		}

	}

	public void añadirAsig(Asignatura uno, Asignatura dos, Asignatura tres) {

		for (Alumno alumno : aula) {

			alumno.add(uno);
			alumno.add(dos);
			alumno.add(tres);

		}
	}

	@Override
	public String toString() {
		return "" + Arrays.toString(aula);
	}

}
