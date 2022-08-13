package ejerciciosjava001;

import java.util.Scanner;

public class MainUno {

	/*
	 * Escriba un programa que lea un número no especificado de enteros, 
	 * determine cuántos valores positivos y negativos se han leído, y 
	 * calcula el total y
	 * promedio de los valores de entrada (sin contar ceros). 
	 * Tu programa termina con la entrada 0.
	 * Muestra el promedio como un número de punto flotante.
	 */

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		int validador = 1;		
		int contadorNumeros = 0;
		int sumador = 0;		
		int contadorPositivos = 0;		
		int contadorNegativos = 0;
		float promedio = 0;
		
		int[] numeros = new int [5];
		
		while (validador != 0) {
			
			System.out.println("Este es un programa que le permite ingresar varios números y calcula el total y promedio");
			System.out.println("Después de ingresar los números que desee, ingrese el 0 para que el programa muestre el resultado");
			System.out.println();
			System.out.println("Ingrese un número");
			
			validador = leer.nextInt();
			
			numeros[contadorNumeros] = validador;
			
			sumador = sumador + numeros[contadorNumeros];
			
			System.out.println("Número en la posición " + contadorNumeros + " " + numeros[contadorNumeros]);
			
			contadorNumeros++;
			
			if (validador > 0) {
				contadorPositivos++;
			} else if (validador < 0) {
				contadorNegativos++;
			}
			
			System.out.println();
			
		}
		
		System.out.println("La cantidad de números positivos es: " + contadorPositivos);
		System.out.println("La cantidad de números negativos es: " + contadorNegativos);
		
		System.out.println("La cantiad total de números es: " + (contadorNumeros-1));
		
		System.out.println("La suma de los números es: " + sumador);
		
		promedio = (float) sumador/(contadorNumeros-1); //Se utiliza (float) para poder que el resultado salga con decimales.
		
		System.out.println("El promedio de los números es: " + promedio);
		
		System.out.println("Se terminó la operación");
		
		leer.close();
		

 

	}

}
