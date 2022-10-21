package examen;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeAbonos {

	private List<Abono> abonos = new ArrayList<Abono>();
	
	public void agregarAbonos(Abono a) {
		abonos.add(a);
	}
	
	public double costoDe(Abono a) {
		return a.costoTotal();
	}
	
	public double totalACobrar() {
		double total = 0;
		
		for (Abono a: abonos) {
			total = a.costoTotal();
		}
		return total;
	}
	
	public int cantidadDePlanes() {
		int total = 0;
		
		for (Abono a: abonos) {
			total = a.cantidadDePlanes();
		}
		return total;
	}
	
	public void agregarAbonoOro(Cliente c, List<HD> canales) {
		Abono a = new Abono();
		a.setCliente(c);
		
		Oro o = new Oro();
		for(HD hd:canales) {
			o.agregarCanal(hd);
		}
		
		a.setPlan(o);
	}
	
	public int cantidadDeCanalesHD() {
		int total = 0;
		
		for (Abono a: abonos) {
			total = a.cantidadDeCanalesHD();
		}
		return total;
	}
	
}
