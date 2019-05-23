package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * 
 * @author Oh! Enterprises.
 * PanelSedes: Clase dedicada a las sedes de las casas de apuestas.
 *
 */
public class PanelSedes extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Etiqueta de entrada.
	 */
	private JLabel labEntrada;
	/**
	 * Etiqueta de entrada 2.
	 */
	private JLabel labEntrada2;
	private JLabel labEntrada4;
	/**
	 * Etiqueta de entrada 3.
	 */
	private JLabel labEntrada3;
	/**
	 * Campo de texto de ubicacion.
	 */
	public JTextField txtUbicacion;
	/**
	 * Campo de texto Numero de empleados.
	 */
	public JTextField txtNumEmp;
	/**
	 * Boton Guardar.
	 */
	public JButton butGuardar;
	/**
	 * Boton Cargar.
	 */
	public JButton butCargar;
	
	/**
	 * Boton estatico de Cargar.
	 */
	public static final String CARGAR = "Cargar";
	/**
	 * Boton estatico de Guardar.
	 */
	public static final String GUARDAR = "Guardar";
	
	public PanelSedes()
	{
		/**
		 * @param PanelSedes: Constructor del panel destinado a sedes de casa de apuestas.
		 * setLayout(new GridLayout(4,2)): Creacion del panel grande y de botones en cuadricula (4 filas, 2 columnas).
		 * labEntrada=new JLabel("Ubicacion"): Crear nueva etiqueta de "Ubicacion".
		 * labEntrada2=new JLabel("Numero de empleados"): Crear nueva etiqueta de "Numero de empleados".
		 * txtUbicacion= new JTextField(""): Campo de texto de "ubicacion", vacio.
		 * txtNumEmp= new JTextField(""): Campo de texto de "numero de empleados", vacio.
		 * txtUbicacion.setForeground(Color.BLACK): Color de fuente del campo de texto en ubicacion (negro).
		 * txtUbicacion.setBackground(Color.WHITE): Color de fondo del campo de texto en ubicacion (blanco).
		 * txtNumEmp.setForeground(Color.BLACK): Color de fuente del campo de texto en numero de empleados (negro).
		 * txtNumEmp.setBackground(Color.WHITE): Color de fondo del campo de texto en numero de empleados (blanco).
		 * butGuardar = new JButton("Modificar datos"): Nuevo boton "Modificar datos" en el submenu "guardar".
		 * butGuardar.setActionCommand(GUARDAR): Desplegar del boton "Guardar" el boton "Modificar datos".
		 * butCargar = new JButton("Cargar datos"): Nuevo boton "Cargar datos" en el submenu "Cargar".
		 * butCargar.setActionCommand(CARGAR): Desplegar del boton "Cargar" el boton "Cargar datos".
		 * add(labEntrada); add(txtUbicacion): Agregar etiqueta y campo de texto de "ubicacion".
		 * add(labEntrada2); add(txtNumEmp): Agregar etiqueta y campo de texto de "Numero de empleados".
		 * add(butGuardar); add(butCargar): Agregar botones de "Guardar" y "Cargar".
		 */
		setLayout(new GridLayout(4,2));
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
	/**
	 * Obtener boton de guardar.
	 * @return butGuardar.
	 */
	public JButton getGuardar() {
		return butGuardar;
	}
	/**
	 * Obtener boton de cargar.
	 * @return butCargar.
	 */
	public JButton getCargar() {
		return butCargar;
	}
	/**
	 * Obtener campo de texto de ubicacion.
	 * @return txtUbicacion.
	 */
	public JTextField getUbicacion() {
		return txtUbicacion;
	}
	/**
	 * Obtener campo de texto de numero de empleados.
	 * @return txtNumEmp.
	 */
	public JTextField getNumEmp() {
		return txtNumEmp;
	}
	
}
