package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSedes extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JLabel labEntrada2;
	private JLabel labEntrada4;
	public JTextField txtUbicacion;
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
		txtUbicacion= new JTextField("");
		txtNumEmp= new JTextField("");
		txtUbicacion.setForeground(Color.BLACK);
		txtUbicacion.setBackground(Color.WHITE);
		txtNumEmp.setForeground(Color.BLACK);
		txtNumEmp.setBackground(Color.WHITE);
		butGuardar = new JButton("Modificar datos");
		butGuardar.setActionCommand(GUARDAR);
		butCargar = new JButton("Cargar datos");
		butCargar.setActionCommand(CARGAR);
		
		add(labEntrada); add(txtUbicacion);
		
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
	public JTextField getUbicacion() {
		return txtUbicacion;
	}
	public JTextField getNumEmp() {
		return txtNumEmp;
	}
	
}
