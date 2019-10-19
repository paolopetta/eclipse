package Banca;
import anagrafica.*;

public class SavingAccount extends BankAccount {
	
	private double interesse;
	
	public SavingAccount(double saldo, Cliente cliente, double interesse) {
		super(saldo, cliente);
		this.interesse= interesse;
	}
	
	public void aggiungiInteresse() {
		double inter = getSaldo()*interesse/100;
		deposita(inter);
	}
	
	public String toString() {
		return super.toString()+"[interesse="+interesse+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject))
			return false;
		
		SavingAccount other=(SavingAccount) otherObject;
		return interesse == other.interesse;
	}
	
	public SavingAccount clone() {
		SavingAccount cloned= (SavingAccount) super.clone();
		return cloned;
	}
	
}
