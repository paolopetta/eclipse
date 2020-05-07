
public class Distributore {
	private int lattine;
	private int gettoni;
	
	//costruttori
	/**
	 * Costruisco un Distributore con 0 lattine e 0 gettoni
	 */
	public Distributore() {
		lattine = 0;
		gettoni = 0;
	}
	/**
	 * Costruisco un Distributore con un det num di lattine e un det num di gettoni
	 * @param lattine num di lattine da inserire nel nuovo distributore
	 * @param gettoni num di gettoni da inserire nel nuovo distributore
	 */
	public Distributore (int lattine, int gettoni) {
		this.lattine = lattine;
		this.gettoni = gettoni;
	}
	
	//metodi
	/**
	 * Aggiungo un det num di lattine al distributore
	 * @param numLattine numero di lattine da aggiungere
	 */
	public void aggLattine(int numLattine) {
		lattine += numLattine;
	}
	/**
	 * Aggiungo un det num di gettoni al distributore
	 * @param numGettoni numero di gettoni da aggiungere
	 */
	public void aggGettoni(int numGettoni) {
		gettoni += numGettoni;
	}
	/**
	 * Azzero il num di lattine e gettoni
	 */
	public void azzera() {
		lattine= 0;
		gettoni= 0;
	}
	/**
	 * Prendo il numero di lattine
	 * @return restituisco il n di lattine
	 */
	public int getLatt() {
		return lattine;
	}
	/**
	 * Prendo il numero di gettoni
	 * @return restituisco il n di gettoni
	 */
	public int getGett() {
		return gettoni;
	}
	
}
