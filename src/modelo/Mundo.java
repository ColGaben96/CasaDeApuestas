package modelo;

public class Mundo 
{
	private ApuestaBaloto ab;
	private ApuestaSuperAstro asa;
	private ApuestaOhPolla aohp;
	private Propiedades p;
	private Archivo a;
	private Facturacion f;
	
	public Mundo()
	{
		ab = new ApuestaBaloto();
		asa = new ApuestaSuperAstro();
		aohp = new ApuestaOhPolla();
		p = new Propiedades();
		a = new Archivo();
		f = new Facturacion();
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
	
}
