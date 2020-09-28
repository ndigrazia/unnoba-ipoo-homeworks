package practica3.ejer12.eje1;

public class Persona {

	private String nombre;
	private String DNI;

	public Persona(String nombre, String dNI) {
		super();
		this.setNombre(nombre);
		setDNI(dNI);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

}
