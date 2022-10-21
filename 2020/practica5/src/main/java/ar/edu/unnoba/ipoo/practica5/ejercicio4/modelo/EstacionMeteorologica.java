package ar.edu.unnoba.ipoo.practica5.ejercicio4.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class EstacionMeteorologica extends Observable {

	private List<Clima> historial = new ArrayList<Clima>();
	private Clima actual;
	
	public void addClima(Clima c) {
		actual = c;
		historial.add(c);
		
		notificarCambios();
	}

	public void removeClima(Clima c) {
		if(c==actual)
			actual=null;
		historial.remove(c);
		
		notificarCambios();
	}
	
	public Clima getActual() {
		return actual;
	}

	public List<Clima> getClimas(){
		return historial;
	}
	
	public void ordenarClimaPorFecha() {
		notificarCambios();
	}
	
	public void ordenarClimaPorTemperatura() {
		notificarCambios();
	}
	
	private void notificarCambios() {
		  setChanged();
		  notifyObservers();
	}
}
