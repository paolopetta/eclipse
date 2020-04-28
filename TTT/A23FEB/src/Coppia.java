
public class Coppia <T> implements Cloneable{
	
	private T oggetto1;
	private T oggetto2;
	
	public Coppia (T ogg1, T ogg2){
		oggetto1= ogg1;
		oggetto2= ogg2;
	}
	
	//metodi accesso
	public T get1() { return oggetto1;	}
	
	public T get2() {return oggetto2; }
	
	
	//metodi modificatori 
	public void modOgg1(T newOgg) {
		oggetto1= newOgg;
	}
	
	public String toString() {
		return getClass().getName()+"[Primo="+ oggetto1+", secondo="+ oggetto2+"]";
	}
	
	public Coppia clone() {
		try {
			Coppia cloned= (Coppia) super.clone();
			return cloned;
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
