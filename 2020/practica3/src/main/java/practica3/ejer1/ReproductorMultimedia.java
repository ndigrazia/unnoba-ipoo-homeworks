package practica3.ejer1;

public class ReproductorMultimedia implements VideoClip {

	private boolean ejecutando, bucle = false;
	
	public void bucle() {
		bucle=!bucle;
	}

	public void play() {
		ejecutando = true;
	}

	public void stop() {
		ejecutando = false;
	}

}
