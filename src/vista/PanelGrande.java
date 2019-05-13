package vista;

import java.awt.*;

import javax.swing.*;

public class PanelGrande extends JPanel
{
	private static final long serialVersionUID = 1L;
	private PanelPestanas pestanas;
	private PanelOperaciones operaciones;
	
	public PanelGrande()
	{
		setLayout(new GridLayout(1, 2));
		pestanas = new PanelPestanas();
		pestanas.getMaximumSize();
		add(pestanas);
		operaciones = new PanelOperaciones();
		add(operaciones);
	}

	public PanelPestanas getPestanas() {
		return pestanas;
	}

	public PanelOperaciones getOperaciones() {
		return operaciones;
	}
	
	
}
