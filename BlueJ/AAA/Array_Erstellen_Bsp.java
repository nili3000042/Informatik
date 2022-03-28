import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Array_Erstellen_Bsp
{
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public Array_Erstellen_Bsp()
    {
        System.out.println('\u000c');
        Zufall();
        Eingabe();
    }
    public void Zufall()
    {
        System.out.println("Name:");
        int [] Name =new int[7];
        for(int i=0;i<Name.length;i++)
        {
            Name[i]=rnd.nextInt(100);
            System.out.println(i+": "+Name[i]);
        }
    }
    public void Eingabe()
    {
        int [] Name =new int[7];
        System.out.println("Gebe "+Name.length+" Zahlen ein.");
        for(int i=0;i<Name.length;i++)
        {
            Name[i]=scan.nextInt();
        }
        System.out.println("Name:");
        for(int i=0;i<Name.length;i++)
        {
            System.out.println(i+": "+Name[i]);
        }
    }
}
