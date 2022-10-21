package practica3.ejer6;

import java.util.Date;

public class Clima {
	
	private String ciudad;
	private String provincia;
	private String pais;
	private Temperatura actual;
	private Temperatura minima;
	private Temperatura maxima;
	private float veloViento;
	private Direccion dirViento;
	private float humedad;
	private float visibilidad;
	private Date ultimaActualizacion;
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Temperatura getActual() {
		return actual;
	}
	public void setActual(Temperatura actual) {
		this.actual = actual;
	}
	public Temperatura getMinima() {
		return minima;
	}
	public void setMinima(Temperatura minima) {
		this.minima = minima;
	}
	public Temperatura getMaxima() {
		return maxima;
	}
	public void setMaxima(Temperatura maxima) {
		this.maxima = maxima;
	}
	public float getVeloViento() {
		return veloViento;
	}
	public void setVeloViento(float veloViento) {
		this.veloViento = veloViento;
	}
	public Direccion getDirViento() {
		return dirViento;
	}
	public void setDirViento(Direccion dirViento) {
		this.dirViento = dirViento;
	}
	public float getHumedad() {
		return humedad;
	}
	public void setHumedad(float humedad) {
		this.humedad = humedad;
	}
	public float getVisibilidad() {
		return visibilidad;
	}
	public void setVisibilidad(float visibilidad) {
		this.visibilidad = visibilidad;
	}
	public Date getUltimaActualizacion() {
		return ultimaActualizacion;
	}
	public void setUltimaActualizacion(Date ultimaActualizacion) {
		this.ultimaActualizacion = ultimaActualizacion;
	}
	
	@Override
	public String toString() {
		return "Clima [ciudad=" + ciudad + ", provincia=" + provincia + ", pais=" + pais + ", actual=" + actual
				+ ", minima=" + minima + ", maxima=" + maxima + ", veloViento=" + veloViento + ", dirViento="
				+ dirViento + ", humedad=" + humedad + ", visibilidad=" + visibilidad + ", ultimaActualizacion="
				+ ultimaActualizacion + "]";
	}

}
