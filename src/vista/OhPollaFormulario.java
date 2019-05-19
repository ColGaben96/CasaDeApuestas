package vista;

import javax.swing.*;

import java.awt.*;

public class OhPollaFormulario extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel idFactura, idCliente, labelEquipoA, labelEquipoB;
	private JTextField txFactura, txidCliente, txEquipoA, txEquipoB, txMarcadorA, txMarcadorB;
	
	public OhPollaFormulario()
	{
		setLayout(new GridLayout(5, 2));
		idFactura = new JLabel("ID Factura N.");
		txFactura = new JTextField("0000");
		txFactura.setEditable(false);
		txFactura.setForeground(Color.RED);
		txFactura.setBackground(Color.WHITE);
		Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12);
		txFactura.setFont(fuenteFactura);
		add(idFactura);
		add(txFactura);
		
		idCliente = new JLabel("Cedula");
		txidCliente = new JTextField();
		add(idCliente);
		add(txidCliente);
		
		labelEquipoA = new JLabel("Equipo A");
		txEquipoA = new JTextField("ej. Millonarios");
		labelEquipoB = new JLabel("Equipo B");
		txEquipoB = new JTextField("ej. Santafe");
		txMarcadorA = new JTextField("ej 3");
		txMarcadorB = new JTextField("ej 2");
		add(labelEquipoA);
		add(labelEquipoB);
		
		add(txEquipoA);
		add(txEquipoB);
		
		add(txMarcadorA);
		add(txMarcadorB);
	}

	public JLabel getIdFactura() {
		return idFactura;
	}

	public JLabel getIdCliente() {
		return idCliente;
	}

	public JLabel getLabelEquipoA() {
		return labelEquipoA;
	}

	public JLabel getLabelEquipoB() {
		return labelEquipoB;
	}

	public JTextField getTxFactura() {
		return txFactura;
	}

	public JTextField getTxidCliente() {
		return txidCliente;
	}

	public JTextField getTxEquipoA() {
		return txEquipoA;
	}

	public JTextField getTxEquipoB() {
		return txEquipoB;
	}

	public JTextField getTxMarcadorA() {
		return txMarcadorA;
	}

	public JTextField getTxMarcadorB() {
		return txMarcadorB;
	}
	
	

}
