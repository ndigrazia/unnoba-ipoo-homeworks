package ar.edu.unnoba.ipoo.com;

import ar.edu.unnoba.ipoo.com.model.Clima;
import ar.edu.unnoba.ipoo.com.model.Humedad;
import ar.edu.unnoba.ipoo.com.model.Lugar;
import ar.edu.unnoba.ipoo.com.model.Presion;
import ar.edu.unnoba.ipoo.com.model.Temperatura;
import ar.edu.unnoba.ipoo.com.model.Viento;

/**
 * App
 */
public class App 
{
    public static void main( String[] args )
    {
        Lugar lugar = new Lugar("Pergamino", "Bs As", "Argentina");
        Humedad humedad = new Humedad(30);
        Presion presion = new Presion(20);
        Temperatura temperatura = new Temperatura(22, Temperatura.Escala.CELSIUS);
        Viento viento = new Viento(60, Viento.Direccion.NORTE);    

        Clima c = new Clima(lugar, humedad, presion, temperatura, viento);

        System.out.println(c);
    }
    
}
