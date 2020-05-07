package punto4;

public class MissingPositionException extends Exception{
	
	public MissingPositionException() {
		super();
		System.out.println("L'oggetto inserito non è un centro urbano mappa");
	}

}
