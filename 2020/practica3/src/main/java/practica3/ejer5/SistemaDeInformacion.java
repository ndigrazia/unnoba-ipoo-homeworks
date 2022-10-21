package practica3.ejer5;

import java.util.Observable;
import java.util.Observer;

public class SistemaDeInformacion implements Observer {

    @Override
    public void update(Observable arg0, Object arg1) {
       imprimir ((Impresora) arg0);
    }
     public void imprimir(Impresora arg0) {
         System.out.println(arg0);
     }

    public static void main(String[] args) {
        SistemaDeInformacion si = new SistemaDeInformacion();

        Impresora i1 = new Impresora("Uno", true);
        i1.addObserver(si);

        Impresora i2 = new Impresora("Dos", false);
        i2.addObserver(si);

        i1.setImprimiendo(true);
        i2.setEncendida(true);
    }

}