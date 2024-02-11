package ej02_Contraseñas;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de contraseñas a generar: ");
        int cantidad = scanner.nextInt();
        
        Password[] passwords = new Password[cantidad];
        boolean[] esFuerte = new boolean[cantidad];
        
        for (int i = 0; i < passwords.length; i++) {
            System.out.print("Ingrese la longitud para la contraseña " + (i + 1) + ": ");
            int longitud = scanner.nextInt();
            passwords[i] = new Password(longitud);
            esFuerte[i] = passwords[i].esFuerte();
        }
        
        for (int i = 0; i < passwords.length; i++) {
        	String fortaleza;
        	if (esFuerte[i]) {
        	    fortaleza = "fuerte";
        	} else {
        	    fortaleza = "débil";
        	}
            System.out.println("Contraseña " + (i + 1) + " > " + fortaleza);
        }
        
        scanner.close();
	}

}
