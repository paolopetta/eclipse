package Banca;
import anagrafica.*;

public class CheckingAccount extends BankAccount {

  private int operazioni;
  private final static int OP_GRATIS = 3;
  private final static int COSTO_OP = 1;
  
  public CheckingAccount(double saldo, Cliente cliente) {
    super(saldo, cliente);
    operazioni = 0;
  }
  
  public void deposito(double soldi) {
    super.deposita(soldi);
    operazioni++;
  }
  
  public void prelievo(double soldi) {
    super.preleva(soldi);
    operazioni++;
  }
  
  public void scalaoperazioni() {
    if(operazioni > OP_GRATIS) {
      double op = operazioni * COSTO_OP;
      prelievo(op);
    }
  }
  
  public String toString() {
    return super.toString() + "[operazioni="+operazioni+"]";
  }
public boolean equals(Object otherObject) {
	if(!super.equals(otherObject))
		return false;
	
	CheckingAccount other=(CheckingAccount) otherObject;
	return operazioni == other.operazioni;
}

public CheckingAccount clone() {
	CheckingAccount cloned= (CheckingAccount) super.clone();
	return cloned;
}
}
