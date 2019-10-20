package anagrafica;

public class Cliente implements Cloneable{
	
	private String nome, cognome;
	private Indirizzo indirizzo;
	
	//costruttore
	public Cliente() {
		nome="";
		cognome="";
		indirizzo= new Indirizzo();
	}
	
	public  Cliente(String nome, String cognome, Indirizzo indirizzo) {
		this.nome= nome;
		this.cognome= cognome;
		this.indirizzo= indirizzo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	
	public String toString() {
		return getClass().getName()+"[nome="+ nome+", indirizzo="+ indirizzo+"]";
	}
	
	public boolean equals(Object otherObject){
		if (otherObject == null) return false;
		if (getClass() != otherObject.getClass())
		return false;
		Cliente other = (Cliente)otherObject;
		return nome.equals(other.nome) && cognome.equals(other.cognome)&& indirizzo.equals(other.indirizzo);
		}
	
	public Cliente clone() {
		try {
			Cliente cloned= (Cliente) super.clone();
			cloned.indirizzo = indirizzo.clone();
			return cloned;
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}//prova
