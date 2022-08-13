package ejerciciosjava017;

import java.util.Scanner;

public class MainDiecisiete {
	
	/*
	 * Escriba un programa que le pida al usuario que ingrese un número entero del  1 al 15 y muestra una pirámide. 
	 */

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un número del 1 al 15");
		int numero = leer.nextInt();
		
		leer.close();
		
		for (int i = 1; i <= numero; i++) {
			
			for (int j = 1; j <= numero-i; j++) {
				System.out.print(" ");
			}	
			
			
			for (int j = 1; j <= (i*2)-1; j++) {
				System.out.print("X");
			}
			
			System.out.println();
		}
		
		
		
	}
	
}
