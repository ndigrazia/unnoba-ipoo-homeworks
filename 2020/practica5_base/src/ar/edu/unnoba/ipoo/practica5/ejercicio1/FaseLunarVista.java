package ar.edu.unnoba.ipoo.practica5.ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class FaseLunarVista {
	
	private static final int TIEMPO_EJECUCION = 1000; 
	private static String FORMATO = "ddMMyyyy";
	
	private JPanel ps, pm, pp, pck;
	private ImageIcon[] imagenes;
	
	private FaseLunar faseLunar;
	
	private JTextField diaTxt;
	private JTextField mesTxt;
	private JTextField anoTxt;
	
	private JButton calcularBtn;
	private SimpleDateFormat formato;
	
	private JLabel fl;
	
	private FaseLunarWorker worker;
	
	public FaseLunarVista() {
		faseLunar = new FaseLunarImp();
		
		ps = new JPanel();
        pm = new JPanel();
        pck = new JPanel();
        
        imagenes = new ImageIcon[faseLunar.fases()];
        formato = new SimpleDateFormat(FORMATO);
        
        agregarComponentes();
        
        pp = new JPanel();
        pp.setLayout(new BoxLayout(pp, BoxLayout.PAGE_AXIS));
        pp.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        pp.add(ps);
        pp.add(pm);
        pp.add(pck);
	}
	
	private void agregarComponentes() {
		for (int i = 0; i < imagenes.length; i++)
			imagenes[i] = crearImagen("\\ejercicio1\\imagenes" + i + ".jpg");
	
        fl = crearContenedorImagen();
        	        
        diaTxt = crearTextField("Dia", "##", 2);
        mesTxt = crearTextField("Mes", "##", 2);
	    anoTxt = crearTextField("A�o", "####", 4);
        
        calcularBtn = new JButton("Calcular");
        
        ps.setBorder(crearBorder("Seleccione la fecha"));
        pm.setBorder(crearBorder("Fase"));
        pck.setBorder(crearBorder("Informe por hora"));

        pm.add(fl);
        
        ps.add(diaTxt);
        ps.add(mesTxt);
        ps.add(anoTxt);
        ps.add(calcularBtn);

        JCheckBox jc = new JCheckBox("activa informe");
        jc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				activarInforme(arg0);
			}});
        
        pck.add(jc);
        
        calcularBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				presentarFase();
			}});
	}
	
	private void presentarFase() {
		try {
			String f = diaTxt.getText() + mesTxt.getText() + anoTxt.getText();
			Date d = formato.parse(f);
			fl.setIcon(imagenes[obtenerFase(d).getFase()]);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	private void activarInforme(ActionEvent arg0) {
		JCheckBox o = (JCheckBox)arg0.getSource();
		
		if(o.isSelected()) {
			worker = new FaseLunarWorker(TIEMPO_EJECUCION);
			worker.start();
		}
		else {
			worker.cancelar();
		}
	}

	private Fase obtenerFase(Date d) {
		return faseLunar.calcularFase(d);
	}

	private static JLabel crearContenedorImagen() {
		JLabel fl = new JLabel();
		
        fl.setHorizontalAlignment(JLabel.CENTER);
        fl.setVerticalAlignment(JLabel.CENTER);
        fl.setVerticalTextPosition(JLabel.CENTER);
        fl.setHorizontalTextPosition(JLabel.CENTER);
        fl.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLoweredBevelBorder(),
                BorderFactory.createEmptyBorder(5,5,5,5)));

            fl.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(0,0,10,0),
                fl.getBorder()));
	            
	    return fl; 
	}
	
	private static Border crearBorder(String txt) {
		return BorderFactory.createCompoundBorder(
	            BorderFactory.createTitledBorder(txt), 
	            BorderFactory.createEmptyBorder(5,5,5,5));
	}
	
	private static JTextField crearTextField(String txt, String ms, int col) {
		try {
			
			JTextField ed = new JFormattedTextField(new MaskFormatter(ms));
			
			ed.setColumns(col);
			ed.setBorder(BorderFactory.createCompoundBorder(
	 	            BorderFactory.createTitledBorder(txt), 
	 	            BorderFactory.createEmptyBorder(5,15,5,5)));
			
			return ed;
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static ImageIcon crearImagen(String path) {
        java.net.URL url = FaseLunarVista.class.getResource(path);

        if (url == null) {
            System.err.println("Recurso no encontrado: " + path);
            return null;
        } else {
            return new ImageIcon(url);
        }
    }
	
	public JPanel getGUI() {
		return pp;
	}

	private static void crearYMostrarGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        FaseLunarVista v = new FaseLunarVista();

        JFrame fl = new JFrame("Fases Lunares");
        fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fl.setContentPane(v.getGUI());

        fl.pack();
        fl.setVisible(true);
    }
	
	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	crearYMostrarGUI();
            }
        });
    }
	
	private class FaseLunarWorker extends Thread {

		private boolean cancel = false;
		private int tiempoEjecucion;
		
		public FaseLunarWorker(int tiempo) {
			tiempoEjecucion = tiempo;
		}
		
		public void cancelar() {
			cancel = true;
		}
		
		@Override
		public void run() {
			System.out.println("Informe iniciado...");
			
			while(!isCancelled()){
				Date d = Calendar.getInstance().getTime();
				
				System.out.println("------------------------------------------------------------------");
				System.out.println("Fase de la luna al : " + d);
				System.out.println("Estado : " + obtenerFase(d));
				System.out.println("------------------------------------------------------------------");
		    	
				try {
					Thread.sleep(tiempoEjecucion);
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}
			  
			System.out.println("Informe finalizado...");
		}

		private boolean isCancelled() {
			return cancel;
		}
	}
	
}
