import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Scanner_While_Bsp_Chose extends Scanner_While_Bsp
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
    public Scanner_While_Bsp_Chose()
    {
        System.out.println('\u000c');
        Chose();
    }
    public void Chose()
    {
        System.out.println("Was soll die maximale Zahl sein?");
        max_zahl = scan.nextInt();
        System.out.println("Möchtest du deine Versuche begrenzen?");
        for(int a=0;a==0;)
        {
            char eingabe_versuche = scan.next().charAt(0);
            if(eingabe_versuche == 'y')
            {
                System.out.println("Wieviele Versuche möchtest du haben?");
                start_versuche = scan.nextInt();
                System.out.println("Möchtest du Tips aktivieren?");
                for(int i=0;i==0;)
                {
                    char eingabe_tips = scan.next().charAt(0);
                    if(eingabe_tips == 'y')
                    {
                        Raten_limit_tips();
                        i++;
                    }
                    else if(eingabe_tips == 'n')
                    {
                        Raten_limit();
                        i++;
                    }
                    else
                    {
                        System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
                    }
                }
                a++;
            }
            else if(eingabe_versuche == 'n')
            {
                System.out.println("Möchtest du Tips aktivieren?");
                for(int i=0;i==0;)
                {
                    char eingabe_tips = scan.next().charAt(0);
                    if(eingabe_tips == 'y')
                    {
                        Raten_tips();
                        i++;
                    }
                    else if(eingabe_tips == 'n')
                    {
                        Raten();
                        i++;
                    }
                    else
                    {
                        System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
                    }
                }
                a++;
            }
            else
            {
                System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
            } 
        }
        System.out.println("Möchtest du nochmal Spielen?");
        for(int i=0;i==0;)
        {
            char eingabe_tips = scan.next().charAt(0);
            if(eingabe_tips == 'y')
            {
                System.out.println('\u000c');
                Chose();
            }
            else if(eingabe_tips == 'n')
            {
                System.out.println("Schöö");
            }
            else
            {
                System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
            }
        }
    }
}
