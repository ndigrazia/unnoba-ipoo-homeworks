package ar.edu.unnoba.ipoo.eje4;

public abstract class Pieza {
	
	private String numero;
	private String nombre;
	private int tiempoManoObraEnMinutos;
	
	public Pieza(String numero, String nombre, int tiempoManoObraEnMinutos) {
		this.numero = numero;
		this.nombre = nombre;
		this.tiempoManoObraEnMinutos = tiempoManoObraEnMinutos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public abstract float getPrecio();
	
	public int getTiempoManoObraEnMinutos() {
		return tiempoManoObraEnMinutos;
	}
	public void setTiempoManoObraEnMinutos(int tiempoManoObraEnMinutos) {
		this.tiempoManoObraEnMinutos = tiempoManoObraEnMinutos;
	}
	
}
