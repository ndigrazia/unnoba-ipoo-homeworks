package ar.edu.unnoba.ipoo.practica1.ejer7;

public enum Moneda {
	
	DOLAR(27.09f), YEN(0.24f), EURO(31.49f);
	
	private final float monto;
	
	Moneda(float monto) {
		this.monto = monto;
	}
	
	public float monto() {
		return monto;
	}
	
}
