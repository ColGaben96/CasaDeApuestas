package vista;

import javax.swing.*;
import java.awt.*;

public class OhPollaFormulario extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel idFactura, idCliente, labelvs, labelMarcador, labelSeparadorMarcador;
	private JTextField txFactura, txidCliente, txEquipoA, txEquipoB, txMarcadorA, txMarcadorB;
	
	public OhPollaFormulario()
	{
<<<<<<< HEAD
		idFactura = new JLabel("ID Factura Nï¿½");
=======
		idFactura = new JLabel("ID Factura N°");
>>>>>>> origin/Pochecito
		txFactura = new JTextField("0000");
		txFactura.setEditable(false);
		txFactura.setForeground(Color.RED);
		txFactura.setBackground(Color.WHITE);
		Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12);
		txFactura.setFont(fuenteFactura);
		add(idFactura);
		add(txFactura);
<<<<<<< HEAD
		idCliente = new JLabel("C.C / C.E");
		txidCliente = new JTextField();
		add(idCliente);
		add(txidCliente);
		txEquipoA = new JTextField();
		labelvs = new JLabel("vs");
=======
>>>>>>> origin/Pochecito
	}

}
