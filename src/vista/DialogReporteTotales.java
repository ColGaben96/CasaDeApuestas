package vista;

import javax.swing.*;
import java.awt.*;

public class DialogReporteTotales extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel labelIngresos, labelEgresos;
	private JTextField txIngresos, txEgresos;
	
	public DialogReporteTotales()
	{
		setLayout(new GridLayout(2, 2));
		labelIngresos = new JLabel("Ingresos: ");
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
