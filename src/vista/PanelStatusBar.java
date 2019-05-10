package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelStatusBar extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel status;
	public PanelStatusBar()
	{
		setLayout(new GridLayout(1, 0));
		setBackground(Color.LIGHT_GRAY);
		status = new JLabel("Ready");
		add(status);
	}
	public JLabel getStatus() {
		return status;
	}
	
}
