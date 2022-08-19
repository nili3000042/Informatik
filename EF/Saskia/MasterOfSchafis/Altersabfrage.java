
/**
 * Beschreiben Sie hier die Klasse Altersabfrage.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.util.Scanner;

public class Altersabfrage
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Altersabfrage
     */
    public Altersabfrage()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    public static void Altersabfrage ()
    {
        System.out.println('\u000C'); //Feld leeren
       System.out.println("Hallo, ich möchte dir ein paar Fragen stellen.");
       System.out.println("Bitte gib dein Geschlecht an! m, w, d");
       
       Scanner scan = new Scanner(System.in);
       char Geschlecht = scan.next().charAt(0);
       
       if (Geschlecht == 'm')
       {
           System.out.println("Bitte gib zum Fortfahren dein Alter an");
           int x;
           x = scan.nextInt();
           
           if ( x < 18)
           {
               System.out.println("Hallo Junge, du bist zu jung!");
           }
           else if ( x >= 18)
           {
               System.out.println("Hallo der Herr, treten Sie ein!");
           }
       }
       else if (Geschlecht == 'w')
       {
           System.out.println("Bitte gib zum Fortfahren dein Alter an");
           int x;
           x = scan.nextInt();
           
           if ( x < 18)
           {
               System.out.println("Hallo Mädchen, du bist zu jung!");
           }
           else if ( x >= 18)
           {
               System.out.println("Hallo die Dame, treten Sie ein!");
           }
       }
       else if (Geschlecht == 'd')
       {
           System.out.println("Bitte gib zum Fortfahren dein Alter an");
           int x;
           x = scan.nextInt();
           
           if ( x < 18)
           {
               System.out.println("Hallo, du bist zu jung!");
           }
           else if ( x >= 18)
           {
               System.out.println("Hallo, treten Sie ein!");
           }
       }
    }
}
