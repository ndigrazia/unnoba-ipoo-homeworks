package ar.edu.unnoba.ipoo.eje1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Comedor {

	private String telefono;
	private String direccion;
	private Vector<Reserva> reservas;
	
	public Comedor(String telefono, String direccion) {
		super();
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setReservas(new Vector<Reserva>());
	}
	
	/* Agrega una reserva a las reservas del comedor*/
	public void agregarReserva(Cliente cliente, Plato plato){
		Reserva reserva = new ReservaSimple(cliente, plato);
		getReservas().add(reserva);
	}
	
	/* Agrega varias reservas a las reservas del comedor*/
	public void agregarReserva(Cliente cliente, Vector<Plato> platos){
		Reserva reserva = new ReservaMultiple(cliente, platos);
		getReservas().add(reserva);
	}
	
	/* Retorna el valor del plato teniendo en cuenta los descuentos pertinentes */
	public float valorReserva(Reserva reserva){
		return reserva.getPrecioPlato();
	}
	
	/* Retorna la cantidad total de todos los platos reservados */
	public int totalPlatosReservados(){
		int aux = 0;
		for (Reserva reserva : reservas) {
			aux =+ reserva.getCantidadPlatos();
		}
		return aux;
	}
	
	/* Retorna la suma total de todos los valores platos reservados */
	public float totalValorReservas(){
		float aux = 0;
		for (Reserva reserva : reservas) {
			aux =+ valorReserva(reserva);
		}
		return aux;
	}
	
	/* Retorna la reserva que tenga mas platos reservados */
	public Reserva reservaMasPlatos(){
		Reserva auxReserva = null;
		int auxPlatos = 0;
		for (Reserva reserva : reservas) {
			if(reserva.getCantidadPlatos() > auxPlatos){
				auxPlatos = reserva.getCantidadPlatos();
				auxReserva = reserva;
			}
		}
		return auxReserva;
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Vector<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Vector<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	
	
}

