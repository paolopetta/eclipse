package punto3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFrame;

import allegati.CentroUrbano;
import allegati.CentroUrbanoMappa;
import allegati.Nazione;
import allegati.PuntoMappa;
import punto1.Centri;
import punto2.Frame;

public class Starter {
	public static void main(String[] args) {
		File file= new File("collezione.dat");
		ArrayList<CentroUrbanoMappa> A = new ArrayList<CentroUrbanoMappa>();
		
		if(file.exists()) {
			try {
				ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));
				A= (ArrayList<CentroUrbanoMappa>) objInput.readObject();
				objInput.close();
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		else {
			A.add(new CentroUrbanoMappa("centro 1", new Nazione("Nazione 1", 1500), 100, 15.5, new PuntoMappa(10, 10)));
			A.add(new CentroUrbanoMappa("centro 2", new Nazione("Nazione 2", 1600), 100, 20.5, new PuntoMappa(50, 15)));
			A.add(new CentroUrbanoMappa("centro 3", new Nazione("Nazione 3", 2000), 100, 17.5, new PuntoMappa(100, 50)));
			A.add(new CentroUrbanoMappa("centro 4", new Nazione("Nazione 4", 500), 100, 10.5, new PuntoMappa(40, 70)));
			A.add(new CentroUrbanoMappa("centro 5", new Nazione("Nazione 5", 7500), 100, 19.5, new PuntoMappa(70, 40)));
			A.add(new CentroUrbanoMappa("centro 6", new Nazione("Nazione 6", 4500), 100, 17.0, new PuntoMappa(90, 30)));
			
			try { //scrivo nel file 
				ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));
				objOutput.writeObject(A);
				objOutput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		Centri<CentroUrbanoMappa> centri= new Centri<CentroUrbanoMappa>();
		for(int i=0; i < A.size(); i++) {
			centri.aggiungi(A.get(i).clone());
			
		JFrame frame = new Frame(centri);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
			
		}
	}

}
