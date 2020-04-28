
public class VotoEsame implements Measurable {
	
	private String voto;
	private double punteggio;
	
	public VotoEsame(String voto, double punteggio) {
		this.voto= (voto== null? "": voto);
		this.punteggio= punteggio;
	}
	
	public double getMeasure() {
		return punteggio;
	}
	
	public String getVoto() {
		return voto;
	}
	
	public double getPunt() {
		return punteggio;
	}
	
}
