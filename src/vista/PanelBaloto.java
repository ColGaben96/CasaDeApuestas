package vista;

import java.awt.BorderLayout;

import javax.swing.*;
public class PanelBaloto extends JPanel
{
	private static final long serialVersionUID = 1L;
	private BalotoFormulario formulario;
	private BalotoOperaciones operaciones;
	
	public PanelBaloto()
	{
		setLayout(new BorderLayout());
		formulario = new BalotoFormulario();
		add(formulario, BorderLayout.CENTER);
		operaciones = new BalotoOperaciones();
		add(operaciones, BorderLayout.SOUTH);
	}

	public BalotoFormulario getFormulario() {
		return formulario;
	}

	public BalotoOperaciones getOperaciones() {
		return operaciones;
	}

}
