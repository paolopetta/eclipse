
public class Coin {
	
	private String nome;
	private double valore;
	
	//costruttore
	public Coin (double unValore, String unNome) {
		nome= unNome;
		valore= unValore;
	}	
	public String daiNome() {return nome;}
	
	public double daiValore() {return valore;}
	
	public boolean equals (Coin moneta) {
		return nome.equals(moneta.daiNome());
	}
	
	
}
