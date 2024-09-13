package practica2.eje4;

public class Numero implements Operacion {
    
    private double numero;

    public Numero(double numero) {
        this.numero = numero;
    }

    @Override
    public double calcular() {
        return numero;
    }

}
