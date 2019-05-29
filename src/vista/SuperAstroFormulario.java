package vista;

import java.awt.*;

import javax.swing.*;

public class SuperAstroFormulario extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel idFactura, idCliente, selectAstro, selectNumber;
	private JTextField txIDCliente, txNumber1,txNumber2,txNumber3,txNumber4, txFactura;
	private JComboBox<String> listAstro;
	
	public SuperAstroFormulario()
	{
		setLayout(new GridLayout(4, 4));
		String[] listSignos = {"SELECCIONAR", "Acuario", "Piscis", "Aries", "Tauro", "Geminis", "Cancer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario", "Capricornio"};
		
		idFactura = new JLabel("ID Factura N.");
		txFactura = new JTextField("0000");
		txFactura.setEditable(false);
		txFactura.setForeground(Color.RED);
		txFactura.setBackground(Color.WHITE);
		Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12);
		txFactura.setFont(fuenteFactura);
		add(idFactura);
		add(txFactura);
		
		idCliente = new JLabel("C.C / C.E");
		txIDCliente = new JTextField();
		add(idCliente);
		add(txIDCliente);
		
		selectAstro = new JLabel("Signo Zodiacal");
		listAstro = new JComboBox<String>(listSignos);
		add(selectAstro);
		add(listAstro);
		
		selectNumber = new JLabel("Numero a Jugar");
		selectNumber.setBounds(20,30,200,30);
		add(selectNumber);
		
		txNumber1 = new JTextField();
		txNumber1.setBounds(230, 30, 200, 30); 
		add(txNumber1);
		
		txNumber2 = new JTextField();
		txNumber2.setBounds(230, 30, 200, 30); 
		add(txNumber2);
		
		txNumber3 = new JTextField();
		txNumber3.setBounds(230, 30, 200, 30); 
		add(txNumber3);
		
		txNumber4 = new JTextField();
		txNumber4.setBounds(230, 30, 200, 30); 
		add(txNumber4);
		
	}

	public JLabel getIdFactura() {
		return idFactura;
	}

	public JLabel getIdCliente() {
		return idCliente;
	}

	public JLabel getSelectAstro() {
		return selectAstro;
	}

	public JLabel getSelectNumber() {
		return selectNumber;
	}

	public JTextField getTxIDCliente() {
		return txIDCliente;
	}

	public JTextField getTxNumber1() {
		return txNumber1;
	}
	
	public JTextField getTxNumber2() {
		return txNumber2;
	}
	
	public JTextField getTxNumber3() {
		return txNumber3;
	}
	
	public JTextField getTxNumber4() {
		return txNumber4;
	}

	public JTextField getTxFactura() {
		return txFactura;
	}

	public JComboBox<String> getListAstro() {
		return listAstro;
	}
	
}
