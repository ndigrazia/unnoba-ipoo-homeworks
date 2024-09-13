package practica2.eje5.fabrica;

import practica2.eje5.mesa.MesaLuz;
import practica2.eje5.silla.Silla;
import practica2.eje5.sofa.Sofa;

public interface FabricaMuebles {

    public Silla crearSilla();
    
    public Sofa crearSofa();

    public MesaLuz crearLuz();
}
