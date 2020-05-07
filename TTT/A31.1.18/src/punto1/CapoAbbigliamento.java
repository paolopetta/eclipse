package punto1;

public abstract class CapoAbbigliamento implements Cloneable{

	private String marca, colore;
	private int codice;
	private double prezzo;
	
	
	public CapoAbbigliamento(String marca, String colore, int codice, double prezzo) {
		this.marca= marca;
		this.codice= codice;
		this.colore= colore;
		this.prezzo= prezzo;
	}
	
	public String getMarca() {return marca; }
	
	public String getColore() { return colore;}
	
	public int getCodice() { return codice;}
	
	public double getPrezzo() { return prezzo;}
	
	public String toString() {
		return getClass().getName()+"[marca" + marca+", colore="+ colore+", codice="+codice+ "prezzo="+ prezzo;
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass()== otherObject.getClass()) {
			CapoAbbigliamento other= (CapoAbbigliamento) otherObject;
			return marca.equals(other.marca) && colore.equals(other.colore) && codice == other.codice && prezzo == other.prezzo;
		}
		return false;
	}
	
	public CapoAbbigliamento clone() {
		try {
			return (CapoAbbigliamento) super.clone();
		}catch(CloneNotSupportedException e) {
			return null;
		}
		
	}
	

}
	

