package ejerciciosjava011;

public class MainOnce {
	
	/*
	 * Escribe un programa que muestre todos los n�meros del 100 al 200, 
	 * diez por  l�nea, 
	 * que sean divisibles entre 5 o 6, pero no ambos. 
	 * Los n�meros est�n  separados exactamente por un espacio. 
	 */

	public static void main(String[] args) {
		
		int contadorNumeros = 0;
		int saltoLinea = 10;
		
		for (int i = 100; i <= 200; i++) {
			
			if ((i%5 == 0 || i%6 == 0) && !(i%5==0 && i%6==0)) {
							
				System.out.print(i + " ");
				contadorNumeros ++;
				
				if (contadorNumeros == saltoLinea) {
					
					System.out.println();
					saltoLinea += 10;
					
				}
			}
			
		}
		
	}

}
