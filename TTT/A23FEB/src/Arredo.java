
public abstract class Arredo implements Cloneable{

	private String descrizione;
	private Coppia<Integer> misura;
	
	public Arredo(String desc, Coppia<Integer> coppia) {
		descrizione= desc;
		misura= coppia; //boh
		
	}
	
	//metodi accesso
	public String getDescr() {
		return descrizione;
	}
	
	public Coppia<Integer> getMisur() {
		return misura;
	}
	
	public String toString() {
		return getClass().getName()+"[Descrizione="+ descrizione+", misura="+misura.get1()+misura.get2()+"]";
	}
	
}
