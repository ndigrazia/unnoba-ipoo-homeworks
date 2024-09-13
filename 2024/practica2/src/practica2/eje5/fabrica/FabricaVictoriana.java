package practica2.eje5.fabrica;

import practica2.eje5.mesa.MesaLuz;
import practica2.eje5.mesa.MesaLuzVictoriana;
import practica2.eje5.silla.Silla;
import practica2.eje5.silla.SillaVictoriana;
import practica2.eje5.sofa.Sofa;
import practica2.eje5.sofa.SofaVictoriana;

public class FabricaVictoriana implements FabricaMuebles {

    @Override
    public Silla crearSilla() {
       return new SillaVictoriana();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaVictoriana();
    }

    @Override
    public MesaLuz crearLuz() {
        return new MesaLuzVictoriana();
    }

}
