package ar.edu.unnoba.ipoo.practica4.ejercicio5;

public class Pasajero {

	private String numero;
	private Persona persona;

	public Pasajero(String numero, Persona persona) {
		super();
		this.numero = numero;
		this.persona = persona;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
			
}
