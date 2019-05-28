package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSedes extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JLabel labEntrada2;
	private JLabel labEntrada4;
	public JComboBox<String> listUbicacion;
	public JTextField txtNumEmp;
	public JButton butGuardar;
	public JButton butCargar;
	public static final String CARGAR = "Cargar2";
	public static final String GUARDAR = "Guardar2";
	
	public PanelSedes() {
		
		setLayout(new GridLayout(6,2));
		labEntrada=new JLabel("Ubicacion");
		labEntrada2=new JLabel("Numero de empleados");
		labEntrada4=new JLabel("");
		String[] panUbicacion= {"SELECCIONAR:", "Usaquen", "Chapinero", "Santa Fe", "San Cristobal", "Usme", "Tunjuelito", "Bosa", "Kennedy", "Fontibon", "Engativa", "Suba", "Barrios Unidos", "Teusaquillo", "Los Martires", "Antonio Narino", "Puente Aranda", "La Candelaria", "Rafael Uribe Uribe", "Ciudad Bolivar", "Sumapaz"};
		txtNumEmp= new JTextField("");
		txtNumEmp.setForeground(Color.BLACK);
		txtNumEmp.setBackground(Color.WHITE);
		butGuardar = new JButton("Modificar datos");
		butGuardar.setActionCommand(GUARDAR);
		butCargar = new JButton("Cargar datos");
		butCargar.setActionCommand(CARGAR);
		listUbicacion = new JComboBox<String>(panUbicacion);
		
		add(labEntrada); add(listUbicacion);
		
		add(labEntrada2); add(txtNumEmp);
		
		add(butGuardar); add(butCargar);
		
		add(labEntrada4);add(labEntrada4);
		
		add(labEntrada4);add(labEntrada4);
		
		add(labEntrada4);add(labEntrada4);
	}
	
	public JButton getGuardar() {
		return butGuardar;
	}
	public JButton getCargar() {
		return butCargar;
	}
	public JComboBox<String> listUbicacion() {
		return listUbicacion;
	}
	public JTextField getNumEmp() {
		return txtNumEmp;
	}
	
}
