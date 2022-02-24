import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Scanner_Bsp
{
    Scanner scan = new Scanner(System.in);
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public Scanner_Bsp()
    {
        System.out.println('\u000c');
        hallo();
    }
    public void hallo()
    {
        System.out.println("Wie heißt du?");
        String name = scan.nextLine();
        System.out.println("Woher kommst du?");
        String Wohnort = scan.nextLine();
        System.out.println("Wie alt bist du?");
        double Alter = scan.nextDouble();
        System.out.println("Du bist "+name+", "+Alter+" Jahre, aus "+Wohnort+" .");
    }
}
