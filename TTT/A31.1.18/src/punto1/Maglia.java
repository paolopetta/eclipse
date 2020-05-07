package punto1;

public class Maglia extends CapoAbbigliamento implements Cloneable{

	private Taglia taglia;
	
	public Maglia(String marca, String colore, int codice, double prezzo, Taglia taglia) {
		
		super ( marca, colore, codice, prezzo);
		this.taglia= taglia;
	}
	
	public Taglia getTaglia() {return taglia;}
	
	public String toString() {
		return super.toString()+"[taglia=" + taglia+"]";
	}
	
	public boolean equals(Object otherObject) {
		super.equals(otherObject);
		Maglia other= (Maglia) otherObject;
		return taglia.equals(other.taglia);
	}
	
	public Maglia clone() {
		Maglia cloned= (Maglia) super.clone();
		cloned.taglia= taglia.clone();
		return cloned;
	}
	
}
