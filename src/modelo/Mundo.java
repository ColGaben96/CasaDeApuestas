package modelo;

public class Mundo 
{
	private ApuestaBaloto ab;
	private ApuestaSuperAstro asa;
	private ApuestaOhPolla aohp;
	private Propiedades p;
	private Archivo a;
	private Facturacion f;
	private Apuestas ap;
	private Clientes cli;
	
	public Mundo()
	{
		ab = new ApuestaBaloto();
		asa = new ApuestaSuperAstro();
		aohp = new ApuestaOhPolla();
		p = new Propiedades();
		a = new Archivo();
		f = new Facturacion();
		ap= new Apuestas();
		cli = new Clientes();
	}

	public ApuestaBaloto getAb() 
	{
		return ab;
	}

	public ApuestaSuperAstro getAsa() 
	{
		return asa;
	}

	public ApuestaOhPolla getAohp() 
	{
		return aohp;
	}

	public Propiedades getP() 
	{
		return p;
	}

	public Archivo getA() 
	{
		return a;
	}

	public Facturacion getF() {
		return f;
	}
	
	
	public Apuestas getApuestas() {
		return ap;
	}
	
	public Clientes getClientes() {
		return cli;
	}
}
