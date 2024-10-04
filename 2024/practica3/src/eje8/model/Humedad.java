package eje8.model;

public class Humedad {
    private int valor;
    private Escala escala;

    public Humedad(int valor) {
        this.valor = valor;
        this.escala = Escala.PORCENTAJE;
    }

    public int getValor() {
        return valor;
    }

    public Escala getEscala() {
        return escala;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }

    @Override
    public String toString() {
        return "Humedad [valor=" + valor + ", escala=" + escala + "]";
    }

    public enum Escala { PORCENTAJE; } 
}
