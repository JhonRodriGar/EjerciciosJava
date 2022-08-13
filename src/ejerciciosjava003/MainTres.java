package ejerciciosjava003;

public class MainTres {
	
	/*
	 	Escribe un programa que muestre la siguiente tabla (ten en cuenta que 1  kilogramo es 2,2 libras): 
		Kilogramos 	Libras
		1 			2.2
		3 			6.6
		… 			…
		197 		433.4
		199 		437.8
	 */

	public static void main(String[] args) {
		
		double libra = 2.2;
		
		for (int i = 1; i < 200; i=i+2) {
			
			System.out.println(i + " kilogramo es igual a " + libra*i + " libras");
			
		}
		
	}

}
