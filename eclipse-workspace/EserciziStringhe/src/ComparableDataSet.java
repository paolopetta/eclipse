
public class ComparableDataSet <T extends Comparable <T>>{

	private T min;
	private T max;
	
	public ComparableDataSet() {
		min=null;
		max=null;
	}
	
	public void add(T other) {
		if(min==null) min=other;
			else if (min.compareTo(other) > 0) min= other;
		if(max == null) max= other;
		else if (max.compareTo(other) < 0) max= other;
	}
	
	public T getMin() {return min;}
	public T getMax() {return max;}
	
}
