package vista;

import javax.swing.*;
import java.awt.*;

public class AboutUs extends JDialog
{
	private static final long serialVersionUID = 1L;
	private JLabel OhEnterprises, specialMessage;
	private JTextArea thanksto;
	private JScrollPane scroll;
	
	public AboutUs()
	{
		setTitle("Acerca de");
		setSize(800, 600);
		OhEnterprises = new JLabel("Oh! Enterprises Colombia");
		specialMessage = new JLabel("Este programa fue hecho gracias a:");
		thanksto = new JTextArea("Gabriel Ernesto Blanco La Rotta - gblancol@unbosque.edu.co" + "\n"
				+ "Nicolas Ferreira Perez - nferreirap@unbosque.edu.co" + "\n"
				+ "Julian Eduardo Santos Niño - jesantos@unbosque.edu.co" + "\n"
				+ "Jose Julian Ojeda Bernal - jojedab@unbosque.edu.co" + "\n"
				+ "Universidad El Bosque" + "\n"
				+ "© 2019 - Oh! Enterprises - Todos los derechos reservados");
		scroll = new JScrollPane();
		setLayout(new GridLayout(3, 1));
		add(OhEnterprises);
		add(specialMessage);
		add(thanksto);
		thanksto.add(scroll);
		thanksto.setEditable(false);
		setVisible(false);
	}
	
}
