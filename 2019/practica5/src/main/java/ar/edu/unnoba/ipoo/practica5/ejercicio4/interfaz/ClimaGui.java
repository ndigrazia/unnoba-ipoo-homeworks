package ar.edu.unnoba.ipoo.practica5.ejercicio4.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.github.fedy2.weather.data.Channel;

import ar.edu.unnoba.WeatherService;
import ar.edu.unnoba.ipoo.practica5.ejercicio4.interfaz.panel.BotonPanel;
import ar.edu.unnoba.ipoo.practica5.ejercicio4.interfaz.panel.LogPanel;
import ar.edu.unnoba.ipoo.practica5.ejercicio4.modelo.Clima;
import ar.edu.unnoba.ipoo.practica5.ejercicio4.modelo.EstacionMeteorologica;
import ar.edu.unnoba.util.City;

public class ClimaGui implements Observer {

	private EstacionMeteorologica estacion = new EstacionMeteorologica();
	
	private WeatherService services = new WeatherService(City.Pergamino, 1);
	
	private JLabel actual = new JLabel();
	private BotonPanel botonPanel = new BotonPanel();
	private LogPanel logPanel = new LogPanel();
	
	private JFrame frame = new JFrame();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClimaGui window = new ClimaGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ClimaGui() {
		inicializar();
	}

	private void inicializar() {
		inicializarPaneles();
		registrarYIniciarServicio();
		agregarPanelesObservadores();
		agregarListenerDePaneles();
	}

	private void agregarListenerDePaneles() {
		botonPanel.addBotonBorrarActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickBotonBorrar();
			}
		});
		botonPanel.addBotonFechaActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickBotonFecha();
			}
		});
		botonPanel.addBotonTemperaturaActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickBotonTemperatura();
			}
		});
	}

	private void clickBotonBorrar() {
		logPanel.limpiar();
	}
	
	private void clickBotonTemperatura() {
	}
	
	private void clickBotonFecha() {
	}
	
	private void agregarPanelesObservadores() {
		estacion.addObserver(logPanel);	
	}
	
	private void registrarYIniciarServicio() {
		services.addObserver(this);
		services.start();
	}
	
	private void desregistrarYPararServicio() {
		services.stop();
 		services.deleteObserver(this);
	}
	
	private void inicializarPaneles() {
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel centro = new JPanel();
		centro.setLayout(new GridLayout(2, 1, 0, 0));
	
		JPanel abajo = new JPanel();
		abajo.setLayout(new GridLayout(1, 2, 0, 0));
		
		abajo.add(botonPanel);
		abajo.add(logPanel);	
		
		centro.add(actual, BorderLayout.NORTH);
		centro.add(abajo, BorderLayout.SOUTH);
		
		frame.getContentPane().add(centro);

		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	cerrarVentana();
		    }
		});
	}
	
	private void cerrarVentana() {
		 if (JOptionPane.showConfirmDialog(frame, 
				 "Are you sure you want to close this window?", "Close Window?", 
				 JOptionPane.YES_NO_OPTION,
				 JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
			 		desregistrarYPararServicio();
		            System.exit(0);
		  }
	}

	public void update(Observable o, Object arg) {
		Channel channel = ((WeatherService) o).getChannel();
		
		Clima clima = new Clima();

		clima.setCiudad(channel.getLocation().getCity());
		clima.setTemperatura(channel.getItem().getCondition().getTemp());
		clima.setFecha(channel.getItem().getCondition().getDate());
		clima.setHumedad(channel.getAtmosphere().getHumidity());
		clima.setPresion(channel.getAtmosphere().getPressure());
		
		estacion.addClima(clima);
		
		actual.setText(clima.toString());
	}

}
