
public class Autore implements Cloneable{
	
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
	
	public String toString () {
		return getClass().getName()+"[nome="+nome+", cognome="+cognome+", data di nascita="+ dataNascita+"]";
	}
	
	public boolean equals(Object otherObject) {
		if (otherObject == null) return false;
		if(getClass() != otherObject.getClass()) return false;
		Autore other= (Autore) otherObject;
		return nome.equals(other.nome) && cognome.equals(other.cognome) && dataNascita == other.dataNascita;
	}
	
	public Autore clone() {
		try {
			Autore cloned= (Autore) super.clone();
			return cloned;
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
}

	
