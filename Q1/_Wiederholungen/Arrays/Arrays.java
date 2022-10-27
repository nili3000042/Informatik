import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Arrays
{
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public static void Namen()
    {
        System.out.println('\u000c');
        String [] vornamen = {"Tim"+"Christofer"+"Luca"+"Nils"+"Manuel"+"Chris"+"Tom"};
        String [] nachnamen = {"2Tim"+"2Christofer"+"2Luca"+"2Nils"+"2Manuel"+"2Chris"+"2Tom"};
        String [] [] namen = {vornamen, nachnamen};
        
        for(int i = 0; i<namen.length; i++)
        {
            System.out.println(namen[i][1]);
        }
        for(int i = 0; i<namen.length; i++)
        {
            System.out.println(namen[i][2]);
        }
    }
}