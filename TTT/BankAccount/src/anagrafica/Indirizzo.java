package anagrafica;

public final class Indirizzo implements Cloneable {
	
	private String via,citta ;
	private int nCivico, cap;
	
	public Indirizzo() {
		via = (via ==null ? "" : via);
		nCivico=0;
		citta =(citta  ==null ? "" : citta);
		cap=0;
	}
	
	public Indirizzo(String via, int nCivico, String citta ,int cap) {
		this.via= via;
		this.nCivico= nCivico;
		this.citta = citta;
		this.cap= cap;
		}
	
	public String getVia() {
		return via;
	}
	
	public int getNCiv() {
		return nCivico;
	}
	
	public int getCap() {
		return cap;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public String toString() {
		return getClass().getName()+"[via="+via+", citta ="+citta+", civico="+nCivico+", cap="+cap+"]";
	}
	
	public boolean equals(Object otherObject){
		if (otherObject == null) return false;
		if (getClass() != otherObject.getClass())
		return false;
		Indirizzo other = (Indirizzo)otherObject;
		return via.equals(other.via) && nCivico==other.nCivico && cap==other.cap && citta.equals(other.citta);
		}
	
	protected Indirizzo clone() {
		try {
			return(Indirizzo) super.clone();
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}
