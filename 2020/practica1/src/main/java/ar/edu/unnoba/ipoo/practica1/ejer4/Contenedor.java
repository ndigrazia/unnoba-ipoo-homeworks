package ar.edu.unnoba.ipoo.practica1.ejer4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contenedor {

	private List<Articulo> articulos = new ArrayList<Articulo>();
	
	private String id;
	private String destino;
	private int pesoMaximo;
	
	public void addArticulo(Articulo a) {
		articulos.add(a);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	
	public float peso() {
		float t = 0;
		for (Iterator iterator = articulos.iterator(); iterator.hasNext();) {
			Articulo articulo = (Articulo) iterator.next();
			t+= articulo.getPeso();
		}
		
		return t;
	}
	
	public float precio() {
		float t = 0;
		for (Iterator iterator = articulos.iterator(); iterator.hasNext();) {
			Articulo articulo = (Articulo) iterator.next();
			t+= articulo.precio();
		}
		
		return t;
	}
}
