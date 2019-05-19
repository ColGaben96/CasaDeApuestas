package vista;

import javax.swing.*;

import java.awt.*;

public class BalotoFormulario extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JCheckBox revancha;
	private JRadioButton automatico, manual;
	private JLabel labelBalotas, idFactura;
	private JTextField txBalotas, txFactura;
	private JSeparator separador;
	private JButton generarNumeros;
	public static final String RADIOAUTOMATICO = "RadioAutomatico", RADIOMANUAL = "RadioManual", GENERAR = "Generar";
	
	public BalotoFormulario()
	{
		setLayout(new GridLayout(5, 2));
		idFactura = new JLabel("ID Factura N°");
		txFactura = new JTextField("0000");
		txFactura.setEditable(false);
		txFactura.setForeground(Color.RED);
		txFactura.setBackground(Color.WHITE);
		Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12);
		txFactura.setFont(fuenteFactura);
		add(idFactura);
		add(txFactura);
		automatico = new JRadioButton("Automático");
		manual = new JRadioButton("Manual");
		add(automatico);
		add(manual);
		revancha = new JCheckBox("Revancha");
		separador = new JSeparator();
		add(revancha);
		add(separador);	
		labelBalotas = new JLabel("Balotas a Jugar: ");
		txBalotas = new JTextField();
		add(labelBalotas);
		generarNumeros = new JButton("Generar");
		add(generarNumeros);
		add(txBalotas);
		manual.setSelected(true);
		automatico.setActionCommand(RADIOAUTOMATICO);
		manual.setActionCommand(RADIOMANUAL);
		generarNumeros.setActionCommand(GENERAR);
		
	}

	public JCheckBox getRevancha() {
		return revancha;
	}

	public JRadioButton getAutomatico() {
		return automatico;
	}

	public JRadioButton getManual() {
		return manual;
	}

	public JLabel getLabelBalotas() {
		return labelBalotas;
	}

	public JLabel getIdFactura() {
		return idFactura;
	}

	public JTextField getTxBalotas() {
		return txBalotas;
	}

	public JTextField getTxFactura() {
		return txFactura;
	}

	public JSeparator getSeparador() {
		return separador;
	}

	public JButton getGenerarNumeros() {
		return generarNumeros;
	}
	
	

}
