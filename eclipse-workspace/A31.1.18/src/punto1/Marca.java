package punto1;

public final class Marca implements Cloneable{
	
	private String nome, desc;
	
	public Marca (String nome, String desc) {
		this.nome= nome;
		this.desc= desc;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String toString() {
		return getClass().getName()+"[nome="+ nome +", descrizione=" + desc+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() == otherObject.getClass()) {
			Marca other= (Marca) otherObject;
			return nome.equals(other.nome) && desc.equals(other.desc);
		}
		return false;
	}
	
	public Marca clone() {
		try {
			return (Marca) super.clone();
		}catch(CloneNotSupportedException e) {
			return null;
		}
		
	}
	
}
