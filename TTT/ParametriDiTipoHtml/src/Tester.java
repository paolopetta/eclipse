
public class Tester {
	
	public static void main(String[] args) {
		Bottiglia<Acqua> bottiglia1= new Bottiglia<Acqua>(new Acqua());
		Bottiglia<Vino> bottiglia2= new Bottiglia<Vino>(new Vino());
		BraccioAutomatico braccio= new BraccioAutomatico();
		braccio.prendiBottiglia(bottiglia1);
		braccio.prendiBottiglia(bottiglia2);
	}

}
