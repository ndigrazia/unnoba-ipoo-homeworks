package ar.edu.unnoba.ipoo.practica4.ejercicio10;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StopwatchSwing {

	private JButton btn = new JButton();
	private JLabel lbl = new JLabel();
	
	private StateSwing state = null ;	
	
	public StopwatchSwing() {
		JFrame.setDefaultLookAndFeelDecorated(true); 
		JFrame frame = new JFrame("Cronometro"); 
		frame.setPreferredSize(new Dimension(250, 100));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		addListeners();
		
		setState(new BeginStateSwing(new Stopwatch()));
		
		frame.getContentPane().add(getPanel());
		frame.pack(); 
		frame.setVisible(true);
	}
	
	private void addListeners() {
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				changeState();
			}
		});
	}
	
	private JPanel getPanel() {
		JPanel panel = new JPanel();
		
		panel.setLayout(new BorderLayout());
		
		panel.add(lbl, BorderLayout.CENTER);
		panel.add(btn, BorderLayout.SOUTH);;
		
		return panel;
	}
	
	private void changeState() {
		state.action();
		setState(state.getNextState());
	}
	
	private void setState(StateSwing e) {
		state = e;
		javax.swing.SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				btn.setText(state.getName());
				lbl.setText(state.getTime());
			}
		});
	}
	
	private static void createGUI() { 
		 new StopwatchSwing();
	} 
	
	public static void main(String[] args) { 
		javax.swing.SwingUtilities.invokeLater(new Runnable() { 
			public void run() {createGUI();}
		}); 
	} 

}
