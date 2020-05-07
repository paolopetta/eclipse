public class Punto {
	private double x;
	private double y;

	public Punto() {
		x=0;
		y=0;
	}
	
	public Punto(double firstPunto, double secondPunto) {
		x= firstPunto;
		y= secondPunto;
	}
	//methods
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void modAsc(double newx) {
		x= newx;
	}
	
	public void modOrd(double newy) {
		y= newy;
	}
	
	public void translate (double xTr, double yTr) {
		x += xTr;
		y += yTr;
	}
		
}//class

