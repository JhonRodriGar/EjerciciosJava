package ejerciciosjava012;

public class MainDoce {
	
	/*
	 * Use un ciclo while para encontrar el n�mero entero m�s peque�o n tal que n  ^ 2 sea mayor de 12.000. 
	 */

	public static void main(String[] args) {
		
		int resultado = 0;
		
		while (resultado*resultado < 1200) {
			
			resultado++;
			
			//System.out.println(resultado);
			
		}
		
		System.out.println("El n�mero entero m�s peque�o que elevado al cudrado es mayor que 1200 es: " + resultado);

	}

}
