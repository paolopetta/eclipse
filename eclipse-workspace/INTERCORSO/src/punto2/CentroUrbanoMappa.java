package punto2;

import allegati.CentroU;

public class CentroUrbanoMappa extends CentroUrbano {
	
	private CentroUrbano centroUrb;
	private PuntoMappa puntoM;
	
	public CentroUrbanoMappa(CentroUrbano centro, PuntoMappa mappa) {
		centroUrb= centro;
		puntoM = mappa;
	}
	

}
