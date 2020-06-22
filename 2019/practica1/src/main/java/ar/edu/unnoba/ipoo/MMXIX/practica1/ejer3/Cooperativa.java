package ar.edu.unnoba.ipoo.MMXIX.practica1.ejer3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cooperativa {

	private List<Chofer> choferes = new ArrayList<Chofer>();

	public Chofer realizarViaje(int cantPas, float cantKmts) {
		for (Iterator iterator = choferes.iterator(); iterator.hasNext();) {
			Chofer chofer = (Chofer) iterator.next();
			if(chofer.realizarViaje(cantPas, cantKmts)) {
				return chofer;
			}
		}
		
		return null;
	}

	public Colectivo mayorKilimetro() {
		int max = 0;
		Colectivo cMax= null;
		for (Iterator iterator = choferes.iterator(); iterator.hasNext();) {
			Chofer chofer = (Chofer) iterator.next();
			if(chofer.kilometraje() > max) {
					max = chofer.kilometraje();
					cMax = chofer.getColectivo();
			}
		}
		
		return cMax;
	}

}
