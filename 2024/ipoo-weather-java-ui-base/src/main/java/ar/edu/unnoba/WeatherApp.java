package ar.edu.unnoba;

import ar.edu.unnoba.model.Central;
import ar.edu.unnoba.ui.WearherUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public final class WeatherApp {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                    try {
                        JFrame main = new JFrame("Weather App");
                        WearherUI ui = new WearherUI(new Central());

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
