import java.awt.Rectangle;

public class DataSetTest {
	
	public static void main (String[] args) {
		
		class RectangleMeasurer implements Measurer<Rectangle>{
			public double measure(Rectangle aRectangle){
				double area = aRectangle.getWidth() * aRectangle.getHeight();
				return area;
			}
			
		}		
		Measurer m= new RectangleMeasurer();
		DataSetMeasurer<Rectangle> data= new DataSetMeasurer<Rectangle>(m);
		data.add(new Rectangle(5,10,20,30));
		data.add(new Rectangle(10,50,45,80));
		data.add(new Rectangle(5,15,10,30));
		
		System.out.println("La media è: "+ data.getAverage());
		Rectangle max= data.getMax();
		System.out.println("L'area maggiore è: "+ m.measure(max));
		
		
		
	}

}
