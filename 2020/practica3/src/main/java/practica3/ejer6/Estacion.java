package practica3.ejer6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Estacion {

	private List<Clima> historial = new ArrayList<Clima>();
	
	private Random random = new Random();
	
	private Clima climaActual;
	private String ciudad;
	
	public Estacion(String c) {
		ciudad = c;
	}

	//Actualiza el clima
	public void actualizarClima() {
		Clima c = new Clima();
		
		Temperatura t = new Temperatura();
		t.setValor(random.nextInt(25));
		t.setEscala(Escala.Celsius);
		
		c.setUltimaActualizacion(GregorianCalendar.getInstance().getTime());
		c.setCiudad(ciudad);
		c.setActual(t);
		
		System.out.println(c);
		
		setClimaActual(c);	
		agregarClima(c);
	}
	
	//Agrega un clima al historial
	public void agregarClima(Clima c) {
		historial.add(c);
	}

	//Retorna el clima actual 
	public Clima getClimaActual() {
		return climaActual;
	}

	//Asigna el clima actual 
	public void setClimaActual(Clima climaActual) {
		this.climaActual = climaActual;
	}
	
	//Retorna los historiales del clima
	public List<Clima> getClimas() {
		return historial;
	}
	
	//Ordena el historial por temperatura
	public List<Clima> ordenarTemperatura() {
		List<Clima> o = new ArrayList<Clima>(historial);
		Collections.sort(o, new Comparator<Clima>() {

			public int compare(Clima o1, Clima o2) {
				return o1.getActual().compareTo(o2.getActual());
			}
		});
		
		return o;
	}
	
	//Ordena el historial por fecha 
	public List<Clima> ordenarClimaPorFecha() {
		List<Clima> o = new ArrayList<Clima>(historial);
		Collections.sort(o, new Comparator<Clima>() {
			public int compare(Clima o1, Clima o2) {
				return 	o1.getUltimaActualizacion().compareTo(o2.getUltimaActualizacion());
			}
		});
		
		return o;
	}
	
	public static void main(String[] args) {
		final Estacion e = new Estacion("Pergamino");
		
		Timer timer = new Timer();

	    TimerTask task = new TimerTask() {
			@Override
			public void run() {
				e.actualizarClima();	
			}
		};
		
		timer.schedule(task, 1, 3000);
		
		try {
            Thread.sleep(10000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        
		timer.cancel();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>> Por Temperatura: " + e.ordenarTemperatura());
		
	}
	

	
}
