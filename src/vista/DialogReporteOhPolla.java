package vista;

import javax.swing.*;
import java.awt.*;

public class DialogReporteOhPolla extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel labelIngresos, labelEgresos;
	private JTextField txIngresos, txEgresos;
	
	public DialogReporteOhPolla()
	{
		setLayout(new GridLayout(2, 2));
		labelIngresos = new JLabel("Ingreos: ");
		txIngresos = new JTextField("$ - ");
		add(labelIngresos);
		add(txIngresos);
		labelEgresos = new JLabel("Egresos: ");
		txEgresos = new JTextField("$ - ");
		add(labelEgresos);
		add(txEgresos);
		
	}

	public JLabel getLabelIngresos() {
		return labelIngresos;
	}

	public JLabel getLabelEgresos() {
		return labelEgresos;
	}

	public JTextField getTxIngresos() {
		return txIngresos;
	}

	public JTextField getTxEgresos() {
		return txEgresos;
	}

}
