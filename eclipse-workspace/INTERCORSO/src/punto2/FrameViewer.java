package punto2;

import java.util.Random;
import punto1.Centri;

import javax.swing.JFrame;

import allegati.CentroUrbanoMappa;
import allegati.Nazione;
import allegati.PuntoMappa;
import punto1.Centri;

public class FrameViewer {

	public static void main(String[] args) {
		Random random= new Random();
		Centri<CentroUrbanoMappa> centri =new Centri<CentroUrbanoMappa>();
		centri.aggiungi(new CentroUrbanoMappa("Milano", new Nazione("Italia",0), 500 , 13 ,new PuntoMappa(random.nextInt(480), random.nextInt(480))));
		centri.aggiungi(new CentroUrbanoMappa("Napoli", new Nazione("Italia",0), 1000 , 24.5 ,new PuntoMappa(random.nextInt(480), random.nextInt(480))));
		
		JFrame frame= new Frame(centri);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	

		
}
