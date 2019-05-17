package vista;

import java.awt.GridLayout;

import javax.swing.*;
/**
 * 
 * @author Oh! Enterprises.
 * PanelOhPolla: Panel principal de la Oh! Polla.
 *
 */
public class PanelOhPolla extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Relacion con la clase OhPollaFormulario para crear el formulario de la polla.
	 */
	private OhPollaFormulario formulario;
	/**
	 * Relacion con la clase OhPollaOperaciones para crear el panel de operaciones en la polla.
	 */
	private OhPollaOperaciones operaciones;
	
	public PanelOhPolla()
	{
		/**
		 * @param PanelOhPolla: Panel principal de la Oh! Polla.
		 * setLayout(new GridLayout(2,1)): Crea el panel maestro y crea un panel con cuadricula (2 flias, 1 columna).
		 * formulario = new OhPollaFormulario(): Crea el formulario en la clase.
		 * add(formulario): Agrega el formulario en la interfaz.
		 * operaciones = new OhPollaOperaciones(): Crea el panel de operaciones en la clase.
		 * add(operaciones): Agrega el panel de operaciones en la interfaz.
		 */
		setLayout(new GridLayout(2, 1));
		formulario = new OhPollaFormulario();
		add(formulario);
		operaciones = new OhPollaOperaciones();
		add(operaciones);
	}

	/**
	 * Obtener formulario.
	 * @return formulario.
	 */
	public OhPollaFormulario getFormulario() {
		return formulario;
	}

	/**
	 * Obtener panel de operaciones.
	 * @return operaciones.
	 */
	public OhPollaOperaciones getOperaciones() {
		return operaciones;
	}
	
	

}
