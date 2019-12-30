package punto2;

import java.util.ArrayList;

public class Estrattore<T> {

	private Estrazione <T> estrazione;
	
	public Estrattore(Estrazione<T> estrazione) {
		this.estrazione= estrazione;
	}

	public String estrazione(ArrayList<T> collezione) {
		String toReturn = "";
		for (T t: collezione)
			toReturn += estrazione.estrai(t)+ "\n";
		return toReturn;
	}
}

