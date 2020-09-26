package ar.edu.unnoba.ipoo.eje4;

public class Simple extends Pieza {

	private float precio;
	
	public Simple(String numero, String nombre, int tiempoManoObraEnMinutos, float precio) {
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
