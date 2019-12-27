package punto1;

public class Libro {

	private Autore autore;
	private String titolo;
	private String dataNasc;
	private double prezzo;
	
	public Libro(Autore autore, String titolo, String dataNasc, double prezzo) {
		this.autore= autore;
		this.titolo= titolo;
		this.dataNasc= dataNasc;
		this.prezzo= prezzo;
	}
	
	public Autore getAutore() {
		return autore;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	
	
}
