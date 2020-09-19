package ar.edu.unnoba.ipoo.eje4;

import java.util.ArrayList;
import java.util.List;

public class Taller {
	
	private List<OrderDeReparacion> ordenes = new ArrayList<OrderDeReparacion>();

	public void add(OrderDeReparacion p) {
		ordenes.add(p);
	}
	
	public float getCostoTotalReparacion() {
		float r = 0;
		
		for(OrderDeReparacion o: ordenes)
			r+=o.getCostoReparacion();
		
		return r;
	}
}
