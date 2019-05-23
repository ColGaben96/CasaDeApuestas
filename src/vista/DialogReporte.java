package vista;

import javax.swing.*;
import java.awt.*;

public class DialogReporte extends JDialog
{
	private static final long serialVersionUID = 1L;
	private DialogReportePestanas pestanas;
	private DialogReporteOperaciones operaciones;
	
	public DialogReporte()
	{
		setLayout(new BorderLayout());
		setSize(800, 600);
		setTitle("Extractos");
		setVisible(false);
		pestanas = new DialogReportePestanas();
		operaciones = new DialogReporteOperaciones();
		
		add(pestanas, BorderLayout.CENTER);
		add(operaciones, BorderLayout.SOUTH);
	}

	public DialogReportePestanas getPestanas() {
		return pestanas;
	}

	public DialogReporteOperaciones getOperaciones() {
		return operaciones;
	}
	
	
}
