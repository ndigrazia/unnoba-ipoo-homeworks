package ar.edu.unnoba.ipoo.eje2;

import java.util.ArrayList;
import java.util.List;

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
		int capMax = 0;
		Estadio eMax = null;
		
		for(Estadio e: estadios){
			int c = e.getCapacidad(); 
			if(c > capMax) {
				eMax = e;
				capMax = c;
			}
		}
		
		return eMax;
	}
	
	/**
	 * Retorna la suma de todos los espectadores de todos los partidos. Es decir, 
	 * la suma de la capacidad de cada estadio de cada partido. 
	 */
	public int cantidadTotalEspectadores() {
		int c = 0;
		
		for(Estadio e: estadios){ 
			c += e.getCapacidad();
		}
		
		return c;
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
		float c = 0;
		
		for(Partido p: partidos){ 
			c += p.montoRecaudado();
		}
		
		return c;
	}
	
}
