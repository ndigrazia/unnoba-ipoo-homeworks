package ar.edu.unnoba.ipoo.MMXIX.practica1.ejer3;

public class Chofer {

	private Colectivo colectivo;

	public Chofer(Colectivo colectivo) {
		super();
		this.colectivo = colectivo;
	}

	public Colectivo getColectivo() {
		return colectivo;
	}

	public void setColectivo(Colectivo colectivo) {
		this.colectivo = colectivo;
	}
	
	public boolean realizarViaje(int cantPas, float cantKmts) {
		 return colectivo.realizarViaje(cantPas, cantKmts);
	}
	
	public int kilometraje() {
		return colectivo.getKmts();
	}
}
