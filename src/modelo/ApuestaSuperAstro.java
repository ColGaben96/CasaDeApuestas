package modelo;

public class ApuestaSuperAstro {
	
	
	String num=" ";
	public String SuperAstro() {
		
	int a, b , c , d  ;
	
	a = (int)Math.random();
	b = (int)Math.random();
	c = (int)Math.random();
	d = (int)Math.random();
	
	num= (Integer.toString(a) +"-"+  Integer.toString(b) +"-"+ Integer.toString(c) +"-"+ Integer.toString(d));
	
	return num;
			
	}
	public String getNumeroFactA() {
		return num;
	}
		
	
}
