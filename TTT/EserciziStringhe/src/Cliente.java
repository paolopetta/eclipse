
public class Cliente implements Comparable<Cliente>, Measurer<Cliente>{

	private int età;
	private String nome;
	
	//costruttore
	public Cliente(int età, String nome) {
		this.età= età;
		this.nome= (nome== null? "": nome);
	}
	
	//metodi d'accesso 
	public int getEtà() {
		return età;
	}
	
	public String getNome() {
		return nome;
	}
	
	//metodi interfacce
	public int compareTo(Cliente c) {
		if(età - c.età == 0) {
			return nome.compareToIgnoreCase(c.nome);
		}
		return età -c.età;
	}
	
	public double getMeasure() {
		return età;
	}
	
	public String toString() {
		return getClass().getName()+"[Età="+età+", nome="+nome+"]";
	}
	
}


