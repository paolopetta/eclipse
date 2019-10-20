
public class Collocazione implements Cloneable{

	private String settore;
	private int codSett;
	
	public Collocazione() {
		settore= "";
		codSett= 0;
	}
	
	public Collocazione(String settore, int codSett) {
		this.settore= settore;
		this.codSett= codSett;
	}
	
	public String getSettore() {
		return settore;
	}
	
	public int codSettore() {
		return codSett;
	}
	
	public String toString() {
		return getClass().getName()+"[settore="+settore+", codice settore="+codSett+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() != otherObject.getClass()) return false;
		Collocazione other = (Collocazione) otherObject;
		return settore.equals(other.settore) && codSett == other.codSett;
	}
	
	public Collocazione clone() {
		try {
			Collocazione cloned= (Collocazione)super.clone();
			return cloned;
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
