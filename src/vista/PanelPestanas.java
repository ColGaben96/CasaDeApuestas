package vista;

import java.awt.GridLayout;

import javax.swing.*;

public class PanelPestanas extends JPanel
{
	private JTabbedPane pestanas;
	private PanelSuperAstro psa;
	private PanelBaloto pb;
	private PanelOhPolla poh;
	
	public PanelPestanas()
	{
		setLayout(new GridLayout(1, 0));
		pestanas = new JTabbedPane();
		psa = new PanelSuperAstro();
		pb = new PanelBaloto();
		poh = new PanelOhPolla();
		pestanas.addTab("SuperAstro", psa);
		pestanas.addTab("Baloto", pb);
		pestanas.addTab("Marcardor Oh!Polla", poh);
		
	}
}
