package ar.edu.unnoba.ui;


import ar.edu.unnoba.model.Channel;
import ar.edu.unnoba.model.City;
import ar.edu.unnoba.service.WeatherService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

public class WearherUI extends JPanel implements Observer{

	private static final String _DEGREE = "\u00b0";
	private static final long serialVersionUID = 1L;

	private WeatherService service;

	public WearherUI(){
		setService(new WeatherService(City.Junin, 5));
		getService().addObserver(this);
		getService().start();



		//TODO aca ir armando la IU del la App
	}

	public void close() {
		getService().stop();
		getService().deleteObserver(this);
	}

	public WeatherService getService() {
		return service;
	}

	public void setService(WeatherService service) {
		this.service = service;
	}

	@Override
	public void update(Observable weather, Object param) {
		Channel channel = (Channel) param;
		System.out.println(channel.toString());

		//TODO completar con el codigo de uds
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
					try {
						JFrame main = new JFrame("Weather App");
						WearherUI ui = new WearherUI();

						main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						main.setPreferredSize(new Dimension(640, 480)); // Le damos el tamaño a la ventana

						main.getContentPane().add(ui); // Le agregamos el JPanel con nuestros componentes
						main.pack();
						main.setLocationRelativeTo(null); // Le decimos que no sea relativa a nada, eso hace que quede centrada.

						main.addWindowListener(new WindowAdapter() {
							public void windowClosing(WindowEvent e) {
								ui.close();
							}
						});
						main.setVisible(true); // Le decimos que se muestre
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		);

	}
}

