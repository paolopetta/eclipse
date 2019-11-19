package bandieraItalia;

import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class Bandiera extends JComponent{
	
	
	public void paintComponent(Graphics g) {
	Graphics2D g2= (Graphics2D) g;
	
	Rectangle leftRectangle = new Rectangle(100, 100, 30, 60);
	g2.draw(leftRectangle);
	Rectangle rightRectangle = new Rectangle(160,100,30,60);
	g2.draw(rightRectangle);
	Rectangle centerRectangle = new Rectangle(130,100,30,60);
	g2.draw(centerRectangle);
	
	g2.setColor(Color.green);
	g2.fill(leftRectangle);
	
	g2.setColor(Color.red);
	g2.fill(rightRectangle);
	
	g2.setColor(Color.white);
	g2.fill(centerRectangle);
	
	

	}

}
