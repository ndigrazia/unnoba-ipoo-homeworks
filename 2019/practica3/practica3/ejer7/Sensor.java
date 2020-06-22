package practica3.ejer7;

import java.util.Observable;

public class Sensor extends Observable {

	private Estado estado;
	
	public void activar() {
		estado = Estado.ESPERANDO;
	}

	public void desactivar() {
		estado = Estado.APAGADO;
	}
	
	public void movimiento() {
		setChanged();
		notifyObservers();
		
		estado = Estado.ALERTA;	
	}
	
	@Override
	public String toString() {
		return "Sensor " + estado;
	}
}
