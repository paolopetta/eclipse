package punto1;

public class Maglia extends CapoAbbigliamento {

	private Taglia taglia;
	
	public Maglia(String marca, String colore, int codice, double prezzo, Taglia taglia) {
		
		super ( marca, colore, codice, prezzo);
		this.taglia= taglia;
	}
	
	public Taglia getTaglia() {return taglia;	}
	
}
