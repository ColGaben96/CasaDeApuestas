package vista;

import javax.swing.*;
import java.awt.*;

public class PanelDialogFacturaDetalles extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel idFactura, txFactura;
	
	public PanelDialogFacturaDetalles()
	{
		setLayout(new GridLayout(2, 1));
		idFactura = new JLabel("Factura N.");
		txFactura = new JLabel("");
		add(idFactura);
		add(txFactura);
	}

	public JLabel getTxFactura() {
		return txFactura;
	}
	
}
