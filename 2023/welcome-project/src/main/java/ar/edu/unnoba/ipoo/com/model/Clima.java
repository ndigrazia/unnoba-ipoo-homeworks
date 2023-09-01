package ar.edu.unnoba.ipoo.com.model;

public class Clima {

    private Lugar lugar;
    private Humedad Humedad;
    private Presion presion;
    private Temperatura temperatura;
    private Viento viento;
    
    public Clima(Lugar lugar, Humedad humedad, Presion presion,
            Temperatura temperatura, Viento viento) {
        this.lugar = lugar;
        Humedad = humedad;
        this.presion = presion;
        this.temperatura = temperatura;
        this.viento = viento;
    }

    public Lugar getLugar() {
        return lugar;
    }
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    public Humedad getHumedad() {
        return Humedad;
    }
    public void setHumedad(Humedad humedad) {
        Humedad = humedad;
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

    @Override
    public String toString() {
        return "Clima [lugar=" + lugar + ", Humedad=" + Humedad + ", presion=" + presion + ", temperatura="
                + temperatura + ", viento=" + viento + "]";
    }
    
}
