package banca;
import anagrafica.*;
import eccezioni.*;

public class BankAccount implements Cloneable {
	
	private double saldo;
	private String nome;
	private int ID;
	private Cliente cliente;
	
	public BankAccount(double saldo, Cliente cliente) throws ErrorCostructSaldoNegativoException{
		if(saldo < 0)  throw new ErrorCostructSaldoNegativoException();
		this.saldo = saldo;
		this.cliente= cliente;
	}

	public double getSaldo() {
		return saldo;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getID() {
		return ID;
	}
	
	public void preleva(double amount) throws ErrorSaldoInsufficienteException{
		if(amount > saldo) throw new ErrorSaldoInsufficienteException();

		saldo -= amount;
	}
	
	public void deposita(double amount) throws ErrorVersamentoNegativoException{
		if(amount < 0) throw new ErrorVersamentoNegativoException();
		
		saldo +=amount;
	}
	
	public String toString() {
		return getClass().getName()+"[cliente="+cliente+", saldo="+saldo+"]";
	}
	
	public boolean equals(Object otherObject){
		if (otherObject == null) return false;
		if (getClass() != otherObject.getClass())
		return false;
		BankAccount other = (BankAccount)otherObject;
		return saldo== other.saldo && cliente.equals(other.cliente);
		}
	
	public BankAccount clone() {
		try {
			BankAccount cloned= (BankAccount) super.clone();
			cloned.cliente= cliente.clone();
			return cloned;
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	} 
	
	
}

