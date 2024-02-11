package ej03_Series;

public class Videojuego implements Entregable{

	public String titulo;
	public int horasEst;
	public boolean entregado; 
	public String genero;
	public String compañia;
	
	public Videojuego() {
		this.titulo ="";
		this.horasEst = 10;
		this.entregado = false;
		this.genero = "";
		this.compañia = "";
	}
	public Videojuego(String titulo, int horasEst) {
		this();
		this.titulo = titulo;
		this.horasEst = horasEst;
	}
	public Videojuego(String titulo,int horasEst, String genero, String compañia) {
		this(titulo, horasEst);
		this.genero = genero;
		this.compañia = compañia;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHorasEst() {
		return horasEst;
	}
	public void setHorasEst(int horasEst) {
		this.horasEst = horasEst;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEst=" + horasEst + ", entregado=" + entregado + ", genero="
				+ genero + ", compañia=" + compañia + "]";
	}
	@Override
	public void entregar() {
		this.entregado = true;
	}
	@Override
	public void devolver() {
		this.entregado = false;
	}
	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	
	
	
}
