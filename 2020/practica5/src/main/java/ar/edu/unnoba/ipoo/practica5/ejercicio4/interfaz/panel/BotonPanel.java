package ar.edu.unnoba.ipoo.practica5.ejercicio4.interfaz.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class BotonPanel extends JPanel {

	private JButton tempBtn = new JButton("Temperatura");
	private JButton fechaBtn = new JButton("Fecha");
	private JButton borrarBtn = new JButton("Borrar");
	
	public BotonPanel() {
		setLayout(new GridLayout(3, 1, 0, 0));
		
		add(tempBtn);
		add(fechaBtn);
		add(borrarBtn);
	}
	
	public void addBotonTemperaturaActionListener(ActionListener s) {
		tempBtn.addActionListener(s);
	}

	public void addBotonFechaActionListener(ActionListener s) {
		fechaBtn.addActionListener(s);
	}
	
	public void addBotonBorrarActionListener(ActionListener s) {
		borrarBtn.addActionListener(s);
	}
}
