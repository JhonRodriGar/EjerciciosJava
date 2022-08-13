package ejerciciosjava004;

public class MainCuatro {

	/*
	 * Escriba un programa que muestre la siguiente tabla (tenga en cuenta que 1 milla es 1,609 kilómetros): 
	 * Millas Kilómetros 
	 * 1 		1.609 
	 * 2 		3.218 
	 * … 		… 
	 * 9 		14.481 
	 * 10 		16.090
	 */

	public static void main(String[] args) {

		int milla = 1609;

		System.out.println("--------------------------------------");
		System.out.printf("%10s %20s", "Millas", "Kilómetros");
		System.out.println();
		System.out.println("--------------------------------------");

		for (int i = 1; i <= 10; i++) {

			System.out.format("%7s %20s", i, milla*i);
			System.out.println();

		}

		System.out.println("--------------------------------------");
		
	}

}
