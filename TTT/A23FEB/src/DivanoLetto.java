
public class DivanoLetto extends Arredo{
	
	private int nPosti;
	public enum Stato{divano, letto}
	
	private Stato stato= Stato.divano;
	private Coppia<Integer> dimensioneLetto;
	
	public DivanoLetto(String descrizione, Coppia<Integer> dimensione, Coppia<Integer> dimensioneLetto) {
		super(descrizione, dimensione);
		this.dimensioneLetto= dimensioneLetto.clone();
	}
	
	public Stato getStato() {returnstato;
	
	
	//metodi accesso
	public int getNPos() {
		return nPosti;
	}
	
	
	

}
