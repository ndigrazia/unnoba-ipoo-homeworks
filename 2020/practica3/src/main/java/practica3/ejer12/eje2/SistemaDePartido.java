package practica3.ejer12.eje2;

import practica3.ejer12.eje1.Reserva;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class SistemaDePartido {
	
	private List<Partido> partidos = new ArrayList<Partido>();
	private List<Estadio> estadios = new ArrayList<Estadio>();

	public void addEstadio(Estadio e) {
		estadios.add(e);
	}
	
	/**
	 * Agregra un partido a la colecci�n de partidos que tiene el sistema 
	 */
	public void agregarPartido(String local, String visita, Estadio estadio, float valorEntrada) {
		partidos.add(new Partido(local, visita, estadio, valorEntrada));
	}
	
	/**
	 * Retorna el estadio con mayor capacidad de espectadores
	 */
	public Estadio estadioConMayorCapacidad() {
		Estadio r = estadios.stream()
				.max(Comparator.comparing(Estadio::getCapacidad))
				.orElseThrow(NoSuchElementException::new);
		return r;
	}
	
	/**
	 * Retorna la suma de todos los espectadores de todos los partidos. Es decir, 
	 * la suma de la capacidad de cada estadio de cada partido. 
	 */
	public int cantidadTotalEspectadores() {
		return estadios.stream()
				.mapToInt(e -> e.getCapacidad())
				.sum();
	}

	/**
	 * Retorna la suma recaudada en el partido que se pasa como par�metro
	 */
	public float montoRecaudado(Partido partido) {
		return partido.montoRecaudado();
	}
	
	/**
	 * Retorna la suma total recaudada por todos los partidos del mundial 
	 */
	public float montoTotalRecaudado() {
		//Casteo porque se que trabajo con float.
		//No hay perdida de precisión
		float t = (float) partidos
				.stream().mapToDouble(e -> e.montoRecaudado())
				.sum();
		return t;
	}
	
}
