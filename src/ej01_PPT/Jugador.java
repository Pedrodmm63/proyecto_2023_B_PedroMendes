package ej01_PPT;

public class Jugador {

	public String nombre;


	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	public int generarJugada() {
		return (int) (Math.random() * 3) + 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + "]";
	}

}
