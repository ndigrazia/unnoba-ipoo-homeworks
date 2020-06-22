package practica5.ejercicio2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConversorCelsius implements ActionListener {
	
    JFrame conversorFrame;
    JPanel conversorPanel;
    JTextField tempCelsius;
    JLabel celsiusLbl, fahrenheitLbl;
    JButton conversorBtn;

    public ConversorCelsius() {
        conversorFrame = new JFrame("Conversor Celsius a Fahrenheit");
        conversorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        conversorFrame.setSize(new Dimension(120, 40));

        conversorPanel = new JPanel(new GridLayout(2, 2));

        agregarComponentes();

        conversorFrame.getRootPane().setDefaultButton(conversorBtn);

        conversorFrame.getContentPane().add(conversorPanel, BorderLayout.CENTER);

        conversorFrame.pack();
        conversorFrame.setVisible(true);
    }

    private void agregarComponentes() {
        tempCelsius = new JTextField(2);
        celsiusLbl = new JLabel("Celsius", SwingConstants.LEFT);
        conversorBtn = new JButton("Convertir");
        fahrenheitLbl = new JLabel("Fahrenheit", SwingConstants.LEFT);

        conversorBtn.addActionListener(this);

        conversorPanel.add(tempCelsius);
        conversorPanel.add(celsiusLbl);
        conversorPanel.add(conversorBtn);
        conversorPanel.add(fahrenheitLbl);
        
        celsiusLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        fahrenheitLbl.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    public void actionPerformed(ActionEvent event) {
        double tempFahr = ((Double.parseDouble(tempCelsius.getText()))
                             * 1.8 + 32);
        fahrenheitLbl.setText(tempFahr + " Fahrenheit");
    }

    private static void crearGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ConversorCelsius();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	crearGUI();
            }
        });
    }
    
}
