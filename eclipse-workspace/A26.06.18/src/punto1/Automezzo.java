package punto1;

public class Automezzo implements Cloneable{
	
	private Targa targa;
	private Libretto libretto;
	private String nome;
	
	public Automezzo(Targa targa, Libretto libretto, String nome) {
		this.targa= targa;
		this.libretto= libretto;
		this.nome= nome;
	}
	
	//accesso
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return getClass().getName()+"[targa="+ targa+", libretto="+libretto+",nome="+nome+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() == otherObject.getClass()) {
			Automezzo other = (Automezzo) otherObject;
			return targa.equals(other.targa) && libretto.equals(other.libretto)&& nome.equals(other.nome);
		}
		return false;
	}
	
	public Automezzo clone() {
		try {
			return (Automezzo) super.clone();
		}catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
}
