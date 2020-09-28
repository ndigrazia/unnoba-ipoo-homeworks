package practica3.ejer12.eje2;

public class Main {

    public static void main(String[] args) {
        Estadio e1 = new Estadio(200, "estado1");
        Estadio e2 = new Estadio(300, "estado3");
        SistemaDePartido s = new SistemaDePartido();
        s.addEstadio(e2);
        s.addEstadio(e1);
        System.out.println(s.estadioConMayorCapacidad());
    }
}
