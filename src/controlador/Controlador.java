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
		modelo.getF().hacerFactura();
		vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
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
		
		if(evento.getActionCommand().equals(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().RADIOAUTOMATICO))
		{
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getManual().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setText("");
		}
		if(evento.getActionCommand().equals(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().RADIOMANUAL))
		{
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getAutomatico().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(true);
		}
		if(evento.getActionCommand() .equals( vista.getPanelGrande().getPestanas().getBaloto().getFormulario().GENERAR))
		{
			/* Generar balotas de manera random */
		}
		
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getBaloto().getOperaciones().APOSTAR))
		{
			/* Capturar datos y usar un generador de pdf*/
			vista.getFactura().setVisible(true);
			vista.getStatusBar().getStatus().setText("Saving Invoice...");
			vista.getFactura().getDetalles().getTxFactura().setText(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxFactura().getText());
			if(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getRevancha().isSelected())
			{
				Object[][] data = new Object[2][3];
				vista.getFactura().getFactura().getModel().addRow(data);
				
			}
			else
			{
				Object[][] data = new Object[1][3];
				vista.getFactura().getFactura().getModel().addRow(data);
			}
		}
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getSuperAstro().getOperaciones().APOSTAR))
		{
			/* Capturar datos y usar un generador de pdf*/
			vista.getFactura().setVisible(true);
			vista.getStatusBar().getStatus().setText("Saving Invoice...");
			vista.getFactura().getDetalles().getTxFactura().setText(vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxFactura().getText());
		}
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getOhPolla().getOperaciones().APOSTAR))
		{
			/* Capturar datos y usar un generador de pdf*/
			vista.getFactura().setVisible(true);
			vista.getStatusBar().getStatus().setText("Saving Invoice...");
			vista.getFactura().getDetalles().getTxFactura().setText(vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxFactura().getText());
		}
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getBaloto().getOperaciones().DESCARTAR))
		{
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getManual().setSelected(true);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getAutomatico().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(true);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getRevancha().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setText("");
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		}
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getSuperAstro().getOperaciones().DESCARTAR))
		{
			vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getListAstro().setSelectedIndex(0);
			vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxIDCliente().setText("");
			vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxNumber().setText("");
			modelo.getF().hacerFactura();
			vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		}
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getOhPolla().getOperaciones().DESCARTAR))
		{
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoA().setSelectedIndex(0);
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoB().setSelectedIndex(0);
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxMarcadorA().setText("Ej. 3");
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxMarcadorB().setText("Ej. 1");
			modelo.getF().hacerFactura();
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		}
		
	}


}
