package ar.edu.unnoba.ipoo.practica1.ejer7;

public class Nacional extends Transaccion {

	private static final float IMPUESTO = 1.08f;

	@Override
	public float montoEnPesos() {
		return getMonto();
	}

	public float montoConImpuesto() {
		return montoEnPesos() * IMPUESTO;
	}
}
