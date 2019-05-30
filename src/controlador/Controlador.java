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

@SuppressWarnings("unused")
public class Controlador implements ActionListener
{
	private Mundo modelo;
	private InterfazGUI vista;
	public Controlador()
	{
		modelo = new Mundo();
		vista = new InterfazGUI(this);

		modelo.getF().hacerFactura();
		vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getGenerarNumeros().setEnabled(false);
		vista.getFactura().getOperaciones().getEnviaracorreo().setVisible(false);
		vista.getDetalles().setVisible(true);
	}


	@SuppressWarnings("static-access")
	public  void actionPerformed(ActionEvent evento) 
	{
		if(evento.getActionCommand().equals(vista.getDetalles().getParametros().CARGAR)) {
			modelo.getP().leerPropiedades();
			vista.getDetalles().getParametros().getCasa().setText(modelo.getP().getCasa());
			vista.getDetalles().getParametros().getSedes().setText(modelo.getP().getSedes());
			vista.getDetalles().getParametros().getPresupuesto().setText(modelo.getP().getPresupuesto());
			modelo.getA().setCasa(modelo.getP().getCasa());
		}
		
		if(evento.getActionCommand().equals(vista.getDetalles().getParametros().GUARDAR)) {
			modelo.getA().leerArchivoJuegos();
			modelo.getP().escribirPropiedades(vista.getDetalles().getParametros().getCasa().getText(), 
		    vista.getDetalles().getParametros().getSedes().getText(), 
		    vista.getDetalles().getParametros().getPresupuesto().getText(), modelo.getA().getPresupuesto());
		}
		
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().DETALLES)) {
			vista.getDetalles().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(vista.getDetalles().getSedes().CARGAR)) {
			modelo.getA().leerArchivoSedes();

			vista.getDetalles().getSedes().listUbicacion().setSelectedItem(modelo.getA().getUbicacion());
			vista.getDetalles().getSedes().getNumEmp().setText(modelo.getA().getNumemp());
			vista.setTitle("Oh! Apuestas - "+modelo.getA().getCasa());
		}
		if(evento.getActionCommand().equals(vista.getDetalles().getSedes().GUARDAR)) {
			modelo.getA().escribirArchivoSedes(vista.getDetalles().getSedes().listUbicacion().getSelectedItem().toString(), 

					vista.getDetalles().getSedes().getNumEmp().getText());
			modelo.getA().setCasa(vista.getDetalles().getParametros().getTxtCasa().getText().toString());
			vista.setTitle("Oh! Apuestas - "+modelo.getA().getCasa());
		}
		if(evento.getActionCommand().equals(vista.getDetalles().getApostador().CARGAR)) {
			modelo.getA().leerArchivoApostador();
			vista.getDetalles().getApostador().getNombre().setText(modelo.getA().getNombre());
			vista.getDetalles().getApostador().getCedula().setText(modelo.getA().getCedula());

			vista.getDetalles().getApostador().listSede().setSelectedItem(modelo.getA().getSede());

			vista.getDetalles().getApostador().getDireccion().setText(modelo.getA().getDireccion());
			vista.getDetalles().getApostador().getCelular().setText(modelo.getA().getCelular());
			vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxIDCliente().setText(modelo.getA().getCedula());
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxidCliente().setText(modelo.getA().getCedula());
		}
		
		if(evento.getActionCommand().equals(vista.getDetalles().getApostador().GUARDAR)) {
			modelo.getA().escribirArchivoApostador(vista.getDetalles().getApostador().getNombre().getText(), 
		    vista.getDetalles().getApostador().getCedula().getText(), 
		    vista.getDetalles().getApostador().listSede().getSelectedItem().toString(),
		    vista.getDetalles().getApostador().getDireccion().getText(), 
		    vista.getDetalles().getApostador().getCelular().getText());
		}
		
		if(evento.getActionCommand().equals(vista.getDetalles().getApostador().AGREGAR)) {
			modelo.getA().leerArchivoApostador();
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
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().setSelectedGame("Automatico");

		}
		if(evento.getActionCommand().equals(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().RADIOMANUAL))
		{
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getAutomatico().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(true);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getGenerarNumeros().setEnabled(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().setSelectedGame("Manual");
		}
		if(evento.getActionCommand() .equals( vista.getPanelGrande().getPestanas().getBaloto().getFormulario().GENERAR))
		{
			/* Generar balotas de manera random */
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setText(modelo.getAb().BalotoAutomatico());
		}
		
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getBaloto().getOperaciones().APOSTAR))
		{
			vista.getPanelGrande().getPestanas().setSelectedTab("Baloto");
			int valorinicial = Integer.parseInt(vista.getFactura().getOperaciones().getValortotal().getText());
			if(vista.getFactura().getOperaciones().getValortotal().getText() == null)
				valorinicial = 0;
			/* Capturar datos y usar un generador de pdf*/
			vista.getStatusBar().getStatus().setText("Making Invoice...");
			vista.getImagenReporte().getChart().setBaloto(vista.getImagenReporte().getChart().getBaloto()+1.0);
			vista.getImagenReporte().getRepo().setApuestasquant(vista.getImagenReporte().getRepo().getApuestasquant()+1);
			vista.getFactura().getDetalles().getTxFactura().setText(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxFactura().getText());
			if(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getRevancha().isSelected())
			{
				vista.getPanelGrande().getPestanas().getBaloto().getFormulario().setSelectedGame(vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getSelectedGame()+" con Revancha");
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
				vista.getFactura().getFactura().getItem2().setText("Adicion Revancha");
				vista.getFactura().getFactura().getValor2().setText("2500");
				int valor1 = Integer.parseInt(vista.getFactura().getFactura().getValor1().getText());
				int valor2 = Integer.parseInt(vista.getFactura().getFactura().getValor2().getText());
				int valortotal = valor1+valor2;
				modelo.getAb().BalotoManual();
				vista.getFactura().getOperaciones().getValortotal().setText(String.valueOf(valortotal) );
				vista.getReporteExtractos().getPestanas().getBaloto().getTxIngresos().setText("$ "+String.valueOf(valortotal+valorinicial));
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
				vista.getFactura().getFactura().getItem1().setText("Juego Baloto");
				vista.getFactura().getFactura().getValor1().setText("5400");
				int valor1 = Integer.parseInt(vista.getFactura().getFactura().getValor1().getText());
				int valortotal = valor1;
				modelo.getAb().BalotoManual();
				vista.getFactura().getOperaciones().getValortotal().setText(String.valueOf(valortotal));
				vista.getReporteExtractos().getPestanas().getBaloto().getTxIngresos().setText(String.valueOf(valortotal+valorinicial));
			}
			vista.getFactura().setVisible(true);
			vista.getFactura().validate();
		}
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getSuperAstro().getOperaciones().APOSTAR))
		{
			vista.getPanelGrande().getPestanas().setSelectedTab("SuperAstro");
			int valorinicial = Integer.parseInt(vista.getFactura().getOperaciones().getValortotal().getText());
			if(vista.getFactura().getOperaciones().getValortotal().getText() == null)
				valorinicial = 0;
			vista.getImagenReporte().getChart().setSuperastro(vista.getImagenReporte().getChart().getSuperastro()+1.0);
			vista.getImagenReporte().getRepo().setApuestasquant(vista.getImagenReporte().getRepo().getApuestasquant()+1);
			vista.getStatusBar().getStatus().setText("Making Invoice...");
			vista.getFactura().getDetalles().getTxFactura().setText(vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxFactura().getText());
			vista.getFactura().getFactura().getId1().setVisible(true);
			vista.getFactura().getFactura().getItem1().setVisible(true);
			vista.getFactura().getFactura().getValor1().setVisible(true);
			vista.getFactura().getFactura().getId2().setVisible(false);
			vista.getFactura().getFactura().getItem2().setVisible(false);
			vista.getFactura().getFactura().getValor2().setVisible(false);
			vista.getFactura().getFactura().getId1().setText("0002");
			vista.getFactura().getFactura().getItem1().setText("Juego SuperAstro");
			vista.getFactura().getFactura().getValor1().setText("3500");
			int valor1 = Integer.parseInt(vista.getFactura().getFactura().getValor1().getText());
			int valortotal = valor1;
			vista.getFactura().getOperaciones().getValortotal().setText(String.valueOf(valortotal));
			vista.getReporteExtractos().getPestanas().getSuperastro().getTxIngresos().setText(String.valueOf(valortotal+valorinicial));
			vista.getFactura().setVisible(true);
			vista.getFactura().validate();
			modelo.getAsa().SuperAstro();
		}
		if(evento.getActionCommand().equals(vista.getPanelGrande().getPestanas().getOhPolla().getOperaciones().APOSTAR))
		{
			vista.getPanelGrande().getPestanas().setSelectedTab("OhPolla");
			int valorinicial = Integer.parseInt(vista.getFactura().getOperaciones().getValortotal().getText());
			if(vista.getFactura().getOperaciones().getValortotal().getText() == null)
				valorinicial = 0;
			vista.getImagenReporte().getChart().setOhpolla(vista.getImagenReporte().getChart().getOhpolla()+1.0);
			vista.getImagenReporte().getRepo().setApuestasquant(vista.getImagenReporte().getRepo().getApuestasquant()+1);
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
			int valortotal = valor1;
			vista.getFactura().getOperaciones().getValortotal().setText(String.valueOf(valortotal));
			vista.getReporteExtractos().getPestanas().getOhpolla().getTxIngresos().setText(String.valueOf(valortotal+valorinicial));
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

			vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxNumber1().setText("");

			modelo.getF().hacerFactura();
			vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		}
		if(evento.getActionCommand().equals( vista.getPanelGrande().getPestanas().getOhPolla().getOperaciones().DESCARTAR))
		{
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoA().setSelectedIndex(0);
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoB().setSelectedIndex(0);

			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxMarcadorA().setText("");
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxMarcadorB().setText("");

			modelo.getF().hacerFactura();
			vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		}
		if(evento.getActionCommand().equals(vista.getFactura().getOperaciones().OK))
		{
				vista.getStatusBar().getStatus().setText("Printing...");
				if(vista.getPanelGrande().getPestanas().getSelectedTab() == "SuperAstro") 
				{
					modelo.getA().imprimirFactura("Tienda: "+modelo.getA().getCasa()+" - "+modelo.getA().getSede()+"\n"
							+"Factura Numero: "+vista.getFactura().getDetalles().getTxFactura().getText()+"\n"
							+"Cliente: "+modelo.getA().getNombre().toString()+"\n"
							+"Cedula: "+modelo.getA().getCedula().toString()+"\n"
							+"---------------------------------------------------------------------------------\n"
							+"                                     FACTURA\n"
							+"---------------------------------------------------------------------------------\n"
							+ vista.getFactura().getFactura().getId().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor().getText().toString()+"\n"
							+ vista.getFactura().getFactura().getId1().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem1().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor1().getText().toString()+"\n"
							+ vista.getFactura().getFactura().getId2().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem2().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor2().getText().toString()+"\n"
							+ "Gran Total: "+vista.getFactura().getOperaciones().getValortotal().getText().toString()+"\n"
							+"---------------------------------------------------------------------------------\n"
							+"                                     JUEGO\n"
							+"---------------------------------------------------------------------------------\n"
							+"Signo Zodiacal: "+vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getListAstro().getSelectedItem().toString()+"\n"
							+"Numero a Apostar: "+vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxNumber1().getText().toString()+"\n"
							+"\nMucha suerte!\n"
							+"\nGracias por utilizar nuestros servicios! Estamos a tu disposición para una próxima vez.");
				}
				if(vista.getPanelGrande().getPestanas().getSelectedTab() == "Baloto") 
				{
					modelo.getA().imprimirFactura("Tienda: "+modelo.getA().getCasa()+" - "+modelo.getA().getSede()+"\n"
							+"Factura Numero: "+vista.getFactura().getDetalles().getTxFactura().getText()+"\n"
							+"Cliente: "+modelo.getA().getNombre().toString()+"\n"
							+"Cedula: "+modelo.getA().getCedula().toString()+"\n"
							+"---------------------------------------------------------------------------------\n"
							+"                                     FACTURA\n"
							+"---------------------------------------------------------------------------------\n"
							+ vista.getFactura().getFactura().getId().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor().getText().toString()+"\n"
							+ vista.getFactura().getFactura().getId1().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem1().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor1().getText().toString()+"\n"
							+ vista.getFactura().getFactura().getId2().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem2().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor2().getText().toString()+"\n"
							+ "Gran Total: "+vista.getFactura().getOperaciones().getValortotal().getText().toString()+"\n"
							+"---------------------------------------------------------------------------------\n"
							+"                                     JUEGO\n"
							+"---------------------------------------------------------------------------------\n"
							+"Tipo de juego: "+vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getSelectedGame()+"\n"
							+"Balotas: "+vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().getText().toString()+"\n"
							+"\nMucha suerte!\n"
							+"\nGracias por utilizar nuestros servicios! Estamos a tu disposición para una próxima vez.");
				}
				if(vista.getPanelGrande().getPestanas().getSelectedTab() == "OhPolla") 
				{
					modelo.getA().imprimirFactura("Tienda: "+modelo.getA().getCasa()+" - "+modelo.getA().getSede()+"\n"
							+"Factura Numero: "+vista.getFactura().getDetalles().getTxFactura().getText()+"\n"
							+"Cliente: "+modelo.getA().getNombre().toString()+"\n"
							+"Cedula: "+modelo.getA().getCedula().toString()+"\n"
							+"---------------------------------------------------------------------------------\n"
							+"                                     FACTURA\n"
							+"---------------------------------------------------------------------------------\n"
							+ vista.getFactura().getFactura().getId().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor().getText().toString()+"\n"
							+ vista.getFactura().getFactura().getId1().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem1().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor1().getText().toString()+"\n"
							+ vista.getFactura().getFactura().getId2().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem2().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor2().getText().toString()+"\n"
							+ "Gran Total: "+vista.getFactura().getOperaciones().getValortotal().getText().toString()+"\n"
							+"---------------------------------------------------------------------------------\n"
							+"                                     JUEGO\n"
							+"---------------------------------------------------------------------------------\n"
							+vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoA().getSelectedItem().toString()+" "
							+vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxMarcadorA().getText().toString()+" vs "
							+vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoB().getSelectedItem().toString()+" "
							+vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxMarcadorB().getText().toString()+"\n"
							+"\nMucha suerte!\n"
							+"\nGracias por utilizar nuestros servicios! Estamos a tu disposición para una próxima vez.");
				}
				vista.getFactura().setVisible(false);
				vista.getStatusBar().getStatus().setText("Ready...");
				vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoA().setSelectedIndex(0);
				vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getListEquipoB().setSelectedIndex(0);

				vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxMarcadorA().setText("");
				vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxMarcadorB().setText("");

				modelo.getF().hacerFactura();
				vista.getPanelGrande().getPestanas().getOhPolla().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
				
				vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getListAstro().setSelectedIndex(0);

				vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxNumber1().setText("");

				modelo.getF().hacerFactura();
				vista.getPanelGrande().getPestanas().getSuperAstro().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
				
				vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getManual().setSelected(true);
				vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getAutomatico().setSelected(false);
				vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(true);
				vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getRevancha().setSelected(false);
				vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setText("");
				vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxFactura().setText("10233432"+String.valueOf(modelo.getF().getFactura()));
		}
			
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().EXTRACTOS))
		{
			vista.getReporteExtractos().setVisible(true);
		}
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().REPORTE))
		{
			vista.getImagenReporte().setVisible(true);
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
			vista.getImagenReporte().setVisible(false);
		}
		
		/*
		if (vista.getFactura().getOperaciones().getEnviaracorreo().isSelected())
		{
			try 
			{
				Desktop desktop = Desktop.getDesktop();
				String message = "mailto:ventas@ohdelivery.co?subject=Tu factura de Oh! Delivery";
				URI uri = URI.create(message);
				desktop.mail(uri);
				vista.getStatusBar().getStatus().setText("Sending Email...");
			} 
			catch (IOException e) 
			{
				// TODO Bloque catch generado automï¿½ticamente
				e.printStackTrace();
			}
		}
		if (vista.getFactura().getOperaciones().getImprimirFactura().isSelected() && vista.getFactura().getOperaciones().getEnviaracorreo().isSelected())
		{
			modelo.getA().imprimirFactura("Tienda: "+modelo.getA().getCasa()+"\n"
					+"Factura Numero: "+vista.getFactura().getDetalles().getTxFactura().getText()+"\n"
					+"Cliente: "+modelo.getA().getNombre()+"\n"
					+"Cedula: "+modelo.getA().getCedula()+"\n"
					+"---------------------------------------------------------------------------------\n"
					+"                                     FACTURA\n"
					+"---------------------------------------------------------------------------------\n"
					+ vista.getFactura().getFactura().getId().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor().getText().toString()+"\n"
					+ vista.getFactura().getFactura().getId1().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem1().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor1().getText().toString()+"\n"
					+ vista.getFactura().getFactura().getId2().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getItem2().getText().toString()+"	  \t	  "+vista.getFactura().getFactura().getValor2().getText().toString()+"\n"
					+ "Gran Total: "+vista.getFactura().getOperaciones().getValortotal().getText().toString()+"\n"
					+"---------------------------------------------------------------------------------\n"
					+"                                     JUEGO\n"
					+"---------------------------------------------------------------------------------\n"
					+"\nGracias por utilizar nuestros servicios! Estamos a tu disposición para una próxima vez.");
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
				// TODO Bloque catch generado automï¿½ticamente
				e.printStackTrace();
			}*/
	}
}
