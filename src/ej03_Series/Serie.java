package ej03_Series;

public class Serie implements Entregable{

	public String titulo;
	public int numTemp;
	public boolean entregado;
	public String genero;
	public String creador;
	
	public Serie() {
		this.titulo = "";
		this.numTemp = 3;
		this.entregado = false;
		this.genero = "";
        this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this();
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int numTemp, String genero, String creador) {
		this(titulo, creador);
		this.numTemp = numTemp;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemp() {
		return numTemp;
	}

	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemp=" + numTemp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
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
