package ar.edu.unnoba.ipoo.eje4;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Pieza {

	private List<Pieza> piezas = new ArrayList<Pieza>();

	public Kit(String numero, String nombre, int tiempoManoObraEnMinutos) {
		super(numero, nombre, tiempoManoObraEnMinutos);
	}

	public List<Pieza> getPiezas() {
		return piezas;
	}

	public void add(Pieza p) {
		piezas.add(p);
	}

	@Override
	public float getPrecio() {
		float r = 0;
		
		for(Pieza p : piezas)
			r+=p.getPrecio();
		
		return r;
	}
	
}
