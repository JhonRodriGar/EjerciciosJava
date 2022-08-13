package Ejerciciosjava008;

public class Estudiante {
	
	private String nombre;
	private int puntaje;
	
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre, int puntaje) {
		this.nombre = nombre;
		this.puntaje = puntaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String toString() {
		return "Estudiante [nombre=" + nombre + ", puntaje=" + puntaje + "]";
	}
	
	
	

}
