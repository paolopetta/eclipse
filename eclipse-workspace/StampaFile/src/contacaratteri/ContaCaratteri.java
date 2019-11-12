package contacaratteri;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ContaCaratteri {
	
	public static void main(String[] args) throws IOException {
		Reader reader= new FileReader("nomefile.txt");
		
		int totale =0;
		while (reader.read() != -1) 
			totale++;
		reader.close();
		System.out.println("Il numero di caratteri è:" + totale);
	}

}
