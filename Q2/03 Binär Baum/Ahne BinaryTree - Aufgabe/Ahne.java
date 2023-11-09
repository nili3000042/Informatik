
/**
 * Beschreiben Sie hier die Klasse Ahne.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ahne
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String vorname, nachname;
    private char geschlecht;

    /**
     * Konstruktor für Objekte der Klasse Ahne
     */
    public Ahne(String pVorname, String pNachname, char pGeschlecht)
    {
       vorname = pVorname;
       nachname = pNachname;
       geschlecht = pGeschlecht;
    }

    /**
     * Methode
     */
    public String getVorname()
    {
      return vorname;
    }
    
    public String getNachname()
    {
        return nachname;
    }
    
    public char getGeschlecht()
    {
      return geschlecht; 
    }
}
