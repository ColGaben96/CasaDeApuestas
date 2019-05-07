package vista;

import java.awt.GridLayout;

import javax.swing.*;

public class PanelSuperAstro extends JPanel
{
	private static final long serialVersionUID = 1L;
	private SuperAstroFormulario formulario;
	private SuperAstroOperaciones operaciones;
	
	public PanelSuperAstro()
	{
		setLayout(new GridLayout(2, 1));
		formulario = new SuperAstroFormulario();
		add(formulario);
		operaciones = new SuperAstroOperaciones();
		add(operaciones);
	}

}
