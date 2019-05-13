package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador implements ActionListener
{
	private Mundo modelo;
	private InterfazGUI vista;
	public Controlador()
	{
		modelo = new Mundo();
		vista = new InterfazGUI(this);
		vista.getPanelGrande().getPestanas().getParametros().butGuardar.addActionListener(this);
		vista.getPanelGrande().getPestanas().getParametros().butCargar.addActionListener(this);
		
	}


	public  void actionPerformed(ActionEvent evento) 
	{
		if(evento.getActionCommand().equals(vista.getPanelGrande().getPestanas().getParametros().CARGAR)) {
			modelo.getP().leerPropiedades();
			vista.getPanelGrande().getPestanas().getParametros().txtCasa.setText(modelo.getP().casa);
			vista.getPanelGrande().getPestanas().getParametros().txtSedes.setText(modelo.getP().sedes);
			vista.getPanelGrande().getPestanas().getParametros().txtPresupuesto.setText(modelo.getP().presupuesto);
		}
		
		if(evento.getActionCommand().equals(vista.getPanelGrande().getPestanas().getParametros().GUARDAR)) {
			modelo.getP().escribirPropiedades(vista.getPanelGrande().getPestanas().getParametros().txtCasa.getText(), 
		    vista.getPanelGrande().getPestanas().getParametros().txtSedes.getText(), 
		    vista.getPanelGrande().getPestanas().getParametros().txtPresupuesto.getText());
		}
		
	}


}
