package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import controlador.Controlador;

public class VentanaDetalles extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JTabbedPane pestanas;
	private PanelParametros para;
	private PanelSedes sede;
	private PanelApostador apos;
	
	public VentanaDetalles(Controlador control) {
		
		setLayout(new BorderLayout());
		pestanas = new JTabbedPane();
		para = new PanelParametros();
		sede = new PanelSedes();
		apos= new PanelApostador();
		para.getCargar().addActionListener(control);
		para.getGuardar().addActionListener(control);
		sede.getCargar().addActionListener(control);
		sede.getGuardar().addActionListener(control);
		apos.getCargar().addActionListener(control);
		apos.getGuardar().addActionListener(control);
		add(pestanas);
		pestanas.addTab("Parametrizacion", para);
		pestanas.addTab("Sede", sede);
		pestanas.addTab("Apostador", apos);
		setSize(800, 400);
		
		
	}
	public PanelParametros getParametros() {
		return para;
	}
	public PanelSedes getSedes() {
		return sede;
	}
	public PanelApostador getApostador() {
		return apos;
	}

}
