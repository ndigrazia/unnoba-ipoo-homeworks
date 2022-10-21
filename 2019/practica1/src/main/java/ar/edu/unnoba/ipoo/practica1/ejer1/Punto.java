package ar.edu.unnoba.ipoo.practica1.ejer1;

public class Punto {
	
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void sumar(int v) {
		x+=v;
		y+=v;
	}
	
	//TODO Realizar operación
	public void sumar(Punto p) {
		
	}
	
	//TODO Realizar operación
	public float distancia(Punto p) {
		return 0;
	}

	@Override
	public String toString() {
		return "Soy un Punto (x: " + x + ", y: " + y + ")";
	}

}
