package vista;

import java.awt.*;

import javax.swing.*;
/**
 * 
 * @author Oh! Enterprises.
 * SuperAstroFormulario: Clase dedicada al formulario de Super Astro.
 *
 */
public class SuperAstroFormulario extends JPanel
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Etiquetas de los campos a llenar.
	 */
	private JLabel idFactura, idCliente, selectAstro, selectNumber;
	/**
	 * Campos de texto.
	 */
	private JTextField txIDCliente, txNumber, txFactura;
	/**
	 * Campo especial de lista estatica desplegable.
	 */
	private JComboBox<String> listAstro;
	
	public SuperAstroFormulario()
	{
		/**
		 * @param SuperAstroFormulario: Constructor del formulario de Super Astro.
		 * setLayout(new GridLayout(4, 2)): Crea nuevo panel grande que aloja los botones en una cuadricula (4 filas, 2 columnas).
		 * String[] listSignos = {"SELECCIONAR", "Acuario", "Piscis", "Aries", "Tauro", "Geminis", "Cancer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario", "Capricornio"}: Lista de los signos del zodiaco disponibles.
		 * 
		 * idFactura = new JLabel("ID Factura Nº"): Etiqueta nueva de "ID Factura Nº".
		 * txFactura = new JTextField("0000"): Campo de texto del numero de factura ("0000" por defecto).
		 * txFactura.setEditable(false): Este campo de texto no se puede editar.
		 * txFactura.setForeground(Color.RED): Color de letra del campo de texto es rojo.
		 * txFactura.setBackground(Color.WHITE): Color de fondo del campo de texto es blanco.
		 * Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12): Tipo de fuente del campo de texto es "Monospaced", tipo plana de tamano 12.
		 * txFactura.setFont(fuenteFactura): Agrega el tipo de fuente al campo de texto.
		 * add(idFactura): Agrega la etiqueta de "Factura" a la interfaz.
		 * add(txFactura): Agrega el campo de texto de "factura" a la interfaz.
		 * 
		 * idCliente = new JLabel("C.C / C.E"): Etiqueta nueva de "C.C/C.E".
		 * txIDCliente = new JTextField(): Campo de texto de "ID Cliente".
		 * add(idCliente): Agrega la etiqueta a la interfaz.
		 * add(txIDCliente): Agrega el campo de texto a la interfaz.
		 * 
		 * selectAstro = new JLabel("Signo Zodiacal"): Nueva etiqueta de "signo zodiacal".
		 * listAstro = new JComboBox<String>(listSignos): Nueva lista cerrada de signos del zodiaco.
		 * add(selectAstro): Agrega la etiqueta a la interfaz.
		 * add(listAstro): Agrega la lista a la interfaz.
		 * 
		 * selectNumber = new JLabel("Numero a Jugar"): Nueva etiqueta de "Numero a jugar".
		 * txNumber = new JTextField(): Nuevo campo de texto de "Numero a jugar".
		 * add(selectNumber): Agrega etiqueta a la interfaz.
		 * add(txNumber): Agrega campo de texto a la interfaz.
		 */
		setLayout(new GridLayout(4, 2));
		String[] listSignos = {"SELECCIONAR", "Acuario", "Piscis", "Aries", "Tauro", "Geminis", "Cancer", "Leo", "Virgo", "Libra", "Escorpio", "Sagitario", "Capricornio"};
		
		idFactura = new JLabel("ID Factura N.");
		txFactura = new JTextField("0000");
		txFactura.setEditable(false);
		txFactura.setForeground(Color.RED);
		txFactura.setBackground(Color.WHITE);
		Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12);
		txFactura.setFont(fuenteFactura);
		add(idFactura);
		add(txFactura);
		
		idCliente = new JLabel("C.C / C.E");
		txIDCliente = new JTextField();
		add(idCliente);
		add(txIDCliente);
		
		selectAstro = new JLabel("Signo Zodiacal");
		listAstro = new JComboBox<String>(listSignos);
		add(selectAstro);
		add(listAstro);
		
		selectNumber = new JLabel("Numero a Jugar");
		txNumber = new JTextField();
		add(selectNumber);
		add(txNumber);
	}

	/**
	 * Obtener numero de factura.
	 * @return idFactura.
	 */
	public JLabel getIdFactura() {
		return idFactura;
	}
	/**
	 * Obtener numero de cliente.
	 * @return idCliente.
	 */
	public JLabel getIdCliente() {
		return idCliente;
	}
	/**
	 * Obtener seleccionar astro.
	 * @return selectAstro.
	 */
	public JLabel getSelectAstro() {
		return selectAstro;
	}
	/**
	 * Obtener selesccionar numero.
	 * @return selectNumber.
	 */
	public JLabel getSelectNumber() {
		return selectNumber;
	}
	/**
	 * Obtener numero de cliente.
	 * @return txIDCliente.
	 */
	public JTextField getTxIDCliente() {
		return txIDCliente;
	}
	/**
	 * Obtener ingresar numero.
	 * @return txNumber.
	 */
	public JTextField getTxNumber() {
		return txNumber;
	}
	/**
	 * Obtener numero factura.
	 * @return txFactura.
	 */
	public JTextField getTxFactura() {
		return txFactura;
	}
	/**
	 * Obtener lista de astros.
	 * @return listAstro.
	 */
	public JComboBox<String> getListAstro() {
		return listAstro;
	}
	
}
