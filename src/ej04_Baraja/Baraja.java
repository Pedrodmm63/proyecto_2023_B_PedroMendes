package ej04_Baraja;

import java.util.Arrays;

public class Baraja {

	private Carta[] cartas = new Carta[40];
    private int cartasSacadas;	
    
    public Baraja() {
        cartasSacadas = 0;
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        int contador = 0;
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    cartas[contador++] = new Carta(i, palo);
                }
            }
        }
    }
    
    public void barajar() {
        for (int i = 0; i < cartas.length; i++) {
            int cartaAleatoria = (int) (Math.random() * cartas.length);
            cartas[i] = cartas[cartaAleatoria];
        }
    }
    public Carta siguienteCarta() {
    	if(cartasSacadas < cartas.length) {
    		return cartas[cartasSacadas++];	
    	}
    	else return null;
    }
    public int cartasDisponibles() {
    	return cartas.length - cartasSacadas;
    }
   
    public Carta[] darCartas(int numeroDeCartas) {
    	 if (numeroDeCartas > cartasDisponibles()) {
    	        System.out.println("No hay suficientes cartas para repartir.");
    	        return null; 
    	    } else {
    	        Carta[] cartasDadas = new Carta[numeroDeCartas];
    	        for (int i = 0; i < numeroDeCartas; i++) {
    	            cartasDadas[i] = siguienteCarta(); 
    	        }
    	        return cartasDadas;
    	    }
    } 
    
    public void cartasMonton() {
    	if (cartasSacadas == 0) {
            System.out.println("No se ha sacado ninguna carta aún.");
        } else {
            System.out.println("Cartas sacadas hasta ahora:");
            for (int i = 0; i < cartasSacadas; i++) {
                System.out.println(cartas[i].toString());
            }
        }
	}
    public void mostrarBaraja() {
        for (int i = cartasSacadas; i < cartas.length; i++) {
            System.out.println(cartas[i].toString());
        }
    }

	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + ", cartasSacadas=" + cartasSacadas + "]";
	}
    
    
}
