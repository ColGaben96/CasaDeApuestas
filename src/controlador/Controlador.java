package controlador;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

import modelo.Mundo;
import vista.InterfazGUI;
import vista.VentanaDetalles;
import vista.VentanaReporte;

public class Controlador implements ActionListener
{
	private Mundo modelo;
	private InterfazGUI vista;
	private VentanaDetalles detalles;
	private VentanaReporte repo;
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
		vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getGenerarNumeros().setEnabled(false);
		
	
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
			modelo.getA().leerArchivoJuegos();
			modelo.getP().escribirPropiedades(detalles.getParametros().getCasa().getText(), 
		    detalles.getParametros().getSedes().getText(), 
		    detalles.getParametros().getPresupuesto().getText(), modelo.getA().getPresupuesto());
		}
		
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().DETALLES)) {
			detalles.setVisible(true);
		}
		
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().REPORTE)) {
			repo = new VentanaReporte(("Total de apuestas:" + Integer.toString(modelo.getApuestas().getCantidad()) + 
					"\n \n" + modelo.getClientes().getClientes()));
			repo.setVisible(true);
		}
		
		if(evento.getActionCommand().equals(detalles.getSedes().CARGAR)) {
			modelo.getA().leerArchivoSedes();
			detalles.getSedes().listUbicacion().setToolTipText(modelo.getA().getUbicacion());
			detalles.getSedes().getNumEmp().setText(modelo.getA().getNumEmp());
		}
		if(evento.getActionCommand().equals(detalles.getSedes().GUARDAR)) {
			modelo.getA().escribirArchivoSedes(detalles.getSedes().listUbicacion().getToolTipText(), 
					detalles.getSedes().getNumEmp().getText());
		}
		if(evento.getActionCommand().equals(detalles.getApostador().CARGAR)) {
			modelo.getA().leerArchivoApostador();
			detalles.getApostador().getNombre().setText(modelo.getA().getNombre());
			detalles.getApostador().getCedula().setText(modelo.getA().getCedula());
			detalles.getApostador().listSede().setToolTipText(modelo.getA().getSede());
			detalles.getApostador().getDireccion().setText(modelo.getA().getDireccion());
			detalles.getApostador().getCelular().setText(modelo.getA().getCelular());
		}
		
		if(evento.getActionCommand().equals(detalles.getApostador().GUARDAR)) {
			modelo.getA().escribirArchivoApostador(detalles.getApostador().getNombre().getText(), 
		    detalles.getApostador().getCedula().getText(), 
		    detalles.getApostador().listSede().getSelectedItem().toString(),
		    detalles.getApostador().getDireccion().getText(), 
		    detalles.getApostador().getCelular().getText());
			modelo.getClientes().setClientes("nombre:"+modelo.getA().getNombre()+  " cedula:" +
		    modelo.getA().getCedula() +" sede:" +modelo.getA().getSede() + " direccion:" +
		    modelo.getA().getDireccion() + " celular:" + modelo.getA().getCelular());
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
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setText(null);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getGenerarNumeros().setEnabled(true);
		}
		if(evento.getActionCommand().equals(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().RADIOMANUAL))
		{
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getAutomatico().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(true);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getGenerarNumeros().setEnabled(false);
		}
		if(evento.getActionCommand() .equals( vista.getPanelGrande().getPestanas().getBaloto().getFormulario().GENERAR))
		{
			/* Generar balotas de manera random */
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setText(modelo.getAb().BalotoAutomatico());
		}
		
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getBaloto().getOperaciones().APOSTAR))
		{
			/* Capturar datos y usar un generador de pdf*/
			vista.getStatusBar().getStatus().setText("Making...");
			vista.getFactura().getDetalles().getTxFactura().setText(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxFactura().getText());
			if(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getRevancha().isSelected())
			{
				
				vista.getFactura().getFactura().getId1().setVisible(true);
				vista.getFactura().getFactura().getItem1().setVisible(true);
				vista.getFactura().getFactura().getValor1().setVisible(true);
				vista.getFactura().getFactura().getId2().setVisible(true);
				vista.getFactura().getFactura().getItem2().setVisible(true);
				vista.getFactura().getFactura().getValor2().setVisible(true);
				vista.getFactura().getFactura().getId1().setText("0001");
				vista.getFactura().getFactura().getItem1().setText("Juego Baloto");
				vista.getFactura().getFactura().getValor1().setText("5400");
				vista.getFactura().getFactura().getId2().setText("0001a");
				vista.getFactura().getFactura().getItem2().setText("Adici�n Revancha");
				vista.getFactura().getFactura().getValor2().setText("2500");
				int valor1 = Integer.parseInt(vista.getFactura().getFactura().getValor1().getText());
				int valor2 = Integer.parseInt(vista.getFactura().getFactura().getValor2().getText());
				modelo.getAb().BalotoManual();
				vista.getFactura().getOperaciones().getValortotal().setText("$ "+String.valueOf(valor1+valor2) );
			}
			else
			{	
			
				vista.getFactura().getFactura().getId1().setVisible(true);
				vista.getFactura().getFactura().getItem1().setVisible(true);
				vista.getFactura().getFactura().getValor1().setVisible(true);
				vista.getFactura().getFactura().getId2().setVisible(false);
				vista.getFactura().getFactura().getItem2().setVisible(false);
				vista.getFactura().getFactura().getValor2().setVisible(false);
				vista.getFactura().getFactura().getId1().setText("0001");
				vista.getFactura().getFactura().getItem1().setText("Juego Baloto"  + modelo.getAb().getNumeroFact());
				vista.getFactura().getFactura().getValor1().setText("5400");
				int valor1 = Integer.parseInt(vista.getFactura().getFactura().getValor1().getText());
				modelo.getAb().BalotoManual();
				vista.getFactura().getOperaciones().getValortotal().setText("$ "+String.valueOf(valor1));
				
			}
			vista.getFactura().setVisible(true);
			vista.getFactura().validate();
		}
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getSuperAstro().getOperaciones().APOSTAR))
		{
			
			vista.getFactura().setVisible(true);
			vista.getStatusBar().getStatus().setText("Making Invoice...");
			vista.getFactura().getDetalles().getTxFactura().setText(vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxFactura().getText());
			vista.getFactura().getFactura().getId1().setVisible(true);
			vista.getFactura().getFactura().getItem1().setVisible(true);
			vista.getFactura().getFactura().getValor1().setVisible(true);
			vista.getFactura().getFactura().getId2().setVisible(false);
			vista.getFactura().getFactura().getItem2().setVisible(false);
			vista.getFactura().getFactura().getValor2().setVisible(false);
			vista.getFactura().getFactura().getId1().setText("0002");
			vista.getFactura().getFactura().getItem1().setText("Juego SuperAstro" + modelo.getAsa().SuperAstro());
			vista.getFactura().getFactura().getValor1().setText("3500");
			int valor1 = Integer.parseInt(vista.getFactura().getFactura().getValor1().getText());
			vista.getFactura().getOperaciones().getValortotal().setText("$ "+String.valueOf(valor1));
			vista.getFactura().setVisible(true);
			vista.getFactura().validate();
			modelo.getAsa().SuperAstro();
		}
		if(evento.getActionCommand().equals(vista.getPanelGrande().getPestanas().getOhPolla().getOperaciones().APOSTAR))
		{
			vista.getStatusBar().getStatus().setText("Making Invoice...");
			modelo.getA().escribirOhPolla(modelo.getA().getSede(), modelo.getA().getCedula(), 
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoA().getToolTipText()+
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoB().getToolTipText());
			modelo.getApuestas().sumarCantidad();
			vista.getFactura().getFactura().getId1().setVisible(true);
			vista.getFactura().getFactura().getItem1().setVisible(true);
			vista.getFactura().getFactura().getValor1().setVisible(true);
			vista.getFactura().getFactura().getId2().setVisible(false);
			vista.getFactura().getFactura().getItem2().setVisible(false);
			vista.getFactura().getFactura().getValor2().setVisible(false);
			vista.getFactura().getFactura().getId1().setText("0003");
			vista.getFactura().getFactura().getItem1().setText("Juego Oh! Polla");
			vista.getFactura().getFactura().getValor1().setText("2300");
			int valor1 = Integer.parseInt(vista.getFactura().getFactura().getValor1().getText());
			vista.getFactura().getOperaciones().getValortotal().setText("$ "+String.valueOf(valor1));
			vista.getFactura().setVisible(true);
			vista.getFactura().validate();
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
		if(evento.getActionCommand().equals(vista.getFactura().getOperaciones().OK))
		{
			if (vista.getFactura().getOperaciones().getImprimirFactura().isSelected()) 
			{
				modelo.getA().imprimirFactura("");
			}
			if (vista.getFactura().getOperaciones().getEnviaracorreo().isSelected())
			{
				try 
				{
					Desktop desktop = Desktop.getDesktop();
					String message = "mailto:ventas@ohdelivery.co?subject=Tu factura de Oh! Delivery";
					URI uri = URI.create(message);
					desktop.mail(uri);
					vista.getStatusBar().getStatus().setText("Printing Invoice...");
				} 
				catch (IOException e) 
				{
					// TODO Bloque catch generado autom�ticamente
					e.printStackTrace();
				}
			}
			if (vista.getFactura().getOperaciones().getImprimirFactura().isSelected() && vista.getFactura().getOperaciones().getEnviaracorreo().isSelected())
			{
				modelo.getA().imprimirFactura("");
				try 
				{
					Desktop desktop = Desktop.getDesktop();
					String message = "mailto:ventas@ohdelivery.co?subject=Tu factura de Oh! Delivery";
					URI uri = URI.create(message);
					desktop.mail(uri);
					vista.getStatusBar().getStatus().setText("Printing and Sending Email...");
				} 
				catch (IOException e) 
				{
					// TODO Bloque catch generado autom�ticamente
					e.printStackTrace();
				}
			}
			
			vista.getFactura().setVisible(false);
			vista.getStatusBar().getStatus().setText("Ready...");
		}
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().EXTRACTOS))
		{
			vista.getReporteExtractos().setVisible(true);
		}
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().REPORTE))
		{
			vista.getImagenReporte().setVisible(true);
			vista.getImagenReporte().getChart().getFrame().setVisible(true);
		}
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().FACTURAS)) 
		{
			vista.NotAvailableYet();
		}
		if (evento.getActionCommand().equals(vista.getReporteExtractos().getOperaciones().CANCEL)) 
		{
			vista.getReporteExtractos().setVisible(false);
		}
		if (evento.getActionCommand().equals(vista.getImagenReporte().getOperaciones().CANCEL))
		{
			vista.getImagenReporte().getOperaciones().setVisible(false);
		}
		
	
	}


}
