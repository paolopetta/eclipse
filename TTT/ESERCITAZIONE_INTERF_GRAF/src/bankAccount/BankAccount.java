package bankAccount;

public class BankAccount {

	private double saldo;
	
	public BankAccount(double saldo) {
		this.saldo= saldo;
	}
	
	public double getSaldo() {return saldo; }
	
	public void deposita(double amount) { saldo +=amount;}
	
	public void preleva(double amount) { saldo -=amount;}
	
}
