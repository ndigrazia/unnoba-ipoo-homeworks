package ar.edu.unnoba.ipoo.practica1.ejer2;

public class Transaccion {
	
	private float monto;
	private String tipo;
	
	public Transaccion(float monto, String tipo) {
		super();
		this.monto = monto;
		this.tipo = tipo;
	}
	
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
