package ar.edu.unnoba.ipoo.practica1.ejer3;

public class Colectivo extends Vehiculo {

	private String patente;
	private String modelo;
	private int cantidadPasajeros;
	private int kmts;
	
	public int getKmts() {
		return kmts;
	}
	public void setKmts(int kmts) {
		this.kmts = kmts;
	}

	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}
	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}
	
	public boolean realizarViaje(int cantPas, float cantKmts) {
		 if(cantPas <= cantidadPasajeros) {
			 kmts+=cantKmts;
			 return true;
		 }
		 
		 return false;
	}
}
