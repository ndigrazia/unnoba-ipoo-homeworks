package eje8.model;

public class Temperatura {

    private int valor;
    private Escala escala;

    public Temperatura(int valor, Escala escala) {
        this.valor = valor;
        this.escala = escala;
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
        return "Temperatura [valor=" + valor + ", escala=" + escala + "]";
    }

    public enum Escala { CELSIUS, KELVIN, FAHRENHEIT; } 
    
}
