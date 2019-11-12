package eccezioni;

public class ErrorCostructSaldoNegativoException extends RuntimeException{
	
	public ErrorCostructSaldoNegativoException(){
		super("Impossibile costruire un bankaccount con saldo negativo");
	}
	
	

}
