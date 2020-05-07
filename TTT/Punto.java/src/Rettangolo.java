
public class Rettangolo {
	
	private Punto corner= new Punto();
	double width , height;
	
	
	public Rettangolo() {
		width = 0;
		height = 0;
	}

	public Rettangolo(Punto cor, double larghezza, double altezza) {
		corner.modAsc(cor.getX());
		corner.modOrd(cor.getY());
		width = larghezza;
		height = altezza;
	}
	
	public void move(double mx, double my) {
		corner.modAsc(mx);
		corner.modOrd(my);
	}
	
	public void resize (double rw, double he) {
		width= rw;
		height= he;
	}
	
	public double getX() {
		return corner.getX();
	}
	
	public double getY() {
		return corner.getY();
	}
	
	public double getAltezza() {
		return height;
	}
	
	public double getLarghezza() {
		return width;
	}
	
	public double getPerimetro() {
		return (height*2)+(width*2);
	}
	
	public double getArea() {
		return height * width;
	}
	
	public void move (int xMove, int yMove) {
		corner.translate(xMove, yMove);
	}
	
	/**
	 * Allarga il rettangolo in base ai parametri passati
	 * @param newX valore da incrementare sull'ordinata
	 * @param newY valore da incrementare sull'ordinata
	 */
	public void grow (double newX, double newY) {
		width += newX;
		height +=newY;
	}
}

