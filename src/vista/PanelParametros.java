package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import modelo.Propiedades;

public class PanelParametros extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JLabel labEntrada2;
	private JLabel labEntrada3;
	public JTextField txtCasa;
	public JTextField txtSedes;
	public JTextField txtPresupuesto;
	public JButton butGuardar;
	public JButton butCargar;
	public static final String CARGAR = "Cargar";
	public static final String GUARDAR = "Guardar";
	public PanelParametros() {
		setLayout(new GridLayout(4,2));
		labEntrada=new JLabel("Nombre de la casa");
		labEntrada2=new JLabel("Numero de sedes");
		labEntrada3=new JLabel("Presupuesto total");
		txtCasa= new JTextField("");
		txtSedes= new JTextField("");
		txtPresupuesto= new JTextField("");
		txtCasa.setForeground(Color.BLACK);
		txtCasa.setBackground(Color.WHITE);
		txtSedes.setForeground(Color.BLACK);
		txtSedes.setBackground(Color.WHITE);
		txtPresupuesto.setForeground(Color.BLACK);
		txtPresupuesto.setBackground(Color.WHITE);
		butGuardar = new JButton("Modificar datos");
		butGuardar.setActionCommand(GUARDAR);
		butCargar = new JButton("Cargar datos");
		butCargar.setActionCommand(CARGAR);
		
		add(labEntrada); add(txtCasa);
		
		add(labEntrada2); add(txtSedes);
		
		add(labEntrada3); add(txtPresupuesto);
		
		add(butGuardar); add(butCargar);
	}
	
	
	
}
