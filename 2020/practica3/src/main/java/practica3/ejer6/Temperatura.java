package practica3.ejer6;

public class Temperatura implements Comparable<Temperatura> {

	private float valor;
	private Escala escala;
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Escala getEscala() {
		return escala;
	}
	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	@Override
	public String toString() {
		return "Temperatura [valor=" + valor + ", escala=" + escala + "]";
	}
	
	public int compareTo(Temperatura t) {
		return (int)valor - (int)t.getValor();
	}
	
}
