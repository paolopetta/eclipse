
public class Autore {
	
	private final String nome, cognome, dataNascita;
	
	public Autore() {
		nome= "";
		cognome= "";
		dataNascita= "00/00/00";
	}
	
	public Autore(String nome, String cognome, String dataNascita) {
		this.nome= nome;
		this.cognome= cognome;
		this.dataNascita= dataNascita;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getDataNasc() {
		return dataNascita;
	}
}
