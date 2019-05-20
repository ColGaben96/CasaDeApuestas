package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Mundo;
import vista.InterfazGUI;
import vista.VentanaDetalles;
/**
 * 
 * @author Oh! Enterprises.
 * Controlador: Dereminar los eventos del usuario a la hora de correr del programa.
 *
 */
public class Controlador implements ActionListener
{
	/**
	 * Importacion de mundo.
	 */
	private Mundo modelo;
	/**
	 * Importacion de vista.
	 */
	private InterfazGUI vista;
	/**
	 * Importacion de detalles.
	 */
	private VentanaDetalles detalles;
	public Controlador()
	{
		/**
		 * @param Controlador: Constructor del controlador.
		 * modelo = new Mundo(): Crea nuevo mundo en la ejecucion.
		 * vista = new InterfazGUI(this): Crea nueva interfaz en la ejecucion.
		 * detalles = new VentanaDetalles(this): Crea nueva ventana de detalles en la ejecucion.
		 * vista.getPanelGrande().getOperaciones().getDetallesPunto().addActionListener(this): Al cargar vista, se cargan las demas clases.
		 * detalles.getParametros().getGuardar().addActionListener(this): Carga parameetros, guardar y el oyente ya puede interactuar.
		 * detalles.getParametros().getCargar().addActionListener(this): Carga parametros, cargar y el oyente puede interactuar.
		 * detalles.getSedes().getGuardar().addActionListener(this): Carga sedes, guardar y el oyente puede interactuar.
		 * detalles.getSedes().getCargar().addActionListener(this): Carga sedes, cargar y el oyente puede interactuar.
		 */
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
	public void actionPerformed(ActionEvent evento) 
	{
		/**
		 * @param actionPerformed: Accion implenentada con cada clase en el programa.
		 */
		if(evento.getActionCommand().equals(detalles.getParametros().CARGAR)) {
			/**
			 * modelo.getP().leerPropiedades(): Lee el archivo .properties.
			 * detalles.getParametros().getCasa().setText(modelo.getP().getCasa()): Obtiene en casa.
			 * detalles.getParametros().getSedes().setText(modelo.getP().getSedes()): Obtiene en sedes.
			 * detalles.getParametros().getPresupuesto().setText(modelo.getP().getPresupuesto()): Obtiene en presupuesto.
			 */
			modelo.getP().leerPropiedades();
			detalles.getParametros().getCasa().setText(modelo.getP().getCasa());
			detalles.getParametros().getSedes().setText(modelo.getP().getSedes());
			detalles.getParametros().getPresupuesto().setText(modelo.getP().getPresupuesto());
		}
		
		if(evento.getActionCommand().equals(detalles.getParametros().GUARDAR)) {
			/**
			 * modelo.getP().escribirPropiedades(detalles.getParametros().getCasa().getText(), 
		     * detalles.getParametros().getSedes().getText(), 
		     * detalles.getParametros().getPresupuesto().getText()): Escribe el archivo en los diversos campos del programa.
			 */
			modelo.getP().escribirPropiedades(detalles.getParametros().getCasa().getText(), 
		    detalles.getParametros().getSedes().getText(), 
		    detalles.getParametros().getPresupuesto().getText());
		}
		/**
		 * Detalles es visible.
		 */
		if(evento.getActionCommand().equals(vista.getPanelGrande().getOperaciones().DETALLES)) {
			detalles.setVisible(true);
		}
		
		if(evento.getActionCommand().equals(detalles.getSedes().CARGAR)) {
			/**
			 * modelo.getA().leerArchivoSedes(): Leer archivo de sedes.
			 * detalles.getSedes().getUbicacion().setText(modelo.getA().getUbicacion()): Obtener ubicacion.
			 * detalles.getSedes().getNumEmp().setText(modelo.getA().getNumEmp()): Obtener numero de empleados.
			 */
			modelo.getA().leerArchivoSedes();
			detalles.getSedes().getUbicacion().setText(modelo.getA().getUbicacion());
			detalles.getSedes().getNumEmp().setText(modelo.getA().getNumEmp());
		}
		if(evento.getActionCommand().equals(detalles.getSedes().GUARDAR)) {
			/**
			 * Escribe el archivo de sedes y empleados.
			 */
			modelo.getA().escribirArchivoSedes(detalles.getSedes().getUbicacion().getText(), 
					detalles.getSedes().getNumEmp().getText());
		}
		if(evento.getActionCommand().equals(detalles.getParametros().CARGAR)) {
			/**
			 * modelo.getA().leerArchivoApostador(): Leer archivo de apostador.
			 * detalles.getApostador().getNombre().setText(modelo.getA().getNombre()): Obtener nombre.
			 * detalles.getApostador().getCedula().setText(modelo.getA().getCedula()): Obtener cedula.
			 * detalles.getApostador().getSede().setText(modelo.getA().getSede()): Obtener sede.
			 * detalles.getApostador().getDireccion().setText(modelo.getA().getDireccion()): Obtener direccion.
			 * detalles.getApostador().getCelular().setText(modelo.getA().getCelular()): Obtener celular.
			 */
			modelo.getA().leerArchivoApostador();
			detalles.getApostador().getNombre().setText(modelo.getA().getNombre());
			detalles.getApostador().getCedula().setText(modelo.getA().getCedula());
			detalles.getApostador().getSede().setText(modelo.getA().getSede());
			detalles.getApostador().getDireccion().setText(modelo.getA().getDireccion());
			detalles.getApostador().getCelular().setText(modelo.getA().getCelular());
		}
		
		if(evento.getActionCommand().equals(detalles.getParametros().GUARDAR)) {
			/**
			 * modelo.getA().escribirArchivoApostador(detalles.getApostador().getNombre().getText(), 
		     * detalles.getApostador().getCedula().getText(), 
		     * detalles.getApostador().getSede().getText(),
		     * detalles.getApostador().getDireccion().getText(), 
		     * detalles.getApostador().getCelular().getText()): Escribir archivo.
			 */
			modelo.getA().escribirArchivoApostador(detalles.getApostador().getNombre().getText(), 
		    detalles.getApostador().getCedula().getText(), 
		    detalles.getApostador().getSede().getText(),
		    detalles.getApostador().getDireccion().getText(), 
		    detalles.getApostador().getCelular().getText());
		}
		
		if(evento.getActionCommand().equals(vista.getTooltip().CERRAR))
		{
			/**
			 * Cerrar el programa (mata el proceso).
			 */
			System.exit(0);
		}
		
		if(evento.getActionCommand().equals(vista.getTooltip().ACERCADE))
		{
			/**
			 * El programa es visible.
			 */
			vista.getAboutus().setVisible(true);
		}
		
		if(evento.getActionCommand() == vista.getPanelGrande().getPestanas().getBaloto().getFormulario().RADIOAUTOMATICO)
		{
			/**
			 * vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getManual().setSelected(false): Si se selecciona automatico, manual no se selecciona.
			 * vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(false): No es seleccionado cuando se selecicona otra opcion.
			 * vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setText(""): Campo de texto en vacio.
			 */
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getManual().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setText("");
		}
		if(evento.getActionCommand() == vista.getPanelGrande().getPestanas().getBaloto().getFormulario().RADIOMANUAL)
		{
			/**
			 * vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getAutomatico().setSelected(false): No se selecciona cuando otra opcion es seleccionada.
			 * vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(true): Las balotas se pueden editar manualmente.
			 */
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getAutomatico().setSelected(false);
			vista.getPanelGrande().getPestanas().getBaloto().getFormulario().getTxBalotas().setEditable(true);
		}
		if(evento.getActionCommand() == vista.getPanelGrande().getPestanas().getBaloto().getFormulario().GENERAR)
		{
			
		}
		
	}


}
