package clima.modelo;

import java.util.Date;

public class Clima {
	
	private double temperatura;
	private double minima;
	private double maxima;
	private String escala;
	private double presion;
	private double vientoVelocidad;
	private double vientoDireccion;
	private double humedad;
	private double visibilidad;
	private Date fecha;
	private String ciudad;
	 
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getMinima() {
		return minima;
	}
	public void setMinima(double minima) {
		this.minima = minima;
	}
	public double getMaxima() {
		return maxima;
	}
	public void setMaxima(double maxima) {
		this.maxima = maxima;
	}
	public String getEscala() {
		return escala;
	}
	public void setEscala(String escala) {
		this.escala = escala;
	}
	public double getPresion() {
		return presion;
	}
	public void setPresion(double presion) {
		this.presion = presion;
	}
	public double getVientoVelocidad() {
		return vientoVelocidad;
	}
	public void setVientoVelocidad(double vientoVelocidad) {
		this.vientoVelocidad = vientoVelocidad;
	}
	public double getVientoDireccion() {
		return vientoDireccion;
	}
	public void setVientoDireccion(double vientoDireccion) {
		this.vientoDireccion = vientoDireccion;
	}
	public double getHumedad() {
		return humedad;
	}
	public void setHumedad(double humedad) {
		this.humedad = humedad;
	}
	public double getVisibilidad() {
		return visibilidad;
	}
	public void setVisibilidad(double visibilidad) {
		this.visibilidad = visibilidad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Clima [temperatura=" + temperatura + ", humedad=" + humedad + ", visibilidad=" + visibilidad
				+ ", fecha=" + fecha + ", ciudad=" + ciudad + "]";
	}
	
}
