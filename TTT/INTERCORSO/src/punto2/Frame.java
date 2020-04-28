package punto2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

import allegati.CentroUrbanoMappa;
import punto1.Centri;

public class Frame extends JFrame{
	
	public Frame (Centri<CentroUrbanoMappa> centri) {
		setSize(500,500);
		
		class MapComponent extends JComponent{
			
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				for(int i=0; i < centri.getSize(); i++) {
					CentroUrbanoMappa centro= centri.getCentro(i);
					int y= centro.getPuntoMappa().getLongitudine();
					int x= centro.getPuntoMappa().getLatitudine();
					Ellipse2D.Double punto= new Ellipse2D.Double(x,y,5,5);
					g2.fill(punto);
					g2.drawString(centro.getNome()+" "+centro.getTemperatura()+"°C", x, y);
				}
			}
		}
		add(new MapComponent());
	}

}
