package ar.edu.unnoba.ui;


import ar.edu.unnoba.model.Central;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class WearherUI extends JPanel implements Observer{

	private static final String _DEGREE = "\u00b0";
	private static final long serialVersionUID = 1L;
	private Central model;

	public WearherUI(Central model){
		setModel(model);
		getModel().addObserver(this);
		//TODO aca ir armando la IU del la App

	}

	public Central getModel() {
		return model;
	}

	public void setModel(Central model) {
		this.model = model;
	}

	public void close() {
		this.getModel().stop();
		this.getModel().deleteObserver(this);
	}

	@Override
	public void update(Observable central, Object param) {
		System.out.println("Update del modelo");

		//TODO completar con el codigo de uds. ¨
		//getModel().getClimas() //el historial
		//getModel().getClimaActual(); //el clima actual
		//etc, etc
	}



}

