package ar.edu.unnoba.ipoo.practica4.ejercicio5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vuelo {
	
	private static int NUMERO_VUELO=0;

	private String numeroVuelo;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private Date fechaSalida;
	private int cantMaxPasajeros;
	
	private List<PasajeAereo> pasajesVendidos = new ArrayList<PasajeAereo>();
		
	public Vuelo(Ciudad ciudadOrigen, Ciudad ciudadDestino, Date fechaSalida, int CantMaxPasajeros) {
		super();
		this.numeroVuelo = String.valueOf(++NUMERO_VUELO);;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.fechaSalida = fechaSalida;
		this.cantMaxPasajeros = CantMaxPasajeros;
	}
	
	public int getCantMaxPasajeros() {
		return cantMaxPasajeros;
	}

	public void setCantMaxPasajeros(int cantMaxPasajeros) {
		this.cantMaxPasajeros = cantMaxPasajeros;
	}

	public List<PasajeAereo> getPasajesVendidos() {
		return pasajesVendidos;
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
	
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	public String getNumeroVuelo() {
		return numeroVuelo;
	}
	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}
	
	public void addPasaje(PasajeAereo p) {
		pasajesVendidos.add(p);
	}
	
	public boolean removerPasaje(PasajeAereo p) {
		return pasajesVendidos.remove(p);
	}
	
	public int getCantPasajesVendidos() {
		return pasajesVendidos.size();
	}
	
	public boolean estaCompleto(){
		return getCantPasajesVendidos() == cantMaxPasajeros;
	}
	
	public boolean tienePasajeVendido(Pasajero p)  {
		for(PasajeAereo pa: pasajesVendidos){
			if(pa.tieneEstePasajero(p))
				return true;
		}
		
		return false;
	}

	public int cantDisponible() {
		return cantMaxPasajeros - getCantPasajesVendidos();
	}
	
	public float getPorcentajeOcupado() {
		return getCantPasajesVendidos() / cantMaxPasajeros * 100;
	}

}
