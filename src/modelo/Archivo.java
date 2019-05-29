package modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.print.*;

public class Archivo implements Printable
{

private String ubicacion;
private String numemp;
private String direccion;
private String nombre;
private String sede;
private String celular;
private String cedula;
private String presupuesto;
private PrinterJob pjob;
private PageFormat pf;


	public Archivo()
	{
		ubicacion = new String();
		numemp = new String();
		direccion = new String();
		nombre = new String();
		sede = new String();
		celular = new String();
		cedula = new String();
		presupuesto = new String();
		pf = new PageFormat();
		pjob = new PrinterJob() 
		{
			
			@Override
			public PageFormat validatePage(PageFormat page) {
				// TODO Apéndice de método generado automáticamente
				return null;
			}
			
			@Override
			public void setPrintable(Printable painter, PageFormat format) {
				// TODO Apéndice de método generado automáticamente
				
			}
			
			@Override
			public void setPrintable(Printable painter) {
				// TODO Apéndice de método generado automáticamente
				
			}
			
			@Override
			public void setPageable(Pageable document) throws NullPointerException {
				// TODO Apéndice de método generado automáticamente
				
			}
			
			@Override
			public void setJobName(String jobName) {
				// TODO Apéndice de método generado automáticamente
				
			}
			
			@Override
			public void setCopies(int copies) {
				// TODO Apéndice de método generado automáticamente
				
			}
			
			@Override
			public boolean printDialog() throws HeadlessException {
				// TODO Apéndice de método generado automáticamente
				return false;
			}
			
			@Override
			public void print() throws PrinterException {
				// TODO Apéndice de método generado automáticamente
				
			}
			
			@Override
			public PageFormat pageDialog(PageFormat page) throws HeadlessException {
				// TODO Apéndice de método generado automáticamente
				return null;
			}
			
			@Override
			public boolean isCancelled() {
				// TODO Apéndice de método generado automáticamente
				return false;
			}
			
			@Override
			public String getUserName() {
				// TODO Apéndice de método generado automáticamente
				return null;
			}
			
			@Override
			public String getJobName() {
				// TODO Apéndice de método generado automáticamente
				return null;
			}
			
			@Override
			public int getCopies() {
				// TODO Apéndice de método generado automáticamente
				return 0;
			}
			
			@Override
			public PageFormat defaultPage(PageFormat page) {
				// TODO Apéndice de método generado automáticamente
				return null;
			}
			
			@Override
			public void cancel() {
				// TODO Apéndice de método generado automáticamente
				
			}
		};
	}
		   
