
public class TestPunto {
	
	public static void main(String[] args) {
		Punto p= new Punto();
		
		System.out.println("Creo un punto di coordinate (0,0)");
		System.out.println(p.getX()+ " " +p.getY());
		
		Punto p1= new Punto (5,10);
		System.out.println("Creo un punto di coordinate (5,10)");
		System.out.println(p1.getX()+" "+ p1.getY());
		
		p1.modAsc(5);
		p1.modOrd(4);
		System.out.println("Sposto il punto alle coord (5,4)");
		System.out.println(p1.getX()+ " "+ p1.getY());
		
	}

}
