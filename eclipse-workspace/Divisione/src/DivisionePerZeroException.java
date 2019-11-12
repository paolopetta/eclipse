
public class DivisionePerZeroException extends RuntimeException{
	
	public DivisionePerZeroException() {
		super("Non puoi dividere per 0");
		
	}
	
	public DivisionePerZeroException(String msg) {
		super(msg);
	}
}
