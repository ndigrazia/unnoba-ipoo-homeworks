package ar.edu.unnoba.ipoo.eje1;

public class ReservaSimple extends Reserva {
	
	private Plato plato;
	
	public ReservaSimple(Cliente cliente, Plato plato) {
		super(cliente);
		this.setPlato(plato);
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	@Override
	public float getPrecioPlato() {
		return getCliente().descontar(getPlato().getPrecio());
	}

	@Override
	public int getCantidadPlatos() {
		return 1;
	}
	
}
