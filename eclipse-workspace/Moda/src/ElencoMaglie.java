import java.util.ArrayList;

public class ElencoMaglie {

	private ArrayList <Maglia> maglie;
	
	//costruttore
	public ElencoMaglie() {
		maglie= new ArrayList<Maglia>();
	}
	
	//accesso
	public String getAll() {
		String get= "";
		for(Maglia maglia: maglie) {
			get += maglia.toString()+"\n";
		}
		return get;
	}
	
	//modificatori
	public void addMaglia(Maglia m) {
		maglie.add(m.clone());
	}
	
	public void deleteMaglia(Maglia m) {
		maglie.remove(m.clone());
	}
}
