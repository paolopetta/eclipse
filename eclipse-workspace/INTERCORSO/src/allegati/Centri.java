package allegati;

import java.util.ArrayList;


public class Centri {
	private ArrayList<CentroUrbano> centri;
	
	public Centri(){
		centri=new ArrayList<CentroUrbano>();
	}
	
	public void aggiungi(CentroUrbano x){
		int i = cerca(x.getNome());
		if (i== -1)	centri.add(x);			
	}
	
	
	private int cerca(String unNome) {
		int i;
		for(i=0; i<centri.size(); i++)
			if(centri.get(i).getNome().equalsIgnoreCase(unNome) )
				return i;
	    return -1;
	}
	
	public CentroUrbano cancellazione(String unNome){
		int i = cerca(unNome);
		if (i!= -1) {
			return centri.remove(i).clone();
		}
		return null;
	}
	
	
	public CentroUrbano getCentro(int indice){
		return centri.get(indice).clone();
	}
	
	public int getSize(){
		return centri.size();
	}

}
