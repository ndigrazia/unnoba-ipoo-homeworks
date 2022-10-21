package ar.edu.unnoba.ipoo.practica5.ejercicio4.interfaz.panel;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import ar.edu.unnoba.ipoo.practica5.ejercicio4.modelo.EstacionMeteorologica;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.StandardSocketOptions;
import java.util.Observable;
import java.util.Observer;

public class LogPanel extends JPanel implements Observer {

	private JList jlist = new JList();
	//private JTextPane txtpnText = new JTextPane();
	
	public LogPanel() {
		setLayout(new BorderLayout(0, 0));
		DefaultListModel model = new DefaultListModel();
		model.clear();
		jlist.setModel(model);

		jlist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					//TODO Hacer double click
					//Obtener el elemento seleccionado
					//Mostrarlo en un JDialog
					System.out.println("Double Click");
				}
			}
		});

		JScrollPane scrollPane = new JScrollPane(jlist);//txtpnText);
		
		add(scrollPane, BorderLayout.CENTER);
	}

	public void limpiar() {
		DefaultListModel listmodel = (DefaultListModel)jlist.getModel();
		listmodel.removeAllElements();
	}
	
	public void update(Observable o, Object arg) {
		//try {
			EstacionMeteorologica estacion = (EstacionMeteorologica) o;
			/*StyledDocument doc = txtpnText.getStyledDocument();
					doc.insertString(doc.getLength(), estacion.getActual() + "\n", null);*/
			DefaultListModel listmodel = (DefaultListModel) jlist.getModel();
			listmodel.addElement(estacion.getActual());
		//} catch (BadLocationException e) {
		//	throw new RuntimeException(e);
		//}
	}
}
