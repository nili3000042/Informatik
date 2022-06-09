
/**
 * Beschreiben Sie hier die Klasse S.
 * 
 * @author (MasterOFSchafis) 
 * @version (1.0 / 31.01.2022)
 */

import java.util.Scanner;

public class S
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public int x;
   

    /**
     * Konstruktor für Objekte der Klasse S
     */
    public S()
    {
        // Instanzvariable initialisieren
        x = 0;
    }
    
    public static void begrüßung ()
    {
        System.out.println('\u000C'); //Feld leeren
        Scanner scan = new Scanner(System.in);
        String eingabe;
        System.out.println("Hallo, wie heißt du?");
        eingabe = scan.nextLine();
        System.out.println("Hallo " +eingabe+ ", wie gehts es dir?");
        System.out.println("Ich möchte ein weinig mal rechnen...");
        System.out.println("Bitte gib zwei Zahlen an.");
        int a;
        a = scan.nextInt();
        int b;
        b = scan.nextInt();
        int c = a*b;
        System.out.println( a+" * " +b+ " = " +c);
        System.out.println("Ich möchte ein weinig subtrahieren...");
        System.out.println("Bitte gib zwei Zahlen an.");
        int x;
        x = scan.nextInt();
        int y;
        y = scan.nextInt();
        
        if ( x > y)
        {
            System.out.println("Deine erste Zahl ist größer. Ich rechne:");
            int z = x-y;
            System.out.println( x + "-" +y+ "=" +z);
        }
        else if ( x < y)
        {
            System.out.println("Deine zweite Zahl ist größer. Ich rechne:");
            int z = y - x;
            System.out.println( y + "-" +x+ "=" +z);
        }
        
    }
    
    public static void Taschenrechner ()
    {
       System.out.println('\u000C'); //Feld leeren
       System.out.println("Ich kann ein Ergebnis aus zwei Zahlen berechnen.");
       System.out.println("Bitte gib die Rechenart an!");
       Scanner scan = new Scanner(System.in);
       char Rechenart = scan.next().charAt(0);
       
       if(Rechenart == '+')
       {
           System.out.println("Bitte wähle zwei Zahlen.");
           int x;
           x = scan.nextInt();
           int y;
           y = scan.nextInt();
           
           int z = x + y;
           System.out.println("Dein Ergebnis ist " +x+ "+" +y+ "=" +z);
       }
       else if (Rechenart == '-')
       {
           System.out.println("Bitte wähle zwei Zahlen.");
           int x;
           x = scan.nextInt();
           int y;
           y = scan.nextInt();
           
           int z = x - y;
           System.out.println("Dein Ergebnis ist " +x+ "-" +y+ "=" +z);
       }
       else if (Rechenart == '*')
       {
           System.out.println("Bitte wähle zwei Zahlen.");
           int x;
           x = scan.nextInt();
           int y;
           y = scan.nextInt();
           
           int z = x * y;
           System.out.println("Dein Ergebnis ist " +x+ "*" +y+ "=" +z);
       }
       else if (Rechenart == '/')
       {
           System.out.println("Bitte wähle zwei Zahlen.");
           int x;
           x = scan.nextInt();
           int y;
           y = scan.nextInt();
           
           int z = x / y;
           System.out.println("Dein Ergebnis ist " +x+ "/" +y+ "=" +z);
       }
       else
       {
           System.out.println("Das sind keine Zahlen.");
           Taschenrechner();
       }
       
       System.out.println("Möchtest du noch etwas rechnen? 1= Ja 0= Nein");
       int antwort;
       antwort = scan.nextInt();
       
       if (antwort == 1 )
       {
           Taschenrechner();
       }
       else if (antwort == 0)
       {
           System.out.println("Dann halt nicht!");
       }
    }
    
    public void Zählen ()
    {
        x = 0;
        for (int i = 0; i<=100; i++)
        {
            x = x + i;
        }
        
    }
    
    
    
}
