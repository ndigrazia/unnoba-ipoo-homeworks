package ar.edu.unnoba.model;

public class Viento {

    private int velocidad;
    private Direccion direccion;
    
    public Viento(int velocidad, Direccion direccion) {
        this.velocidad = velocidad;
        this.direccion = direccion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Viento [velocidad=" + velocidad + ", direccion=" + direccion + "]";
    }

    public enum Direccion { NORTE, SUR, ESTE, OESTE; } 
}
