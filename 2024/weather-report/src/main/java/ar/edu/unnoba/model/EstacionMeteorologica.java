package ar.edu.unnoba.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class EstacionMeteorologica implements Observer {

    private List<Clima> historial = new ArrayList<Clima>();

	private Clima actual;

    public void agregarClima(Clima c) {
		actual = c;
		historial.add(c);
    }

	public void eliminarClima(Clima c) {
		if(c==actual)
			actual=null;
		historial.remove(c);
	}
	
	public Clima climaActual() {
		return actual;
	}

	public List<Clima> getClimas(){
		return historial;
	}
	
	public List<Clima> ordenarClimaPorFecha() {
		List<Clima> fecha = new ArrayList<>(historial);

		fecha.sort(new java.util.Comparator<Clima>() {
			public int compare(Clima c1, Clima c2) {
				return c1.getFecha().compareTo(c2.getFecha());
			}
		});

		return null;
	}
	
	public List<Clima> ordenarClimaPorTemperatura() {
		List<Clima> temperatura = new ArrayList<>(historial);

		temperatura.sort(new java.util.Comparator<Clima>() {
			public int compare(Clima c1, Clima c2) {
				return Double.compare(c1.getTemperatura().getValor(), 
					c2.getTemperatura().getValor());
			}
		});

		return temperatura;
	}

	@Override
    public void update(Observable observable, Object weather) {
        Channel channel = (Channel) weather;
        System.out.println(channel.toString());
		
		Date actual = Date.from(Instant.now());
		Temperatura temperatura = new Temperatura(channel.getTemperature(), 
			Temperatura.Escala.CELSIUS);

		agregarClima(new Clima(actual, temperatura)); 
    }

}
