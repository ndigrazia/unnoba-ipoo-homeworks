package practica3.ejer8;

public interface Desplazable {

	public void mover(Punto p);

	public default void mover(int unPunto, Direccion direccion) {
		Punto p = null;
		int valor = Math.abs(unPunto);

		if(direccion.compareTo(Direccion.NORTE) == 0) {
			p = new Punto(0, valor);
		} else if(direccion.compareTo(Direccion.SUR) == 0) {
			p = new Punto(0, -valor);
		} else if(direccion.compareTo(Direccion.ESTE) == 0) {
			p = new Punto(-valor, 0);
		} else if(direccion.compareTo(Direccion.OESTE) == 0) {
			p = new Punto(valor, 0);
		}

		mover(p);
	}
	
}
