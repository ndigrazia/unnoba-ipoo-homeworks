package practica2.eje5;

import practica2.eje5.fabrica.FabricaMuebles;
import practica2.eje5.mesa.MesaLuz;
import practica2.eje5.silla.Silla;
import practica2.eje5.sofa.Sofa;

public class Tienda {
    
    private FabricaMuebles fabrica;

    public Tienda(FabricaMuebles fabrica) {
        this.fabrica = fabrica;
    }

    public void simular() {
        Silla silla = fabrica.crearSilla();
        Sofa sofa = fabrica.crearSofa();
        MesaLuz mesa = fabrica.crearLuz();

       mostrar(silla, sofa, mesa);
    }

    private void mostrar( Mostarse silla, Mostarse sofa, Mostarse mesa) {
        silla.mostar();
        sofa.mostar();
        mesa.mostar();
    }
}
