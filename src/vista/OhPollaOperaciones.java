package vista;

import java.awt.*;
import javax.swing.*;

/**
 * 
 * @author Oh! Enterprises
 * OhPollaOperaciones: Sirve para generar o descartar el juego de la polla.
 *
 */
public class OhPollaOperaciones extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Crea los respectivos botones de apostar y descartar.
	 */
	private JButton apostar, descartar;
	public static final String APOSTAR = "Apostar", DESCARTAR = "Descartar";
	
	public OhPollaOperaciones()
	{
		/**
		 * @param OhPollaOperaciones: Implementa los botones en la interfaz en el panel de operaciones de la polla.
		 * apostar = new JButton("Apostar"): Crea un nuevo boton de "apostar".
		 * add(apostar): Agrega el boton "apostar" en la interfaz.
		 * descartar = new JButton("Descartar"): Crea un nuevo boton de "descartar".
		 * add(descartar): Agrega el boton "descartar" en la interfaz.
		 */
		setLayout(new GridLayout(1, 2));
		apostar = new JButton("Apostar");
		add(apostar);
		descartar = new JButton("Descartar");
		add(descartar);
		apostar.setActionCommand(APOSTAR);
		descartar.setActionCommand(DESCARTAR);
		
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
