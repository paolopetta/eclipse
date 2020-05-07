
public class Libro implements Cloneable {

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
	
	public void changePrezzo(double newPrezzo) {
		prezzo= newPrezzo;
	}
	
	public String toString() {
		return getClass().getName()+"[autore="+ autore + ", titolo="+titolo+ ", prezzo="+prezzo+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() != otherObject.getClass()) return false;
		Libro other = (Libro) otherObject;
		return autore.equals(other.autore) && titolo.equals(other.titolo) && prezzo== other.prezzo;
	}
	
	public Libro clone() {
		try {
			Libro cloned= (Libro) super.clone();
			cloned.autore= autore.clone();
			return cloned;
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
