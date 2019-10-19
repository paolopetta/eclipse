
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String misura = "paolo";
		String seconda= "Petta";
		System.out.println("Hello word");
		System.out.println();	//vado a capo
		System.out.println("Paolo Petta");
		int length = misura.length();
		System.out.print("Lunghezza: "+length);
		System.out.println();
		System.out.println("Concatenazione: "+misura.concat(seconda));
		System.out.println("toUpper: "+ misura.toUpperCase());
		
		//frase splittata
		System.out.println("Frase splittata: ");
		String frase = "Mary had a little lamb";
		String[] risultato= frase.split("\\s");
		for(int x=0 ; x<risultato.length; x++ ) {
		System.out.println(risultato[x]);
		}

	}

}
