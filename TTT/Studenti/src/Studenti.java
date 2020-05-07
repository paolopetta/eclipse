
public class Studenti {
	
	private String nome;
	private int[] voti= new int[10] ;
	private double media;
	int i=0;
	
	//costruttori
	/**
	 * Creo uno studente senza voti.
	 */
	public Studenti (String nome) {
		this.nome = nome;
		media = 0;
	}
	/**
	 * Aggiungo un voto. (da completare)
	 */
	public void aggVoto(int voto) {
		voti[i]= voto;
		i++;
		
	}
	/**
	 * Ritorno lo studente.
	 * @return
	 */
	public String getStudente() {
		return nome;		
	}
	/**
	 * ritorno i voti.	
	 * @return
	 */
	public int[] getVoti() {
		return voti; 
	}
	
	public void stampVoti() {
		int i;
		for (i=0; i<voti.length && voti[i]!= 0; i++)
			System.out.println(voti[i]);
	}
	
	/**
	 * calcolo e ritorno la media 
	 * @return media
	 */
	public double getMedia() {
		int i=0;
		double sum=voti[i];
		for (i=1; i< voti.length && voti[i]!= 0; i++) {
			sum+=voti[i];
		}
		media = sum/i;
		return media;
	}
	public double getMediaMod() {
		double sum= voti[0];
		for (double d : voti) {
			if(d != 0)
				sum+= d;
		}
		media = sum/2;
		return media;
	}
}
