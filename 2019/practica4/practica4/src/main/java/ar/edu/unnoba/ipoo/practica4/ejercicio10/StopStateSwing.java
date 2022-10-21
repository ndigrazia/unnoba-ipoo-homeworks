package ar.edu.unnoba.ipoo.practica4.ejercicio10;

public class StopStateSwing extends StateSwing {

	private final static String DETENER = "Detener";
	
	public StopStateSwing(Stopwatch sw) {
		super(sw);
	}

	public String getName() {
		return DETENER;
	}

	public StateSwing getNextState() {
		return new BeginStateSwing(getStopwatch());
	}

	public void action() {
		getStopwatch().stop();
	}

}
