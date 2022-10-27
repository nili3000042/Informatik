import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wuerfel
{
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public static void wuerfeln()
    {
        System.out.println('\u000c');
        System.out.println("Hallo beim Würfel simmulator 3000!!!!!");
        char a= 'n';
        double[][] Würfel;
        do{
            System.out.println("Wieviele Seiten soll ihr Würfel haben?");
            
        }while(a!='y');
    }
}
