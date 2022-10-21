package ar.edu.unnoba.ipoo.practica5.ejercicio2;

public enum Moneda {
    PESO("Peso"), DOLAR("Dolar");

    private String nombre;

    Moneda(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
