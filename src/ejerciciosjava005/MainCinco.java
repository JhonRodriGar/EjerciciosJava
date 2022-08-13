package ejerciciosjava005;

public class MainCinco {
	
	/*
	 * Escriba un programa que muestre las siguientes dos tablas una al lado de la  otra: 
		Kilogramos 		Libras 		Libras 		Kilogramos
		1 				2.2 		20 			9.09
		3 				6.6 		25 			11.36
		… 				… 			… 			…
		197 			433.4 		510 		231.82
		199 			437.8 		515 		234.09

	 */

	public static void main(String[] args) {
		
		double libra = 2.2;
		double incremento = 2.27;
		double kilo = 9.09;

		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%15s %20s %20s %20s", "Kilogramos", "Libras", "Libras", "Kilogramos");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");

		for (int i = 1, j = 20; i <= 200; i=i+2, j=j+5) {

			System.out.format("%10s %25s %20s %20s", i, libra*i, j, kilo);
			kilo = kilo+incremento;
			System.out.println();
			
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
	}

}
