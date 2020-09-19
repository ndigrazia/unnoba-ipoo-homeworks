package ar.edu.unnoba.ipoo.practica1.ejer2;

public class CA extends CuentaBancaria {

	private int extracciones;
	
	public CA() {
		reinicio();
	}
	
	@Override
	public float limite() {
		return 10;
	}

	@Override
	public void extraer(float m) {
		if (extracciones > 0) {
			super.extraer(m);
			extracciones--;
		}
	}
	
	public void reinicio() {
		extracciones = 5;
	}

}
