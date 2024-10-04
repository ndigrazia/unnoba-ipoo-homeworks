package ar.edu.unnoba.model;

import java.util.Date;

public class Clima {

    private Date fecha;
    private Lugar lugar;
    private Humedad humedad;
    private Presion presion;
    private Temperatura temperatura;
    private Viento viento;
    
    public Clima(Date fecha, Temperatura temperatura) {
        this.temperatura = temperatura;
        this.fecha = fecha;
    }

    public Clima(Date fecha, Lugar lugar, Humedad humedad, Presion presion,
            Temperatura temperatura, Viento viento) {
        this.lugar = lugar;
        this.humedad = humedad;
        this.presion = presion;
        this.temperatura = temperatura;
        this.viento = viento;
        this.fecha = fecha;
    }

    public Lugar getLugar() {
        return lugar;
    }
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    public Humedad getHumedad() {
        return humedad;
    }
    public void setHumedad(Humedad humedad) {
        this.humedad = humedad;
    }
    public Presion getPresion() {
        return presion;
    }
    public void setPresion(Presion presion) {
        this.presion = presion;
    }
    public Temperatura getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }
    public Viento getViento() {
        return viento;
    }
    public void setViento(Viento viento) {
        this.viento = viento;
    }
    
    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Clima [lugar=" + lugar + ", Humedad=" + humedad + ", presion=" + presion + ", temperatura="
                + temperatura + ", viento=" + viento + "]";
    }
}
