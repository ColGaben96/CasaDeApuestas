package modelo;

import java.util.Random;

public class Facturacion 
{
	private int realfactura;
	public Facturacion()
	{

		double factura = Math.random();

		factura = Double.longBitsToDouble(0);


		
	}
	public void hacerFactura()
	{
		Random r = new Random();
		realfactura = r.nextInt(99999*10);
	}
	public int getFactura() {
		return realfactura;
	}
	
}