	  public void leerArchivoSedes() {
			
	        try (FileInputStream input = new FileInputStream("sedes.dat")) {

	    		DataInputStream idstream = new DataInputStream(input); 

	            ubicacion=idstream.readUTF();
	            numemp=idstream.readUTF();
	            
	    		idstream.close();
	    		input.close(); 
	      
	        } catch (IOException ex) {
	            ex.printStackTrace();
	            JOptionPane.showMessageDialog(null, "ERROR: NO EXISTE EL ARCHIVO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	        }

			}
			public void escribirArchivoSedes(String pUbicacion, String pNumEmp) {
			 	 try (FileOutputStream output = new FileOutputStream("sedes.dat")) {
			     		DataOutputStream dstream = new DataOutputStream(output); 

			     		dstream.writeUTF(pUbicacion); 
			    		dstream.writeUTF(pNumEmp);
			    		
			     		dstream.close();
			     		output.close(); 
			     	      JOptionPane.showMessageDialog(null, "EXITOSO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
			         } catch (IOException io) {
			             io.printStackTrace();
			             JOptionPane.showMessageDialog(null, "ERROR: NO EXISTE EL ARCHIVO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
			         }  
			}
			
			public void escribirArchivoJuegos() {
			 	 try (FileOutputStream output = new FileOutputStream("juegos.dat")) {
			     		DataOutputStream dstream = new DataOutputStream(output); 

			     		dstream.writeUTF("Nombre: SuperAstro"); 
			    		dstream.writeUTF("Tipo: Loteria");
			    		dstream.writeUTF("0");
			    		dstream.writeUTF("Nombre: Baloto"); 
			    		dstream.writeUTF("Tipo: Loteria");
			    		dstream.writeUTF("0");
			    		dstream.writeUTF("Nombre: OhPolla"); 
			    		dstream.writeUTF("Tipo: Deportes");
			    		dstream.writeUTF("0");
			    		
			     		dstream.close();
			     		output.close(); 
			     	      JOptionPane.showMessageDialog(null, "EXITOSO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
			         } catch (IOException io) {
			             io.printStackTrace();
			             JOptionPane.showMessageDialog(null, "ERROR: NO EXISTE EL ARCHIVO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
			         }  
			}
			  public void leerArchivoJuegos() {
					
			        try (FileInputStream input = new FileInputStream("juegos.dat")) {

			    		DataInputStream idstream = new DataInputStream(input); 

			            int suma=0;
			            idstream.readUTF();
			            idstream.readUTF();
			    		suma=suma+Integer.parseInt(idstream.readUTF());
			    		idstream.readUTF();
			    		idstream.readUTF();
			            suma=suma+Integer.parseInt(idstream.readUTF());		 
			            idstream.readUTF();
			            idstream.readUTF();
			            suma=suma+Integer.parseInt(idstream.readUTF());         
			            presupuesto=Integer.toString(suma);
			            suma=0;
			    		idstream.close();
			    		input.close(); 

			        } catch (IOException ex) {
			            ex.printStackTrace();
			            JOptionPane.showMessageDialog(null, "ERROR: NO EXISTE EL ARCHIVO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
			        }

					}
			
			 public void leerArchivoApostador() {
					
			        try (FileInputStream input = new FileInputStream("apostadores.dat")) {

			    		DataInputStream idstream = new DataInputStream(input); 

			            nombre=idstream.readUTF();
			            cedula=idstream.readUTF();
			            sede=idstream.readUTF();
			            direccion=idstream.readUTF();
			            celular=idstream.readUTF();
			    
			            
			    		idstream.close();
			    		input.close(); 
			          
			        } catch (IOException ex) {
			            ex.printStackTrace();
			            JOptionPane.showMessageDialog(null, "ERROR: NO EXISTE EL ARCHIVO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
			        }

					}
					public void escribirArchivoApostador(String pNombre, String pCedula, String pSede, String pDireccion, String pCelular) {
					 	if(pNombre.equals("")|| pCedula.equals("") || pSede.equals("SELECCIONAR:") || pDireccion.equals("") || pCelular.equals("")){
					 		 JOptionPane.showMessageDialog(null, "ERROR: UNO O VARIOS DE LOS CAMPOS ESTAN VACIOS", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
					 	}
					 	else {
						try (FileOutputStream output = new FileOutputStream("apostadores.dat")) {
					     		DataOutputStream dstream = new DataOutputStream(output); 

					     		dstream.writeUTF(pNombre); 
					    		dstream.writeUTF(pCedula);
					    		dstream.writeUTF(pSede); 
					    		dstream.writeUTF(pDireccion);
					    		dstream.writeUTF(pCelular); 
					    		
					    		
					     		dstream.close();
					     		output.close(); 
					            JOptionPane.showMessageDialog(null, "EXITOSO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
					         } catch (IOException io) {
					             io.printStackTrace();
					             JOptionPane.showMessageDialog(null, "ERROR: NO EXISTE EL ARCHIVO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
					         } 
					 	}
					}
					public void escribirSuperAstro(String pNombre, String pCedula, String pDatos) {
					 	 try (FileOutputStream output = new FileOutputStream("apuestas-superastro-"+pNombre+".dat")) {
					     		DataOutputStream dstream = new DataOutputStream(output); 

					     		dstream.writeUTF(pNombre); 
					    		dstream.writeUTF(pCedula);
					     		dstream.writeUTF("Lunes"); 
					    		dstream.writeUTF("1300");
					    		dstream.writeUTF(pDatos);
					    		
					     		dstream.close();
					     		output.close(); 
					          
					         } catch (IOException io) {
					             io.printStackTrace();
					         
					         }  
					}
					public void escribirBaloto(String pNombre, String pCedula, String pDatos) {
					 	 try (FileOutputStream output = new FileOutputStream("apuestas-baloto-"+pNombre+".dat")) {
					     		DataOutputStream dstream = new DataOutputStream(output); 

					     		dstream.writeUTF(pNombre); 
					    		dstream.writeUTF(pCedula);
					     		dstream.writeUTF("Lunes"); 
					    		dstream.writeUTF("1300");
					    		dstream.writeUTF(pDatos);
					    		
					     		dstream.close();
					     		output.close(); 
					          
					         } catch (IOException io) {
					             io.printStackTrace();
					            
					         }  
					}
					public void escribirOhPolla(String pNombre, String pCedula, String pDatos) {
					 	 try (FileOutputStream output = new FileOutputStream("apuestas-marcadores-"+pNombre+".dat")) {
					     		DataOutputStream dstream = new DataOutputStream(output); 

					     		dstream.writeUTF(pNombre); 
					    		dstream.writeUTF(pCedula);
					     		dstream.writeUTF("Lunes"); 
					    		dstream.writeUTF("1300");
					    		dstream.writeUTF(pDatos);
					    		
					     		dstream.close();
					     		output.close(); 
					          
					         } catch (IOException io) {
					             io.printStackTrace();
					            
					         }  
					}
					
					public void imprimirFactura(String pInsertWhatToPrint)
					{
						pjob = PrinterJob.getPrinterJob();
						pf = pjob.defaultPage();
						pjob.setPrintable(null, pf);
						if(pjob.printDialog())
						{
							try 
							{
								pjob.print();
							} 
							catch (PrinterException e) 
							{
								// TODO Bloque catch generado automáticamente
								e.printStackTrace();
							}
						}
					}
					
					
					
			public String getUbicacion() {
						return ubicacion;
			}
			public String getNumEmp() {
						return numemp;
			}
			public String getNombre() {
				return nombre;
			}
			public String getCedula() {
				return cedula;
			}
			public String getSede() {
				return sede;
			}
			public String getDireccion() {
				return direccion;
			}
			public String getCelular() {
				return celular;
			}
			public String getPresupuesto() {
				return presupuesto;
			}

			@Override
			public int print(Graphics arg0, PageFormat arg1, int arg2) throws PrinterException {
				// TODO Apéndice de método generado automáticamente
				return 0;
			}
			
	
}
