package practica3.ejer8;

public class Rectangulo extends FiguraGeometrica {

	private float base;
	private float altura;
	
	public Rectangulo(Punto origen, float base, float altura) {
		super(origen);
		this.base = base;
		this.altura = base;
	}

	public Rectangulo(Punto origen, String nombre, String color, float base, float altura) {
		super(origen, nombre, color);
		this.base = base;
		this.altura = altura;
	}

	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}
	
}
