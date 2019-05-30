package vista;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JTabbedPane;

import controlador.Controlador;

public class VentanaDetalles extends JDialog{
	
	private static final long serialVersionUID = 1L;
	private JTabbedPane pestanas;
	private PanelParametros para;
	private PanelSedes sede;
	private PanelApostador apos;
	
	public VentanaDetalles(Controlador control) {
		/**
		 * @param VentanaDetalles: Constructor de la ventana detalles.
		 * setLayout(new GridLayout()): Crea un panel grande, sin cuadricula.
		 * pestanas = new JTabbedPane(): Crea el panel especial de pestanas.
		 * para = new PanelParametros(): Crea el panel especial de parametros.
		 * sede = new PanelSedes(): Crea el panel especial de sedes.
		 * apos= new PanelApostador(): Crea el panel de apostador.
		 * add(pestanas): Agrega las pestanas a la interfaz.
		 * pestanas.addTab("Parametrizacion", para): Agrega una pestana de "parametrizacion".
		 * pestanas.addTab("Sede", sede): Agrega una pestana de "sede".
		 * pestanas.addTab("Apostador", apos): Agrega una pestana de "apostador".
		 * setSize(800, 400): Tamano de la interfaz 800,600.
		 */
		
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
		apos.getAgregarr().addActionListener(control);
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
