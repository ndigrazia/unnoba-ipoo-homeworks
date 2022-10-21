package ar.edu.unnoba.ipoo.practica1.ejer3;

public class Main {

    public static void main(String[] args) {
        Vehiculo v = new Tractor();
        Chofer chofer = new Chofer(v);
        Cooperativa coop= new Cooperativa();
        coop.addChofer(chofer);
        coop.mayorKilimetro();
    }

}
