package examen;

public abstract class Canal {
	
	private String name;
	private String fecuencia;
	
	public double incrementarCosto(double valor) {
		return valor + costo();
	}
	
	public abstract double costo();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFecuencia() {
		return fecuencia;
	}
	public void setFecuencia(String fecuencia) {
		this.fecuencia = fecuencia;
	}

	public abstract int contarCanalHD(); 
}
