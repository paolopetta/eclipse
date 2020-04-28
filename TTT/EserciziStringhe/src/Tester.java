
public class Tester {

	public static void main(String[] args) {
		
		//test country
		ComparableDataSet<Country> dataCountry= new ComparableDataSet<Country>();
		dataCountry.add(new Country ("Italia", 1000));
		dataCountry.add(new Country("Romania", 500));
		dataCountry.add(new Country ("Belgio", 540));
		
		Country minCountry = dataCountry.getMin();
		Country maxCountry = dataCountry.getMax();
		
		System.out.println("dataCountry");
		System.out.println("Max= "+maxCountry);
		System.out.println("Min= "+minCountry);
		
		//test clienti
		ComparableDataSet<Cliente> dataCliente= new ComparableDataSet<Cliente>();
		dataCliente.add(new Cliente (50, "Alessio"));
		dataCliente.add(new Cliente(20, "Den"));
		dataCliente.add(new Cliente (25, "Luigi"));
		
		Cliente minCliente= dataCliente.getMin();
		Cliente maxCliente= dataCliente.getMax();
		
		System.out.println("dataCliente");
		System.out.println("Max= "+maxCliente);
		System.out.println("Min= "+minCliente);
		
				
	}
}
