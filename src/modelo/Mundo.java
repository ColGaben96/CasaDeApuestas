package modelo;

public class Mundo 
{
	private ApuestaBaloto ab;
	private ApuestaSuperAstro asa;
	private ApuestaOhPolla aohp;
	private Propiedades p;
	private Archivo a;
	
	public Mundo()
	{
		ab = new ApuestaBaloto();
		asa = new ApuestaSuperAstro();
		aohp = new ApuestaOhPolla();
		p = new Propiedades();
		a = new Archivo();
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
}
