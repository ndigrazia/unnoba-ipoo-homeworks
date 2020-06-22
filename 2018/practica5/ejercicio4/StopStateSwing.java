package practica5.ejercicio4;

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
