package modelo;

public class ApuestaBaloto extends Apuestas
{
	int a = 0, b = 0, c = 0 , d = 0 , e=0 , f=0; 
	String num=" ";
	
	public String BalotoAutomatico(){
		
		int a = 0, b = 0, c = 0 , d = 0 , e=0 , f=0; 
	
		while(a<40) {
			
			a = (int)(Math.rint(46)*Math.random());
			
		}
		while(b<30) {
			
			b = (int)(Math.rint(40)*Math.random());
			
		}
		while(c<20) {
			
			c = (int)(Math.rint(30)*Math.random());
		}
		
		while(d<10) {
			
			d = (int)(Math.rint(20)*Math.random());
		}
		
		while(e<1) {
			
			e = (int)(Math.rint(10)*Math.random());
		}
		
			
			f = (int)(Math.rint(46)*Math.random());

		num= (Integer.toString(a) +"-"+  Integer.toString(b) +"-"+ Integer.toString(c) +"-"+ Integer.toString(d) +"-"+ Integer.toString(e) +"-"+Integer.toString(f));
	
		return num;
	}
	
	public int BalotoManual() {
			
			int num;
			num = a+b+c+d+e+f;
			return (num);
	}
	
	public String getNumeroFact() {
		return num;
	}
		
		
}

