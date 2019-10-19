
public class Libro {

	private String titolo;
	private double prezzo;
	private Autore autore;
	
	public Libro() {
		autore= new Autore();
		titolo= "";
		prezzo= 0;
	}
	
	public Libro(Autore autore, String titolo, double prezzo) {
		this.autore= autore;
		this.titolo= titolo;
		this.prezzo= prezzo;
	}
	
	public Autore getAutore() {
		return autore;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public String toString() {
		return getClass().getName()+"[autore="+ autore + ", titolo="+titolo+ ", prezzo="+prezzo+"]";
	}
	
}
