package vista;

import java.awt.*;

import javax.swing.*;

/**
 * 
 * @author Oh! Enterprises
 * BalotoOperaciones: Panel de operaciones de Baloto: Permite la apuesta y el descarte al jugador.
 */
public class BalotoOperaciones extends JPanel
{
	/**
	 * 1L: Serial por defecto.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Creación de botones "Apostar" y "Descartar".
	 */
	private JButton apostar, descartar;
	public static final String APOSTAR = "Apostar2", DESCARTAR = "Descartar2";
	
	public BalotoOperaciones()
	{
		/**
		 * Muestra en el panel de BalotoOperaciones y toda su estructura.
		 * @param BalotoOperaciones
		 * @return <ul>
		 * <li> setLayout: Crea el nuevo panel.<\li>
		 * <li> GridLayout(1,2): Cantidad de filas y colmunas para el panel (una fila, dos columnas).<\li>
		 * <li> apostar = new JButton("Apostar"): Crea el boton "Apostar" al panel.<\li>
		 * <li> add(apostar): Agrega el boton "Apostar" al panel.<\li>
		 * <li> descartar = new JButton("Descartar"): Agrega el boton "Descartar" al panel. <\li>
		 * <li> add(descartar): Agrega el boton "Descartar" al panel.>\li>
		 */
		setLayout(new GridLayout(1, 2));
		apostar = new JButton("Apostar");
		add(apostar);
		descartar = new JButton("Descartar");
		add(descartar);
		apostar.setActionCommand(APOSTAR);
		descartar.setActionCommand(DESCARTAR);
		
	}

	/**
	 * Obtener apostar
	 * @return apostar.
	 */
	public JButton getApostar() 
	{
		return apostar;
	}

	/**
	 * Obtener descartar.
	 * @return descartar.
	 */
	public JButton getDescartar() 
	{
		return descartar;
	}
}
