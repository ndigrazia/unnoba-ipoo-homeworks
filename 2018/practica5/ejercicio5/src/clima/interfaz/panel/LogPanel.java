package clima.interfaz.panel;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import clima.modelo.EstaciónMeteorológica;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JScrollPane;

public class LogPanel extends JPanel implements Observer {

	private JTextPane txtpnText = new JTextPane();
	
	public LogPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane(txtpnText);
		
		add(scrollPane, BorderLayout.CENTER);
	}

	public void limpiar() {
		txtpnText.setText("");
	}
	
	@Override
	public void update(Observable o, Object arg) {
		try {
			EstaciónMeteorológica estacion = (EstaciónMeteorológica) o;
			StyledDocument doc = txtpnText.getStyledDocument();
			doc.insertString(doc.getLength(), estacion.getActual() + "\n", null);
		} catch (BadLocationException e) {
			throw new RuntimeException(e);
		}
	}
}
