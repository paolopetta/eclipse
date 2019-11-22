package punto4;

public class MissingItemException extends RuntimeException{
	
	public MissingItemException() {
		super();
		System.out.println("Città non presente");
	}
	

}
