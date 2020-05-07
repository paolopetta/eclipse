
public class Programma {
	
	public static void main(String[] args) {
		Punto p= new Punto(12,53);
		Rettangolo r= new Rettangolo(p, 30.5, 12.5);
		System.out.println("Il rettangolo è: "+ r.getX()+" "+r.getY()+" "+r.getLarghezza()+ " "+r.getAltezza());
		r.move(5, 7);
		System.out.println("Il rettangolo spostato di x=5 e y=7 è : "+ r.getX()+" "+r.getY()+" "+r.getLarghezza()+ " "+r.getAltezza());
		r.move(-5, -7);
		System.out.println("Il rettangolo spostato di x=-5 e y=-7 è : "+ r.getX()+" "+r.getY()+" "+r.getLarghezza()+ " "+r.getAltezza());
	}
}
