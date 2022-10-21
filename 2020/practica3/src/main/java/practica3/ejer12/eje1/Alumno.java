package practica3.ejer12.eje1;

public class Alumno extends Cliente {

	public Alumno(String nombre, String dNI) {
		super(nombre, dNI);
	}

	public float descuento() {
		return 20;
	}

}
