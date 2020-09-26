package practica3.ejer8;

public abstract class FiguraGeometrica implements Desplazable, FiguraMostrable {

	private Punto origen;
	private String nombre;
	private String color;

	public FiguraGeometrica(Punto origen) {
		this.origen = origen;
	}

	public FiguraGeometrica(Punto origen, String nombre, String color) {
		this.origen = origen;
		this.nombre = nombre;
		this.color = color;
	}

	public Punto getOrigen() {
		return origen;
	}
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public void mover(Punto p) {
		p.sumar(p);
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double area();
}
