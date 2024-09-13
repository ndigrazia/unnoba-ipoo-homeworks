package practica2.eje5;

import practica2.eje5.fabrica.FabricaArtDeco;
import practica2.eje5.fabrica.FabricaModerna;
import practica2.eje5.fabrica.FabricaMuebles;
import practica2.eje5.fabrica.FabricaVictoriana;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaMuebles fabricaModerna = new FabricaModerna();
        Tienda tiendaModerna = new Tienda(fabricaModerna);
        tiendaModerna.simular();
        
        FabricaMuebles fabricaVictoriana = new FabricaVictoriana();
        Tienda tiendaVictoriana = new Tienda(fabricaVictoriana);
        tiendaVictoriana.simular();
        
        FabricaMuebles fabricaArtDeco = new FabricaArtDeco();
        Tienda tiendaArtDeco = new Tienda(fabricaArtDeco);
        tiendaArtDeco.simular();
    }
}
