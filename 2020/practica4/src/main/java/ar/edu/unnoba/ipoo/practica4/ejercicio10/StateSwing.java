package ar.edu.unnoba.ipoo.practica4.ejercicio10;

public abstract class StateSwing {

	private Stopwatch stopwatch;
	
	public StateSwing(Stopwatch sw) {
		stopwatch = sw;
	}
	
	public Stopwatch getStopwatch() {
		return stopwatch;
	}

	public String getTime() {
		return getStopwatch().getTime();
	}
	
	public abstract String getName();
	
	public abstract StateSwing getNextState();
	
	public abstract void action();
	
}
