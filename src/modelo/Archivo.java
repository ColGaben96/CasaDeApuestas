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
		   
	  public void leerArchivo() {
			
	        try (FileInputStream input = new FileInputStream("sedes.dat")) {

	    		DataInputStream idstream = new DataInputStream(input); 

	            ubicacion=idstream.readUTF();
	            numemp=idstream.readUTF();
	            
	    		idstream.close();
	    		input.close(); 

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

			}
			public void escribirArchivo(String pUbicacion, String pNumEmp) {
			 	 try (FileOutputStream output = new FileOutputStream("sedes.dat")) {
			     		DataOutputStream dstream = new DataOutputStream(output); 

			     		dstream.writeUTF(pUbicacion); 
			    		dstream.writeUTF(pNumEmp);
			    		
			     		dstream.close();
			     		output.close(); 

			         } catch (IOException io) {
			             io.printStackTrace();
			         }  
			}
			public String getUbicacion() {
				return ubicacion;
			}
			public String getNumEmp() {
				return numemp;
			}
	
}
