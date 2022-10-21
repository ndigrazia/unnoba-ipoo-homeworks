package practica3.ejer3;

public abstract class FiguraGeometrica implements Desplazable {

	private Punto origen;

	public FiguraGeometrica(Punto origen) {
		this.origen = origen;
	}
	
	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public void deplazar(Punto p) {
		p.sumar(p);
	}
	
	public void mover(int unPunto, Direccion direccion) {
		Punto p = null;
		int valor = Math.abs(unPunto);	
		
		if(direccion.compareTo(Direccion.NORTE) == 0) {
			p = new Punto(0, valor);
		} else if(direccion.compareTo(Direccion.SUR) == 0) {
			p = new Punto(0, -valor);
		} else if(direccion.compareTo(Direccion.ESTE) == 0) {
			p = new Punto(-valor, 0);
		} else if(direccion.compareTo(Direccion.OESTE) == 0) {
			p = new Punto(valor, 0);
		}
		
		deplazar(p);
	}
	
	public abstract double superficie();

}
