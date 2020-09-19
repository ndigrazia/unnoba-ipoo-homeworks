package ar.edu.unnoba.ipoo.eje1;

public abstract class Cliente extends Persona {

	public Cliente(String nombre, String dNI) {
		super(nombre, dNI);
	}

	public abstract float descuento();
	
	public float descontar(float valor) {
		return valor - (valor * descuento() / 100);
	}
	
}
