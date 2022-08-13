package ejerciciosjava0181;

public class MainDieciochoUno {
	
	/*
	 * Utilice bucles anidados que muestren los siguientes patrones en cuatro  programas:
	 * 
	 * 1
	 * 1 2
	 * 1 2 3
	 * 1 2 3 4
	 * 1 2 3 4 5
	 * 1 2 3 4 5 6
	 */

	public static void main(String[] args) {
		
		int numeroFilas = 15;
		
		for (int i = 0; i <= numeroFilas; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(j + " ");
				
			}
			
			System.out.println();
		}

	}

}
