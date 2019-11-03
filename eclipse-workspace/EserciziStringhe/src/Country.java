
public class Country implements Comparable<Country>, Measurer<Country> {

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
	
	public int compareTo(Country c) {
		if((this.getMeasure() - c.getMeasure()) < 0) // se c è più grande
			return -1;
		else if((this.getMeasure() - c.getMeasure()) > 0 )//c è più piccolo 
			return 1;
		else return 0;
	}
	
	public String toString() {
		return getClass().getName()+"[Nome="+nome+", Superficie="+sup+"]";
	}
	
}
