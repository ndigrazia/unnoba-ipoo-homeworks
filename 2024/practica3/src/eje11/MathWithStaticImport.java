package eje11;

import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.PI;
import static java.lang.System.out;

public class MathWithStaticImport {
    public static void main (String[] args) {
        ArrayList<String> lista= new ArrayList<String>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");

        double resultado= pow(2, 2);
        double resultado2= pow(3,3);
        double resultado3= PI*2;

        out.println(resultado);
        out.println(resultado2);
        out.println(resultado3);
    }
}
