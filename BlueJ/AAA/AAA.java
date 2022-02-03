import java.util.Scanner;
/**
 * Beschreiben Sie hier die Klasse AAA.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AAA
{
    Scanner scan = new Scanner(System.in);
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    /**
     * Konstruktor für Objekte der Klasse AAA
     */
    public AAA()
    {
        System.out.println('\u000c');
        System.out.println("Wie heist du?");
        String eingabe = scan.nextLine();
        Begrüßung(eingabe);
        Rechnen();
    }
    public void Rechnen()
    {
        System.out.println("Was soll ich Rechnen?");
        double eingabe1 = scan.nextDouble();
        char Methode = scan.next().charAt(0);
        if(Methode == '+')
        {
            double eingabe2 = scan.nextDouble();
            plus(eingabe1,eingabe2);
        }
        else if(Methode == '-')
        {
            double eingabe2 = scan.nextDouble();
            minus(eingabe1,eingabe2);
        }
        else if(Methode == '*')
        {
            double eingabe2 = scan.nextDouble();
            mal(eingabe1,eingabe2);
        }
        else if(Methode == '/')
        {
            double eingabe2 = scan.nextDouble();
            geteilt(eingabe1,eingabe2);
        }
        else 
        {
            System.out.println("Ich kann dich nicht verstehen, bitte versuche nochmal.");
            Rechnen();
        }
        System.out.println("Soll ich nochmal Rechnen?");
        double a =0;
        while(a ==0)
        {
            char eingabe = scan.next().charAt(0);
            if(eingabe == 'n')
            {
                a =1;
            }
            else if(eingabe == 'y')
            {
                Rechnen();
                a =1;
            }
            else 
            {
                System.out.println("Ich kann dich nicht verstehen, bitte versuche nochmal.");
            }
        }
    }
    public static void plus(double a, double b)
    {
        double c = a+b;
        System.out.println("=");
        System.out.println(c);
    }
    public static void minus(double a, double b)
    {
        double c = a-b;
        System.out.println("=");
        System.out.println(c);
    }
    public static void mal(double a,double b)
    {
        double c = a*b;
        System.out.println("=");
        System.out.println(c);
    }
    public static void geteilt(double a, double b)
    {
        double c = a/b;
        System.out.println("=");
        System.out.println(c);
    }
    public static void hallo(String Ausgabe)
    {
        System.out.println(Ausgabe);
    }
    public static void YEAT(double input)
    {
        double a=0;
        for(double i=0;i<input+1;i++)
        {
            a=a+i;
        }
        System.out.println(a);
    }
    public static void Begrüßung(String Name)
    {
        System.out.println("Hallo "+Name+", wie geht es dir?");
    }
}
