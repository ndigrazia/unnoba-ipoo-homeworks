package practica2.eje5.fabrica;

import practica2.eje5.mesa.MesaLuz;
import practica2.eje5.mesa.MesaLuzArtDeco;
import practica2.eje5.silla.Silla;
import practica2.eje5.silla.SillaArtDeco;
import practica2.eje5.sofa.Sofa;
import practica2.eje5.sofa.SofaArtDeco;

public class FabricaArtDeco implements FabricaMuebles {

    @Override
    public Silla crearSilla() {
       return new SillaArtDeco();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaArtDeco();
    }

    @Override
    public MesaLuz crearLuz() {
        return new MesaLuzArtDeco();
    }

}
