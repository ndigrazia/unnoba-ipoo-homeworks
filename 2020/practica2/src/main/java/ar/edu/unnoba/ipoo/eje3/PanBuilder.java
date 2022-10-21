package ar.edu.unnoba.ipoo.eje3;

public abstract class PanBuilder {

	public void comprovarTemperatura(){
		System.out.println("comprovarTemperatura()");
	}
	
	public void prepararAguaConSal(){
		System.out.println("prepararAguaConSal()");
	};
	
	public void prepararLevadura(){
		System.out.println("prepararLevadura()");
	};
	
	public void anadirAguaYMezclar(){
		System.out.println("a�adirAguaYMezclar()");
	};

	public void amasar() {
		System.out.println("amasar()");
	};
	
	public void reposar() {
		System.out.println("reposar()");
	};
	
	public void cortarMasa() {
		System.out.println("cortarMasa()");
	};
	
	public void ponerEnHorno() {
		System.out.println("ponerEnHorno()");
	};

	public abstract Pan getPan();

	public abstract void anadirHarinaYRemover();
}
