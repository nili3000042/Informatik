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
    int max_zahl = 100;
    int start_versuche = 10;
    public Scanner_While_Bsp()
    {
        System.out.println('\u000c');
        System.out.println("Was soll die maximale Zahl sein?");
        max_zahl = scan.nextInt();
        System.out.println("Wieviele Versuche möchtest du haben?");
        start_versuche = scan.nextInt();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Raten_tips();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Raten();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Raten_limit_tips();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Raten_limit();
    }
    public void Raten_tips()
    {
        double lösung = rnd.nextInt(max_zahl+1);
        double raten = 1111111;
        System.out.println("Lass uns ein Spiel spielen.");
        System.out.println("Ich habe mir eine Zufählige Zahl zwischen 0 und "+max_zahl+" ausgedacht,");
        System.out.println("und du musst sie erraten.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung)
        {
            raten = scan.nextDouble();
            if(raten==lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
            }
            else if(raten<lösung)
            {
                System.out.println("Schade, deine Zahl ist zu klein, versuche nochmal.");
            }
            else if(raten>lösung)
            {
                System.out.println("Schade, deine Zahl ist zu groß, versuche nochmal.");
            }
        }
    }
    public void Raten()
    {
        double lösung = rnd.nextInt(max_zahl+1);
        double raten = 1111111;
        System.out.println("Dass war ja einfach, dieses mal gebe ich dir keine Tips,");
        System.out.println("alle andere bleibt gleich.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung)
        {
            raten = scan.nextDouble();
            if(raten==lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
            }
            else
            {
                System.out.println("Schade, dass ist nicht richtig, versuche nochmal.");
            }
        }
    }
    public void Raten_limit_tips()
    {
        double lösung = rnd.nextInt(max_zahl+1);
        double raten = 1111111;
        int versuche = start_versuche;
        System.out.println("Dass war ja einfach, dieses mal musst du dass in "+start_versuche+" Versuchen schaffen,");
        System.out.println("aber ich bin fair, ich werde dir wieder Tips geben,");
        System.out.println("alle andere bleibt gleich.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung&&versuche>0)
        {
            raten = scan.nextDouble();
            if(raten==lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
            }
            else if(raten<lösung)
            {
                System.out.println("Schade, deine Zahl ist zu klein, versuche nochmal.");
                versuche--;
                System.out.println("Du hast noch "+versuche+" Versuche.");
            }
            else if(raten>lösung)
            {
                System.out.println("Schade, deine Zahl ist zu groß, versuche nochmal.");
                versuche--;
                System.out.println("Du hast noch "+versuche+" Versuche.");
            }
        }
        if(versuche<=0)
        {
            System.out.println("Ha du hast keine Versuche mehr, du hast verloren.");
            System.out.println("Meine Zahl wäre "+lösung+" gewesen");
            System.exit(0);
        }
    }
    public void Raten_limit()
    {
        double lösung = rnd.nextInt(max_zahl+1);
        double raten = 1111111;
        int versuche = start_versuche;
        System.out.println("Dass war ja einfach, dieses mal gebe ich dir keine Tips,");
        System.out.println("alle andere bleibt gleich.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung&&versuche>0)
        {
            raten = scan.nextDouble();
            if(raten==lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
            }
            else
            {
                System.out.println("Schade, dass ist nicht richtig, versuche nochmal.");
                versuche--;
                System.out.println("Du hast noch "+versuche+" Versuche.");
            }
        }
        if(versuche<=0)
        {
            System.out.println("Ha du hast keine Versuche mehr, du hast verloren.");
            System.out.println("Meine Zahl wäre "+lösung+" gewesen");
            System.exit(0);
        }
    }
}
