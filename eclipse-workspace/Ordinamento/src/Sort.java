import java.util.ArrayList;

public class Sort <T>{
	
	private Comparable<T> comparatore;
	private ArrayList<T> data;
	
	//costruttore
	public Sort (Comparable <T> comparatore) {
		data = new ArrayList<T>();
		this.comparatore = comparatore;
	}
	
	//add
	
	public void addElements(T object) {
		data.add(object);
	}
	
	//sort
	public ArrayList<T> selectionSort(){
		for(int i=0; i < data.size(); i++) {
			int min= i;
			for(int j= i+1; j < data.size(); j++){
				if(comparatore.compara(data.get(j), data.get(min)) < 0)
					min= j;
			}
			T t= data.get(min);
			data.set(min, data.get(i));
			data.set(i, t);
		}
		return data;
	}
}
