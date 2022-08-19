
import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Mo28_03.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mo28_03
{
    public static void Eingabe()
    {
        System.out.println('\u000C'); //Feld leeren
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Gebe 7 Zahlen ein");
        int [] Eingabe=new int [6];
        for(int i=0; i<Eingabe.length; i++)
        {
            Eingabe[i]= scan.nextInt();
        }
        
        
    }
    
    public static void Random()
    {
        System.out.println('\u000C'); //Feld leeren
        Random rnd = new Random();
        
        int [] Eingabe=new int [6];
        for(int i=0; i<Eingabe.length; i++)
        {
            Eingabe[i]= rnd.nextInt(100);
            System.out.println( Eingabe[i] + " ");
        }
        
       
    }
}


