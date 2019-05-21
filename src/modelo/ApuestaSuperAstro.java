package modelo;

public class ApuestaSuperAstro {
	
	public String Astro() {
		
		int a = 0 , b = 0 , c = 0 , d = 0 ;
		
		a =(int)((int)Math.rint(10)*Math.random());
		
		b =(int)((int)Math.rint(10)*Math.random());
		
		c =(int)((int)Math.rint(10)*Math.random());
		
		d =(int)((int)Math.rint(10)*Math.random());
		
		
		String resultado =""+ a + b + c + d ;
		
		return resultado;
	}

}
