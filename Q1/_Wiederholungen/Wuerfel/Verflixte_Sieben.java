import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Verflixte_Sieben.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Verflixte_Sieben
{
    int anzahl_spieler = 2;
    String name[] = new String[anzahl_spieler];
    int pott[] = {1000,1000};
    int einsatz[] = new int[anzahl_spieler];
    Random rnd = new Random();
    Scanner scan = new Scanner(System.in);
    public Verflixte_Sieben()
    {
        System.out.println('\u000c');
        System.out.println("____   ____                _____ .__   .__           __                 _________.__        ___.                     ");
        System.out.println("\\   \\ /   / ____ _______ _/ ____\\|  |  |__|___  ____/  |_   ____       /   _____/|__|  ____ \\_ |__    ____    ____   ");
        System.out.println(" \\   Y   /_/ __ \\\\_  __ \\\\   __\\ |  |  |  |\\  \\/  /\\   __\\_/ __ \\      \\_____  \\ |  |_/ __ \\ | __ \\ _/ __ \\  /    \\  ");
        System.out.println("  \\     / \\  ___/ |  | \\/ |  |   |  |__|  | >    <  |  |  \\  ___/      /        \\|  |\\  ___/ | \\_\\ \\\\  ___/ |   |  \\ ");
        System.out.println("   \\___/   \\_____>|__|    |__|   |____/|__|/__/\\__\\ |__|   \\_____>    /_________/|__| \\_____>|_____/ \\_____>|___|  / ");
        
    }
}
