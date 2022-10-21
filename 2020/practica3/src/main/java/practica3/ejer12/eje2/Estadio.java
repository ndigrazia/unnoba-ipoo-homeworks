package practica3.ejer12.eje2;

public class Estadio {

	private int capacidad;
	private String nombre;
	
	public Estadio(int capacidad, String nombre) {
		super();
		this.capacidad = capacidad;
		this.nombre = nombre;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString(){
		return nombre;
	}
}
