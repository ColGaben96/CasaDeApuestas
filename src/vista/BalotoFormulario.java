package vista;

import javax.swing.*;

import java.awt.*;

/**
 * 
 * @author Oh! Enterprises
 * Baloto Formulario: Es el marcador con respecto al juego.
 */

public class BalotoFormulario extends JPanel
{
	/**
	 * 1L = Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Indicador que si se quiere el modo de juego "Revancha" o no.
	 */
	private JCheckBox revancha;
	/**
	 * Modo de juego automático o manual.
	 */
	private JRadioButton automatico, manual;
	/**
	 * Indicador de factura y el numero de la misma.
	 */
	private JLabel labelBalotas, idFactura;
	/**
	 * Muestra en texto el numero de la factura del jugador.
	 */
	private JTextField txBalotas, txFactura;
	/**
	 * Separador para interfaz grafica, organizacion visual.
	 */
	private JSeparator separador;
	/**
	 * Boton para generar numeros aleatorios para el juego.
	 */
	private JButton generarNumeros;	
	
	private String selectedGame;
	public static final String RADIOAUTOMATICO = "RadioAutomatico", RADIOMANUAL = "RadioManual", GENERAR = "Generar";
	
	public BalotoFormulario()
	{
		/**
		 * Muestra el panel de Baloto Formulario en pantalla y toda su estructura.
		 * @param BalotoFormulario
		 * @return <ul>
		 * <li> setLayout: Crea el nuevo panel.<\li>
		 * <li> gridLayout: Cantidad de filas y columnas en el panel (en este caso (5,2)).<\li>
		 * <li> idFactura: Muestra el titulo "ID Factura Nº".<\li>
		 * <li> txFactura: Muestra el campo de texto que contiene el numero de la factura.<\li>
		 * <li> setEditable(false): El campo no se puede editar.<\li>
		 * <li> setForeground(Color.RED): El color de la letra del campo es rojo.<\li>
		 * <li> setBackground(Color.WHITE): El color del fondo del campo es blanco.<\li>
		 * <li> Font fuenteFactura: El tipo de fuente del campo es "Monospaced", tipo plana, tamano 12.<\li>
		 * <li> setFont: Asigna la fuente de la letra estipulada anteriormente al campo.<\li>
		 * <li> add(idFactura): Agrega el campo idFactura.<\li>
		 * <li> add(txFactura): Agrega el campo txFactura.<\li>
		 * <li> new JRadioButton("Automatico"): Crea el boton tipo redondo "Automatico".<\li>
		 * <li> new JRadioButton("Manual"): Carea el boton tipo redondo "Manual".<\li>
		 * <li> add(automatico): Agrega el boton "Automatico".<\li>
		 * <li> add(manual): Agrega el boton "Manual".<\li>
		 * <li> revancha = new JCheckBox("Revancha"): Crea boton de check de "Revancha" <\li>
		 * <li> separador = JSeparator(): Agrega un separador al panel.<\li>
		 * <li> add(revancha): Agrega "Revancha".<\li>
		 * <li> add(separador): Agrega "Separador".<\li>
		 * <li> labelBalotas = new JLabel("Balotas a Jugar: "): Crea la etiqueta de "Balotas a Jugar.<\li>
		 * <li> txBalotas = new JTextField(): Crea el campo de texto de las balotas a jugar.<\li>
		 * <li> add(labelBalotas): Agrega la etiqueta de "Balotas a Jugar" al panel.<\li>
		 * <li> add(txBalotas): Agrega el campo de texto al panel.<\li>
		 * <li> generarNumeros = new JButton("Generar"): Crea el boton de generar numeros del baloto.<\li>
		 * <li> add(generarNumeros): Agrega el boton de "Generar".<\li>
		 *
		 */
		setLayout(new GridLayout(5, 2));
		idFactura = new JLabel("ID Factura N.");
		txFactura = new JTextField("0000");
		txFactura.setEditable(false);
		txFactura.setForeground(Color.RED);
		txFactura.setBackground(Color.WHITE);
		Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12);
		txFactura.setFont(fuenteFactura);
		add(idFactura);
		add(txFactura);
		automatico = new JRadioButton("Automatico");
		manual = new JRadioButton("Manual");
		add(automatico);
		add(manual);
		revancha = new JCheckBox("Revancha");
		separador = new JSeparator();
		add(revancha);
		add(separador);	
		labelBalotas = new JLabel("Balotas a Jugar: ");
		txBalotas = new JTextField();
		add(labelBalotas);
		generarNumeros = new JButton("Generar");
		add(generarNumeros);
		add(txBalotas);
		manual.setSelected(true);
		automatico.setActionCommand(RADIOAUTOMATICO);
		manual.setActionCommand(RADIOMANUAL);
		generarNumeros.setActionCommand(GENERAR);
		selectedGame = new String();
		
	}

	public JCheckBox getRevancha() {
		return revancha;
	}

	public JRadioButton getAutomatico() {
		return automatico;
	}

	public JRadioButton getManual() {
		return manual;
	}

	public JLabel getLabelBalotas() {
		return labelBalotas;
	}

	public JLabel getIdFactura() {
		return idFactura;
	}

	public JTextField getTxBalotas() {
		return txBalotas;
	}

	public JTextField getTxFactura() {
		return txFactura;
	}

	public JSeparator getSeparador() {
		return separador;
	}

	public JButton getGenerarNumeros() {
		return generarNumeros;
	}

	public String getSelectedGame() {
		return selectedGame;
	}

	public void setSelectedGame(String selectedGame) {
		this.selectedGame = selectedGame;
	}
	
	

}
