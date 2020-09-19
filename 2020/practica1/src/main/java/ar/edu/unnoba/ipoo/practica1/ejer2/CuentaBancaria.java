package ar.edu.unnoba.ipoo.practica1.ejer2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class CuentaBancaria {

	private List<Transaccion> transacciones= new ArrayList<Transaccion>();

	private static final String DEPOSITO = "Deposito";
	private static final String EXTRACCION = "Extracción";
	
	private Titular titular;
		
	private float saldo;
	private Date fecha;
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public void extraer(float m) {
		if(saldo-m>= limite()) {
			saldo-=m;
			addTransaccion(new Transaccion(m, EXTRACCION));
		}
	}
	
	public void depositar(float m) {
		saldo+=m;
		addTransaccion(new Transaccion(m, DEPOSITO));
	}
	
	private void addTransaccion(Transaccion t) {
		transacciones.add(t);
	}
	
	public abstract float limite();
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public abstract void reinicio();
}
