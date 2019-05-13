package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vista.InterfazGUI;
import vista.VentanaDetalles;

public class Controlador implements ActionListener
{
	private Mundo modelo;
	private InterfazGUI vista;
	private VentanaDetalles detalles;
	public Controlador()
	{
		modelo = new Mundo();
		vista = new InterfazGUI(this);
		detalles = new VentanaDetalles(this);
		vista.getPanelGrande().getOperaciones().getDetallesPunto().addActionListener(this);
		detalles.getParametros().getGuardar().addActionListener(this);
		detalles.getParametros().getCargar().addActionListener(this);
	}


	public  void actionPerformed(ActionEvent evento) 
	{
		if(evento.getActionCommand().equals(detalles.getParametros().CARGAR)) {
			modelo.getP().leerPropiedades();
			detalles.getParametros().getCasa().setText(modelo.getP().getCasa());
			detalles.getParametros().getSedes().setText(modelo.getP().getSedes());
			detalles.getParametros().getPresupuesto().setText(modelo.getP().getPresupuesto());
		}
		
		if(evento.getActionCommand().equals(detalles.getParametros().GUARDAR)) {
			modelo.getP().escribirPropiedades(detalles.getParametros().getCasa().getText(), 
		    detalles.getParametros().getSedes().getText(), 
		    detalles.getParametros().getPresupuesto().getText());
		}
		
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().DETALLES)) {
			detalles.setVisible(true);
		}
		
		if(evento.getActionCommand().equals(detalles.getSedes().GUARDAR)) {
			modelo.getA().leerArchivo();
			detalles.getSedes().getUbicacion().setText(modelo.getA().getUbicacion());
			detalles.getSedes().getNumEmp().setText(modelo.getA().getNumEmp());
		}
		if(evento.getActionCommand().equals(detalles.getSedes().CARGAR)) {
			modelo.getA().escribirArchivo(detalles.getSedes().getUbicacion().getText(), 
					detalles.getSedes().getNumEmp().getText());
		}
		
	}


}
