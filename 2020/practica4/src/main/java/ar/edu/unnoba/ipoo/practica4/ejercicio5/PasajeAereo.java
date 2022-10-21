package ar.edu.unnoba.ipoo.practica4.ejercicio5;

import java.util.Date;

public class PasajeAereo {

	private static int NUMERO_PASAJE=0;
	
	private String numeroPasaje;
	private Vuelo vuelo;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private Date fechaSalida;
	private Pasajero pasajero;
		
	public PasajeAereo(Vuelo vuelo, Ciudad ciudadOrigen, Ciudad ciudadDestino, Date fechaSalida, Pasajero pasajero) {
		super();
		this.numeroPasaje = String.valueOf(++NUMERO_PASAJE);
		this.vuelo = vuelo;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.fechaSalida = fechaSalida;
		this.pasajero = pasajero;
	}
	
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	public String getNumeroPasaje() {
		return numeroPasaje;
	}
	public void setNumeroPasaje(String numeroPasaje) {
		this.numeroPasaje = numeroPasaje;
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}
	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	
	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}
	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
	
	public Pasajero getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	public boolean tieneEstePasajero(Pasajero pasajero) {
		return pasajero == pasajero;
	}
	
	public boolean eliminarVuelo() {
		return vuelo.removerPasaje(this);
	}
	
}
