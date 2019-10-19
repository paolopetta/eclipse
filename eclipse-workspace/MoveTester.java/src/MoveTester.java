import java.awt.Rectangle;

public class MoveTester {
	//okay
	public static void main(String[] args) {
		Rectangle box = new Rectangle(5,10,20,30);
		
		System.out.println("Il rettangolo è in poizione: X="+ box.getX()+" Y="+box.getY());
		
		//muovo il rettangolo
		box.translate(15,25);
		
		//stampo le informazioni dopo il movimento del rettangolo
		System.out.println("Il rettangolo dopo lo spostamento è a: X=" + box.getX()+" Y="+ box.getY());
		
		
	}
}
