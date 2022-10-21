package ar.edu.unnoba.ipoo.practica1.ejer3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cooperativa {

	private List<Chofer> choferes = new ArrayList<Chofer>();

	public Chofer realizarViaje(int cantPas, float cantKmts) {
		for (Chofer chofer:choferes) {
			if(chofer.realizarViaje(cantPas, cantKmts)) {
				return chofer;
			}
		}
		
		return null;
	}

	public Vehiculo mayorKilimetro() {
		int max = 0;
		Vehiculo cMax= null;
		for (Iterator iterator = choferes.iterator(); iterator.hasNext();) {
			Chofer chofer = (Chofer) iterator.next();
			if(chofer.kilometraje() > max) {
					max = chofer.kilometraje();
					cMax = chofer.getVehiculo();
			}
		}
		
		return cMax;
	}

	public void addChofer(Chofer c) {
		choferes.add(c);
	}
}
