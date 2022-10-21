package practica3.ejer12.eje1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Plato plato1 = new Plato("plato1", "lunes", 120.00f);
        Plato plato2 = new Plato("plato2", "martes", 90.00f);

        Alumno alumno1 = new Alumno("Carlos", "23456744");
        Alumno alumno2 = new Alumno("Juan", "23456741");

        Comedor comedor = new Comedor("123456", "MiNegocio 123");

        comedor.agregarReserva(alumno1, plato1);
        comedor.agregarReserva(alumno1, plato2);

        System.out.println(comedor.totalPlatosReservados());
        System.out.println(comedor.totalValorReservas());
        System.out.println(comedor.reservaMasPlatos());

        Vector<Plato> platos = new Vector<Plato>();
        platos.add(plato1);
        platos.add(plato2);
        comedor.agregarReserva(alumno2, platos);

        System.out.println(comedor.totalValorReservas());
    }
}
