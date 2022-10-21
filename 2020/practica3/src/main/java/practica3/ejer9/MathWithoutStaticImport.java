package practica3.ejer9;

import java.util.ArrayList;

public class MathWithoutStaticImport {
    public static void main (String[] args) {
        ArrayList<String> lista= new ArrayList<String>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");

        double resultado= Math.pow(2, 2);
        double resultado2= Math.pow(3,3);
        double resultado3= Math.PI*2;

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}
