package modelo;

public class ApuestaBaloto extends Apuestas
{
	int a = 0, b = 0, c = 0 , d = 0 , e=0 , f=0; 
	
	public String BalotoAutomatico(){
		
		String num=" ";
		int a = 0, b = 0, c = 0 , d = 0 , e=0 , f=0; 
	
		while(a<40) {
			
			a = (int)(Math.rint(45)*Math.random());
			
		}
		while(b<35) {
			
			b = (int)(Math.rint(40)*Math.random());
			
		}
		while(c<30) {
			
			c = (int)(Math.rint(35)*Math.random());
		}
		
		while(d<25) {
			
			d = (int)(Math.rint(30)*Math.random());
		}
		
		while(e<20) {
			
			e = (int)(Math.rint(25)*Math.random());
			
		}
		
		while(f<15) {
			
			f = (int)(Math.rint(20)*Math.random());
			
		}
		

		
		num= (Integer.toString(a) +"-"+  Integer.toString(b) +"-"+ Integer.toString(c) +"-"+ Integer.toString(d) +"-"+ Integer.toString(e) +"-"+Integer.toString(f));
	
		return num;
		
		
	}
	
	public int BalotoManual() {
			
			int num;
			num = a+b+c+d+e+f;
			return (num);
	}
		
		
}

