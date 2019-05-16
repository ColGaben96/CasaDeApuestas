package vista;

import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author Oh! Enterprises
 * OhPollaFormulario: Crea el marcador de la polla en el programa.
 *
 */
public class OhPollaFormulario extends JPanel
{
	/**
	 * @param OhPollaFormulario extends JPanel: Crea el marcador con extension al JPanel.
	 * serialVersionUID = 1L: Serial por defecto.
	 * JLabel idFactura, idCliente, labelvs, labelMarcador, labelSeparadorMarcador: Implementa las etiquetas de factura, cliente, VS, Marcador y los separadores.
	 * JTextField txFactura, txidCliente, txEquipoA, txEquipoB, tx MarcadorA, txMarcadorB: Implementa los campos de texto de factura, IDCliente, Equipo A y B, Marcador A y B.
	 */
	private static final long serialVersionUID = 1L;
	private JLabel idFactura, idCliente, labelvs, labelMarcador, labelSeparadorMarcador;
	private JTextField txFactura, txidCliente, txEquipoA, txEquipoB, txMarcadorA, txMarcadorB;
	
	public OhPollaFormulario()
	{
		/**
		 * @param OhPollaFormulario: Implementacion grafica del mercador de la polla.
		 * idFactura = new JLabel("ID Factura Nº"): Crea la etiqueta del numero de factura.
		 * txFactura = new JTextField("0000"): Crea el campo de texto de la factura con "0000" de base.
		 * txFactura.setEditable(false): El campo de texto no se puede editar.
		 * txFactura.setForeground(Color.RED): El color de la fuente es ROJO.
		 * txFactura.setBackground(Color.WHITE): El color del fondo del campo de texto es BLANCO.
		 * Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12): Determina la fuente del campo de texto asignado al numero de la factura.
		 * txFactura.setFont(fuenteFactura): Asigna el tipo de fuente al campo de texto.
		 * add(idFactura): Agrega el idFactura a la interfaz.
		 * add(txFactura): Agrega el campo de texto de la factura a la interfaz.
		 */
		idFactura = new JLabel("ID Factura Nº");
		txFactura = new JTextField("0000");
		txFactura.setEditable(false);
		txFactura.setForeground(Color.RED);
		txFactura.setBackground(Color.WHITE);
		Font fuenteFactura = new Font("Monospaced", Font.PLAIN,12);
		txFactura.setFont(fuenteFactura);
		add(idFactura);
		add(txFactura);
	}

}
