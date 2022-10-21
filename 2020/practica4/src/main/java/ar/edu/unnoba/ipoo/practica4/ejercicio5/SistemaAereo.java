package ar.edu.unnoba.ipoo.practica4.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class SistemaAereo {
	
	private List<Pasajero> pasajeros = new ArrayList<Pasajero>();
	private List<PasajeAereo> pasajes = new ArrayList<PasajeAereo>();
	private List<Vuelo> vuelos = new ArrayList<Vuelo>();
	
	public SistemaAereo(){
	}

	public void addPasaje(PasajeAereo p) {
		pasajes.add(p);
	}
	
	public void addVuelo(Vuelo v) {
		vuelos.add(v);
	}
	
	/**
	 * Dar de alta Pasajeros en el sistema (E)
	 * @param p
	 */
	public void addPasajero(Pasajero p) {
		pasajeros.add(p);
	}
	
	/**
	 * Buscar los pasajes (todos) que se le vendieron a una persona en particular(F)
	 * @param p
	 * @return
	 */
	public List<PasajeAereo> verPasajesVendidosDe(Pasajero p){
		List<PasajeAereo> pjes = new ArrayList<PasajeAereo>();
		
		for(PasajeAereo pa: pasajes){
			if(pa.getPasajero().equals(p))
				pjes.add(pa);
		}
		
		return pjes;
	}
	
	/**
	 * Saber la cantidad de pasajes de cada categor�a. El total y la cantidad ocupados (C)
	 *
	 */
	/*public List<CantidadPasajeCategoria> getCantidadTotalDePasajesPorCategoria(){
		List<CantidadPasajeCategoria> l = new ArrayList<CantidadPasajeCategoria>();
		
		for(Clase c : Clase.values()){
			int cpt = 0;
			int cpv = 0;
				
			for(Vuelo v: vuelos){
				cpt += v.getCantMaxPasajerosEn(c);
				cpv += v.getCantPasajesVendidosEn(c);
			}
			
			l.add(new CantidadPasajeCategoria(c, cpt, cpv));
		}
	
		return l;
	}*/
	
	/**
	 * Eliminar una venta y dejar libre el lugar(D)
	 * @param p
	 */
	public void removerVenta(PasajeAereo p){
		if(p.getVuelo().removerPasaje(p)) 
			pasajes.remove(p);
	}
	
	/**
	 * Vender un pasaje de un vuelo en una categor�a para una persona en particular(A)
	 * @param p
	 * @param vuelo
	 * @param ciudadOrigen
	 * @param ciudadDestino
	 * @param clase
	 */
	/*public void venderPasaje(Pasajero p, Vuelo vuelo, Clase clase) throws
		SuperaAsientosPorCategoriaException, PasajeVendidoAPasajeroException {
		
		if(!tienePasajeVendido(p, vuelo)) {
			if(vuelo.getCantPasajesVendidosEn(clase)< vuelo.getCantMaxPasajerosEn(clase)){
				PasajeAereo pa = new PasajeAereo(vuelo, vuelo.getCiudadOrigen(), 
						vuelo.getCiudadDestino(), vuelo.getFechaSalida(), p, clase);
				vuelo.addPasaje(pa);
				addPasaje(pa);
			}else {
				throw new SuperaAsientosPorCategoriaException();
			}
		}
		else {
			throw new PasajeVendidoAPasajeroException();
		}
	}*/
	
	/**
	 * Saber qu� porcentaje de un vuelo est� ocupado(B)
	 * @param vuelo
	 * @return
	 */
	public float getPorcentajeOcupadoDe(Vuelo vuelo){
		return (vuelo.getCantPasajesVendidos() / vuelo.getCantMaxPasajeros()) * 100 ;
	}
	
	private boolean tienePasajeVendido(Pasajero p, Vuelo vuelo)  {
		for(PasajeAereo pa: vuelo.getPasajesVendidos()){
			if(pa.getPasajero().equals(p))
				return true;
		}
		
		return false;
	}

}
