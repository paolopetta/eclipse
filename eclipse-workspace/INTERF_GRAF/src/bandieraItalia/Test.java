package bandieraItalia;
import java.awt.Graphics2D;

import javax.swing.*;

import coloreAlCentro.Errore;

public class Test {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		 
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 400;
		
		frame.setSize(FRAME_WIDTH, FRAME_WIDTH);
		frame.setTitle("Due rettangoli");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		String input= JOptionPane.showInputDialog("Inserisci cosa vuoi vedere");
		
		if(input.compareTo("Bandiera Italia") == 0) {
			Bandiera component= new Bandiera();
			frame.add(component);
		}
		else {
			Errore component1= new Errore();
			frame.add(component1);
			
		}
		frame.setVisible(true);
		
	}

}
