package practica3.ejer12.eje1;

public class Profesor extends Cliente {

	public Profesor(String nombre, String dNI) {
		super(nombre, dNI);
	}

	public float descuento() {
		return 10;
	}

}
