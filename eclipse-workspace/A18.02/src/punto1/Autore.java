package punto1;
//quando immutabile -> final
public final class Autore {
	
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
	
	public String toString () {
		return getClass().getName()+"[nome="+ nome+", cognome="+ cognome+", data nascita="+ dataNasc+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() == otherObject.getClass()) {
			Autore other = (Autore) otherObject;
			return nome.equals(other.nome) && cognome.equals(other.cognome) && dataNasc.equals(other.dataNasc);
		}
		return false;
	}
	
	public Autore clone() {
		try {
			return (Autore) super.clone();
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
