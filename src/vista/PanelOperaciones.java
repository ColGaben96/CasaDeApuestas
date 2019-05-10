package vista;

import java.awt.GridLayout;

import javax.swing.*;

public class PanelOperaciones extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton generarExtractos, crearReporte, imprimirFacturas, detallesPunto;
	public PanelOperaciones()
	{
		setLayout(new GridLayout(4, 1));
		generarExtractos = new JButton("Generar Extractos");
		crearReporte = new JButton("Crear Reporte");
		imprimirFacturas = new JButton("Imprimir Facturas");
		detallesPunto = new JButton("Detalles del Punto");
		
		add(generarExtractos);
		add(crearReporte);
		add(imprimirFacturas);
		add(detallesPunto);
	}
	public JButton getGenerarExtractos() {
		return generarExtractos;
	}
	public JButton getCrearReporte() {
		return crearReporte;
	}
	public JButton getImprimirFacturas() {
		return imprimirFacturas;
	}
	public JButton getDetallesPunto() {
		return detallesPunto;
	}
	
}
