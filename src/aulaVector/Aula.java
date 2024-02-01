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

	@Override
	public String toString() {
		return "Aula [aula=" + Arrays.toString(aula) + "]";
	}

}
