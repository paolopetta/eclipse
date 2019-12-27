package punto1;

public class Autore {
	
	private String nome;
	private String cognome;
	private String dataNasc;
	
	public Autore(String nome, String cognome, String dataNasc) {
		this.nome= nome;
		this.cognome= cognome;
		this.dataNasc= dataNasc;
	}

	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	
}
