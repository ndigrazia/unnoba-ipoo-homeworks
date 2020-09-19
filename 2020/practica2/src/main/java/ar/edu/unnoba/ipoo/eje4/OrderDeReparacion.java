package ar.edu.unnoba.ipoo.eje4;

import java.util.ArrayList;
import java.util.List;

public class OrderDeReparacion {
	
	private List<Pieza> piezas = new ArrayList<Pieza>();
	
	private String numero;
	
	public OrderDeReparacion(String numero) {
		super();
		this.numero = numero;
	}

	public void add(Pieza p) {
		piezas.add(p);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public float getCostoReparacion() {
		float r = 0;
		
		for(Pieza p : piezas)
			r+=p.getPrecio();
		
		return r;
	}
}
