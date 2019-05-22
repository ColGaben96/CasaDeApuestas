package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import controlador.Controlador;

public class VentanaReporte extends JFrame{

	
	private static final long serialVersionUID = 1L;

public String dato;
	
	public VentanaReporte(String dato) {
		
		setLayout(new GridLayout(1 , 1));
		
	    JPanel Panel = new JPanel();
	  
	    JTextArea ta = new JTextArea(dato, 40, 70);
	    ta.setLineWrap(true);
	    ta.setWrapStyleWord(true);
	    Panel.add(new JScrollPane(ta));

		
		add(Panel);
		

		setSize(800, 400);
		
	
}
	
	
}
