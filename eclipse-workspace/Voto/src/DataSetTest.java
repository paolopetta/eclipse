
public class DataSetTest {

	public static void main(String[] args) {
		
		DataSet ds= new DataSet();
		
		ds.add(new VotoEsame("B", 8.0));
		ds.add(new VotoEsame("C", 7.0));
		ds.add(new VotoEsame("D", 6.0));

		System.out.println("Voto medio= "+ ds.getAverage());
		
		Measurable max= ds.getMax();
		System.out.println("Voto più alto="+ max.getMeasure());
		VotoEsame voto= (VotoEsame) max;
		System.out.println("Voto in lettere="+ voto.getVoto());
		
		Measurable min= ds.getMin();
		System.out.println("Voto più basso="+ min.getMeasure());
	}

}
