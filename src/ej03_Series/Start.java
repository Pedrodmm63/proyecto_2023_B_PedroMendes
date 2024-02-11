package ej03_Series;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];
        
        series[0] = new Serie("Serie A", "Creador A");
        series[1] = new Serie("Serie B", 5, "Ciencia",  "Creador A");
        series[2] = new Serie("Serie C", "Creador B");
        series[3] = new Serie("Serie D", 2, "Terror", "Creador C");
        series[4] = new Serie("Serie E", "Creador B");

        videojuegos[0] = new Videojuego("Videojuego A", 20);
        videojuegos[1] = new Videojuego("Videojuego B", 10, "Shooter", "Compañia A");
        videojuegos[2] = new Videojuego("Videojuego C", 22);
        videojuegos[3] = new Videojuego("Videojuego D", 50, "Shooter", "Compañia A");
        videojuegos[4] = new Videojuego("Videojuego E", 65);
        
        series[1].entregar();
        videojuegos[4].entregar();
        
        int SeriesEntregadas = 0;
        for(int i = 0; i < series.length; i++) {
        	if(series[i].isEntregado()) {
        		SeriesEntregadas++;
        	}
        }
        System.out.println("Hay "+ SeriesEntregadas + " series entregadas");
        
        int VideojuegosEntregados = 0;
        for(int i = 0; i < series.length; i++) {
        	if(series[i].isEntregado()) {
        		VideojuegosEntregados++;
        	}
        }
        System.out.println("Hay "+ VideojuegosEntregados + " videojuegos entregados");
        
        
        FicheroWriter writer = new FicheroWriter();
        writer.writeToFile(series, videojuegos);
	}

}
