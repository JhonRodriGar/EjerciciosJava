package ejerciciosjava016;

import java.util.Scanner;

public class MainDieciseis {
	
	/*
	 * Escriba un programa que lea un número entero y muestre todos sus factores  más pequeños en orden creciente. 
	 * Por ejemplo, si el número entero de  entrada es 120, la salida debe ser como sigue: 2, 2, 2, 3, 5.
	 */

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int numero = 0;
		int contadorDivisores = 0;
		
		System.out.println("Ingrese el número");
		numero = leer.nextInt();
		
		leer.close();
		
		/*
		 * Lo primero que se hace es encontrar todos los números primos desde 2 hasta el número ingresado.
		 */
		
		int listaPrimos[] = new int[numero]; //Crea el arreglo donde se guardarán los números primos encontrados.
		int posicionesArreglo = 0;
		
		for (int j = 1; j <= numero; j++) { //Pasa números desde uno hasta llegar al número ingresado.

			for (int i = 1; i <= j; i++) { //Evalúa cada número a ver si es primo.

				if (j % i == 0) { //Verifica la cantidad de divisores que tiene el número que recibe.

					contadorDivisores++;
					System.out.println("El número " + j + " es dibicible sobre " + i);

				}

			}

			System.out.println("La sumatoria de divisores es " + contadorDivisores); //Muestra la sumatoria de divisores.

			if (contadorDivisores == 2) { //Los números primos son los que solo se pueden dividir por 1 y por el mismo número, es decir que solo tienen dos divisores.
				System.out.println("El número " + j + " es primo");
				listaPrimos[posicionesArreglo] = j; //Cada uno de los números primos los va guardando en el arreglo desde la posición 0 que es el valor al que está igualada inicialmente la variable posicionesArreglo. 
				
				System.out.println("El valor del arreglo en la posición " + posicionesArreglo + " es " + listaPrimos[posicionesArreglo]);
				
				posicionesArreglo++; //Como ya tiene un valor guardado en la posición 0, el siguiente número primo se debe guardar en al posición 1 y así sucesivamente.
			} else {
				System.out.println("El número " + j + " NO es primo"); //Si el número tiene más de dos divisores indica que no es primo.
			}
			
			contadorDivisores = 0; //Suma la cantidad de divisores del 1 y resetea la variable para que sume la cantidad de divisores del 2, luego del 3 y así sucesivamente.
			
			System.out.println();

		}
		
		System.out.println("El total de números primos es: ");
		
		for (int i = 0; i < listaPrimos.length; i++) {
			
			if (listaPrimos[i] > 0) {
				
				System.out.println(listaPrimos[i]); //Imprime todos los números primos que se han encontrado.
				
			}
		}
		
		posicionesArreglo = 0; //Resetea la variable para utilizarla posteriormente.
		
		int resultado = numero;
		
		while (resultado != 1) { //La verificación de factores primos de un número termina cuando el resultado de la división es 1.

			while (resultado % listaPrimos[posicionesArreglo] == 0) { //Verifica si el número ingresado es divisible entre el primer número primo encontrado, luego el segundo, etc.

				resultado = resultado / listaPrimos[posicionesArreglo]; //Si el número es dibisible entonces realiza la división y sigue operando con el resultado.

				System.out.println("Divisor " + listaPrimos[posicionesArreglo]);

			}
			
			posicionesArreglo++; //Incrementa el valor del arreglo para que se evalúe con el siguiente número primo que hay en el arreglo.

		}
		
	}

}
