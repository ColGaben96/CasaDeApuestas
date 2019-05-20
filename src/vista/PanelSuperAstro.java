package vista;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * 
 * @author Oh! Enterprises.
 * PanelSuperAstro: Clase dedicada al panel global de Super Astro.
 */
public class PanelSuperAstro extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Formulario de Super Astro.
	 */
	private SuperAstroFormulario formulario;
	/**
	 * Panel de operaciones de Super Astro.
	 */
	private SuperAstroOperaciones operaciones;
	
	public PanelSuperAstro()
	{
		/**
		 * @param PanelSuperAstro: Constructor del panel Super Astro.
		 * formulario = new SuperAstroFormulario(): Crea nuevo formulario.
		 * add(formulario): Agrega el formulario a la interfaz.
		 * operaciones = new SuperAstroOperaciones(): Crea nuevo panel de operaciones.
		 * add(operaciones): Agrega el panel a la interfaz.
		 */
		formulario = new SuperAstroFormulario();
		add(formulario, BorderLayout.CENTER);
		operaciones = new SuperAstroOperaciones();
		add(operaciones, BorderLayout.SOUTH);
	}
	/**
	 * Obtener formulario.
	 * @return formulario.
	 */
	public SuperAstroFormulario getFormulario() {
		return formulario;
	}
	/**
	 * Obtener panel de operaciones.
	 * @return operaciones.
	 */
	public SuperAstroOperaciones getOperaciones() {
		return operaciones;
	}

}
