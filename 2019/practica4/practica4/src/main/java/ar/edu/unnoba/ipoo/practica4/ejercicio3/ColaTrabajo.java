package ar.edu.unnoba.ipoo.practica4.ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class ColaTrabajo {

	private Queue<Trabajo> colas = new LinkedList<Trabajo>();
	
	private String nombre;
	private boolean lista;
	
	public ColaTrabajo(String nombre, boolean lista) {
		this.nombre = nombre;
		this.lista = lista;
	}

	public boolean isLista() {
		return lista;
	}
	public void setLista(boolean lista) {
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Trabajo sacar() throws NoListaException, SinTrabajoEnColaException {
		if(!isLista())
			throw new NoListaException(getNombre(), colas.size());
		else if (colas.size() == 0)
			throw new SinTrabajoEnColaException(getNombre());
		else
			return colas.poll();
	}
	
	public void poner(Trabajo t) {
		colas.add(t);	
	}
	
	public static void main(String[] args) {
		ColaTrabajo ct = new ColaTrabajo("Cola1", true);
		ct.poner(new Trabajo(){});
		
		try {
			ct.sacar();
		} catch (NoListaException e) {
			e.getMessage();
		} catch (SinTrabajoEnColaException e) {
			e.getMessage();
		}
	}
}
