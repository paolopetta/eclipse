import java.awt.*;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//Costruisci un rettangolo e disegna
		Rectangle box = new Rectangle(5,10,20,30);
		g2.draw(box);
		
		//Muovi il rettangolo
		box.translate(15, 25);
		
		g2.draw(box);
	}

}
