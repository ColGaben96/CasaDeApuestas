package vista;

import java.awt.GridLayout;

import javax.swing.*;
public class PanelBaloto extends JPanel
{
	private static final long serialVersionUID = 1L;
	private BalotoFormulario formulario;
	private BalotoOperaciones operaciones;
	
	public PanelBaloto()
	{
		setLayout(new GridLayout(2, 1));
		formulario = new BalotoFormulario();
		add(formulario);
		operaciones = new BalotoOperaciones();
		add(operaciones);
	}

	public BalotoFormulario getFormulario() {
		return formulario;
	}

	public BalotoOperaciones getOperaciones() {
		return operaciones;
	}

}
