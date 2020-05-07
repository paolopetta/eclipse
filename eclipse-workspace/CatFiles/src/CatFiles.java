import java.io.*;
import java.util.*;

public class CatFiles {
	
	public CatFiles() {
		
	}

	public void concat(ArrayList<String> files, File catted) throws FileNotFoundException {
		 
		PrintWriter scrive = new PrintWriter(catted);
		for(String s: files) { //scorro il file
			File file= new File(s);
			if(file.exists()) {
				Scanner legge = new Scanner(file);
				while(legge.hasNextLine()) 
					scrive.println(legge.nextLine());
				
					legge.close();
			}
		}
		scrive.close();
	}
}