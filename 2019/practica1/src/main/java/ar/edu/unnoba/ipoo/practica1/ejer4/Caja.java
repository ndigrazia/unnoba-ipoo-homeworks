package ar.edu.unnoba.ipoo.practica1.ejer4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caja extends Articulo {

	private List<Simple> simples = new ArrayList<Simple>();

	@Override
	public float precio() {
		float t = 0;
		for (Iterator iterator = simples.iterator(); iterator.hasNext();) {
			Simple simple = (Simple) iterator.next();
			t+=simple.precio();
		}
		
		return t;
	}

	@Override
	public float getPeso() {
		float t = 0;
		for (Iterator iterator = simples.iterator(); iterator.hasNext();) {
			Simple simple = (Simple) iterator.next();
			t+=simple.getPeso();
		}
		
		return t;
	}
	
	public void addSimple(Simple s) {
		simples.add(s);
	}
	
	public void removeSimple(Simple s) {
		simples.remove(s);
	}
}
