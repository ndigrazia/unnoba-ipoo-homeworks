package practica3.ejer8;

public class Cuadrado extends FiguraGeometrica {

	private float lado;
	
	public Cuadrado(Punto origen, float lado) {
		super(origen);
		this.lado = lado;
	}

	public Cuadrado(Punto origen, String nombre, String color, float lado) {
		super(origen, nombre, color);
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
}
