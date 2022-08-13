package ejerciciosjava006;

public class MainSeis {
	
	/*
	 * . Escriba un programa que muestre las siguientes dos tablas una al lado de la  otra:
			Millas 	Kilómetros 	Kilómetros 	Millas
			1 		1.609 		20 			12.430
			2 		3.218 		25 			15.538
			… 		… 			… 			…			
			9 		14.481 		60 			37.290
			10 		16.090 		65 			40.398

	 */

	public static void main(String[] args) {
		
		double kilometro = 1.609;
		double incremento = 3.10750999999999991;
		double milla = 12.430;

		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%15s %20s %20s %20s", "Millas", "Kilómetros", "Kilómetros", "Millas");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");

		for (int i = 1, j = 20; i <= 10; i++, j=j+5) {

			System.out.format("%10s %25s %20s %20s", i, kilometro*i, j, milla);
			milla = milla+incremento;
			System.out.println();
			
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
	}
}
