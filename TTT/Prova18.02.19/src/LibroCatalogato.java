
public class LibroCatalogato extends Libro{
	
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
	
	//modificatore
	
	public void changeColloc(Collocazione newColl) {
		collocazione= newColl;
	}
			
	public String toString() {
		return super.toString()+"[soggetto="+ soggetto +", collocazione=" + collocazione+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject)) return false;
		
		LibroCatalogato other= (LibroCatalogato) otherObject;
		return soggetto.equals(other.soggetto) && collocazione.equals(other.collocazione);
	}
	
	public LibroCatalogato clone() {
			LibroCatalogato cloned= (LibroCatalogato) super.clone();
			cloned.collocazione = collocazione.clone();
			return cloned;
	}
	
		
}
