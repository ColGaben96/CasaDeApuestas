package vista;

import javax.swing.*;
import java.awt.*;
/**
 * 
 * @author Oh! Enterprises.
 * Panel Pestanas: Clase dedicadas a las pestanas de la interfaz.
 *
 */
public class PanelPestanas extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Panel de pestanas.
	 */
	private JTabbedPane pestanas;
	/**
	 * Panel de Super Astro.
	 */
	private PanelSuperAstro superAstro;
	/**
	 * Panel de Baloto.
	 */
	private PanelBaloto baloto;
	/**
	 * Panel Oh! Polla.
	 */
	private PanelOhPolla ohPolla;
	
	public PanelPestanas()
	{
		/**
		 * @param PanelPestanas: Constructor de las pestanas de la interfaz.
		 * setLayout(new GridLayout()): Crea panel general pero no se generan cuadriculas en la interfaz.
		 * pestanas = new JTabbedPane(): Crea un nuevo panel de pestanas.
		 * superAstro = new PanelSuperAstro(): Crea el panel especial de Super Astro.
		 * baloto = new PanelBaloto(): Crea el panel especial Baloto.
		 * ohPolla = new PanelOhPolla(): Crea el panel especial Oh! Polla.
		 * add(pestanas): Agrega las pestanas a la interfaz.
		 * pestanas.addTab("SuperAstro", superAstro): Agrega "Super Astro" a las pestanas.
		 * pestanas.addTab("Baloto", baloto): Agrega "Baloto" a las pestanas.
		 * pestanas.addTab("Marcardor Oh!Polla", ohPolla): Agrega el "Mercador de Oh! Polla" a la interfaz.
		 * 
		 */
		setLayout(new GridLayout());
		pestanas = new JTabbedPane();
		superAstro = new PanelSuperAstro();
		baloto = new PanelBaloto();
		ohPolla = new PanelOhPolla();
		add(pestanas);
		pestanas.addTab("SuperAstro", superAstro);
		pestanas.addTab("Baloto", baloto);
		pestanas.addTab("Marcardor Oh!Polla", ohPolla);
	}
	/**
	 * Obtener Super Astro.
	 * @return superAstro.
	 */
	public PanelSuperAstro getSuperAstro() {
		return superAstro;
	}
	/**
	 * Obtener Baloto.
	 * @return baloto.
	 */
	public PanelBaloto getBaloto() {
		return baloto;
	}
	/**
	 * Obtener Oh! Polla.
	 * @return ohPolla.
	 */
	public PanelOhPolla getOhPolla() {
		return ohPolla;
	}
	

}