package eje8.model;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica {

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
				return Integer.compare(c1.getTemperatura().getValor(), 
					c2.getTemperatura().getValor());
			}
		});

		return temperatura;
	}

}
