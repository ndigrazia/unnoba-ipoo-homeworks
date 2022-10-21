package ar.edu.unnoba.ipoo.practica4.ejercicio10;

public class BeginStateSwing extends StateSwing {

	private final static String EMPEZAR = "Empezar";
	
	public BeginStateSwing(Stopwatch sw) {
		super(sw);
	}
	
	public String getName() {
		return EMPEZAR;
	}

	public StateSwing getNextState() {
		return new StopStateSwing(getStopwatch());
	}
	
	public void action() {
		getStopwatch().clean();
		getStopwatch().start();
	}

}
