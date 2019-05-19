package vista;

import controlador.Controlador;
import javax.swing.*;
import java.awt.*;
public class InterfazGUI extends JFrame
{
	private static final long serialVersionUID = 1L;
	private PanelTooltip tooltip;
	private PanelGrande panelGrande;
	private PanelStatusBar statusBar;
	private AboutUs aboutus;

	public InterfazGUI(Controlador control)
	{
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
		add(tooltip, BorderLayout.NORTH);
		add(panelGrande, BorderLayout.CENTER);
		add(statusBar, BorderLayout.SOUTH);
	}

	public PanelTooltip getTooltip() {
		return tooltip;
	}

	public PanelGrande getPanelGrande() {
		return panelGrande;
	}

	public PanelStatusBar getStatusBar() {
		return statusBar;
	}

	public AboutUs getAboutus() {
		return aboutus;
	}
	
}
