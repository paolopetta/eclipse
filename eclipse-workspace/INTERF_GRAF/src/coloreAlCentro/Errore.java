package coloreAlCentro;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Errore extends JComponent{
	
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawString("Errore oggetto non trovato", 100, 100);
		
		
	}
	
}
