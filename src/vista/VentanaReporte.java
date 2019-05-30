package vista;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class VentanaReporte extends JPanel{

	
	private static final long serialVersionUID = 1L;

public String dato;
public int apuestasquant;
	
	public VentanaReporte(String dato) {
		
		setLayout(new GridLayout(1 , 1));
		apuestasquant = 0;
		
	    JPanel Panel = new JPanel();
	  
	    JTextField ta = new JTextField(dato +" "+apuestasquant);
	    ta.setEditable(false);
	    Panel.add(new JScrollPane(ta));

		
		add(Panel);
		

		setSize(800, 400);
		
	
}

	public int getApuestasquant() {
		return apuestasquant;
	}

	public void setApuestasquant(int apuestasquant) {
		this.apuestasquant = apuestasquant;
	}
	
	
}
