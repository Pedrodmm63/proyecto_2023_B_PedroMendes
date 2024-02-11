package ej03_Series;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroWriter {

	public void writeToFile(Serie[] series, Videojuego[] videojuegos) {
		String ruta = "C:\\Users\\pdmm2\\OneDrive\\Documentos";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (Serie serie : series) {
                bw.write(serie.toString());
                bw.newLine();
            }
            for (Videojuego videojuego : videojuegos) {
                bw.write(videojuego.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
