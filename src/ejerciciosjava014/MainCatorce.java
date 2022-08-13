package ejerciciosjava014;

import java.util.Scanner;

public class MainCatorce {
	
	/*
	 * Ejercicio para encontrar el máximo común divisor. 
	 * Primero encuentre d como  el mínimo de n1 y n2, 
	 * luego verifique si d, d-1, d-2, ..., 2 o 1 es un divisor para  n1 y n2 en este orden. 
	 * El primer divisor común de este tipo es el máximo  común divisor. para n1 y n2. 
	 * Escriba un programa que le solicite al usuario  que ingrese dos enteros y muestra el MCD. 
	 */

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int numeroUno = 0;
		int numeroDos = 0;
		int inicio = 0;
		int mcm = 0;
		
		System.out.println("Por favor ingrese el primer número");
		numeroUno = leer.nextInt();
		
		System.out.println("Por favor ingrese el segundo número");
		numeroDos = leer.nextInt();
		
		if (numeroUno > numeroDos) {
			inicio = numeroDos;
		}else {
			inicio = numeroUno;
		}
		
		while (inicio > 0 && mcm == 0) {
			
			//System.out.println("El número es: " + inicio);
			
			if (numeroUno%inicio == 0 && numeroDos%inicio == 0) {
				
				mcm = inicio;
				
			}
			
			inicio--;
			
		}
		
		System.out.println("El máximo común divisor de " + numeroUno + " y " + numeroDos + " es: " + mcm);
		
		leer.close();
		
		

	}

}
