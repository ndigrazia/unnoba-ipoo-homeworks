package examen;

import java.util.ArrayList;
import java.util.List;

public abstract class Plan {

	private List<Canal> canales = new ArrayList<Canal>();
	
	public int cantidadCanales() {
		return canales.size();
	}
	
	public double costoTotal() {
		return costoBase() + costoDeCanales();
	}
	
	protected void agregarCanal(Canal c) {
		canales.add(c);
	}
	
	protected void borrarCanal(Canal c) {
		canales.remove(c);
	}
	
	protected abstract double costoBase();
	
	public void addCanal(Canal c) {
		canales.add(c);
	}
	
	public void removeCanal(Canal c) {
		canales.remove(c);
	}
	
	public double costoDeCanales() {
		double total = 0;
		
		for (Canal c: canales) {
			total = c.incrementarCosto(total);
		}
		return total;
	}

	public int cantidadDeCanalesHD() {
		int total = 0;
		
		for (Canal c: canales) {
			total += c.contarCanalHD();
		}
		
		return total;
	}
}
