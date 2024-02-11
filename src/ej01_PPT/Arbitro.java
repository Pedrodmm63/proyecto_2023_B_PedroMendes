package ej01_PPT;

public class Arbitro {

	public int victoriasJugador1 = 0;
    public int victoriasJugador2 = 0;
    public int empate = 0;
    public int victoriaJ1 = 1;
    public int victoriaJ2 = 2;
	public final static int PIEDRA = 1;
	public final static int PAPEL = 2;
	public final static int TIJERA = 3;
    private final int victoriasParaGanar;

    public Arbitro(int victoriasParaGanar) {
        this.victoriasParaGanar = victoriasParaGanar;
    }

    public int jugar(int jugadaJugador1, int jugadaJugador2) {
        if (jugadaJugador1 == jugadaJugador2) {
            return empate;
        } else if ((jugadaJugador1 == PIEDRA && jugadaJugador2 == TIJERA) || 
                   (jugadaJugador1 == PAPEL && jugadaJugador2 == PIEDRA) || 
                   (jugadaJugador1 == TIJERA && jugadaJugador2 == PAPEL)) {
            victoriasJugador1++;
            return victoriaJ1;
        } else {
            victoriasJugador2++;
            return victoriaJ2;
        }
    }
    
    public boolean juegoTerminado() {
        return victoriasJugador1 == victoriasParaGanar || victoriasJugador2 == victoriasParaGanar;
    }

    public int obtenerGanador() {
        if (victoriasJugador1 == victoriasParaGanar) {
            return 1;
        } else if (victoriasJugador2 == victoriasParaGanar) {
            return 2;
        } else {
            return 0;
        }
    }
}
