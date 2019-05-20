package vista;

import javax.swing.*;
import java.awt.*;
/**
 * 
 * @author Oh! Enterprises.
 * AboutUs: clase dedicada al "Acerca De".
 *
 */
public class AboutUs extends JDialog
{
	/**
	 * Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Etiquetas.
	 */
	private JLabel OhEnterprises, specialMessage;
	/**
	 * Campos de texto.
	 */
	private JTextArea thanksto;
	/**
	 * Panel desplazable.
	 */
	private JScrollPane scroll;
	
	public AboutUs()
	{
		/**
		 * @param AboutUs: Constructor del "acerca de".
		 * setTitle("Acerca de"): Titulo "Acerca de".
		 * setSize(800, 600): Tamano de la ventana (800,600).
		 * OhEnterprises = new JLabel("Oh! Enterprises Colombia"): Etiqueta de Oh! Enterprises.
		 * specialMessage = new JLabel("Este programa fue hecho gracias a:"): Nueva etiqueta como "mensaje especial"
		 * thanksto = new JTextArea("Gabriel Ernesto Blanco La Rotta - gblancol@unbosque.edu.co" + "\n"
		 * 		+ "Nicolas Ferreira Perez - nferreirap@unbosque.edu.co" + "\n"
		 * 		+ "Julian Eduardo Santos Ni�o - jesantos@unbosque.edu.co" + "\n"
		 * 		+ "Jose Julian Ojeda Bernal - jojedab@unbosque.edu.co" + "\n"
		 * 		+ "Universidad El Bosque" + "\n"
		 * 		+ "� 2019 - Oh! Enterprises - Todos los derechos reservados"): Nuevo campo de texto con "agradecimientos".
		 * scroll = new JScrollPane(): Panel desplegable.
		 * setLayout(new GridLayout(3, 1)): Nueva cuadricula de 3 filas, 1 columna.
		 * add(OhEnterprises): Agregar OhEnterprises.
		 * add(specialMessage): Agregar mensaje especial.
		 * add(thanksto): Agregar Gracias a...
		 * thanksto.add(scroll): Agrega el scroll a los agradecimientos,
		 * thanksto.setEditable(false): No se puede editar.
		 * setVisible(false): No es visible.
		 */
		setTitle("Acerca de");
		setSize(800, 600);
		OhEnterprises = new JLabel("Oh! Enterprises Colombia");
		specialMessage = new JLabel("Este programa fue hecho gracias a:");
		thanksto = new JTextArea("Gabriel Ernesto Blanco La Rotta - gblancol@unbosque.edu.co" + "\n"
				+ "Nicolas Ferreira Perez - nferreirap@unbosque.edu.co" + "\n"
				+ "Julian Eduardo Santos Ni�o - jesantos@unbosque.edu.co" + "\n"
				+ "Jose Julian Ojeda Bernal - jojedab@unbosque.edu.co" + "\n"
				+ "Universidad El Bosque" + "\n"
				+ "� 2019 - Oh! Enterprises - Todos los derechos reservados");
		scroll = new JScrollPane();
		setLayout(new GridLayout(3, 1));
		add(OhEnterprises);
		add(specialMessage);
		add(thanksto);
		thanksto.add(scroll);
		thanksto.setEditable(false);
		setVisible(false);
	}
	
}
