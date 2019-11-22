package allegati;

public class Nazione implements Cloneable{
	private String nome;
	private int numeroAbitanti;
	
	public Nazione(String unNome, int unNumeroAbitanti){
		nome=unNome;
		numeroAbitanti=unNumeroAbitanti;
	}
	
	public String toString(){
		return getClass().getName() + "[nome="+nome+",numeroAbitanti="+numeroAbitanti+"]";		
	}
	
	public boolean equals(Object obj){
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Nazione tmp = (Nazione) obj;
		return nome.equals(tmp.nome) && (numeroAbitanti==tmp.numeroAbitanti);
	}
	
	public Nazione clone(){
		try {
			Nazione tmp = (Nazione) super.clone();
			return tmp;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
		
	//metodi di accesso
	
	public String getNome(){
		return nome;
	}
	
	public int getNumeroAbitanti(){
		return numeroAbitanti;
	}
	
	//metodi modificatori
	
	public void changeNumeroAbitanti(int newNumeroAbitanti){
		numeroAbitanti=newNumeroAbitanti;
	}

}
