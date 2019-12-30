package punto1;

public class Libro {

	private Autore autore;
	private String titolo;
	private double prezzo;
	
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
	
	public String toString () {
		return getClass().getName()+"[autore="+ autore+", titolo="+ titolo+", prezzo"+prezzo+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() == otherObject.getClass()) {
			Libro other = (Libro) otherObject;
			return autore.equals(other.autore) && titolo.equals(other.titolo);
		}
		return false;
	}
	
	public Libro clone() {
		try {
			return (Libro) super.clone();
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
