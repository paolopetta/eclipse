package punto4;

public class MissingPositionException extends Exception{
	
	public MissingPositionException() {
		super();
		System.out.println("L'oggetto inserito non � un centro urbano mappa");
	}

}
