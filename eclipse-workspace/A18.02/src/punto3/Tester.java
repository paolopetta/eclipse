package punto3;

import java.util.ArrayList;

import javax.swing.JFrame;

import punto1.Autore;
import punto1.Collocazione;
import punto1.LibroCatalogato;

public class Tester {
	
	public static void main(String[] args) {
		
		ArrayList<Autore> autori = new ArrayList<Autore>();
		autori.add(new Autore("nome1", "cognome1", "data1"));
		autori.add(new Autore("nome2", "cognome2", "data2"));
		autori.add(new Autore("nome3", "cognome3", "data3"));
		autori.add(new Autore("nome4", "cognome4", "data4"));
		autori.add(new Autore("nome5", "cognome5", "data5"));
		autori.add(new Autore("nome6", "cognome6", "data6"));
		autori.add(new Autore("nome7", "cognome7", "data7"));
		autori.add(new Autore("nome8", "cognome8", "data8"));
		autori.add(new Autore("nome9", "cognome9", "data9"));
		autori.add(new Autore("nome10", "cognome10", "data10"));
		
		ArrayList<LibroCatalogato> libri = new ArrayList<LibroCatalogato>();
		libri.add(new LibroCatalogato(new Autore("nome1", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		libri.add(new LibroCatalogato(new Autore("nome2", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		libri.add(new LibroCatalogato(new Autore("nome3", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		libri.add(new LibroCatalogato(new Autore("nome4", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		libri.add(new LibroCatalogato(new Autore("nome5", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		libri.add(new LibroCatalogato(new Autore("nome6", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		libri.add(new LibroCatalogato(new Autore("nome7", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		libri.add(new LibroCatalogato(new Autore("nome8", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		libri.add(new LibroCatalogato(new Autore("nome9", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		libri.add(new LibroCatalogato(new Autore("nome10", "cognome1", "data1"), "titolo1", 0, new Collocazione('A', 1), "soggetto1"));
		
		JFrame frame= new FrameLib(autori, libri);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
