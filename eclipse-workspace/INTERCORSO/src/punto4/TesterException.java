package punto4;

import allegati.CentroUrbano;
import allegati.CentroUrbanoMappa;
import allegati.Nazione;
import allegati.PuntoMappa;

public class TesterException {
	
	public static void main(String[] args) {
		try {
			System.out.println("Creo un oggetto di tipo Centri<CentroUrbano> e provo ad aggiungere un oggetto di tipo CentroUrbano");
			System.out.println("Questa operazione lancia un eccezione");
			Centri<CentroUrbano> centri = new Centri<CentroUrbano>();
			centri.aggiungi(new CentroUrbano("centro1", new Nazione("Nazione1", 0), 0, 15.0));
		}
		catch (MissingPositionException e){
			e.printStackTrace();			
		}
		
		try {
			Centri<CentroUrbanoMappa> centri = new Centri<CentroUrbanoMappa>();
			centri.aggiungi(new CentroUrbanoMappa("Milano", new Nazione("Italia", 0), 0, 15.2, new PuntoMappa(0, 0)));
			centri.cancellazione("roma");
		}
		catch(MissingItemException e){
			e.printStackTrace();
			
		}
	}
}
