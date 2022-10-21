package practica3.ejer5;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Impresora extends Observable {

	private List<Documento> trabajosEnCola = new ArrayList<Documento>();
	
	private String nombre;
	private boolean encendida; 
	private boolean imprimiendo;
	
	public Impresora(String nombre, boolean encendida) {
		this.nombre = nombre;
		this.encendida = encendida;
	}
	
	public boolean isEncendida() {
		return encendida;
	}
	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
		notificar();
	}
	
	public int getCantidadTrabajosEnCola() {
		return trabajosEnCola.size();
	}
        
	public List<Documento> getTrabajosEnCola() {
		return trabajosEnCola;
	}
	
	public void addTrabajoEnCola(Documento trabajosEnCola) {
		this.trabajosEnCola.add(trabajosEnCola);
		notificar();
	}
	
	private void notificar(){
		setChanged();
		notifyObservers();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		notificar();
	}
	
	@Override
	public String toString() {
		return "Impresona : " + getNombre() + " / Encendida : " + isEncendida() + 
			" / Imprimiendo : " + isImprimiendo() + " / Cant. Trabajos :" + getTrabajosEnCola();
	}

	public boolean isImprimiendo() {
		return imprimiendo;
	}
	public void setImprimiendo(boolean imprimiendo) {
		this.imprimiendo = imprimiendo;
		notificar();
	}

	@Override
	public synchronized void addObserver(Observer arg0) {
		super.addObserver(arg0);
	}

	public void imprimirTodo(){
		for(Documento d:getTrabajosEnCola())
			imprimir(d);
	}

	public void imprimir(Documento documento){
		setImprimiendo(true);
		documento.imprimite();
		setImprimiendo(false);
	}

}