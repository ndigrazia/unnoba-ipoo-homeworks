package ar.edu.unnoba.model;

public class Temperatura {

    private double valor;
    private Escala escala;

    public Temperatura(double valor, Escala escala) {
        this.valor = valor;
        this.escala = escala;
    }

    public double getValor() {
        return valor;
    }

    public Escala getEscala() {
        return escala;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }
    
    @Override
    public String toString() {
        return "Temperatura [valor=" + valor + ", escala=" + escala + "]";
    }

    public enum Escala { CELSIUS, KELVIN, FAHRENHEIT; } 
    
}
