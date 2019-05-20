package vista;

import java.awt.BorderLayout;
import javax.swing.*;
/**
 * 
 * @author Oh! Enterprises
 * PanelBaloto: Panel de la interfaz destinado al baloto.
 *
 */
public class PanelBaloto extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Relacion con la clase BalotoFormulario para crear un formulario.
	 */
	private BalotoFormulario formulario;
	/**
	 * Relacion con la clase BalotoOperaciones para crear un panel de operaciones.
	 */
	private BalotoOperaciones operaciones;
	
	public PanelBaloto()
	{
		setLayout(new BorderLayout());
		/**
		 * @param PanelBaloto: Panel grafico que controla el baloto del programa.
		 * setLayout(new GridLayout(2,1): Crea el panel principal de la clase y crea unas cuadriculas especificas (2 filas, 1 columna).
		 * formulario = mew BalotoFormulario(): Crea un nuevo formulario.
		 * add(formulario): Agrega el formulario a la interfaz.
		 * operaciones = new BalotoOperaciones(): Crea un nuevo panel de operaciones.
		 * add(operaciones): Agrega el panel a la interfaz.
		 */
		formulario = new BalotoFormulario();
		add(formulario, BorderLayout.CENTER);
		operaciones = new BalotoOperaciones();
		add(operaciones, BorderLayout.SOUTH);
	}

	/**
	 * Obtiene formulario.
	 * @return formulario.
	 */
	public BalotoFormulario getFormulario() {
		return formulario;
	}

	/**
	 * Obtiene panel de operaciones.
	 * @return operaciones.
	 */
	public BalotoOperaciones getOperaciones() {
		return operaciones;
	}

}
