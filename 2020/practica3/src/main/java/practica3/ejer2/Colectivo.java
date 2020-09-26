package practica3.ejer2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Colectivo implements Vehiculo {

	private String patente;
	private String modelo;
	private int cantidadPasajeros;
	private int kmts;
	private Viaje ultimoViaje;
	
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
		 	//Genero el viaje
			setUltimoViaje(crearViaje(cantPas));
			kmts+=cantKmts;
			return true;
		 }
		 
		 return false;
	}

	private Viaje crearViaje(int cantPas) {
		Viaje v = new Viaje(GregorianCalendar.getInstance().getTime(),
				cantPas);
		return v;
	}

	@Override
	public float getMillas() {
		return getKmts()/1.60934f;
	}

	@Override
	public Date getFechaUltimoViaje() {
		if(ultimoViaje!=null)
		 	ultimoViaje.getFecha();
		return null;
	}

	public Viaje getUltimoViaje() {
		return ultimoViaje;
	}

	private void setUltimoViaje(Viaje ultimoViaje) {
		this.ultimoViaje = ultimoViaje;
	}

}
