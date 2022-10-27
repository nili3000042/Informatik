
import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Arrays.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Arrays
{
    public static void Beispiel1()
    {
        System.out.println('\u000C'); //Feld leeren
        
        Scanner scan = new Scanner(System.in);
        
        String[]name = {"Nina", "Julia", "Fiona", "Michelle", "Saskia"};
        
        int[]alter = new int[5];
        alter[0]= 30;
        alter[1]= 31;
        alter[2]= 64;
        alter[3]= 67;
        alter[4]= 2;
        
        int[]startpos = new int[5];
        for(int i=0; i<startpos.length; i++)
        {
            startpos[i]=i+1;
        }
        
        for(int i=0; i<name.length; i++)
        {
            System.out.println(name[i]+" ist " +alter[i]+ " alt und startet heute auf Position " +startpos[i]);
        }
    }
    
    public static void Beispiel2()
    {
        System.out.println('\u000C'); //Feld leeren
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Gebe fünf Namen ein.");
        String[]name = new String[5];
        name[0]= scan.nextLine();
        name[1]= scan.nextLine();
        name[2]= scan.nextLine();
        name[3]= scan.nextLine();
        name[4]= scan.nextLine();
        
        System.out.println("Gebe ihr Alter ein.");
        int[]alter = new int[5];
        alter[0]= scan.nextInt();
        alter[1]= scan.nextInt();
        alter[2]= scan.nextInt();
        alter[3]= scan.nextInt();
        alter[4]= scan.nextInt();
        
        int[]startpos = new int[5];
        for(int i=0; i<startpos.length; i++)
        {
            startpos[i]=i+1;
        }
        
        for(int i=0; i<name.length; i++)
        {
            System.out.println(name[i]+" ist " +alter[i]+ " alt und startet heute auf Position " +startpos[i]);
        }
    }
    
    public static void Beispiel3()
    {
        System.out.println('\u000C'); //Feld leeren
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Gebe 5 Zahlen ein");
        int[]zahl = new int[5];
        for (int i=0; i<zahl.length; i++)
        {
            zahl[i]= scan.nextInt();
        }
        
        int c=0;
        for ( int i=0; i<zahl.length; i++)
        {
            if (c<zahl[i])
            {
                c=zahl[i];
            }
        }
         
        System.out.println("Die größte Zahl ist " +c);
    }
    
    public static void Beispiel4()
    {
        System.out.println('\u000C'); //Feld leeren
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Gebe 5 Zahlen ein");
        int[]zahl = new int[5];
        for (int i=0; i<zahl.length; i++)
        {
            zahl[i]= scan.nextInt();
        }
        
        int[]hilfe = new int[5];
        int[]pos= new int[5];
        
        for ( int i=0; i<zahl.length; i++)
        {
            if (hilfe[i]<zahl[i])
            {
                hilfe[i]=zahl[i];
                zahl[i]=0;
            }
        }
         
        for (int  i=0; i<zahl.length; i++)
        {
            System.out.println( hilfe[i]);
        }
    }
}
