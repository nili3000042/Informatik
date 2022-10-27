
/**
 * Beschreiben Sie hier die Klasse Zahleneinlese.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.util.Scanner;

public class Zahleneinlese
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Zahleneinlese
     */
    public Zahleneinlese()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    public static void Zahleneinlese ()
    {
       System.out.println('\u000C'); //Feld leeren
       System.out.println("Hallo, ich sortiere deine Zahlen.");
       System.out.println("Bitte gib zwei Zahlen an");
       
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       int b = scan.nextInt();
       
       
       if ( b > a)
       {
           int c = 0;
           c = b;
           b = a;
           a = c;
       }
       
       System.out.println( a+ " ist größer als " +b+ "." );
       
       System.out.println("Möchtest du noch mehr sortieren? J oder N");
       char antwort = scan.next().charAt(0);
       
       if (antwort == 'J')
       {
           Zahleneinlese();
       }
       else if (antwort == 'N')
       {
           System.out.println("Okay.");
       }
    }
}
