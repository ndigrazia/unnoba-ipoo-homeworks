package eje10;

public class Cuadrado extends FiguraGeometrica {

    private float lado;
	
	public Cuadrado(Punto origen, float lado) {
		super(origen);
		this.lado = lado;
	}
		
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return Math.pow(getLado(),2);
	}

    public void imprimir() { 
        System.out.println("Figura Cuadrado, color: " + getColor() + ", area: " + area()); 
    }

}
