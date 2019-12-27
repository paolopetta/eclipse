package punto3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import punto1.Vacanza;

public class Tester {

	public static void main(String[] args) {
		
		File file= new File("vacanze.dat");
		ArrayList<Vacanza> vacanze= new ArrayList<Vacanza>();

		if(file.exists()) {
			ObjectInputStream input;
			try {
				input= new ObjectInputStream(new FileInputStream(file));
				try {
					vacanze= (ArrayList<Vacanza>) input.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				input.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		else {
			vacanze.add(new Vacanza("milano", 12.2, "d"));
		}
		
	}
	
	
	
}
