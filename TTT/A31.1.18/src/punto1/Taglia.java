package punto1;

public class Taglia implements Cloneable{

	private String codiceA;
	private int codiceN;
	
	public Taglia(String codiceA, int codiceN) {
		this.codiceA= codiceA;
		this.codiceN= codiceN;
	}
	
	//accesso
	public String getCodA() {
		return codiceA;
	}
	
	public int getCodN() {
		return codiceN;
	}
	
	//modificatori
	
	public void modCodN(int nCod) {
		codiceN= nCod;
	}
	
	public String toString () {
		return getClass().getName()+ "[codice alfanumerico=" + codiceA+", codice numerico="+ codiceN+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() == otherObject.getClass()) {
			Taglia other= (Taglia) otherObject;
			return codiceA.equals(other.codiceA) && codiceN == other.codiceN;
		}
		return false;
	}
	
	public Taglia clone() {
		try {
			return (Taglia) super.clone();
		}catch(CloneNotSupportedException e)
		{
			return null;
		}
	}
	
	
	
	
}
