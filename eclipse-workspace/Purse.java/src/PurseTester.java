
public class PurseTester {

	public static void main(String[] args) {
		Purse p= new Purse();
				
		System.out.println("Costruisco un portafoglio inizializzato a 0: ");
		System.out.println("Totale:"+p.getTotal());
		
		System.out.println("Aggiungo 6 monete: ");
		Coin tre= new Coin(3, "euro");
		Coin due= new Coin(2, "euro");
		Coin uno= new Coin(1, "euro");
		p.add(tre);
		p.add(due);
		p.add(uno);
		System.out.println("Totale= "+p.getTotal());
		System.out.println("Cerco il 2");
		System.out.println("Indice: "+p.findCoin(due));
		
		System.out.println("Rimuovo il minimo");
		p.remove(p.getMin());
		System.out.println("Purse: "+ p.getTotal());
		System.out.println("Rimuovo il massimo");
		p.remove(p.getMax());
		System.out.println("Purse: "+ p.getTotal());
		
		
	}

}
