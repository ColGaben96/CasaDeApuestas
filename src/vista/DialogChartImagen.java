package vista;

import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class DialogChartImagen extends JPanel
{
	private static final long serialVersionUID = 1L;
	private DefaultPieDataset data;
	private JFreeChart chart;
	private ChartPanel panel;
	private double superastro, baloto, ohpolla;
	public DialogChartImagen()
	{
		superastro += 0.0;
		baloto += 0.0;
		ohpolla += 0.0;
		data = new DefaultPieDataset();
		data.setValue("SuperAstro", superastro);
		data.setValue("Baloto", baloto);
		data.setValue("Oh! Polla", ohpolla);
		// create a chart...
		chart = ChartFactory.createPieChart(
				"Sample Pie Chart",
				data,
				true, // legend?
				true, // tooltips?
				false // URLs?
				);
		// create and display a frame...
		panel = new ChartPanel(chart);
		panel.validate();
		add(panel);
	}
	public DefaultPieDataset getData() {
		return data;
	}
	public JFreeChart getChart() {
		return chart;
	}
	public ChartPanel getPanel() {
		return panel;
	}
	public double getSuperastro() {
		return superastro;
	}
	public void setSuperastro(double superastro) {
		this.superastro = superastro;
	}
	public double getBaloto() {
		return baloto;
	}
	public void setBaloto(double baloto) {
		this.baloto = baloto;
	}
	public double getOhpolla() {
		return ohpolla;
	}
	public void setOhpolla(double ohpolla) {
		this.ohpolla = ohpolla;
	}
}
