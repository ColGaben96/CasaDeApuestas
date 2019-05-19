package vista;

import java.awt.*;

import javax.swing.*;
public class SuperAstroOperaciones extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JButton apostar, descartar;
	public static final String APOSTAR = "Apostar", DESCARTAR = "Descartar";
	
	public SuperAstroOperaciones()
	{
		setLayout(new GridLayout(1, 2));
		apostar = new JButton("Apostar");
		add(apostar);
		descartar = new JButton("Descartar");
		add(descartar);
		apostar.setActionCommand(APOSTAR);
		descartar.setActionCommand(DESCARTAR);
		
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