import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Scanner_While_Bsp
{
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public Scanner_While_Bsp()
    {
        System.out.println('\u000c');
        Raten();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Raten_limit();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Raten_tips();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Raten_limit_tips();
    }
    public void Raten()
    {
        double lösung = rnd.nextInt(101);
        double raten = 1111111;
        System.out.println("Lass uns ein Spiel spielen.");
        System.out.println("Ich habe mir eine Zufählige Zahl zwischen 0 und 100 ausgedacht,");
        System.out.println("und du musst sie erraten.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung)
        {
            raten = scan.nextDouble();
            if(raten=lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
            }
            else
            {
                System.out.println("Schade, dass ist nicht richtig, versuche nochmal.");
            }
        }
    }
    public void Raten_limit()
    {
        double lösung = nextInt(101);
        double raten = 1111111;
        int versuche = 10;
        System.out.println("Dass war ja einfach, dieses mal musst du dass in 10 Versuchen schaffen,");
        System.out.println("alle andere bleibt gleich.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung)
        {
            raten = scan.nextDouble();
            if(raten=lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
            }
            else
            {
                System.out.println("Schade, dass ist nicht richtig, versuche nochmal.");
                versuche--;
            }
        }
    }
    public void Raten_tips()
    {
        double lösung = rnd.nextDouble()*10;
        double raten = 1111111;
    }
    public void Raten_limit_tips()
    {
        double lösung = rnd.nextDouble()*10;
        double raten = 1111111;
    }
}
