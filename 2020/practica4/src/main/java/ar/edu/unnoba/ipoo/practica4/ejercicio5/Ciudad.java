package ar.edu.unnoba.ipoo.practica4.ejercicio5;

public class Ciudad {

	private String codPostal;
	private String nombre;
	
	public Ciudad(String codPostal, String nombre) {
		super();
		this.codPostal = codPostal;
		this.nombre = nombre;
	}
	
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
