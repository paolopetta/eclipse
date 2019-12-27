package punto1;

public class LibroCatalogato extends Libro{

	Collocazione colloc;
	String soggetto;
	
	public LibroCatalogato(Autore autore, String titolo, String dataNasc, double prezzo, Collocazione colloc, String soggetto) {
		super(autore, titolo, dataNasc, prezzo);
		this.colloc= colloc;
		this.soggetto= soggetto;
	}
	
	//accesso
	public Collocazione getColl() {
		return colloc;
	}
	
	public String getSogg() {
		return soggetto;
	}
	
	//modificatori
	public void modSogg(String newSogg) {
		soggetto= newSogg;
	}
	
	public String toString() {
		return super.toString()+"[collocazione="+colloc+", soggetto="+soggetto+"]";
	}
	
	public boolean equals(Object otherObject) {
		super.equals(otherObject);
		LibroCatalogato other= (LibroCatalogato) otherObject;
		return colloc.equals(other.colloc) && soggetto.equals(other.soggetto);
	}
	
	public LibroCatalogato clone() {
		LibroCatalogato cloned= (LibroCatalogato) super.clone();
		cloned.colloc = colloc.clone();
		return cloned;
	}
	
}
