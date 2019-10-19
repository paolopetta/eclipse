
public class LibroCatalogato extends Libro implements Cloneable{
	
	private String soggetto;
	private Collocazione collocazione;
	
	//costruttore
	public LibroCatalogato(Autore autore,String titolo, double prezzo, String soggetto, Collocazione coll) {
		super(autore, titolo, prezzo);
		this.soggetto= soggetto;
		collocazione= coll;
	}
	
	//accesso
	public String getSogg() {
		return soggetto;
	}
	
	public Collocazione getColloc() {
		return collocazione;
	}
		
	//modificatori
	
	public String toString() {
		return super.toString()+"[soggetto="+ soggetto +", collocazione=" + collocazione+"]";
	}
	
	
		
}
