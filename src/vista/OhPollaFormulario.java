package vista;

import javax.swing.*;

import java.awt.*;

public class OhPollaFormulario extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel idFactura, idCliente, labelvs, labelEquipoA, labelEquipoB;
	private JTextField txFactura, txidCliente, txEquipoA, txEquipoB, txMarcadorA, txMarcadorB;
	private JSeparator separador;
	
	public OhPollaFormulario()
	{
		separador = new JSeparator();
		setLayout(new GridLayout(3, 5));
		idFactura = new JLabel("ID Factura N.");
		txFactura = new JTextField("0000");
		txFactura.setEditable(false);
		txFactura.setForeground(Color.RED);
		txFactura.setBackground(Color.WHITE);
		Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12);
		txFactura.setFont(fuenteFactura);
		add(idFactura);
		add(separador);
		add(txFactura);
		
		idCliente = new JLabel("Cedula");
		txidCliente = new JTextField();
		add(idCliente);
		add(separador);
		add(txidCliente);
		
		labelEquipoA = new JLabel("Equipo A");
		labelvs = new JLabel("vs");
		labelEquipoB = new JLabel("Equipo B");	
		
	}

}
