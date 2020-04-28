package punto1;

public class Collocazione implements Cloneable{

	private char settore;
	private int posizione;
	
	public Collocazione(char settore, int posizione) {
		this.settore= settore;
		this.posizione= posizione;
	}
	
	public char getSett() {
		return settore;
	}
	
	public int getPos() {
		return posizione;
	}
	
	public String toString () {
		return getClass().getName()+"[settore="+ settore+", posizione="+ posizione+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() == otherObject.getClass()) {
			Collocazione other = (Collocazione) otherObject;
			return settore == other.settore && posizione == other.posizione;
		}
		return false;
	}
	
	public Collocazione clone() {
		try {
			return (Collocazione) super.clone();
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	
}
