package ej04_Baraja;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baraja baraja = new Baraja();
		System.out.println(baraja);
		baraja.barajar();
		System.out.println(baraja);
		System.out.println(baraja.siguienteCarta());
		System.out.println(baraja.cartasDisponibles());
		baraja.darCartas(4);
		baraja.cartasMonton();
		baraja.mostrarBaraja();
	}

}
