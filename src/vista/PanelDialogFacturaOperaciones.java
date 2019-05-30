package vista;

import javax.swing.*;
import java.awt.*;

public class PanelDialogFacturaOperaciones extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel valortotal;
	private JButton ok;
	private JCheckBox imprimirFactura, enviaracorreo;
	public static final String OK = "Ok";
	
	public PanelDialogFacturaOperaciones()
	{
		setLayout(new GridLayout(2, 2));
		ok = new JButton("Cerrar y guardar");
		imprimirFactura = new JCheckBox("Imprimir factura");
		enviaracorreo = new JCheckBox("Enviar al correo");
		valortotal = new JLabel("0");
		
		add(imprimirFactura);
		add(enviaracorreo);
		add(ok);
		add(valortotal);
		
		ok.setActionCommand(OK);
	}

	public JButton getOk() {
		return ok;
	}

	public JCheckBox getImprimirFactura() {
		return imprimirFactura;
	}

	public JCheckBox getEnviaracorreo() {
		return enviaracorreo;
	}   

	public JLabel getValortotal() {
		return valortotal;
	}
	
	
	
}
