package eccezioni;

public class ErrorVersamentoNegativoException extends RuntimeException{
	
	public ErrorVersamentoNegativoException() {
		super("Impossibile versare un saldo negativo");
	}

}
