package modelo;

public class Apuestas implements CasasDeApuestas
{
	private String nombrePunto, direccion;
	private double presupuestoPunto;

	@Override
	public String nombrePunto() {
		// TODO Apéndice de método generado automáticamente
		return nombrePunto;
	}

	@Override
	public String direccion() {
		// TODO Apéndice de método generado automáticamente
		return direccion;
	}

	@Override
	public double presupuestoPunto() {
		// TODO Apéndice de método generado automáticamente
		return presupuestoPunto;
	}

	public int cantidad=0;
	
	public void sumarCantidad() {
		cantidad=cantidad +1;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
}
