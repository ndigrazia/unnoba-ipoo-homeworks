package ar.edu.unnoba.ipoo.practica5.ejercicio2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConversorMonedas {
	
    private JFrame conversorFrame;
    private JPanel conversorPanel;
    private JTextField origenText;
    private JTextField destinoText;
    private JButton conversorBtn;

    private JPanel comboPanel;
    private JPanel btnPanel;

    private JComboBox monedaOrigenCb;
    private JComboBox monedaDestinoCb;

    private JButton limpiarBtn;
    private JButton recargarBtn;

    public ConversorMonedas() {
       iniciar();
    }

    private void iniciar() {
        conversorFrame = new JFrame("Conversor de monedas");
        conversorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        conversorFrame.setSize(new Dimension(120, 40));

        conversorPanel = new JPanel(new GridLayout(4, 1));

        comboPanel = new JPanel(new GridLayout(1, 4));

        btnPanel = new JPanel(new GridLayout(1, 3));

        agregarComponentes();

        registrarComponentes();

        conversorFrame.getRootPane().setDefaultButton(conversorBtn);

        conversorFrame.getContentPane().add(conversorPanel, BorderLayout.CENTER);

        recargar();

        conversorFrame.pack();
        conversorFrame.setVisible(true);
    }

    private void agregarComponentes() {
        origenText = new JTextField(2);
        destinoText = new JTextField(2);

        destinoText.setEditable(false);

        monedaOrigenCb = new JComboBox();
        monedaDestinoCb = new JComboBox();

        comboPanel.add(new JLabel("Desde "));
        comboPanel.add(monedaOrigenCb);
        comboPanel.add(new JLabel(" a"));
        comboPanel.add(monedaDestinoCb);

        conversorBtn = new JButton("Convertir");
        limpiarBtn = new JButton("Limpiar");
        recargarBtn = new JButton("Recargar");

        btnPanel.add(conversorBtn);
        btnPanel.add(limpiarBtn);
        btnPanel.add(recargarBtn);

        conversorPanel.add(origenText);
        conversorPanel.add(comboPanel);
        conversorPanel.add(destinoText);
        conversorPanel.add(btnPanel);
    }

    private void registrarComponentes() {
        conversorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertir();
            }
        });

        limpiarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });

        recargarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                recargar();
            }
        });
    }

    private void limpiar() {
        origenText.setText("");
        destinoText.setText("");
    }

    private void recargar() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        //TODO Agregar mas monedas
        model.addElement(Moneda.PESO);
        model.addElement(Moneda.DOLAR);

        monedaOrigenCb.setModel(model);
        monedaDestinoCb.setModel(model);
    }

    private void convertir(){
        //TODO Hacer algoritmo de conversor de monedas
        //Ejemplo de uso
        double temp = ((Double.parseDouble(origenText.getText()))
                * 1.8 + 32);

        destinoText.setText(String.valueOf(temp));
    }

    private static void crearGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ConversorMonedas();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	crearGUI();
            }
        });
    }
    
}
