package punto2;

import java.util.ArrayList;

import allegati.CentroUrbano;


public class Centri <T extends CentroUrbano>{
	private ArrayList<T> centri;
	
	public Centri(){
		centri=new ArrayList<T>();
	}
	
	public void aggiungi(T x){
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
	
	public T cancellazione(String unNome){
		int i = cerca(unNome);
		if (i!= -1) {
			return (T) centri.remove(i).clone();
		}
		return null;
	}
	
	
	public T getCentro(int indice){
		return (T) centri.get(indice).clone();
	}
	
	public int getSize(){
		return centri.size();
	}

}
