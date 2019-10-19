
public class TesterString {
	//okay
	
	public static void main(String[] args ) {
		String x = "ciao";
		String s= "ciao";
		System.out.println("La lettera i è in posizione " + x.indexOf("i") + " della stringa ciao");
		System.out.println("Sostituisco alla stringa ciao la i con la e: "+x.replace("i", "e" ));
		System.out.println("Sostituisco la stringa ciao con come stai?: "+x.replaceAll(x, "come stai?"));
		System.out.println("Sostituisco la prima occorrenza di o con a della stringa ciao: "+x.replaceFirst("o", "a"));
		System.out.println("La sottostringa di ciao di indice 2-4 è: "+x.substring(2, 4));
		System.out.println("ciao è uguale a ciao?: "+x.equals("ciao"));
		System.out.println("ciao è uguale a ciao?"+ x.equalsIgnoreCase(s));
		
		
		String q= "Questo libro sembra un testo di informatica non un testo di matematica";
		
		//primo punto del secondo esercizio
		String q1= q.substring(q.indexOf("Q"), q.indexOf("sembra"));
		String q2= q.substring(q.indexOf("di informatica"), q.indexOf("non"));
		System.out.println(q1.concat(q2).toUpperCase());
		
		
		System.out.println(q.replaceAll("testo", "saggio"));
		
		
		
	}
}
