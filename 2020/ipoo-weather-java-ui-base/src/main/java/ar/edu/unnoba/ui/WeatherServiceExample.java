package ar.edu.unnoba.ui;

import ar.edu.unnoba.model.Channel;
import ar.edu.unnoba.model.City;
import ar.edu.unnoba.service.WeatherService;

import java.util.Observable;
import java.util.Observer;

public class WeatherServiceExample implements Observer {

    private WeatherService service;

    public WeatherServiceExample() {
        service = new WeatherService(City.Pergamino, 10);
    }

    public void start() {
        service.addObserver(this);
        service.start();
    }
    public void stop() {
        service.stop();
        service.deleteObserver(this);
    }

    public void update(Observable weather, Object param) {
        Channel channel = (Channel) param;

        StringBuffer sb = new StringBuffer();

        double humidity = channel.getHumidity();
        sb.append(humidity);
        sb.append(", ");
        double pressure = channel.getPressure();
        sb.append(pressure);
        sb.append(", ");
        double temperature = channel.getTemperature();
        sb.append(temperature);
        sb.append(", ");
        double wind = channel.getWind();
        sb.append(wind);
        sb.append(", ");
        String location = channel.getLocation();
        sb.append(location);

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        WeatherServiceExample weatherServiceExample = new WeatherServiceExample();
        weatherServiceExample.start();
    }
}
