package vista;

import javax.swing.*; //Librerias importadas: * es para una generalzación y ocupar menos espacio.
import java.awt.*;

public class PanelPestanas extends JPanel
{
	private static final long serialVersionUID = 1L; //Serial por defecto.
	private JTabbedPane pestanas;  //Panel de pestañas
	private PanelSuperAstro superAstro;
	private PanelBaloto baloto;
	private PanelOhPolla ohPolla;
	
	public PanelPestanas()
	{
		setLayout(new GridLayout());
		pestanas = new JTabbedPane();
		superAstro = new PanelSuperAstro();
		baloto = new PanelBaloto();
		ohPolla = new PanelOhPolla();
		add(pestanas);
		pestanas.addTab("SuperAstro", superAstro);
		pestanas.addTab("Baloto", baloto);
		pestanas.addTab("Marcardor Oh!Polla", ohPolla);
		setBackground(Color.WHITE);
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
	

}