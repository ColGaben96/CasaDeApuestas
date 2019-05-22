package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelApostador extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JLabel labEntrada2;
	private JLabel labEntrada3;
	private JLabel labEntrada4;
	private JLabel labEntrada5;
	public JTextField txtNombre;
	public JTextField txtCedula;
	public JTextField txtSede;
	public JTextField txtDireccion;
	public JTextField txtCelular;
	public JButton butGuardar;
	public JButton butCargar;
	public static final String CARGAR = "Cargar3";
	public static final String GUARDAR = "Guardar3";
	
public PanelApostador() {
		
		setLayout(new GridLayout(6,2));
		labEntrada=new JLabel("Nombre");
		labEntrada2=new JLabel("Cedula");
		labEntrada3=new JLabel("Sede");
		labEntrada4=new JLabel("Direccion");
		labEntrada5=new JLabel("Celular");
		txtNombre= new JTextField("");
		txtCedula= new JTextField("");
		txtSede= new JTextField("");
		txtDireccion= new JTextField("");
		txtCelular= new JTextField("");
		txtNombre.setForeground(Color.BLACK);
		txtNombre.setBackground(Color.WHITE);
		txtCedula.setForeground(Color.BLACK);
		txtCedula.setBackground(Color.WHITE);
		txtSede.setForeground(Color.BLACK);
		txtSede.setBackground(Color.WHITE);
		txtDireccion.setForeground(Color.BLACK);
		txtDireccion.setBackground(Color.WHITE);
		txtCelular.setForeground(Color.BLACK);
		txtCelular.setBackground(Color.WHITE);
		butGuardar = new JButton("Guardar datos");
		butGuardar.setActionCommand(GUARDAR);
		butCargar = new JButton("Cargar datos del apostador actual");
		butCargar.setActionCommand(CARGAR);
		
		add(labEntrada); add(txtNombre);
		
		add(labEntrada2); add(txtCedula);
		
        add(labEntrada3); add(txtSede);
		
		add(labEntrada4); add(txtDireccion);
		
        add(labEntrada5); add(txtCelular);
			
		add(butGuardar); add(butCargar);
	}
	
	public JButton getGuardar() {
		return butGuardar;
	}
	public JButton getCargar() {
		return butCargar;
	}
	public JTextField getNombre() {
		return txtNombre;
	}
	public JTextField getCedula() {
		return txtCedula;
	}
	public JTextField getSede() {
		return txtSede;
	}
	public JTextField getDireccion() {
		return txtDireccion;
	}
	public JTextField getCelular() {
		return txtCelular;
	}
	
	
}
