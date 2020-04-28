
public class TestRettangolo {

	public static void main(String[] args) {
		Rettangolo r= new Rettangolo();
		System.out.println("Creo un nuovo rettangolo con (0,0) e altezza 0 e larghezza 0");
		System.out.println(r.getX() +" "+ r.getY()+ " "+ r.getAltezza()+ " "+ r.getLarghezza());
		Punto p= new Punto(5,10);
		Rettangolo r1= new Rettangolo(p , 5 , 10);
		System.out.println("Creo il rettangolo con il punto (5,10) di larghezza 5 e lunghezza 10");
		System.out.println(r1.getX() +" "+ r1.getY()+ " "+ r1.getAltezza()+ " "+ r1.getLarghezza());
	}

}
