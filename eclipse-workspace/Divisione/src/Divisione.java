
public class Divisione {

	private int num, den;
	
	public Divisione (int n, int d) {
		num=n;
		den=d;
	}
	
	public double dividi() {
		if(den == 0) throw new DivisionePerZeroException();
		return num/den;
	}
	
}
