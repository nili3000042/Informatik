
/**
 * Beschreiben Sie hier die Klasse Struktogramme.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Struktogramme
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Struktogramme
     */
    public Struktogramme()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    public static void Aufgabe1()
    {
        int a = 10;
        int b = 20;
        
        while (b>5)
        {
            b=b-5;
            a=a+2;
        }
        
        System.out.println(a);
    }
    
    public static void Aufgabe4()
    {
        int Summe=0;
        int z;
        
        for ( z=5; z>0; z--)
        {
            Summe= Summe+z;
        }
        
        System.out.println(Summe);
    }
    
    public static void Aufgabe5()
    {
        int a=1;
        int Summe = 0;
        
        while (a<5)
        {
            Summe= Summe+a;
            
            if (a >3)
            {
                Summe= Summe-1;
            }
            
            a++;
        }
        
        System.out.println(Summe);
    }
}
