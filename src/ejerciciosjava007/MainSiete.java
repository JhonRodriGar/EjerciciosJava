package ejerciciosjava007;

public class MainSiete {

	/*
	 * Suponga que la matrícula de una universidad es de $ 10,000 este año y aumenta un 5% todos los años. 
	 * En un año, la matrícula será de $ 10,500.
	 * Escribe un programa que calcula la matrícula en diez años 
	 * y el costo total de cuatro años de matrícula después del décimo año.
	 */

	public static void main(String[] args) {
		
		double matricula = 10000;
		double sumaMatricula = 0;
		
		System.out.println("------------------------------------------------------");
		System.out.printf("%10s %20s %20s", "Año", "Matricula", "Sumatoria");
		System.out.println();
		System.out.println("------------------------------------------------------");
		
		for (int i = 1; i < 15; i++) {
						
			matricula = matricula * 1.05;
			
			if (i > 10) {
				sumaMatricula = sumaMatricula + matricula;
				//System.out.println("Suma matrícula " + i + " es: " + sumaMatricula);
			}
			
			System.out.printf("%10s %20s %20s", i, matricula, sumaMatricula);
			System.out.println();
			
		}
		
		System.out.println();
		
		System.out.println("El costo de 4 años de matrícula después del 10 año es: " + sumaMatricula);

	}

}
