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
		detalles.getSedes().getGuardar().addActionListener(this);
		detalles.getSedes().getCargar().addActionListener(this);
	}


	@SuppressWarnings("static-access")
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
		
		if(evento.getActionCommand().equals(detalles.getSedes().CARGAR)) {
			modelo.getA().leerArchivoSedes();
			detalles.getSedes().getUbicacion().setText(modelo.getA().getUbicacion());
			detalles.getSedes().getNumEmp().setText(modelo.getA().getNumEmp());
		}
		if(evento.getActionCommand().equals(detalles.getSedes().GUARDAR)) {
			modelo.getA().escribirArchivoSedes(detalles.getSedes().getUbicacion().getText(), 
					detalles.getSedes().getNumEmp().getText());
		}
		if(evento.getActionCommand().equals(detalles.getParametros().CARGAR)) {
			modelo.getA().leerArchivoApostador();
			detalles.getApostador().getNombre().setText(modelo.getA().getNombre());
			detalles.getApostador().getCedula().setText(modelo.getA().getCedula());
			detalles.getApostador().getSede().setText(modelo.getA().getSede());
			detalles.getApostador().getDireccion().setText(modelo.getA().getDireccion());
			detalles.getApostador().getCelular().setText(modelo.getA().getCelular());
		}
		
		if(evento.getActionCommand().equals(detalles.getParametros().GUARDAR)) {
			modelo.getA().escribirArchivoApostador(detalles.getApostador().getNombre().getText(), 
		    detalles.getApostador().getCedula().getText(), 
		    detalles.getApostador().getSede().getText(),
		    detalles.getApostador().getDireccion().getText(), 
		    detalles.getApostador().getCelular().getText());
		}
		
		if(evento.getActionCommand().equals(vista.getTooltip().CERRAR))
		{
			System.exit(0);
		}
		
		if(evento.getActionCommand().equals(vista.getTooltip().ACERCADE))
		{
			vista.getAboutus().setVisible(true);
		}
		
		if(evento.getActionCommand() == vista.getPanelGrande().getPestanas().getBaloto().getFormulario().RADIOAUTOMATICO)
		{
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getManual().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setText("");
		}
		if(evento.getActionCommand() == vista.getPanelGrande().getPestanas().getBaloto().getFormulario().RADIOMANUAL)
		{
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getAutomatico().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(true);
		}
		if(evento.getActionCommand() == vista.getPanelGrande().getPestanas().getBaloto().getFormulario().GENERAR)
		{
			
		}
		
	}


}
