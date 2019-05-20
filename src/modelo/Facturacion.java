package modelo;


public class Facturacion 
{
	private double factura;
	public Facturacion()
	{
		factura = Math.random();
		
	}
	public void hacerFactura()
	{
		factura = Math.random();
	}
	public double getFactura() {
		return factura;
	}
	
}
