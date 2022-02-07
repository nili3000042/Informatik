import java.util.Scanner;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Altersabfrage
{
    Scanner scan = new Scanner(System.in);
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char  eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public Altersabfrage()
    {
        System.out.println('\u000c');
        System.out.println("Hallo, befor du in den Club kannst must du uns zwei Fragen beantworten.");
        System.out.println("Welches Geschlecht bist du? w, m, d");
        char  eingabe1 = scan.next().charAt(0);
        System.out.println("Was ist dein ALter?");
        double eingabe2 = scan.nextDouble();
        Response(eingabe1, eingabe2);
    }
    public void Response(char Geschlecht, double Alter)
    {
        if (Geschlecht == 'm' && Alter <18)
        {
            System.out.println("Hallo Junge, du bist zu jung.");
        }
        else if (Geschlecht == 'm' && Alter >=18)
        {
            System.out.println("Hallo der Herr, treten sie ein.");
        }
        else if (Geschlecht == 'w' && Alter <18)
        {
            System.out.println("Hallo Mädchen, du bist zu jung.");
        }
        else if (Geschlecht == 'w' && Alter >=18)
        {
            System.out.println("Hallo die Dame, treten sie ein.");
        }
        else if (Geschlecht == 'd' && Alter <18)
        {
            System.out.println("Hallo, du bist zu jung.");
        }
        else if (Geschlecht == 'd' && Alter >=18)
        {
            System.out.println("Hallo, treten sie ein");
        }
    }
}
