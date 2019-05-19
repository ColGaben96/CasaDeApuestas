package vista;

import java.awt.*;

import javax.swing.*;

/**
 * 
 * @author Oh! Enterprises
 * PanelGrande: Permite alojar la interfaz en su totalidad, exceptuando las barras de tareas.
 *
 */
public class PanelGrande extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Relacion con la clase PanelPestanas para mostrar pestanas en la interfaz.
	 */
	private PanelPestanas pestanas;
	/**
	 * Relacion con la clase PanelOperaciones para mostrar el panel de operaciones en la interfaz.
	 */
	private PanelOperaciones operaciones;
	
	public PanelGrande()
	{
		setLayout(new BorderLayout());
		/**
		 * @param PanelGrande: Panel grande que aloja en su mayoria los componentes de la interfaz.
		 * setLayout(new GridLayout(1,2)): Crea el panel maestro junto con las cuadriculas (1 fila, 2 columnas).
		 * pestanas = new PanelPestanas(): Crea las pestanas en la clase.
		 * pestanas.getMaximumSize(): Las pestanas pueden alcanzar el tamano maximo segun la interfaz.
		 * add(pestanas): Agrega las pestanas en la interfaz.
		 * operaciones = new PanelOperaciones(): Crea el panel de operaciones en la clase.
		 * add(operaciones): Agrega el panel de operaciones en la interfaz.
		 */
		pestanas = new PanelPestanas();
		add(pestanas, BorderLayout.CENTER);
		operaciones = new PanelOperaciones();
		add(operaciones, BorderLayout.EAST);
	}

	/**
	 * Obtener pestanas.
	 * @return pestanas.
	 */
	public PanelPestanas getPestanas() {
		return pestanas;
	}

	/**
	 * Obtener panel de operaciones.
	 * @return operaciones.
	 */
	public PanelOperaciones getOperaciones() {
		return operaciones;
	}
	
	
}
