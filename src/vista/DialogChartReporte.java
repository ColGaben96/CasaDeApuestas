package vista;

import javax.swing.*;
import java.awt.*;

public class DialogChartReporte extends JDialog
{
	private static final long serialVersionUID = 1L;
	
	private DialogChartImagen chart;
	private DialogChartOperaciones operaciones;
	private VentanaReporte repo;
	
	public DialogChartReporte()
	{
		chart = new DialogChartImagen();
		operaciones = new DialogChartOperaciones();
		repo = new VentanaReporte("Total de Apuestas: ");
		
		setLayout(new BorderLayout());
		setTitle("Reporte");
		setSize(1024, 768);
		setVisible(false);
		
		add(chart, BorderLayout.CENTER);
		add(repo, BorderLayout.NORTH);
		add(operaciones, BorderLayout.SOUTH);
	}

	public DialogChartImagen getChart() {
		return chart;
	}

	public DialogChartOperaciones getOperaciones() {
		return operaciones;
	}

	public VentanaReporte getRepo() {
		return repo;
	}

}
