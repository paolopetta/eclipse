package punto1;

public class Vacanza {
	private String identificativo;
	private Double costo;
	private String descrizione;
	
	public Vacanza (String identificativo, Double costo, String descrizione) {
		this.identificativo= identificativo;
		this.costo= costo;
		this.descrizione= descrizione;
	}
	
	
	//accesso
	public String getIdent() { return identificativo;	}
	
	public Double getCos() { return costo;}
	
	public String getDesc() {return descrizione;}

	//modificatori
	public void modCosto(Double newCosto) {
		costo= newCosto;
	}
	
	
	public String toString() {
		return getClass().getName()+"[identificativo= "+identificativo+", costo="+costo+", descrizione="+ descrizione+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() != otherObject.getClass()) return false;
		Vacanza other= (Vacanza) otherObject;
		return identificativo.equals(other.identificativo) && costo == other.costo && descrizione.equals(other.descrizione);
	}
	
	public Vacanza clone() {
		try {
			Vacanza cloned= (Vacanza) super.clone();
			return cloned;
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
