package vista;

import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author Oh! Enterprises.
 * SuperAstroOperaciones: Clase dedicada al panel de operaciones de Super Astro.
 *
 */
public class SuperAstroOperaciones extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Botones de apostar y descartar.
	 */
	private JButton apostar, descartar;
	
	public SuperAstroOperaciones()
	{
		/**
		 * @param SuperAstroOperaciones: Constructor del panel de operaciones de Super Astro.
		 * setLayout(new GridLayout(1, 2)): Crea el panel grande y una nueva cuadricula que aloja los botones de este (1 fila, 2 columnas).
		 * apostar = new JButton("Apostar"): Crea nuevo boton "Apostar".
		 * add(apostar): Agrega el boton "apostar" a la interfaz.
		 * descartar = new JButton("Descartar"): Crea nuevo boton "descartar".
		 * add(descartar): Agrega "descartar" a la interfaz.
		 */
		setLayout(new GridLayout(1, 2));
		apostar = new JButton("Apostar");
		add(apostar);
		descartar = new JButton("Descartar");
		add(descartar);
	}

	/**
	 * Obtener apostar.
	 * @return apostar.
	 */
	public JButton getApostar() 
	{
		return apostar;
	}
	/**
	 * Obtener descartar.
	 * @return descartar.
	 */
	public JButton getDescartar() 
	{
		return descartar;
	}

}
