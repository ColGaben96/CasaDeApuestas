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
		setLayout(new BorderLayout());
		pestanas = new PanelPestanas();
		add(pestanas, BorderLayout.CENTER);
		operaciones = new PanelOperaciones();
		add(operaciones, BorderLayout.EAST);
	}

	public PanelPestanas getPestanas() {
		return pestanas;
	}

	public PanelOperaciones getOperaciones() {
		return operaciones;
	}
	
	
}
