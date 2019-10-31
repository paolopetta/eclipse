
public class DataSet {

	private double sum;
	private Measurable min;
	private Measurable max;
	private int count;
	
	public DataSet() {
		sum=0;
		count=0;
		min= null;
		max= null;
	}
	
	public double getAverage() {
		if(count == 0) return 0;
		else return sum/count;
	}
	
	public Measurable getMax() {
		return max;
	}
	
	public Measurable getMin() {
		return min;
	}
	
	public void add(Measurable x) {
		sum = sum + x.getMeasure();
		if(count ==0 || min.getMeasure() > x.getMeasure()) min= x;
		if(count == 0 || max.getMeasure() < x.getMeasure()) max= x;
		count++;
	}
	
}
