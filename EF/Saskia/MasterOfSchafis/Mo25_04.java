
import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Mo25_04.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mo25_04
{
    public static void Selection()
    {
        System.out.println('\u000C'); //Feld leeren
        Random zufall = new Random();
        
        int[]A= new int[7];
        
        for(int i=0; i<A.length; i++)
        {
            A[i]=zufall.nextInt(100);
            System.out.print(A[i] + " ");
            
        }
        
        System.out.println(" ");
        
        int links = 0;
        
        while ( links<A.length)// die kleinste Zahl wird gesucht und auf die erste Pos gespeichert
        {
            int min= links; // kleinste Zahl
            
            for ( int i= links+1; i<A.length; i++)
            {
                if (A[i]<A[min])
                {
                    min = i;
                }
            }
            
            int hilf = A[min];
            A[min]=A[links];
            A[links]=hilf;
            
            links++;
        }
        
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
