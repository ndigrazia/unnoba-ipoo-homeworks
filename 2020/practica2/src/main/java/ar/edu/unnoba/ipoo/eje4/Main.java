package ar.edu.unnoba.ipoo.eje4;

public class Main {

    public static void main(String[] args) {
        Taller t = new Taller();

        OrderDeReparacion o1 = new OrderDeReparacion("1");

        Simple s1 = new Simple("1", "simple1", 12, 12.00f);
        Simple s2= new Simple("2", "simple2", 20, 21.00f);

        Simple s3 = new Simple("3", "simple3", 21, 2.00f);
        Simple s4= new Simple("4", "simple4", 22, 22.00f);

        Kit k1 = new Kit("1", "k1", 45);
        k1.add(s3);

        Kit k2 = new Kit("2", "k2", 10);
        k2.add(k1);
        k2.add(s4);

        o1.add(s1);
        o1.add(s2);
        o1.add(k2);

        System.out.println(o1.getCostoReparacion());

        OrderDeReparacion o2 = new OrderDeReparacion("2");
    }
}
