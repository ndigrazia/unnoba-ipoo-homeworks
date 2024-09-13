package practica2.eje4;

public class Suma implements Operacion {

    private Operacion elemento1;
    private Operacion elemento2;

    public Suma(Operacion elemento1, Operacion elemento2) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }

    @Override
    public double calcular() {
       return elemento1.calcular() + elemento2.calcular();
    }

}