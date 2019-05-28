package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import controlador.Controlador;
/**
 * 
 * @author Oh! Enterprises.
 * VentanaDetalles: Clase dedicada a la impresion de la Ventana detalles.
 *
 */
public class VentanaDetalles extends JFrame
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Panel pestanas.
	 */
	private JTabbedPane pestanas;
	/**
	 * Panel parametros.
	 */
	private PanelParametros para;
	/**
	 * Panel sedes.
	 */
	private PanelSedes sede;
	/**
	 * Panel apostador.
	 */
	private PanelApostador apos;
	
	public VentanaDetalles(Controlador control) {
		
		setLayout(new BorderLayout());
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
		//setLayout(new GridLayout());
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
	/**
	 * Obtener panel parametros.
	 * @return para.
	 */
	public PanelParametros getParametros() {
		return para;
	}
	/**
	 * Obtener panel sedes.
	 * @return sede.
	 */
	public PanelSedes getSedes() {
		return sede;
	}
	/**
	 * Obtener panel apostador.
	 * @return apos.
	 */
	public PanelApostador getApostador() {
		return apos;
	}

}
