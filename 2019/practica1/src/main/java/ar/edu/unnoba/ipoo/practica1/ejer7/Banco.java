package ar.edu.unnoba.ipoo.practica1.ejer7;

import java.util.Vector;

public class Banco {

    private Vector<Transaccion> transacciones = new Vector<Transaccion>();

    public void agregarTransaccion(Transaccion unaTransaccion) {
        transacciones.add(unaTransaccion);
    }

    public int cantidadTotalDeTransacciones() {
        return transacciones.size();
    }

    public float impuestoACobrarDe(Transaccion unaTransaccion) {
        return unaTransaccion.montoConImpuesto();
    }

    //TODO
    public int impuestosACobrar() {
        return 0;
    }

    //TODO
    public int montoTotalDeTransacciones() {
        return 0;
    }
}
