package coloreAlCentro;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		
		JFrame frame= new JFrame();
		
		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGTH = 400;
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGTH);
		frame.setTitle("Rettangolo colorato");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String input= JOptionPane.showInputDialog("Enter x");
		double x= Double.parseDouble(input);
		
		//se inserisco 0 nell'input disegno il rettangolo rosa
		if( x == 0) {
		RectangleCol component= new RectangleCol();
		frame.add(component);
		}
	
		
		frame.setVisible(true);
		
		
		

		
	}

}
