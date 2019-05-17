package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Archivo {

public String ubicacion;
public String numemp;
public String direccion;
public String nombre;
public String sede;
public String celular;
public String cedula;
		   
	  public void leerArchivoSedes() {
			
	        try (FileInputStream input = new FileInputStream("sedes.dat")) {

	    		DataInputStream idstream = new DataInputStream(input); 

	            ubicacion=idstream.readUTF();
	            numemp=idstream.readUTF();
	            
	    		idstream.close();
	    		input.close(); 
	            JOptionPane.showMessageDialog(null, "EXITOSO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
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
			            JOptionPane.showMessageDialog(null, "EXITOSO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
			        } catch (IOException ex) {
			            ex.printStackTrace();
			            JOptionPane.showMessageDialog(null, "ERROR: NO EXISTE EL ARCHIVO", "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
			        }

					}
					public void escribirArchivoApostador(String pNombre, String pCedula, String pSede, String pDireccion, String pCelular) {
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
			
	
}
