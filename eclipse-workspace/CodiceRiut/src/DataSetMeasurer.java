
public class DataSetMeasurer <Rectangle>{
	
	private double sum;
	private int count;
	private Measurer<Rectangle> measurer;
	private Rectangle minimum, maximum;
	
	public DataSetMeasurer(Measurer<Rectangle> M) {
		sum=0;
		count=0;
		minimum= null;
		maximum= null;
		measurer= M;
	}

	public double getAverage() {
		if(count == 0) return 0;
		else return sum/count;
	}
	
	public Rectangle getMax() {
		return maximum;
	}
	
	public Rectangle getMin() {
		return minimum;
	}
	
	public void add(Rectangle r) {
		sum= sum+ measurer.measure(r);
		if(count == 0 || measurer.measure(minimum) > measurer.measure(r))
			minimum= r;
		if(count == 0 || measurer.measure(maximum) < measurer.measure(r))
			maximum= r;
		count++;
	}
	
}

