import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner lineaComando= new Scanner (System.in);
		ArrayList<String> files = new ArrayList<String>();
		File catted = new File("risultato.txt");
		
		while(true) {
			String file = lineaComando.next();
			if(file.equals("\\")) break;
			files.add(file);
		}
		lineaComando.close();
		
		CatFiles cat = new CatFiles();
		cat.concat(files, catted);
	}

}
