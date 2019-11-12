package eccezioni;

public class ErrorSaldoInsufficienteException extends Exception{
	
	public ErrorSaldoInsufficienteException() {
		super("Impossibile prelevare, saldo insufficiente");
	}

}
