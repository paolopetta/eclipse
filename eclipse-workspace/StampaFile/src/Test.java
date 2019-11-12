import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main (String[] args ) throws IOException{
		
		Scanner in = new Scanner(System.in);
		boolean ok= false;
		String s;
		
		System.out.println("Inserisci il file da cercare: ");
		
		while(!ok) {
			try {
				s= in.next();
				FileReader fr= new FileReader(s);
				in= new Scanner(fr);
				ok= true;
				while((s=in.nextLine()) != null)
					System.out.println(s);
			}
			catch(FileNotFoundException e) {
				System.out.println("File inesistente, nome?");
			}
		}		
	}
}
