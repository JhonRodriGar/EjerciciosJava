package ejerciciosjava0183;

public class MainDieciochoTres {
	
	/*
	 * Utilice bucles anidados que muestren los siguientes patrones en cuatro  programas:
	 * 
	 *           1
	 *         2 1
	 *       3 2 1
	 *     4 3 2 1
	 *   5 4 3 2 1
	 * 6 5 4 3 2 1
	 */

	public static void main(String[] args) {
		
		int numeroFilas = 10;
		
		for (int i = 1; i < numeroFilas; i++) {
			
			for (int j = 1; j < numeroFilas-i; j++) {
				
				System.out.print("  ");
				
			}
			
			for (int j = i; j > 0; j--) {
				
				System.out.print(j + " ");
				
			}
			
			System.out.println();
			
		}

	}

}
