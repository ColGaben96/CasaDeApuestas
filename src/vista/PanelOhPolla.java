package vista;

import java.awt.GridLayout;

import javax.swing.*;

public class PanelOhPolla extends JPanel
{
	private static final long serialVersionUID = 1L;
	private OhPollaFormulario formulario;
	private OhPollaOperaciones operaciones;
	
	public PanelOhPolla()
	{
		setLayout(new GridLayout(2, 1));
		formulario = new OhPollaFormulario();
		add(formulario);
		operaciones = new OhPollaOperaciones();
		add(operaciones);
	}

	public OhPollaFormulario getFormulario() {
		return formulario;
	}

	public OhPollaOperaciones getOperaciones() {
		return operaciones;
	}
	
	

}
