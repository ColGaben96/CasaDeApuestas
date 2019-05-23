package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class PanelDialogTablaFactura extends JPanel
{
	
	/*
	 * Se declaran los atributos de PanelTabla
	 */
	private static final long serialVersionUID = 1L; //El serial predeterminado que ayuda a funcionar el programa
	private String[] nombreColumnas;
	private int filas;
	private int columnas;
	private JTable table;
	private Object[][] data;
	private DefaultTableModel model;
	private Vector<Object> row;
	private JScrollPane scroll;
	
	/*
	 * Se declara el constructor de PanelTabla
	 */
	public PanelDialogTablaFactura()
	{
		nombreColumnas = new String[] {"Item #", "Concepto", "Valor"};
		data = new Object[][] {{"0", "0", "0"}};
		table = new JTable(data, nombreColumnas);
		model = new DefaultTableModel();
		row = new Vector<Object>();
		table.setFillsViewportHeight(true);
		table.setVisible(true);
		scroll = new JScrollPane(table);
		model.setColumnCount(columnas);
		model.setRowCount(filas);
		model.addRow(row);
		add(scroll);
	}

	public String[] getNombreColumnas() {
		return nombreColumnas;
	}

	public int getFilas() {
		return filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public JTable getTable() {
		return table;
	}

	public Object[][] getData() {
		return data;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public Vector<Object> getRow() {
		return row;
	}

	public JScrollPane getScroll() {
		return scroll;
	}
	

}
