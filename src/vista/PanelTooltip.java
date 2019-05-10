package vista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 * Panel de la barra de arriba
 * @author Gabe
 */
public class PanelTooltip extends JPanel
{
	/*
	 * Serial del panel
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Atributos
	 */
	private JMenuBar tooltip;
	private JMenu mArchivo, mAyuda;
	private JMenuItem marCerrar, mayAcercaDe;
	public final static String CERRAR = "Cerrar", ACERCADE = "AcercaDe";
	/**
	 * M�todo constructor
	 */
	public PanelTooltip()
	{
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
