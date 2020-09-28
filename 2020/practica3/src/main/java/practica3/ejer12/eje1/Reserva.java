package practica3.ejer12.eje1;

import java.util.Date;

public abstract class Reserva {
	
	private Cliente cliente;
	private Date fecha;
	
	public abstract float getPrecioPlato();
	public abstract int getCantidadPlatos();
	
	public Reserva(Cliente cliente) {
		super();
		this.setCliente(cliente);
		this.setFecha(new Date());
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String toString() {
		return getCliente().getNombre() + " " + getCantidadPlatos();
	}

}
