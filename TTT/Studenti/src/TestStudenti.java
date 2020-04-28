
public class TestStudenti {

	public static void main(String[] args) {
		Studenti s= new Studenti("Paolo");
		System.out.println("Lo studente è : "+ s.getStudente()+"\nLa media è: "+s.getMedia());
		System.out.println("I voti sono:");
		s.stampVoti();
		
		System.out.println("Aggiungo il voto 28: ");
		s.aggVoto(28);
		System.out.println("Lo studente è : "+ s.getStudente()+"\nLa media è :"+s.getMedia());
		System.out.println("I voti sono:");
		s.stampVoti();
		
		System.out.println("Aggiungo il voto 26: ");
		s.aggVoto(26);
		System.out.println("Lo studente è : "+ s.getStudente()+"\nLa media è :"+s.getMedia());
		System.out.println("I voti sono:");
		s.stampVoti();
		}

}
