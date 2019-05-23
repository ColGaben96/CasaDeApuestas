package vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 * @author Oh! Enterprises.
 * Clase dedicada al panel superior de la interfaz.
 * 
 */
public class PanelTooltip extends JPanel
{
	/*
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Barra de herramientas superior.
	 */
	private JMenuBar tooltip;
	/**
	 * Menu de archivo y de ayuda.
	 */
	private JMenu mArchivo, mAyuda;
	/**
	 * Desplegables de Cerrar y Acerca De.
	 */
	private JMenuItem marCerrar, mayAcercaDe;
	/**
	 * Botones estaticos de Cerrar y Acerca De.
	 */
	public final static String CERRAR = "Cerrar", ACERCADE = "AcercaDe";
	public PanelTooltip()
	{
		/**
		 * @param PanelTooltip: Constructor para la barra de herramientas superior en la interfaz.
		 * setLayout(new FlowLayout(FlowLayout.LEADING)): Crea nuevo panel en la parte superior de la interfaz.
		 * 
		 * tooltip = new JMenuBar(): Crea nueva barra de herramientas.
		 * tooltip.setSize(getMaximumSize()): Alcanza el maximo tamano permitido.
		 * add(tooltip): Agrega la barra a la interfaz.
		 * 
		 * mArchivo = new JMenu("Archivo"): Crea el menu "Archivo".
		 * tooltip.add(mArchivo): Agrega archivo a la interfaz.
		 * 
		 * mAyuda = new JMenu("Ayuda"): Crea el menu "Ayuda".
		 * tooltip.add(mAyuda): Agrega ayuda a la interfaz.
		 * 
		 * marCerrar = new JMenuItem("Cerrar"): Al desplegar archivo, crea un boton de "Cerrar".
		 * marCerrar.setActionCommand(CERRAR): Asigna un comando a Cerrar.
		 * marCerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK)): Asigna evento del comando por teclado.
		 * mArchivo.add(marCerrar): Agrega el boton a la interfaz
		 * 
		 * mayAcercaDe = new JMenuItem("Acerca De"): Al desplegar ayuda, crea un boton de "Acerca De".
		 * mayAcercaDe.setActionCommand(ACERCADE): Asigna un comando a Acerca De.
		 * mAyuda.add(mayAcercaDe): Agrega el boton a la interfaz. 
		 */
		setLayout(new FlowLayout(FlowLayout.LEADING));
		
		tooltip = new JMenuBar();
		tooltip.setSize(getMaximumSize());
		add(tooltip);
		
		mArchivo = new JMenu("Archivo");
		tooltip.add(mArchivo);
		
		mAyuda = new JMenu("Ayuda");
		tooltip.add(mAyuda);
		
		marCerrar = new JMenuItem("Cerrar");
		marCerrar.setActionCommand(CERRAR);
		marCerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		mArchivo.add(marCerrar);
		
		mayAcercaDe = new JMenuItem("Acerca De");
		mayAcercaDe.setActionCommand(ACERCADE);
		mAyuda.add(mayAcercaDe);
	}
	
	/*
	 * M�todos getter & setter generados por usuario con Eclipse IDE
	 */
	
	/**
	 * M�todo de obtenci�n de Tooltip
	 * @param tooltip
	 */
	public JMenuBar getTooltip() {
		return tooltip;
	}
	/**
	 * M�todo de obtenci�n de Tooltip
	 * @param archivo
	 */
	public JMenu getmArchivo() {
		return mArchivo;
	}
	/**
	 * M�todo de obtenci�n de Tooltip
	 * @param ayuda
	 */
	public JMenu getmAyuda() {
		return mAyuda;
	}
	/**
	 * M�todo de obtenci�n de Tooltip
	 * @param cerrar
	 */
	public JMenuItem getMarCerrar() {
		return marCerrar;
	}
	/**
	 * M�todo de obtenci�n de Tooltip
	 * @param acercade
	 */
	public JMenuItem getMayAcercaDe() {
		return mayAcercaDe;
	}
	
	

}
