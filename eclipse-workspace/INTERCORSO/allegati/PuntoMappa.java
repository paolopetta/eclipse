package allegati;

public final class PuntoMappa implements Cloneable{
	private int latitudine;
	private int longitudine;
	
	public PuntoMappa(int unaLatitudine, int unaLongitudine){
		latitudine=unaLatitudine;
		longitudine=unaLongitudine;
	}
	
	public String toString(){
		return getClass().getName() + "[latitudine="+latitudine+",longitudine="+longitudine+"]";		
	}
	
	public boolean equals(Object obj){
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		PuntoMappa tmp = (PuntoMappa) obj;
		return (latitudine==tmp.latitudine) && (longitudine==tmp.longitudine);
	}
	
	public PuntoMappa clone(){
		try {
			PuntoMappa tmp = (PuntoMappa) super.clone();
			return tmp;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//metodi di accesso
	
	public int getLatitudine(){
		return latitudine;
	}
	
	public int getLongitudine(){
		return longitudine;
	}


}
