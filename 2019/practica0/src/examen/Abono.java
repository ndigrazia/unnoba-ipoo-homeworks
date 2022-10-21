package examen;

public class Abono {

	private double costoBase;
	private Cliente cliente;
	private Plan plan;
	
	public int cantidadCanales() {
		return plan.cantidadCanales();
	}
	
	public double costoTotal() {
		return costoBase + plan.costoTotal();
	}

	public double getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public int cantidadDePlanes() {
		return 1;
	}

	public int cantidadDeCanalesHD() {
		return plan.cantidadDeCanalesHD();
	}
	
}
