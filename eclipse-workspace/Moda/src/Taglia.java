
public class Taglia implements Cloneable{
	
	private String codAlf;
	private int cod;
	
	
	//costruttore
	public Taglia( String codAlf, int cod){
		this.codAlf= (codAlf == null?"" : codAlf);
		this.cod= cod;
	}
	
	//accesso
	public String getCodAlf() {
		return codAlf;
	}
	
	public int getCod() {
		return cod;
	}
	
	//modificatori
	public void changeCodAlf(String newCod) {
		codAlf= newCod;		
	}
	
	public void changeCod(int newCod) {
		cod= newCod;		
	}
	
	public String toString() {
		return getClass().getName()+ "[Codice alfanumerico="+ codAlf+", codice="+cod+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() != otherObject.getClass()) return false;
		Taglia other= (Taglia) otherObject;
		return codAlf.equals(other.codAlf) && cod == other.cod;
	}
	
	public Taglia clone() {
		try {
			Taglia cloned= (Taglia) super.clone();
			return cloned;			
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}	
}
