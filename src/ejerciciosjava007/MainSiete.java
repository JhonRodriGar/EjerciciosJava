package ejerciciosjava007;

public class MainSiete {

	/*
	 * Suponga que la matr�cula de una universidad es de $ 10,000 este a�o y aumenta un 5% todos los a�os. 
	 * En un a�o, la matr�cula ser� de $ 10,500.
	 * Escribe un programa que calcula la matr�cula en diez a�os 
	 * y el costo total de cuatro a�os de matr�cula despu�s del d�cimo a�o.
	 */

	public static void main(String[] args) {
		
		double matricula = 10000;
		double sumaMatricula = 0;
		
		System.out.println("------------------------------------------------------");
		System.out.printf("%10s %20s %20s", "A�o", "Matricula", "Sumatoria");
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		for (int i = 1; i < 15; i++) {
						
			matricula = matricula * 1.05;
			
			if (i > 10) {
				sumaMatricula = sumaMatricula + matricula;
				//System.out.println("Suma matr�cula " + i + " es: " + sumaMatricula);
			}
			
			System.out.printf("%10s %20s %20s", i, matricula, sumaMatricula);
			System.out.println();
			
		}
		
		System.out.println();
		
		System.out.println("El costo de 4 a�os de matr�cula despu�s del 10 a�o es: " + sumaMatricula);

	}

}
