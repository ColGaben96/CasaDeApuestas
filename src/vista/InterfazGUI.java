package vista;

import controlador.Controlador;
import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author Oh! Enterprises
 * InterfazGUI: Panel principal de la interfaz. Muestra toda la parte visual del programa.
 *
 */
public class InterfazGUI extends JFrame
{
	/**
	 * @param InterfazGUI: Crea la interfaz completa del programa. Muestra el panel principal con sus subpaneles.
	 * serialVersionUID = 1L: Serial por defecto.
	 * PanelTooltip tooltip: Relacion con la clase PanelTooltip.
	 * PanelGrande panelGrande: Relacion con la clase PanelGrande.
	 * PanelStatusBar statusBar: Relacion con la clase PanelStatusBar.
	 */
	private static final long serialVersionUID = 1L;
	private PanelTooltip tooltip;
	private PanelGrande panelGrande;
	private PanelStatusBar statusBar;
	private AboutUs aboutus;

	public InterfazGUI(Controlador control)
	{
		/**
		 * @param IntefrazGUI(Controlador control): Relacion con el controlador del programa. Permite la ejecucion del mismo.
		 * tooltip = new PanelTooltip(): Crea la barra de herramientas en la interfaz.
		 * panelGrande = new PanelGrande(): Crea el panel grande en la interfaz.
		 * statusBar = new PanelStatusBar(): Crea la barra de estado en la interfaz.
		 * setDefaultCloseOperation(EXIT_ON_CLOSE): Al cerrar el programa, debe matar el proceso.
		 * setLayout(new BorderLayout()): Crea el panel maestro en la interfaz.
		 * setTitle("Oh! Apuestas): Crea el titulo en el programa de "Oh! Apuestas".
		 * setVisible(true): Muestra la interfaz a la hora de ejecutar el programa.
		 * setSize(1000,400): Configura el tamano del programa, en este caso (1000, 400).
		 * tooltip.getMarCerrar().addActionListener(control): Crea la opcion de Cerrar en la barra de herramientas dentro del menu Archivo.
		 * tootlip.getMayAcercaDe().addActionListener(control): Crea la opcion de Acerca De en la barra de herramientas dentro del menu Ayuda.
		 * add(tooltip, BorderLayout.NORTH): Agrega la barra de herramientas en la interfaz en la posicion NORTE (parte superior).
		 * add(panelGrande, BorderLayout.CENTER): Agrega el panel grande en todo el centro de la interfaz (CENTER).
		 * add(statusBar, BorderLayout.SOUTH): Agrega la barra de estado en la parte inferior de la interfaz (SOUTH).
		 */
		tooltip = new PanelTooltip();
		panelGrande = new PanelGrande();
		statusBar = new PanelStatusBar();
		aboutus = new AboutUs();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setTitle("Oh! Apuestas");
		setVisible(true);
		setSize(1000, 400);
		
		tooltip.getMarCerrar().addActionListener(control);
		tooltip.getMayAcercaDe().addActionListener(control);
		
		panelGrande.getPestanas().getBaloto().getFormulario().getAutomatico().addActionListener(control);
		panelGrande.getPestanas().getBaloto().getFormulario().getManual().addActionListener(control);
		panelGrande.getPestanas().getBaloto().getFormulario().getGenerarNumeros().addActionListener(control);
		
		panelGrande.getPestanas().getBaloto().getOperaciones().getApostar().addActionListener(control);
		panelGrande.getPestanas().getBaloto().getOperaciones().getDescartar().addActionListener(control);
		panelGrande.getPestanas().getOhPolla().getOperaciones().getApostar().addActionListener(control);
		panelGrande.getPestanas().getOhPolla().getOperaciones().getDescartar().addActionListener(control);
		panelGrande.getPestanas().getSuperAstro().getOperaciones().getApostar().addActionListener(control);
		panelGrande.getPestanas().getSuperAstro().getOperaciones().getDescartar().addActionListener(control);
		panelGrande.getOperaciones().getDetallesPunto().addActionListener(control);
		panelGrande.getOperaciones().getCrearReporte().addActionListener(control);
		
		add(tooltip, BorderLayout.NORTH);
		add(panelGrande, BorderLayout.CENTER);
		add(statusBar, BorderLayout.SOUTH);
	}
	/**
	 * Obtener Tooltip.
	 * @return tooltip.
	 */
	public PanelTooltip getTooltip() {
		return tooltip;
	}
	/**
	 * Obtener PanelGrande.
	 * @return panelGrande.
	 */
	public PanelGrande getPanelGrande() {
		return panelGrande;
	}
	/**
	 * Obtener StatusBar.
	 * @return statusBar.
	 */
	public PanelStatusBar getStatusBar() {
		return statusBar;
	}

	public AboutUs getAboutus() {
		return aboutus;
	}
	
}
