 


/**
<p> Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 * @version 2.1 16.03.2014
 */
public class Abfahrerliste {
private List<Abfahrtslaeufer> liste; 

	public Abfahrerliste() {
	    liste = new List<Abfahrtslaeufer>();   
	}

	public void einsortieren(Abfahrtslaeufer abl) {
	      liste.append(abl);
	    //Diese Methode soll so modifiziert werden, sodass der Abfahrtslaeufer entsprechend seiner
	    //Zeit in die Liste eingefügt wird
	}
	
	public String ausgabe() {
		String erg = "";
		liste.toFirst();
		while (liste.hasAccess()) {
			erg += liste.getContent().toString();
			erg += "\n";
			liste.next();
        }
		return erg;
	}

}
