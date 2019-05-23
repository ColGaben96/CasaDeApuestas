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
 * PanelParametros: Clase dedicada a la creacion del panel de parametros.
 *
 */
public class PanelParametros extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Etiqueta de labEntrada.
	 */
	private JLabel labEntrada;
	/**
	 * Etiqueta de labEntrada2.
	 */
	private JLabel labEntrada2;
	/**
	 * Etiqueta de labEntrada3.
	 */
	private JLabel labEntrada3;
	private JLabel labEntrada4;
	/**
	 * Campo de texto de Casa de apuestas.
	 */
	public JTextField txtCasa;
	/**
	 * Campo de texto de sedes.
	 */
	public JTextField txtSedes;
	/**
	 * Campo de texto de presupuesto.
	 */
	public JTextField txtPresupuesto;
	/**
	 * Boton de Guardar.
	 */
	public JButton butGuardar;
	/**
	 * Boton de Cargar.
	 */
	public JButton butCargar;
	/**
	 * Boton estatico de "Cargar".
	 */
	public static final String CARGAR = "Cargar";
	/**
	 * Boton estatico de "Guardar".
	 */
	public static final String GUARDAR = "Guardar";
	public PanelParametros() 
	{
		setLayout(new GridLayout(6,2));
		/**
		 * @param PanelParametros: Constructor del panel de parametros.
		 * setLayout(new GridLayout(4,2)): Crea el panel grande junto con las cuadriculas de los botones.
		 * labEntrada=new JLabel("Nombre de la casa"): Crea la etiqueta "Nombre de la casa".
		 * labEntrada2=new JLabel("Numero de sedes"): Crea la etiqueta "Numero de sedes".
		 * labEntrada3=new JLabel("Presupuesto total"): Crea la etiqueta "Presupuesto total".
		 * txtCasa=new JTextField(""): Crea el campo de texto de casa, en vacio.
		 * txtSedes=new JTextField(""): Crea el campo de texto de sedes, en vacio.
		 * txtPresupuesto=new JTextField(""): Crea el campo de texto de presupuesto, en vacio.
		 * txtCasa.setForeground(Color.BLACK): Determina el color de la letra del campo de texto de casa de apuestas (negro).
		 * txtCasa.setBackground(Color.WHITE): Determina el color del fondo del campo de texto de casa de apuestas (blanco).
		 * txtSedes.setForeground(Color.BLACK): Determina el color de la letra del campo de texto de sedes (negro).
		 * txtSedes.setBackground(Color.WHITE): Determina el color del fondo del campo de texto de sedes (blanco).
		 * txtPresupuesto.setForeground(Color.BLACK): Determina el color de la letra en el campo de texto de presupuesto (negro).
		 * txtPresupuesto.setBackground(Color.WHITE): Determina el color del fondo en el campo de texto de presupuesto (blanco).
		 * butGuardar = new JButton("Modificar datos"): Crea el boton "Modificar datos" a traves del menu guardar.
		 * butGuardar.setActionCommand(GUARDAR): Implementa el enlace de guardar al boton "Guardar".
		 * butCargar = new JButton("Cargar datos"): Crea el boton "Cargar datos" a traves del menu cargar.
		 * butCargar.setActionCommand(CARGAR): Implementa el enlace de cargar al boton "Cargar".
		 * add(labEntrada); add(txtCasa): Agrega boton "Nombre de la casa" y campo de texto.
		 * add(labEntrada2); add(txtSedes): Agrega boton "Numero de sedes" y campo de texto.
		 * add(labEntrada3); add(txtPresupuesto): Agrega boton "Presupuesto total" y campo de texto.
		 * add(butGuardar); add(butCargar): Agrega boton "Guardar" y "Cargar".
		 */
		setLayout(new GridLayout(4,2));
		labEntrada=new JLabel("Nombre de la casa");
		labEntrada2=new JLabel("Numero de sedes");
		labEntrada3=new JLabel("Presupuesto total");
		labEntrada4=new JLabel("");
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
		
		add(labEntrada4); add(labEntrada4);

		add(labEntrada4); add(labEntrada4);
		
		add(labEntrada4); add(labEntrada4);
	}
	/**
	 * Obtener boton guardar.
	 * @return butGuardar.
	 */
	public JButton getGuardar() {
		return butGuardar;
	}
	/**
	 * Obtener boton cargar.
	 * @return butCargar.
	 */
	public JButton getCargar() {
		return butCargar;
	}
	/**
	 * Obtener campo de texto casa.
	 * @return txtCasa.
	 */
	public JTextField getCasa() {
		return txtCasa;
	}
	/**
	 * Obtener campo de texto sedes.
	 * @return txtSedes.
	 */
	public JTextField getSedes() {
		return txtSedes;
	}
	/**
	 * Obtener campo de texto presupuesto.
	 * @return txtPresupuesto.
	 */
	public JTextField getPresupuesto() {
		return txtPresupuesto;
	}

}
