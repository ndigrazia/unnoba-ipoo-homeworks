package practica2.eje5.fabrica;

import practica2.eje5.mesa.MesaLuz;
import practica2.eje5.mesa.MesaLuzModerna;
import practica2.eje5.silla.Silla;
import practica2.eje5.silla.SillaModerna;
import practica2.eje5.sofa.Sofa;
import practica2.eje5.sofa.SofaModerna;

public class FabricaModerna implements FabricaMuebles {

    @Override
    public Silla crearSilla() {
       return new SillaModerna();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaModerna();
    }

    @Override
    public MesaLuz crearLuz() {
        return new MesaLuzModerna();
    }

}
