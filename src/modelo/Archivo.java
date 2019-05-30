package modelo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

private String line;

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

		line = new String();
		pjob = new PrinterJob() {

			
			@Override
			public PageFormat validatePage(PageFormat page) {
				// TODO Apéndice de método generado automáticamente

				return pf;


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

				return pf;

			}
			
			@Override
			public boolean isCancelled() {
				// TODO Apéndice de método generado automáticamente
				return false;
			}
			
			@Override
			public String getUserName() {
				// TODO Apéndice de método generado automáticamente

				return ubicacion;

		

			}
			
			@Override
			public String getJobName() {
				// TODO Apéndice de método generado automáticamente

				return nombre;

		

			}
			
			@Override
			public int getCopies() {
				// TODO Apéndice de método generado automáticamente
				return 0;
			}
			
			@Override
			public PageFormat defaultPage(PageFormat page) {
				// TODO Apéndice de método generado automáticamente

				return pf;

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
					
				
					
					
					public String imprimirFactura(String pInsertWhatTheFuck)
					{
						
						setLine(pInsertWhatTheFuck+"\n");
						PrinterJob job = PrinterJob.getPrinterJob();
				         job.setPrintable(this);
				         boolean ok = job.printDialog();
				         if (ok) {
				             try {
				                  job.print();
				             } catch (PrinterException ex) {
				              /* The job did not successfully complete */
				             }
				         }
						return line;
					}

					@Override
					public int print(Graphics g, PageFormat pf, int page) throws
                    PrinterException 
					{

						if (page > 0) { /* We have only one page, and 'page' is zero-based */
						return NO_SUCH_PAGE;
						}
						
						/* User (0,0) is typically outside the imageable area, so we must
						* translate by the X and Y values in the PageFormat to avoid clipping
						*/
						Graphics2D g2d = (Graphics2D)g;
						g2d.translate(pf.getImageableX(), pf.getImageableY());
						
						/* Now we perform our rendering */
						g.drawString(imprimirFactura(line), 100, 100);
						
						/* tell the caller that this page is part of the printed document */
						return PAGE_EXISTS;
					}

					public String getUbicacion() {
						return ubicacion;
					}

					public void setUbicacion(String ubicacion) {
						this.ubicacion = ubicacion;
					}

					public String getNumemp() {
						return numemp;

					}

					public void setNumemp(String numemp) {
						this.numemp = numemp;
					}

					public String getDireccion() {
						return direccion;
					}

					public void setDireccion(String direccion) {
						this.direccion = direccion;
					}

					public String getNombre() {
						return nombre;
					}

					public void setNombre(String nombre) {
						this.nombre = nombre;
					}

					public String getSede() {
						return sede;
					}

					public void setSede(String sede) {
						this.sede = sede;
					}

					public String getCelular() {
						return celular;
					}

					public void setCelular(String celular) {
						this.celular = celular;
					}

					public String getCedula() {
						return cedula;
					}

					public void setCedula(String cedula) {
						this.cedula = cedula;
					}

					public String getPresupuesto() {
						return presupuesto;
					}

					public void setPresupuesto(String presupuesto) {
						this.presupuesto = presupuesto;
					}

					public PrinterJob getPjob() {
						return pjob;
					}

					public void setPjob(PrinterJob pjob) {
						this.pjob = pjob;
					}

					public PageFormat getPf() {
						return pf;
					}

					public void setPf(PageFormat pf) {
						this.pf = pf;
					}

					public void setLine(String line) {
						this.line = line;
					}
					
					



			
	
}
