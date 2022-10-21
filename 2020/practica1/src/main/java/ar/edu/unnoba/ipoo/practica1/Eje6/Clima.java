package ar.edu.unnoba.ipoo.practica1.Eje6;

import ar.edu.unnoba.ipoo.practica1.ejer5.Cliente;

import java.beans.Visibility;
import java.util.Date;

public class Clima extends Object{

    private Ciudad ciudad;
    private Pais pais;
    private Provincia provincia;
    private Temperatura actual;
    private Temperatura minima;
    private Temperatura maxima;
    private Presion presion;
    private Viento viento;
    private Humedad humedad;
    private Visibilidad visibilidad;
    private Date ultAct;

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
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

    public Presion getPresion() {
        return presion;
    }

    public void setPresion(Presion presion) {
        this.presion = presion;
    }

    public Viento getViento() {
        return viento;
    }

    public void setViento(Viento viento) {
        this.viento = viento;
    }

    public Humedad getHumedad() {
        return humedad;
    }

    public void setHumedad(Humedad humedad) {
        this.humedad = humedad;
    }

    public Visibilidad getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(Visibilidad visibilidad) {
        this.visibilidad = visibilidad;
    }

    public Date getUltAct() {
        return ultAct;
    }

    public void setUltAct(Date ultAct) {
        this.ultAct = ultAct;
    }

    @Override
    public int hashCode() {
        int hash = 13;

        hash = 31 * hash + (actual == null ? 0 : actual.hashCode());
        hash = 31 * hash + (pais == null ? 0 : pais.hashCode());

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if(!(obj instanceof Clima))
            return false;

        if(obj == this)
            return true;

        Clima clima = (Clima) obj;

        return actual.equals(clima.actual) && pais.equals(clima.getPais());
    }
}
