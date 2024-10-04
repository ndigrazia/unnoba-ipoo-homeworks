package eje8.model;

public class Presion {
    
    private int valor;
    private Escala escala;

    public Presion(int valor) {
        this.valor = valor;
        this.escala = Escala.HPA;
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
        return "Presion [valor=" + valor + ", escala=" + escala + "]";
    }

    public enum Escala { HPA; } 
}
