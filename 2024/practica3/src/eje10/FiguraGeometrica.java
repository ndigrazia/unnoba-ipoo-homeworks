package eje10;

public abstract class FiguraGeometrica implements Figura, BidimensionalDesplazable {

    private Punto origen;
    private String color;
    
    public FiguraGeometrica(Punto origen, String color) {
        this.origen = origen;
        this.color = color;
    }

	public FiguraGeometrica(Punto origen) {
		this.origen = origen;
	}

	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	private void mover(Punto p) {
		p.sumar(p);
	}

	public void mover(int posicion, Direccion direccion) {
		Punto p = null;
		int valor = Math.abs(posicion);

		if(direccion.compareTo(Direccion.NORTE) == 0) {
			p = new Punto(0, valor);
		} else if(direccion.compareTo(Direccion.SUR) == 0) {
			p = new Punto(0, -valor);
		} else if(direccion.compareTo(Direccion.ESTE) == 0) {
			p = new Punto(-valor, 0);
		} else if(direccion.compareTo(Direccion.OESTE) == 0) {
			p = new Punto(valor, 0);
		}

		mover(p);
	}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void imprimir() { 
        System.out.println("Figura geometrica, color: " + color + ", area: " + area()); 
    }
    
    public abstract double area();

}
