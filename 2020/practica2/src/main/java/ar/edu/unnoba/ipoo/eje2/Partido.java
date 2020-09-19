package ar.edu.unnoba.ipoo.eje2;

public class Partido {

	private String local;
	private String visitante;
	private Estadio estadio;
	private float valor;

	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	public String getVisitante() {
		return visitante;
	}
	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Partido(String equipo1, String equipo2, Estadio estadio, float valor) {
		super();
		this.local = equipo1;
		this.visitante = equipo2;
		this.estadio = estadio;
		this.valor = valor;
	}
	
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	public float montoRecaudado() {
		return estadio.getCapacidad() * valor;
	}
}