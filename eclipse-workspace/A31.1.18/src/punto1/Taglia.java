package punto1;

public class Taglia {

	private String codiceA;
	private int codiceN;
	
	public Taglia(String codiceA, int codiceN) {
		this.codiceA= codiceA;
		this.codiceN= codiceN;
	}
	
	//accesso
	public String getCodA() {
		return codiceA;
	}
	
	public int getCodN() {
		return codiceN;
	}
	
	//modificatori
	
	public void modCodN(int nCod) {
		codiceN= nCod;
	}
	
	
	
	
}
