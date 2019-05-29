package modelo;

import java.util.ArrayList;

public class Clientes {

	public ArrayList<String> clientes = new ArrayList<String>();
	public String info="";

	public void setClientes(String pCliente) {
		
		clientes.add(pCliente);
		
	}
	
	public String getClientes(){
  
		 for(String name:clientes) {
	         info+=name + "\n";
	        }
		System.out.println(info);
		 
		return info;
	}
	
}
