package practica5.ejercicio3;

public enum Fase {

	LunaNueva(0), CrecienteIluminante(1), CuartoCreciente(2),
		GibosaIluminante(3), LunaLlena(4), GibosaMenguante(5), CuartoMenguante(6), CrecienteMenguante(7);
	
	private int fase;
	
	Fase(int f) {
		fase = f;
	}
	
	public int getFase(){
		return fase;
	}
	
}
