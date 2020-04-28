import java.awt.Rectangle;

public class EsercizioRectangle {
	
	public static void main(String[] args ) {
		Rectangle scatolaBiscotti= new Rectangle(10, 20, 15, 11);
		Rectangle scatolaCaramelle= scatolaBiscotti;
		Rectangle x= scatolaBiscotti;
		// equals vede se il conenuto è lo stesso
		//== vede se sono lo stesso oggetto
		System.out.println(scatolaBiscotti.equals(x));
		System.out.println(scatolaCaramelle.equals(x));
		System.out.println(scatolaBiscotti== x);
		System.out.println(scatolaBiscotti== scatolaCaramelle);
		x.translate(5, 10);
		System.out.println(scatolaCaramelle.intersects(x));
		System.out.println(scatolaCaramelle.intersection(x));
		scatolaCaramelle.resize(15-10, 11-10);
		System.out.println(scatolaCaramelle.intersects(x));
		System.out.println(scatolaCaramelle.intersection(x));
		
	}
}
