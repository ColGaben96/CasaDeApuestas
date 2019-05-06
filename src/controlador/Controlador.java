package controlador;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador 
{
	private Mundo modelo;
	private InterfazGUI vista;
	
	public Controlador()
	{
		modelo = new Mundo();
		vista = new InterfazGUI(this);
	}
}
