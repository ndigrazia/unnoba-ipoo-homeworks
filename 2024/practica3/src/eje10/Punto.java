package eje10;

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
	
	/**
	 * Suma el mismo valor a x e y
	 * @param x
	 */
	public void sumar(int x){
		setX(getX() + x);
		setX(getY() + x);
	}

	/**
	 * Suma el mismo valor a x e y 
	 * @param unPunto
	 */
	public void sumar(Punto unPunto){
		setX(getX() + unPunto.getX());
		setY(getY() + unPunto.getY());
	}

	/**
	 * Calcula la distancia por Pitagoras (y2-y1)^2 + (x2-x1)^2
	 * @param unPunto
	 * @return
	 */
	public int distancia(Punto unPunto){ 
		return (getY() - unPunto.getY())^2 + 
			(getX() - unPunto.getX())^2;
	}
	
	public static void main(String[] args) {
	    Punto p1=new Punto(1,3);
        System.out.println("La coordenada del punto es: "+p1.getX()+"@"+p1.getY());
	}
	
}
