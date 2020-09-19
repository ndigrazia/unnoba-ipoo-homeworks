package ar.edu.unnoba.ipoo.eje1;

import java.util.Vector;

public class ReservaMultiple extends Reserva {

	private Vector<Plato> platos;
	
	public ReservaMultiple(Cliente cliente, Vector<Plato> platos) {
		super(cliente);
		this.setPlatos(platos);
	}

	public Vector<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(Vector<Plato> platos) {
		this.platos = platos;
	}

	@Override
	public float getPrecioPlato() {
		float aux = 0;
		for (Plato plato : platos) {
			aux =+ getCliente().descontar(plato.getPrecio());
		}
		return aux - (aux * 0.05f);
	}

	@Override
	public int getCantidadPlatos() {
		return getPlatos().size();
	}

}
