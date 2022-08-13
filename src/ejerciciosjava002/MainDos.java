package ejerciciosjava002;

import java.util.Random;

public class MainDos {
	
	/*
	 * Realice el programa para generar diez sumas de forma aleatoria para dos  enteros entre 1 y 15. Muestra el recuento. 
	 */

	public static void main(String[] args) {
		
		int contador = 10;
		int numeroUno = 0;
		int numeroDos = 0;
		int suma = 0;
		
		Random random = new Random();
		
		for (int i = 1; i <= contador; i++) {
			numeroUno = random.nextInt(15)+1;
			numeroDos = random.nextInt(15)+1;
			suma = numeroUno + numeroDos;
			System.out.println(i + " suma " + numeroUno + " más " + numeroDos + " es igual a: " + suma);
		}
		

	}

}
