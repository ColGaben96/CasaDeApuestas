package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Propiedades {

	public String casa;
	public String sedes;
	public String presupuesto;
	
	public void leerPropiedades() {
	
	 try (InputStream input = new FileInputStream("config.properties")) {

         Properties prop = new Properties();

         // load a properties file
         prop.load(input);

         // get the property value and print it out
         casa=prop.getProperty("casa");
         sedes=prop.getProperty("sedes");
         presupuesto=prop.getProperty("presupuesto");
         JOptionPane.showMessageDialog(null, "EXITOSO", "T�tulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
     } catch (IOException ex) {
         ex.printStackTrace();
         JOptionPane.showMessageDialog(null, "ERROR: NO EXISTE EL ARCHIVO", "T�tulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
     }

	}
	public void escribirPropiedades(String pCasa, String pSedes, String pPresupuesto) {
	 try (OutputStream output = new FileOutputStream("config.properties")) {

         Properties prop = new Properties();

         // set the properties value
         prop.setProperty("casa", pCasa);
         prop.setProperty("sedes", pSedes);
         prop.setProperty("presupuesto", pPresupuesto);

         // save properties to project root folder
         prop.store(output, null);
         
         JOptionPane.showMessageDialog(null, "EXITOSO", "T�tulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);

     } catch (IOException io) {
         io.printStackTrace();
         JOptionPane.showMessageDialog(null, "ERROR", "T�tulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
     }  
	}
	
	public String getCasa() {
		return casa;
	}
	public String getSedes() {
		return sedes;
	}
	public String getPresupuesto() {
		return presupuesto;
	}
}
