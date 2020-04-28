
public class Maglia extends CapoAbbigliamento{
	
	private Taglia taglia;
	
	public Maglia(Marca marca, String codice, String colore, double prezzo, Taglia taglia) {
		super(marca,codice,colore,prezzo);
		this.taglia= taglia;
	}
	
	//accesso
	public Taglia getTaglia() {
		return taglia;
	}
	
	public String toString() {
		return super.toString()+"[taglia="+taglia+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject)) return false;
		Maglia other= (Maglia) otherObject;
		return taglia.equals(other.taglia);
	}
	
	public Maglia clone() {
		Maglia cloned= (Maglia) super.clone();
		cloned.taglia= taglia;
		return cloned;
	}

}
