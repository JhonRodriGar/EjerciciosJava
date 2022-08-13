package ejerciciosjava010;

public class MainDiez {
	
	/*
	 * Escriba un programa que muestre todos los n�meros del 100 al 1000, 
	 * diez  por l�nea, 
	 * que son divisibles por 5 o 6. 
	 * Los n�meros est�n separados  exactamente por un espacio. 
	 */

	public static void main(String[] args) {
		
		int contadorNumeros = 0;
		int saltoLinea = 10;
		
		for (int i = 100; i <= 1000; i++) {
			
			if (i%5 == 0 || i%6 == 0) {
				
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
