package Banca;
import anagrafica.*;
//import java.util.*;

public class BankTester {

	public static void main(String[] args) {
		Indirizzo indPaolo= new Indirizzo("via s rocco", 8, "Pagani", 84016);
		Cliente Paolo= new Cliente("Paolo", "Petta", indPaolo);
		
		SavingAccount savPaolo= new SavingAccount(12000, Paolo,30);
		System.out.println(savPaolo);
		
	}
}
		
		
		
		/*Bank b= new Bank();
		
		String[] intestatari= {"Paolo", "Giuseppe", "Francesco","lorenzo","Gianluca", "Antonio", "Ernesto", "Marco", "Gianfranco", "Alessio"};
		double[] saldi= {10,30,50,43,50,78,54,11,12.3,78,8};
		
		//aggiungo tutti i conti
		for(int i=0; i< intestatari.length;i++) 
			b.addAccount(saldi[i], intestatari[i], i+1);
		
		//verifico l'inserimento
		System.out.println("Stato della banca dopo i 10 account: ");
		System.out.println("Num account: "+b.getNumAccount());
		
		Random generator= new Random();
		
		for(int i=1; i<=3 ; i++) {
			int randomD1= generator.nextInt(10)+1;
			int randomD2= generator.nextInt(10)+1;
			double randomImport= generator.nextInt(10);
			
			switch(i) {
			case 1: b.deposit(randomD1, randomImport);break;
			case 2: b.withdrow(randomD1, randomImport);break;
			case 3: b.transfer(randomD1, randomD2, randomImport);break;
			}
			System.out.println("\nNum Account: "+ b.getNumAccount());
			b.getAccount();
			
		}
	}
}*/
