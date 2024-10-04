package ar.edu.unnoba.model;

import ar.edu.unnoba.service.WeatherService;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Central extends Observable implements Observer{

    private WeatherService service;
    private List<Clima> climas;
    private Clima current;

    public Central() {
        setClimas(new LinkedList<>());
        setService(new WeatherService(City.LaPlata, 5));
        getService().addObserver(this);
        getService().start();
    }

    public WeatherService getService() {
        return service;
    }

    private void setService(WeatherService service) {
        this.service = service;
    }

    public List<Clima> getClimas() {
        return climas;
    }

    private void setClimas(List<Clima> climas) {
        this.climas = climas;
    }

    public Clima getCurrent() {
        return current;
    }

    public void setCurrent(Clima current) {
        this.current = current;
    }

    @Override
    public void update(Observable observable, Object weather) {
        Channel channel = (Channel) weather;
        System.out.println(channel.toString());

        //TODO completar con el codigo de uds. Con el adapter del channel a clima
        addClima(new Clima(channel.getTemperature())); //Pasar el resto de los valores como por ejemplo: fecha, temp max, temp min, etc
    }

    private void addClima(Clima clima) {
        setCurrent(clima);
        getClimas().add(getCurrent());
        notifyUI();
    }

    private void notifyUI(){
        setChanged();
        notifyObservers();
    }

    public void stop() {
        getService().stop();
        getService().deleteObserver(this);
    }

    public void cleanHistory() {
        //TODO completar
    }

    public void orderByDate() {
        //TODO completar
    }

    public void orderByTemperature() {
        //TODO completar
    }

}

