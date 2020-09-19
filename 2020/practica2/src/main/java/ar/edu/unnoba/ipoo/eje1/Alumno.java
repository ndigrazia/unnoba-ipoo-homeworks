package ar.edu.unnoba.ipoo.eje1;

public class Alumno extends Cliente {

	public Alumno(String nombre, String dNI) {
		super(nombre, dNI);
	}

	public float descuento() {
		return 20;
	}

}
