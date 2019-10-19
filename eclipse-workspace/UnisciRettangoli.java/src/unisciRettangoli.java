import java.awt.Rectangle;

public class unisciRettangoli {
	//okay

	public static void main(String[] args) {
		Rectangle box= new Rectangle(5,10,20,30);
		System.out.print(box);
		box.translate(20, 0);
		box.translate(0, 30);
		box.translate(-20, 0);
		
		System.out.println();
		System.out.println("L'area è: "+box.getWidth()* box.getHeight());
		System.out.println("Il perimetro è: "+ (box.getHeight()+box.getWidth())*2);
		
		
		
	}

}
