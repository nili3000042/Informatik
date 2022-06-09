

import java.util.*;


/**
 * Beschreiben Sie hier die Klasse PackagesUndWhile.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class PackagesUndWhile
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    
    
    /**
     * Konstruktor für Objekte der Klasse PackagesUndWhile
     */
    public PackagesUndWhile()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    
    public static void Übung1()
    {
        System.out.println('\u000C'); //Feld leeren
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Wie heißt du?");
        String name = scan.nextLine();
        System.out.println("AHH, du heißt " +name);
        System.out.println("Woher kommst du denn?");
        String ort = scan.nextLine();
        System.out.println("Und wie alt bist du, " +name+ "?");
        int alter = scan.nextInt();
        
        System.out.println("Das heißt du bist " +name+ ", " +alter+ " Jahre alt und kommst aus " +ort+ ".");
        
    }
    
    public static void Spielstart()
    {
        //System.out.println('\u000C'); //Feld leeren
        Scanner scan = new Scanner(System.in);
        int i;
        
        System.out.println("Die Aufgabe ist es, ein Türschloss zu öffnen.");
        System.out.println("Spielst du allein (1) oder zu zweit (2)?");
        
        i=scan.nextInt();
        
        if ( i==1 )
        {
            Einspieler();
        }
        else if ( i==2 )
        {
            Mehrspieler();
        }
        else if (i!=1 || i!=2)
        {
            System.out.println("Ich verstehe nicht. Ich fange nochmal von vorne an!");
            Spielstart();
        }
        
    }
    
    public static void Einspieler()
    {
        System.out.println('\u000C'); //Feld leeren
        
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int x = rnd.nextInt(101);
        int rate= 0;
        int Leben = 5;
        int antwort;
        
        System.out.println("Vor dir befindet sich eine verschlossene Tür. Du musst eine Zahl erraten um in den Raum dahinter zu gelangen.");
        System.out.println("Die Geheimzahl befindet sich zwischen 0 und 100.");
        System.out.println("Welche Zahl könnte es sein? ");
        
        while ( x != rate && Leben>0)
        {
            rate = scan.nextInt();
            
            if ( x != rate)
            {
                System.out.println("Die Tür bleibt verschlossen und du verlierst ein Leben. Versuche es noch einmal!");
                Leben--;
                System.out.println("Du hast noch " +Leben+ " Versuche. ");
                
                if (Leben <= 0)
                {
                    System.out.println("Du hast verloren.");
                    System.out.println("Die Geheimzahl war " +x+ ".");
                }
                else if ( rate< x)
                {
                    System.out.println("Deine angegebene Zahl ist kleiner als die Geheimzahl");
                }
                else if ( rate> x)
                {
                    System.out.println("Deine angegebene Zahl ist größer als die Geheimzahl");
                }
            }
            else if ( x == rate)
            {
                System.out.println("Wie durch ein Wunder öffnet sich die Tür. Trete ein!");
            }
            
        }
   
        
        System.out.println(" ");
        System.out.println("Möchtest du es noch einmal spielen?");
        System.out.println(" 1= Ja, 0= Nein");
        
        antwort = scan.nextInt();
        
        if (antwort == 1)
        {
            Spielstart();
        }
        else if (antwort == 0)
        {
            System.out.println("Okay, dann bis zum nächsten Mal :)");
        }
    }
    
    public static void Mehrspieler()
    {
        System.out.println('\u000C'); //Feld leeren
        
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int x = rnd.nextInt(101);
        int rate= 0;
        int Leben1 = 5;
        int Leben2 = 5;
        int antwort;
        boolean weiter=true;
        
        System.out.println("Vor euch befindet sich eine verschlossene Tür. Ihr musst eine Zahl erraten um in den Raum dahinter zu gelangen.");
        System.out.println("Die Geheimzahl befindet sich zwischen 0 und 100.");
        System.out.println("Welche Zahl könnte es sein? ");
        
        while ( x != rate && Leben1>0 && weiter==true)
        {
            System.out.println(" ");
            System.out.println("Spieler 1 ist dran.");
            rate = scan.nextInt();
            
            if ( x != rate)
            {
                System.out.println("Die Tür bleibt verschlossen und du verlierst ein Leben.");
                Leben1--;
                System.out.println("Du hast noch " +Leben1+ " Versuche. ");
                
                if (Leben1 <= 0)
                {
                    System.out.println("Du hast verloren.");
                }
                else if ( rate< x)
                {
                    System.out.println("Deine angegebene Zahl ist kleiner als die Geheimzahl");
                }
                else if ( rate> x)
                {
                    System.out.println("Deine angegebene Zahl ist größer als die Geheimzahl");
                }
            }
            else if ( x == rate)
            {
                System.out.println("Wie durch ein Wunder öffnet sich die Tür. Tretet ein!");
                
                System.out.println(" ");
                System.out.println("Möchtet ihr noch einmal spielen?");
                System.out.println(" 1= Ja, 0= Nein");
                
                antwort = scan.nextInt();
        
                if (antwort == 1)
                {
                    Spielstart();
                }
                else if (antwort == 0)
                {
                    System.out.println("Okay, dann bis zum nächsten Mal :)");
                    weiter=false;
                }
            }
            
            if (weiter ==true)
            {
                System.out.println(" ");
                System.out.println("Spieler 2 ist dran.");
                rate = scan.nextInt();
            
                if ( x != rate)
                {
                    System.out.println("Die Tür bleibt verschlossen und du verlierst ein Leben. Versuche es noch einmal!");
                    Leben2--;
                    System.out.println("Du hast noch " +Leben2+ " Versuche. ");
                
                    if (Leben2 <= 0)
                    {
                        System.out.println("Du hast verloren.");
                        System.out.println("Die Geheimzahl war " +x+ ".");
                        System.out.println(" ");
                        System.out.println("Möchtet ihr noch einmal spielen?");
                        System.out.println(" 1= Ja, 0= Nein");
                
                        antwort = scan.nextInt();
        
                        if (antwort == 1)
                        {
                            Spielstart();
                        }
                        else if (antwort == 0)
                        {
                            System.out.println("Okay, dann bis zum nächsten Mal :)");
                            weiter=false;
                        }
                    }
                    else if ( rate< x)
                    {
                        System.out.println("Deine angegebene Zahl ist kleiner als die Geheimzahl");
                    }
                    else if ( rate> x)
                    {
                        System.out.println("Deine angegebene Zahl ist größer als die Geheimzahl");
                    }
                }
                else if ( x == rate)
                {
                    System.out.println("Wie durch ein Wunder öffnet sich die Tür. Tretet ein!");
                    System.out.println(" ");
                    System.out.println("Möchtet ihr noch einmal spielen?");
                    System.out.println(" 1= Ja, 0= Nein");
                
                    antwort = scan.nextInt();
        
                    if (antwort == 1)
                    {
                        Spielstart();
                    }
                    else if (antwort == 0)
                    {
                        System.out.println("Okay, dann bis zum nächsten Mal :)");
                        weiter=false;
                    }
                }
            }
        }
    }
    }
    
    

