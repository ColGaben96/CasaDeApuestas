package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
/**
 * 
 * @author Oh! Enterprises.
 * PanelStatusBar: Clase dedicada al panel de estado.
 *
 */
public class PanelStatusBar extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Etiqueta de estado.
	 */
	private JLabel status;
	public PanelStatusBar()
	{
		/**
		 * @param PanelStatusBar: Constructor del panel de estado.
		 * setLayout(new GridLayout(1, 0)): Crea el panel grande y botones en cuadricula (Una fila).
		 * setBackground(Color.LIGHT_GRAY): Color del fondo de la barra de estado (Gris claro).
		 * status = new JLabel("Ready"): Crea la etiqueta de "Ready".
		 * add(status): Agrega "status" a interfaz.
		 */
		setLayout(new GridLayout(1, 0));
		setBackground(Color.LIGHT_GRAY);
		status = new JLabel("Ready");
		add(status);
	}
	/**
	 * Obtener tener estado.
	 * @return status.
	 */
	public JLabel getStatus() {
		return status;
	}
	
}
