package practica3.ejer2;

import java.util.Date;

public class Pasajero2 extends Pasajero implements Frecuencia {

	private int millas;
	private Date ultimoViaje;

	public Pasajero2(String numero, Persona persona) {
		super(numero, persona);
	}

	public int getMillas() {
		return millas;
	}

	public Date getUltimoViaje() {
		return ultimoViaje;
	}
	
}
