package modelo;
/**
 * Mundo: Clase donde se fundamenta el programa.
 * @author Oh! Enterprises.
 *
 */
public class Mundo 
{
	/**
	 * Apuesta Baloto.
	 */
	private ApuestaBaloto ab;
	/**
	 * Apuesta Super Astro.
	 */
	private ApuestaSuperAstro asa;
	/**
	 * Apuesta Oh! Polla.
	 */
	private ApuestaOhPolla aohp;
	/**
	 * Archivos .properties.
	 */
	private Propiedades p;
	/**
	 * Clase dedicada a archivos.
	 */
	private Archivo a;
	private Facturacion f;
	private Apuestas ap;
	private Clientes cli;
	
	public Mundo()
	{
		/**
		 * @param Mundo: Constructor del mundo.
		 * ab = new ApuestaBaloto(): Apuesta Baloto.
		 * asa = new ApuestaSuperAstro(): Apuesta Super Astro.
		 * aohp = new ApuestaOhPolla(): Apuesta Oh! Polla.
		 * p = new Propiedades(): Archivos .properties.
		 * a = new Archivo(): Archivos del programa.
		 */
		ab = new ApuestaBaloto();
		asa = new ApuestaSuperAstro();
		aohp = new ApuestaOhPolla();
		p = new Propiedades();
		a = new Archivo();
		f = new Facturacion();
		ap= new Apuestas();
		cli = new Clientes();
	}
	/**
	 * Obtener apuesta baloto.
	 * @return ab.
	 */
	public ApuestaBaloto getAb() 
	{
		return ab;
	}
	/**
	 * Obtener apuesta super astro.
	 * @return asa.
	 */
	public ApuestaSuperAstro getAsa() 
	{
		return asa;
	}
	/**
	 * Obtener apuesta Oh! Polla.
	 * @return aohp.
	 */
	public ApuestaOhPolla getAohp() 
	{
		return aohp;
	}
	/**
	 * Obtener archivos propiedades.
	 * @return p.
	 */
	public Propiedades getP() 
	{
		return p;
	}
	/**
	 * Obtener archivos.
	 * @return a.
	 */
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
