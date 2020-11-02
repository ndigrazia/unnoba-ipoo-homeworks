package ar.edu.unnoba.ipoo.practica4.ejercicio5;

public class PasajeVendidoAPasajeroException extends Exception {

	public PasajeVendidoAPasajeroException() {
		super("No se puede vender mas de un pasaje en el mismo vuelo al pasajero.");
	}
}
