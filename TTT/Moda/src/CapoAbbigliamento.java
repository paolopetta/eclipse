
public class CapoAbbigliamento implements Cloneable{

		private Marca marca;
		private String cod;
		private String colore;
		private double prezzo;
		
		public CapoAbbigliamento(Marca marca, String cod, String colore, double prezzo) {
			this.marca= marca;
			this.cod= (cod == null? "" : cod);
			this.colore=(colore== null? "": colore);
			this.prezzo= prezzo;
		}
		
		public Marca getMarca() {
			return marca;
		}
		
		public String getCod() {
			return cod;
		}
	
		public double getPrezzo() {
			return prezzo;
		}
		
		public String getColore() {
			return colore;
		}
		
		public String toString() {
			return "[marca="+marca+", codice="+cod+ ", prezzo="+prezzo+"]";
		}
		
		public boolean equals(Object otherObject) {
			if(otherObject== null) return false;
			if(getClass() != otherObject.getClass()) return false;
			CapoAbbigliamento other= (CapoAbbigliamento) otherObject;
			return marca.equals(other.marca) && cod.equals(other.cod) && prezzo == other.prezzo;
		}
		
		public CapoAbbigliamento clone() {
			try {
				CapoAbbigliamento cloned= (CapoAbbigliamento) super.clone();
				cloned.marca = marca.clone();
				return cloned;
			}
			catch (CloneNotSupportedException e) {
				return null;
			}
		}
}
