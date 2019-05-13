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
<<<<<<< HEAD
=======
	private PanelParametros para;
>>>>>>> origin/Pochecito
	
	public PanelPestanas()
	{
		setLayout(new GridLayout());
		pestanas = new JTabbedPane();
		superAstro = new PanelSuperAstro();
		baloto = new PanelBaloto();
		ohPolla = new PanelOhPolla();
<<<<<<< HEAD
=======
		para = new PanelParametros();
>>>>>>> origin/Pochecito
		add(pestanas);
		pestanas.addTab("SuperAstro", superAstro);
		pestanas.addTab("Baloto", baloto);
		pestanas.addTab("Marcardor Oh!Polla", ohPolla);
<<<<<<< HEAD
=======
		pestanas.addTab("Parametrizacion", para);
>>>>>>> origin/Pochecito
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
<<<<<<< HEAD
=======
	
	public PanelParametros getParametros() {
		return para;
	}
>>>>>>> origin/Pochecito
}