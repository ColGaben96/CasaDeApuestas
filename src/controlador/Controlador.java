package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador implements ActionListener
{
	private Mundo modelo;
	private InterfazGUI vista;
	
	public Controlador()
	{
		modelo = new Mundo();
		vista = new InterfazGUI(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		
		
	}
}
