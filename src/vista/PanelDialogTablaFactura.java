package vista;

import javax.swing.*;

import java.awt.GridLayout;

public class PanelDialogTablaFactura extends JPanel
{
	
	/*
	 * Se declaran los atributos de PanelTabla
	 */
	private static final long serialVersionUID = 1L; //El serial predeterminado que ayuda a funcionar el programa
	private JLabel id, item, valor, id1, id2, item1, item2, valor1, valor2;
	
	/*
	 * Se declara el constructor de PanelTabla
	 */
	public PanelDialogTablaFactura()
	{
		setLayout(new GridLayout(3, 9));
		id = new JLabel("ID");
		item = new JLabel("Item");
		valor = new JLabel("Valor");
		add(id);
		add(item);
		add(valor);
		
		id1 = new JLabel("");
		item1 = new JLabel("");
		valor1 = new JLabel("");
		add(id1);
		add(item1);
		add(valor1);
		
		id2 = new JLabel("");
		item2 = new JLabel("");
		valor2 = new JLabel("");
		add(id2);
		add(item2);
		add(valor2);
	}

	public JLabel getId() {
		return id;
	}

	public JLabel getItem() {
		return item;
	}

	public JLabel getValor() {
		return valor;
	}

	public JLabel getId1() {
		return id1;
	}

	public JLabel getId2() {
		return id2;
	}

	public JLabel getItem1() {
		return item1;
	}

	public JLabel getItem2() {
		return item2;
	}

	public JLabel getValor1() {
		return valor1;
	}

	public JLabel getValor2() {
		return valor2;
	}
}