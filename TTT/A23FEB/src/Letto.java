
public final class Letto extends Arredo implements Cloneable{

	public enum Specifica{ SINGOLO, PIAZZA_MEZZA, MATRIMONIALE_STANDARD, MATRIMONIALE_DELUXE}
	
	private Specifica spec;
	
	public Letto(String descrizione, Coppia<Integer> misura, Specifica spec) {
		super(descrizione, misura);
		this.spec= spec;
	}
	
	//metodi accesso
	public Specifica getSpec() {
		return spec;
	}
	
	public String toString() {
		return super.toString()+"[specifica="+ spec+"]";
	}
}
