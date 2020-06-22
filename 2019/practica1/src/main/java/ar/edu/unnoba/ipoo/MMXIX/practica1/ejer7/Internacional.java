package ar.edu.unnoba.ipoo.MMXIX.practica1.ejer7;

public class Internacional extends Transaccion {

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

}
