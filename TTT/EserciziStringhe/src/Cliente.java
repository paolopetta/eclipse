
public class Cliente implements Comparable<Cliente>, Measurer<Cliente>{

	private int et�;
	private String nome;
	
	//costruttore
	public Cliente(int et�, String nome) {
		this.et�= et�;
		this.nome= (nome== null? "": nome);
	}
	
	//metodi d'accesso 
	public int getEt�() {
		return et�;
	}
	
	public String getNome() {
		return nome;
	}
	
	//metodi interfacce
	public int compareTo(Cliente c) {
		if(et� - c.et� == 0) {
			return nome.compareToIgnoreCase(c.nome);
		}
		return et� -c.et�;
	}
	
	public double getMeasure() {
		return et�;
	}
	
	public String toString() {
		return getClass().getName()+"[Et�="+et�+", nome="+nome+"]";
	}
	
}


