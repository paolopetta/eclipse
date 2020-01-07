package punto1;

public final class Targa implements Cloneable{
	
	private String primo, ultimo;
	private int centro;
	
	public Targa (String primo, int centro, String ultimo) {
		this.primo= primo;
		this.centro= centro;
		this.ultimo= ultimo;
	}
	
	
	//accesso
	public String getTarga() {
		return primo+centro+ultimo;
	}
	
	public String toString () {
		return getClass().getName()+"[targa="+primo+centro+ultimo+"]";
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		if(getClass() == otherObject.getClass()) {
			Targa other= (Targa) otherObject;
			return primo.equals(other.primo) && centro== other.centro && ultimo.equals(other.ultimo);
		}
		return false;
	}
	
	public Targa clone() {
		try {
			return (Targa) super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
		
	}
	
}
