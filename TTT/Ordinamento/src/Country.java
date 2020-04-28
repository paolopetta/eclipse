
public class Country {

	private String nome;
	private int sup;
	
	//costruttore
	public Country(String nome, int sup) {
		this.nome= (nome== null? "": nome);
		this.sup= sup;
	}
	
	//metodi d'accesso
	public String getNome() { return nome;}
		
	public int getSup() {return sup;}
	
	public double getMeasure() {
		return sup;
	}
	
	
	public String toString() {
		return getClass().getName()+"[Nome="+nome+", Superficie="+sup+"]";
	}
	
}
