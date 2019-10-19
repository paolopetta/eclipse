package Banca;
import anagrafica.*;
import java.util.ArrayList;

public class Bank {
	
	private ArrayList<BankAccount> bankAccount;
	
	public Bank() {
		bankAccount= new ArrayList<BankAccount>();
	}
	
	public int getNumAccount() {
		return bankAccount.size();
	}
	
	public void addAccount(double initialBalance, String customerName, int ID) {
		BankAccount nBankAcc= new BankAccount(initialBalance, customerName, ID);	//faccio un nuovo account
		bankAccount.add(nBankAcc); 												//lo aggiungo all'arraylist
	}
	
	public void getAccount() {
		for(BankAccount account: bankAccount)
			System.out.println("ID: "+account.getID()+" Intestatario:"+account.getNome()+" Saldo:"+ account.getSaldo());
	}
	
	public void deposit(int accountNumber ,double amount) {	//quanto voglio depositare e dove?
		for(BankAccount  account :bankAccount) {
			if (account.getID()== accountNumber) 
				account.deposita(amount);
			break;
		}
	}
	
	public void withdrow(int accountNumber ,double amount) {
		for(BankAccount account: bankAccount) {
			if(account.getID()== accountNumber)
				account.preleva(amount);
			break;
		}

	}
	
	public double getBalance (int accountNumber) {
		for(BankAccount account: bankAccount) {
			if(account.getID()== accountNumber)
				return account.getSaldo();
		}
		return -1;
	}
	
	public void transfer(int fromID, int toID, double amount) {
		for(BankAccount accountMitt :bankAccount)
			if(fromID == accountMitt.getID()) {
				accountMitt.preleva(amount);
				for(BankAccount accountDest : bankAccount) {
					if(toID == accountDest.getID()) {
						accountDest.deposita(amount);
						break;
					}
				}
				break;
			}
		}
					
	}
		

