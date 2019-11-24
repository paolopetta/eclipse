import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Tester {
	
	public static void main(String[] args) {
		File file= new File("prova.dat");
		ArrayList<String> parole= new ArrayList<String>();
		ArrayList<Letto> letti= new ArrayList<Letto>();
		ArrayList<DivanoLetto> divaniLetto= new ArrayList<DivanoLetto>();
		
		letti.add(new Letto("", new Coppia<Integer>(40, 20), Letto.Specifica.SINGOLO));
		letti.add(new Letto("", new Coppia<Integer>(20, 20), Letto.Specifica.SINGOLO));
		letti.add(new Letto("", new Coppia<Integer>(60, 20), Letto.Specifica.SINGOLO));
		
		divaniLetto.add(new DivanoLetto("", new Coppia<Integer>(50, 40), new Coppia<T>(ogg1, ogg2)))
		
		if(file.exists()) {
			ObjectInputStream input;
			try {
				input = new ObjectInputStream(new FileInputStream(file));
				try {
					parole= (ArrayList<String>) input.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			parole.add("quattro");
			parole.add("casa");
			parole.add("televisione");
			parole.add("armadio");
			parole.add("castello");
			parole.add("piramide");
			parole.add("anello");
			
			ObjectOutputStream output;
			try {
				output = new ObjectOutputStream(new FileOutputStream(file));
				output.writeObject(parole);
				output.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
