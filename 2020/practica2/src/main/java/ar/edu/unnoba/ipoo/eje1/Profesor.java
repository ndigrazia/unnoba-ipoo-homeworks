package ar.edu.unnoba.ipoo.eje1;

public class Profesor extends Cliente {

	public Profesor(String nombre, String dNI) {
		super(nombre, dNI);
	}

	public float descuento() {
		return 10;
	}

}
