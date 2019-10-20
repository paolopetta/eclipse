
public class Tester {

	public static void main(String[] args) {

		Taglia M= new Taglia("M","01");
		Taglia L= new Taglia("L","02");
		
		Marca armani= new Marca("Armani", "Di Giorgio Armani");
		Marca versace= new Marca("Versace", "Di Gianni Versace");
		
		ElencoMaglie numeroMaglie = new ElencoMaglie();
		
		Maglia uno= new Maglia(armani, "021", "rosso", 120.50, M);
		Maglia due= new Maglia(versace, "054", "giallo", 100.10, L);
		
		numeroMaglie.addMaglia(uno);
		System.out.println(numeroMaglie.getAll());
		numeroMaglie.addMaglia(due);
		System.out.println(numeroMaglie.getAll());
		
		System.out.println(armani.clone());
		System.out.println(M.clone());
		System.out.println(uno.clone());
	}

}
