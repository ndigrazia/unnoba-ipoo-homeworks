package practica5.ejercicio4;

public class Stopwatch {

	private final static String EMPTY = "00:00:00";
	
	private final static int SECONDS = 1000;
	private final static int MINUTES = 1000*60;
	private final static int HOURS = 1000*60*60;
	
	private long begin = 0;
	private long end = 0;
	
	private boolean running = false;
	
	public Stopwatch() {
	}
	
	public void clean() {
		begin = 0;
		end = 0;
	}
	
	public void start(){ 
		begin = System.currentTimeMillis();
		running = true;
	}

	public void stop() {
		end = System.currentTimeMillis();
		running = false;
	}
	
	public String getTime() {
		if(!running) {
			long t = end - begin;
			return getFormat(getHours(t)) + ":" +  
				getFormat(getMinutes(t)) + ":" + getFormat(getSeconds(t));
		}
		else {
			return EMPTY;
		}
	}
	
	private long getSeconds(long ms) {
		return (ms/SECONDS) % 60;
	}
	
	private long getMinutes(long ms) {
		return (ms/MINUTES) % 60;
	}

	private long getHours(long ms) {
		return (ms/HOURS) % 24;
	}
	
	private String getFormat(long t) {
		if(t > 9)
			return String.valueOf(t);
		else
			return "0" + t;
	}
	
}

