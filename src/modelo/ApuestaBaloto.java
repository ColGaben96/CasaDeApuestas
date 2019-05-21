package modelo;


public class ApuestaBaloto extends Apuestas
{
	
	public String Automatico(){
		
		int a = 0, b = 0, c = 0 , d = 0 , e=0 , f=0; 
		String num=" ";
		
		a = (int)(Math.rint(44)*Math.random());
		b = (int)(Math.rint(44)*Math.random());
		c = (int)(Math.rint(44)*Math.random());
		d = (int)(Math.rint(44)*Math.random());
		e = (int)(Math.rint(44)*Math.random());
		f = (int)(Math.rint(44)*Math.random());
		
		num= ( Integer.toString(a) + Integer.toString(b) + Integer.toString(c) + Integer.toString(d) + Integer.toString(e) +Integer.toString(f));
		
	
		return num;
		
		
	}
	
	public void Manual() {
		
		int a = 0, b = 0, c = 0 , d = 0 , e=0 , f=0; 
		
	}

}