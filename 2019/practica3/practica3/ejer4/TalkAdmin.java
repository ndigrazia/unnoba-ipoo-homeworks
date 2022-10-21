package practica3.ejer4;

public class TalkAdmin {

	public static void main(String[] args) {
		Gato g = new Gato();
		hacerHablar(g);
		Perro p = new Perro();
		hacerHablar(p);
		RelojCucu c = new RelojCucu();
		hacerHablar(c);
	}
	
	public static void hacerHablar(Hablador h) {
		System.out.println(h.habla());
	}
}
