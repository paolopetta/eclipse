
public class ArrayEstTester {

	public static void main(String[] args) {
		ArrayEstendibile a= new ArrayEstendibile();
		
		/*for(ArrayEstendibile nuovo : a) {
			nuovo= 8;
		}*/
		for(int i =0; i< a.DATA_LENGTH; i++)
			a.add(i);
		
		a.add(12.5);
		for (int i=0, j=1; i< a.DATA_LENGTH; i++) {
			System.out.println(j+" "+a.get(i));
			j++;
		}
		System.out.println("Lunghezza: "+ a.getLengh());
		a.cancI(50);
		for (int i=0, j=1; i< a.DATA_LENGTH; i++) {
			System.out.println(j+" "+a.get(i));
			j++;
		}
		
		
		
	}

}
