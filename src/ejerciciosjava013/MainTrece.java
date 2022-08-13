package ejerciciosjava013;

public class MainTrece {

	/*
	 * Use un ciclo while para encontrar el entero más grande n tal que n ^ 3 sea menor que 12.000.
	 */

	public static void main(String[] args) {

		int resultado = 0;

		while (resultado * resultado *resultado < 1200) {

			resultado++;

			//System.out.println(resultado);

		}

		System.out.println("El número entero más grande que elevado al cubo es menor que 1200 es: " + (resultado-1));

	}

}
