
public class Tester {

	Comparable<Country> superficie = (p,q) -> p.getSup() - q.getSup();

	Comparable<Country> nome= (p,q) -> p.getNome().compareTo(q.getNome());

	class Lessicografico implements Comparable <String>{
		public int compara(String o, String o1) {
			return o.compareTo(o1);
		}
	}

	class Lunghezza implements Comparable <String>{
		public int compara(String o, String o1) {
			return o.length() - o1.length();
		}
	}

	Sort <String> lessicografico = new Sort <String> (new Lessicografico());

}
