package punto4;

public class MissingItemException extends RuntimeException{
	
	public MissingItemException() {
		super();
		System.out.println("Citt� non presente");
	}
	

}
