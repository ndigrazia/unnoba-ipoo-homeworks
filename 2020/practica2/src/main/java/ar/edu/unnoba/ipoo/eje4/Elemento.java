package ar.edu.unnoba.ipoo.eje4;

public class Elemento extends Pieza {

	private float precio;
	
	public Elemento(String numero, String nombre, int tiempoManoObraEnMinutos, float precio) {
		super(numero, nombre, tiempoManoObraEnMinutos);
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
