package ar.edu.unnoba.ipoo.practica1.ejer4;

import java.util.Date;

public class Simple extends Articulo {

	private String nombre;
	private Date vencimiento;
	private float precio;
	private float peso;
	
	public Simple() {
	}

	public Simple(float peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public float precio() {
		return precio;
	}
	@Override
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float p) {
		peso = p;
	}
}
