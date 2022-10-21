package practica3.ejer5;

import java.util.Observable;
import java.util.Observer;

public class SistemaDeInformacion implements Observer {

    @Override
    public void update(Observable arg0, Object arg1) {
            Impresora i = (Impresora) arg0;
            System.out.println(i);
    }

    public void imprimirTodo(Observable arg0, Object arg1){
        Impresora i = (Impresora) arg0;
        for(Documento d:i.getTrabajosEnCola()){
            d.imprimite();
        }
            System.out.println(i);
    }
    
    public void imprimir(Observable arg0, Object arg1, Documento documento){
        Impresora i = (Impresora) arg0;
            documento.imprimite();
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