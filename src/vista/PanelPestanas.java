package vista;

import javax.swing.*;
import java.awt.*;

public class PanelPestanas extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JTabbedPane pestanas;
	private PanelSuperAstro superAstro;
	private PanelBaloto baloto;
	private PanelOhPolla ohPolla;
	private PanelParametros para;
	
	public PanelPestanas()
	{
		setLayout(new GridLayout());
		pestanas = new JTabbedPane();
		superAstro = new PanelSuperAstro();
		baloto = new PanelBaloto();
		ohPolla = new PanelOhPolla();
		para = new PanelParametros();
		add(pestanas);
		pestanas.addTab("SuperAstro", superAstro);
		pestanas.addTab("Baloto", baloto);
		pestanas.addTab("Marcardor Oh!Polla", ohPolla);
		pestanas.addTab("Parametrizacion", para);
	}

	public PanelSuperAstro getSuperAstro() {
		return superAstro;
	}

	public PanelBaloto getBaloto() {
		return baloto;
	}

	public PanelOhPolla getOhPolla() {
		return ohPolla;
	}
	
	public PanelParametros getParametros() {
		return para;
	}
}