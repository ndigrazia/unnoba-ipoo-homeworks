package practica3.ejer2;

public class Main {

    public static void main(String[] args) {
        Colectivo v = new Colectivo();
        v.setCantidadPasajeros(40);

        Chofer chofer = new Chofer(v);

        Cooperativa coop= new Cooperativa();
        coop.addChofer(chofer);
        Chofer crv = coop.realizarViaje(12, 120);
        coop.mayorKilimetro();
    }

}
