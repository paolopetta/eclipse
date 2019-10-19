
public class Rettangolo {
	private Punto corner= new Punto();
	int width , height;
	
	
	public Rettangolo() {
		width = 0;
		height = 0;
	}

	public Rettangolo(Punto cor, double x, double y) {
		corner.modAsc(cor.getX(),cor.getY());
	
	}
	public static void main(String[] args) {

	}

}
