package vista;

import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class DialogChartImagen extends JPanel
{
	private static final long serialVersionUID = 1L;
	private DefaultPieDataset data;
	private JFreeChart chart;
	private ChartFrame frame;
	public DialogChartImagen()
	{
		data = new DefaultPieDataset();
		data.setValue("Categoria 1", 43.2);
		data.setValue("Categoria 2", 27.9);
		data.setValue("Categoria 3", 79.5);
		// create a chart...
		chart = ChartFactory.createPieChart(
				"Sample Pie Chart",
				data,
				true, // legend?
				true, // tooltips?
				false // URLs?
				);
		// create and display a frame...
		frame = new ChartFrame("Proporción de Venta", chart);
		frame.pack();
		frame.setVisible(false);
	}
	public DefaultPieDataset getData() {
		return data;
	}
	public JFreeChart getChart() {
		return chart;
	}
	public ChartFrame getFrame() {
		return frame;
	}
	
}
