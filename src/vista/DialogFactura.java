package vista;

import javax.swing.*;
import java.awt.*;

public class DialogFactura extends JDialog
{
	private static final long serialVersionUID = 1L;
	private PanelDialogFacturaOperaciones operaciones;
	private PanelDialogTablaFactura factura;
	private PanelDialogFacturaDetalles detalles;
	
	public DialogFactura()
	{
		setLayout(new BorderLayout());
		setSize(650, 400);
		setVisible(false);
		setTitle("Factura");
		
		operaciones = new PanelDialogFacturaOperaciones();
		factura = new PanelDialogTablaFactura();
		detalles = new PanelDialogFacturaDetalles();
		
		add(operaciones, BorderLayout.SOUTH);
		add(factura, BorderLayout.CENTER);
		add(detalles, BorderLayout.NORTH);
	}

	public PanelDialogFacturaOperaciones getOperaciones() {
		return operaciones;
	}

	public PanelDialogTablaFactura getFactura() {
		return factura;
	}

	public PanelDialogFacturaDetalles getDetalles() {
		return detalles;
	}	
}
