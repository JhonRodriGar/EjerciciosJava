package ejerciciosjava015;

public class MainQuince {
	
	/*
	 * Escriba un programa que imprima los caracteres en la tabla de caracteres  ASCII desde ! hasta ~. 
	 * Muestra diez caracteres por línea. 
	 * Los caracteres  están separados exactamente un espacio. 
	 */

	public static void main(String[] args) {
		
		int saltoLinea = 41;
		
		for (char c  = 33; c < 127; c++) {
			
			System.out.print(c + " ");
			
			if (c > saltoLinea) {

				System.out.println();
				saltoLinea += 10;
				
			}
			
		}
		
	}
	
}
