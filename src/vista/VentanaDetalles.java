package vista;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class VentanaDetalles extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTabbedPane pestanas;
	private PanelParametros para;
	
	public VentanaDetalles() {
		
		setLayout(new GridLayout());
		pestanas = new JTabbedPane();
		para = new PanelParametros();
		add(pestanas);
		pestanas.addTab("Parametrizacion", para);
		setSize(800, 400);
		
	}

}
