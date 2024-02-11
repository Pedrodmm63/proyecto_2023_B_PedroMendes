package ej01_PPT;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbitro arbitro = new Arbitro(3);
		Jugador jugador1 = new Jugador("Jugador 1");
		Jugador jugador2 = new Jugador("Jugador 2");

		while (!arbitro.juegoTerminado()) {
			int jugadaJugador1 = jugador1.generarJugada();
			int jugadaJugador2 = jugador2.generarJugada();

			int resultado = arbitro.jugar(jugadaJugador1, jugadaJugador2);

			if (resultado == 0) {
				System.out.println("Empate en esta ronda.");
			} else if (resultado == 1) {
				System.out.println(jugador1.getNombre() +" gana esta ronda.");
			} else {
				System.out.println(jugador2.getNombre() + " gana esta ronda.");
			}
		}


		int ganador = arbitro.obtenerGanador();
		if (ganador == 1) {
			System.out.println(jugador1.getNombre() + " es el ganador del juego.");
		} else if (ganador == 2) {
			System.out.println(jugador2.getNombre() + " es el ganador del juego.");
		}
	}
}
