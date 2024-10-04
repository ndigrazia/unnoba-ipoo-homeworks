package eje6;

public class Main {

    public static void main(String[] args) {
        Vehiculo v = new Automovil();
        v.acelerar();
        v.frenar();

        v = new Bicicleta();
        v.acelerar();
        v.frenar();
    }
}
