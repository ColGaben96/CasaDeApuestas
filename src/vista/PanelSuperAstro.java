package vista;

import java.awt.BorderLayout;

import javax.swing.*;

public class PanelSuperAstro extends JPanel
{
	private static final long serialVersionUID = 1L;
	private SuperAstroFormulario formulario;
	private SuperAstroOperaciones operaciones;
	
	public PanelSuperAstro()
	{
		setLayout(new BorderLayout());
		formulario = new SuperAstroFormulario();
		add(formulario, BorderLayout.CENTER);
		operaciones = new SuperAstroOperaciones();
		add(operaciones, BorderLayout.SOUTH);
	}

	public SuperAstroFormulario getFormulario() {
		return formulario;
	}

	public SuperAstroOperaciones getOperaciones() {
		return operaciones;
	}

}
