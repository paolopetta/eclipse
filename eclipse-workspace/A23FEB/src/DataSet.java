import java.util.ArrayList;

public class DataSet <T> {

	private Comparatore<T> comparatore;
	
	public DataSet(Comparatore<T> comparatore) {
		this.comparatore= comparatore;
	}
	
	
	public ArrayList<T> bubbleSort(ArrayList<T> lista) {
		for(int i=0; i< lista.size() ; i++) {
			for(int j=0; j< lista.size()-1; j++) {
				if(comparatore.compara(lista.get(j), lista.get(j+1)) > 0) {
					T temp= lista.get(j);
					lista.set(j, lista.get(j+1));
					lista.set(j+1, temp);
				}
			}
		}
		return lista;
	}

}
