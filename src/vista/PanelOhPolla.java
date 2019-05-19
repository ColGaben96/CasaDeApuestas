package vista;

import java.awt.BorderLayout;

import javax.swing.*;

public class PanelOhPolla extends JPanel
{
	private static final long serialVersionUID = 1L;
	private OhPollaFormulario formulario;
	private OhPollaOperaciones operaciones;
	
	public PanelOhPolla()
	{
		setLayout(new BorderLayout());
		formulario = new OhPollaFormulario();
		add(formulario, BorderLayout.CENTER);
		operaciones = new OhPollaOperaciones();
		add(operaciones, BorderLayout.SOUTH);
	}

	public OhPollaFormulario getFormulario() {
		return formulario;
	}

	public OhPollaOperaciones getOperaciones() {
		return operaciones;
	}
	
	

}
