package ejerciciosjava016;

import java.util.Scanner;

public class MainDieciseis {
	
	/*
	 * Escriba un programa que lea un n�mero entero y muestre todos sus factores  m�s peque�os en orden creciente. 
	 * Por ejemplo, si el n�mero entero de  entrada es 120, la salida debe ser como sigue: 2, 2, 2, 3, 5.
	 */

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int numero = 0;
		int contadorDivisores = 0;
		
		System.out.println("Ingrese el n�mero");
		numero = leer.nextInt();
		
		leer.close();
		
		/*
		 * Lo primero que se hace es encontrar todos los n�meros primos desde 2 hasta el n�mero ingresado.
		 */
		
		int listaPrimos[] = new int[numero]; //Crea el arreglo donde se guardar�n los n�meros primos encontrados.
		int posicionesArreglo = 0;
		
		for (int j = 1; j <= numero; j++) { //Pasa n�meros desde uno hasta llegar al n�mero ingresado.

			for (int i = 1; i <= j; i++) { //Eval�a cada n�mero a ver si es primo.

				if (j % i == 0) { //Verifica la cantidad de divisores que tiene el n�mero que recibe.

					contadorDivisores++;
					System.out.println("El n�mero " + j + " es dibicible sobre " + i);

				}

			}

			System.out.println("La sumatoria de divisores es " + contadorDivisores); //Muestra la sumatoria de divisores.

			if (contadorDivisores == 2) { //Los n�meros primos son los que solo se pueden dividir por 1 y por el mismo n�mero, es decir que solo tienen dos divisores.
				System.out.println("El n�mero " + j + " es primo");
				listaPrimos[posicionesArreglo] = j; //Cada uno de los n�meros primos los va guardando en el arreglo desde la posici�n 0 que es el valor al que est� igualada inicialmente la variable posicionesArreglo. 
				
				System.out.println("El valor del arreglo en la posici�n " + posicionesArreglo + " es " + listaPrimos[posicionesArreglo]);
				
				posicionesArreglo++; //Como ya tiene un valor guardado en la posici�n 0, el siguiente n�mero primo se debe guardar en al posici�n 1 y as� sucesivamente.
			} else {
				System.out.println("El n�mero " + j + " NO es primo"); //Si el n�mero tiene m�s de dos divisores indica que no es primo.
			}
			
			contadorDivisores = 0; //Suma la cantidad de divisores del 1 y resetea la variable para que sume la cantidad de divisores del 2, luego del 3 y as� sucesivamente.
			
			System.out.println();

		}
		
		System.out.println("El total de n�meros primos es: ");
		
		for (int i = 0; i < listaPrimos.length; i++) {
			
			if (listaPrimos[i] > 0) {
				
				System.out.println(listaPrimos[i]); //Imprime todos los n�meros primos que se han encontrado.
				
			}
		}
		
		posicionesArreglo = 0; //Resetea la variable para utilizarla posteriormente.
		
		int resultado = numero;
		
		while (resultado != 1) { //La verificaci�n de factores primos de un n�mero termina cuando el resultado de la divisi�n es 1.

			while (resultado % listaPrimos[posicionesArreglo] == 0) { //Verifica si el n�mero ingresado es divisible entre el primer n�mero primo encontrado, luego el segundo, etc.

				resultado = resultado / listaPrimos[posicionesArreglo]; //Si el n�mero es dibisible entonces realiza la divisi�n y sigue operando con el resultado.

				System.out.println("Divisor " + listaPrimos[posicionesArreglo]);

			}
			
			posicionesArreglo++; //Incrementa el valor del arreglo para que se eval�e con el siguiente n�mero primo que hay en el arreglo.

		}
		
	}

}
