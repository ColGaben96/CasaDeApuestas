package vista;

import java.awt.GridLayout;

import javax.swing.*;
/**
 * 
 * @author Oh! Enterprises
 *
 */
public class PanelOperaciones extends JPanel
{
	private static final long serialVersionUID = 1L;
	/**
	 * Crea boton de generarExtractos, crearReporte, imprimirFacturas, detallesPunto.
	 */
	private JButton generarExtractos, crearReporte, imprimirFacturas, detallesPunto;
	public static final String DETALLES = "Detalles";
	public static final String REPORTE = "Reporte";
	public static final String EXTRACTOS = "Extractos";
	public static final String FACTURAS = "Facturas";
	public PanelOperaciones()
	{
		/**
		 * @param PanelOperaciones: Constructor del panel de operaciones.
		 * setLayout(new GridLayout(4,1)): Crea el panel grande y las cuadriculas (4 filas, 1 columna).
		 * generarExtractos = new JButton("Generar Extractos"): Crea el boton "Generar Extractos".
		 * crearReporte = new JButton("Crear Reporte"): Crea el boton "Crear Reporte".
		 * imprimirFacturas = new JButton("Imprimir Facturas"): Crea el boton "Imprimir Facturas".
		 * detallesPunto = new JButton("Detalles del Punto"): Crea el boton "Detalles del Punto".
		 * add(generarExtractos): Agrega el boton "Generar Extractos" a la interfaz.
		 * add(crearReporte): Agrega el boton "Crear Reporte" a la interfaz.
		 * add(imprimirFacturas): Agrega el boton "Imprimir Facturas" a la intefaz.
		 * add(detallesPunto): Agrega el boton "Detalles del Puntos" a la interfaz.
		 */
		setLayout(new GridLayout(4, 1));
		generarExtractos = new JButton("Generar Extractos");
		crearReporte = new JButton("Crear Reporte");
		imprimirFacturas = new JButton("Imprimir Facturas");
		detallesPunto = new JButton("Configuracion del Punto");
		detallesPunto.setActionCommand(DETALLES);
		crearReporte.setActionCommand(REPORTE);
		generarExtractos.setActionCommand(EXTRACTOS);
		imprimirFacturas.setActionCommand(FACTURAS);
		add(generarExtractos);
		add(crearReporte);
		add(imprimirFacturas);
		add(detallesPunto);
	}
	/**
	 * Obtener generar extractos.
	 * @return generarExtractos.
	 */
	public JButton getGenerarExtractos() {
		return generarExtractos;
	}
	/**
	 * Obtener crear reporte.
	 * @return crearReporte.
	 */
	public JButton getCrearReporte() {
		return crearReporte;
	}
	/**
	 * Obtener imprimir facturas.
	 * @return imprimirFacturas.
	 */
	public JButton getImprimirFacturas() {
		return imprimirFacturas;
	}
	/**
	 * Obtener detalles del punto.
	 * @return detallesPunto.
	 */
	public JButton getDetallesPunto() {
		return detallesPunto;
	}
	
}
