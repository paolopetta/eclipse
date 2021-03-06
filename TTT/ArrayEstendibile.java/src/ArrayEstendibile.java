
public class ArrayEstendibile {
	
	final static int DATA_LENGTH=100;
	
	private double[] data;
	private int dataSize;
	
	//costruttore
	public ArrayEstendibile() {
		data= new double[DATA_LENGTH];
		dataSize= 0;
	}
	
	public double get(int i) {
		if(i<0 || i>=dataSize) throw new IndexOutOfBoundsException();
		return data[i];
	}
	
	public void set(int i, double x) {
		if(i<0 || i>=dataSize) throw new IndexOutOfBoundsException();
		data[i]= x;
	}
	
	public void add(double x) {
		if(dataSize >= data.length) {
			double[]newD= new double[2*data.length];
			System.arraycopy(data, 0, newD, 0, data.length);
			data=newD;
		}
		data[dataSize]=x;
		dataSize++;
	}
	
	public void cancI(int i) {
		for(int j=i; j < data.length; j++) {
			data[j]= data[j+1];
		}
	}
	
	public int getLengh() {
		return dataSize;
	}
	
	
}
