
public class Marca implements Cloneable{
	
	private final String nome;
	private final String desc;
	
	//costruttore
	public Marca(String nome, String desc) {
		this.nome= (nome == null?"" : nome);
		this.desc= (desc==null?"" : desc);
	}
	
	//accesso
	public String getNome() {
		return nome;
	}
	
	public String getDesc() {
		return desc;
	}
		
	public String toString() {
		return "[nome="+nome+", descrizione="+desc+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() != otherObject.getClass()) return false;
		Marca other= (Marca) otherObject;
		return nome.equals(other.nome) && desc.equals(other.desc);
	}

	public Marca clone() {
		try {
			Marca cloned= (Marca) super.clone();
			return cloned;
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
