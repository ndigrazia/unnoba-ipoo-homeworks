package eje10;

public class Circulo extends FiguraGeometrica {

    private float radio;
	
	public Circulo(Punto origen, float radio) {
		super(origen);
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(getRadio(),2);
	}

}
