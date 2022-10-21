package ar.edu.unnoba.ipoo.practica1.ejer3;

public class Chofer {

	private Vehiculo vehiculo;

	public Chofer(Vehiculo vehiculo) {
		super();
		this.vehiculo = vehiculo;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo colectivo) {
		this.vehiculo = colectivo;
	}
	
	public boolean realizarViaje(int cantPas, float cantKmts) {
		 return vehiculo.realizarViaje(cantPas, cantKmts);
	}
	
	public int kilometraje() {
		return vehiculo.getKmts();
	}
}
