import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		double res;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("inserisci il numeratore: ");
		int n= in.nextInt();
		System.out.println("Inserisci il denominatore: ");
		int d= in.nextInt();
		
		
		try {
			Divisione div= new Divisione(n, d);
			res= div.dividi();
			System.out.println("Il risultato è: "+ res );
		}
		catch (DivisionePerZeroException exception) {
			//System.out.println(exception);	
			exception.printStackTrace();
		}
	}

}
