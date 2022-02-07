import java.util.Scanner;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zahlen_Vergleichen
{
    Scanner scan = new Scanner(System.in);
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public Zahlen_Vergleichen()
    {
        System.out.println('\u000c');
        Vergleichen(false);
    }
    public void Vergleichen(boolean intro_überspringen)
    {
        double a =0;
        if(intro_überspringen==false)
        {
            System.out.println("Wie viele Zahlen soll ich vergleichen?");
        }
        int eingabe = scan.nextInt();
        if(eingabe == 2)
        {
            System.out.println("Welche zwei Zahlen soll ich vergleichen?");
            double eingabe1 = scan.nextDouble();
            double eingabe2 = scan.nextDouble();
            Vergleichen2(eingabe1, eingabe2);
        }
        else 
        {
            System.out.println("Ich kann dich nicht verstehen, bitte versuche nochmal.");
            a=1;
            Vergleichen(true);
        }
        if(a==0)
        {
            System.out.println("Möchtest du noch mehr Zahlen vergleichen?");
        }
        while(a ==0)
        {
            char eingabe3 = scan.next().charAt(0);
            if(eingabe3 == 'n')
            {
                a =1;
            }
            else if(eingabe3 == 'y')
            {
                Vergleichen(false);
                a =1;
            }
            else 
            {
                System.out.println("Ich kann dich nicht verstehen, bitte versuche nochmal.");
            }
        }
    }
    public void Vergleichen2(double a, double b)
    {
        if(b>a)
        {
            double c=b;
            b=a;
            a=c;
        }
        System.out.println(a+" ist größer als "+b+".");
    }
}
