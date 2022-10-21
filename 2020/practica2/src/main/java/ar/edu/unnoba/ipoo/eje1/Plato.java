package ar.edu.unnoba.ipoo.eje1;

public class Plato {

	private String nombre;
	private String dia;
	private Float precio;
	
	public Plato(String nombre, String dia, Float precio) {
		super();
		this.setNombre(nombre);
		this.setDia(dia);
		this.setPrecio(precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
	
}
