package practica3.ejer3;

public class Rectangulo extends FiguraGeometrica {

	private float base;
	private float altura;
	
	public Rectangulo(Punto origen, float base, float altura) {
		super(origen);
		this.base = base;
		this.altura = base;
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
