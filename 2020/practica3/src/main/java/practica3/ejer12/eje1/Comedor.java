package practica3.ejer12.eje1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		int r = reservas
					.stream().mapToInt(e -> e.getCantidadPlatos())
					.sum();
		return r;
	}
	
	/* Retorna la suma total de todos los valores platos reservados */
	public float totalValorReservas(){
		//Casteo porque se que trabajo con float.
		//No hay perdida de precisión
		float r = (float) reservas
				.stream().mapToDouble(e -> e.getPrecioPlato())
				.sum();

		return r;
	}
	
	/* Retorna la reserva que tenga mas platos reservados */
	public Reserva reservaMasPlatos(){
		Reserva r = reservas
				.stream()
				.max(Comparator.comparing(Reserva::getCantidadPlatos))
				.orElseThrow(NoSuchElementException::new);
		return r;
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

