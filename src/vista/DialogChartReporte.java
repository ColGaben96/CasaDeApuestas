package vista;

import javax.swing.*;
import java.awt.*;

public class DialogChartReporte extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private DialogChartImagen chart;
	private DialogChartOperaciones operaciones;
	
	public DialogChartReporte()
	{
		chart = new DialogChartImagen();
		operaciones = new DialogChartOperaciones();
		
		setLayout(new BorderLayout());
		setTitle("Reporte");
		setSize(1024, 768);
		setVisible(false);
		
		add(chart, BorderLayout.CENTER);
		add(operaciones, BorderLayout.SOUTH);
	}

	public DialogChartImagen getChart() {
		return chart;
	}

	public DialogChartOperaciones getOperaciones() {
		return operaciones;
	}

}
