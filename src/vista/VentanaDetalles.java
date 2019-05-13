package vista;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import controlador.Controlador;

public class VentanaDetalles extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTabbedPane pestanas;
	private PanelParametros para;
	private PanelSedes sede;
	
	public VentanaDetalles(Controlador control) {
		
		setLayout(new GridLayout());
		pestanas = new JTabbedPane();
		para = new PanelParametros();
		sede = new PanelSedes();
		add(pestanas);
		pestanas.addTab("Parametrizacion", para);
		pestanas.addTab("Sede", sede);
		setSize(800, 400);
		
	}
	public PanelParametros getParametros() {
		return para;
	}
	public PanelSedes getSedes() {
		return sede;
	}

}
