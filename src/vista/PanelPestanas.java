package vista;

import javax.swing.*;
import java.awt.*;

public class PanelPestanas extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JTabbedPane pestanas;
	private PanelSuperAstro psa;
	private PanelBaloto pb;
	private PanelOhPolla poh;
	
	public PanelPestanas()
	{
		setLayout(new GridLayout());
		pestanas = new JTabbedPane();
		psa = new PanelSuperAstro();
		pb = new PanelBaloto();
		poh = new PanelOhPolla();
		add(pestanas);
		pestanas.addTab("SuperAstro", psa);
		pestanas.addTab("Baloto", pb);
		pestanas.addTab("Marcardor Oh!Polla", poh);
	}
}
