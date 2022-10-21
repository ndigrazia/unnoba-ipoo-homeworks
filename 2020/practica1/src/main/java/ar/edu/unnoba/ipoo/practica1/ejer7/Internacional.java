package ar.edu.unnoba.ipoo.practica1.ejer7;

public class Internacional extends Transaccion {

	private static final float IMPUESTO = 1.10f;

	private Moneda moneda;
	
	@Override
	public float montoEnPesos() {
		return getMonto() * moneda.monto();
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	public float montoConImpuesto() {
		return montoEnPesos() * IMPUESTO;
	}
}
