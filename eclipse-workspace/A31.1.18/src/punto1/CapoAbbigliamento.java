package punto1;

public abstract class CapoAbbigliamento {

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

}
	

