package ejerciciosjava009;

import java.util.Scanner;

import Ejerciciosjava008.Estudiante;

public class MainNueve {
	
	/*
	 * . Escriba un programa que solicite al usuario que ingrese el número de  estudiantes y el nombre y la puntuación de cada alumno, 
	 * y finalmente  muestra al alumno con el puntaje más alto y el estudiante con el segundo  puntaje más alto.
	 */

	public static void main(String[] args) {
		
		int numeroEstudiantes = 0;
		int puntajeMayor = 0;
		String nombreEstudiantePuntajeMayor = null;
		int SegundoPuntajeMayor = 0;
		String nombreSegundoEstudiantePuntajeMayor = null;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el número de estudiantes");
		
		numeroEstudiantes = leer.nextInt();
		
		Estudiante[] estudiantes = new Estudiante[numeroEstudiantes];
		
		for (int i = 1; i <= numeroEstudiantes; i++) {
			
			leer.nextLine(); //Limpia el buffer, http://puntocomnoesunlenguaje.blogspot.com/2013/02/arrays-java-empleado-que-mas-gana.html 
								//https://www.clasesdeinformaticaweb.com/java-desde-cero/el-buffer-de-la-clase-scanner/#:~:text=Scanner%20en%20java.-,El%20buffer%20de%20entrada%20de%20datos%20de%20la%20clase%20Scanner,teclean%20hacen%20el%20siguiente%20recorrido.
			
			System.out.println("Ingrese el nombre del estudiante " + i);
			
			String nombreEstudiante = leer.nextLine();
			
			System.out.println("Ingrese el puntaje del estudiante " + i);
			
			int puntaje = leer.nextInt();
						
			
			Estudiante estudiante = new Estudiante(nombreEstudiante, puntaje);
			
			//System.out.println("El estudiante es: " + estudiante);
			
			estudiantes[i-1] = estudiante;
			
			//System.out.println("El estudiante en el arreglo es: " + estudiantes[i-1]);
			
			if (puntaje > puntajeMayor) {
				
				SegundoPuntajeMayor = puntajeMayor;
				nombreSegundoEstudiantePuntajeMayor = nombreEstudiantePuntajeMayor;
				
				puntajeMayor = puntaje;
				nombreEstudiantePuntajeMayor = nombreEstudiante;
			}						
			
		}
		
		System.out.println("El puntaje mayor lo tiene el estudiante : "+ nombreEstudiantePuntajeMayor + " con un total de: " + puntajeMayor + " puntos");
		System.out.println("El segundo puntaje mayor lo tiene el estudiante : "+ nombreSegundoEstudiantePuntajeMayor + " con un total de: " + SegundoPuntajeMayor + " puntos");
		
		leer.close();

	}

}
