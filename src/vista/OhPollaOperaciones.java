package vista;

import java.awt.*;

import javax.swing.*;
public class OhPollaOperaciones extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JButton apostar, descartar;
	
	public OhPollaOperaciones()
	{
		setLayout(new GridLayout(1, 2));
		apostar = new JButton("Apostar");
		add(apostar);
		descartar = new JButton("Descartar");
		add(descartar);
	}

	public JButton getApostar() 
	{
		return apostar;
	}

	public JButton getDescartar() 
	{
		return descartar;
	}

}
