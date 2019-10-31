
public class Country implements Comparable <Country> {

	private String nome;
	private int sup;
	
	public Country (String nome , int sup) {
		this.nome= (nome == null? "":nome);
		this.sup= sup;
	}
	
	public int compareTo( Country other) {
		return sup - other.sup;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getSup() {
		return sup;
	}
}
