package punto3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent{

	public void paintComponent(Graphics g) {
		Graphics2D g2= (Graphics2D) g;
		
		Rectangle rec= new Rectangle(150, 150,100,100);
		g2.draw(rec);
	}
}
