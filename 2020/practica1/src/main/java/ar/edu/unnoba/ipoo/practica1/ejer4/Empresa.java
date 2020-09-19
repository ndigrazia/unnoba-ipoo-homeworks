package ar.edu.unnoba.ipoo.practica1.ejer4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Empresa {

	private List<Contenedor> contenedores = new ArrayList<Contenedor>();
	
	private String nombre;
	private String direccion;
	
	public void addContenedor(Contenedor c) {
		contenedores.add(c);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public float peso(Articulo a) {
		return a.getPeso();
	}
	
	public float peso(Contenedor c) {
		return c.peso();
	}
	
	public float pesoContenedor() {
		float t = 0;
		for (Iterator iterator = contenedores.iterator(); iterator.hasNext();) {
			Contenedor contenedor = (Contenedor) iterator.next();
			t+=contenedor.peso();
		}
		return t;
	}	
	
	public float valorDeLosArticulos(Contenedor c) {
		return c.precio();
	}
				
	public float valorDeTodosLosArticulos() {
		float t = 0;
		for (Iterator iterator = contenedores.iterator(); iterator.hasNext();) {
			Contenedor contenedor = (Contenedor) iterator.next();
			t+=contenedor.precio();
		}
		return t;
	}	
}
