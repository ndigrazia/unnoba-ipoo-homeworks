package ar.edu.unnoba;

import ar.edu.unnoba.model.City;
import ar.edu.unnoba.model.EstacionMeteorologica;
import ar.edu.unnoba.service.WeatherService;

public final class WeatherApp {

    public static void main(String[] args) {
        WeatherService service = new WeatherService(City.Pergamino, 5);
        EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica();
        service.addObserver(estacionMeteorologica);
        service.start();
    }
}
