
public class TestDistributore {

	public static void main(String[] args) {
		Distributore d= new Distributore();
		System.out.println("Creo un distributore con 0 lattine e 0 gettoni = ");
		System.out.println("Lattine:"+d.getLatt()+" Gettoni:"+ d.getGett());
		Distributore d2= new Distributore(3,4);
		System.out.println("Creo un distributore con 3 lattine e 4 gettoni = ");
		System.out.println("Lattine:"+d2.getLatt()+" Gettoni:"+ d2.getGett());
		System.out.println("Azzero il distribuore precedente: ");
		d2.azzera();
		System.out.println("Lattine:"+d2.getLatt()+" Gettoni:"+ d2.getGett());
		System.out.println("Aggiungo una lattina: ");
		d2.aggLattine(1);
		System.out.println("Lattine: "+d2.getLatt());
		System.out.println("Aggiungo 6 lattine: ");
		d2.aggLattine(6);
		System.out.println("Lattine: "+d2.getLatt());
		System.out.println("Aggiungo un gettone: ");
		d2.aggGettoni(1);
		System.out.println("Gettoni: "+d2.getGett());		
	}

}
