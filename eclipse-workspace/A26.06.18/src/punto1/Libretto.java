package punto1;

public class Libretto implements Cloneable{
	private String intestatario;
	private String descrizione;
	
	public Libretto(String intestatario, String descrizione) {
		this.intestatario= intestatario;
		this.descrizione= descrizione;
	}
	
	//accesso
	public String getIntest() {
		return intestatario;
	}
	
	//modificatori
	public void modIntes(String nIntes) {
		intestatario= nIntes;
	}
	
	public String toString () {
		return getClass().getName()+"[intestatario="+ intestatario+", descrizione="+ descrizione+"]S";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null)	return false;
		if(getClass() == otherObject.getClass()) {
			Libretto other= (Libretto) otherObject;
			return intestatario.equals(other.intestatario) && descrizione.equals(other.descrizione);
		}
		return false;
	}
	
	public Libretto clone() {
		try {
			return (Libretto) super.clone();
		}catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
}
