package ar.edu.unnoba.ipoo.MMXIX.practica1.ejer7;

public abstract class Transaccion {

	private float monto;
	
	public void setMonto(float monto) {
		this.monto = monto;
	}
	
	public float getMonto() {
		return monto;
	}

	public abstract float montoEnPesos();
}
