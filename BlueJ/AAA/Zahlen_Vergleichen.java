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
        else if(eingabe == 3)
        {
            System.out.println("Welche drei Zahlen soll ich vergleichen?");
            double eingabe1 = scan.nextDouble();
            double eingabe2 = scan.nextDouble();
            double eingabe3 = scan.nextDouble();
            Vergleichen3(eingabe1, eingabe2, eingabe3);
        }
        else if(eingabe == 4)
        {
            System.out.println("Welche vier Zahlen soll ich vergleichen?");
            double eingabe1 = scan.nextDouble();
            double eingabe2 = scan.nextDouble();
            double eingabe3 = scan.nextDouble();
            double eingabe4 = scan.nextDouble();
            Vergleichen4(eingabe1, eingabe2, eingabe3, eingabe4);
        }
        else if(eingabe == 10)
        {
            System.out.println("Welche zehn Zahlen soll ich vergleichen?");
            double eingabe1 = scan.nextDouble();
            double eingabe2 = scan.nextDouble();
            double eingabe3 = scan.nextDouble();
            double eingabe4 = scan.nextDouble();
            double eingabe5 = scan.nextDouble();
            double eingabe6 = scan.nextDouble();
            double eingabe7 = scan.nextDouble();
            double eingabe8 = scan.nextDouble();
            double eingabe9 = scan.nextDouble();
            double eingabe10 = scan.nextDouble();
            Vergleichen10(eingabe1, eingabe2, eingabe3, eingabe4, eingabe5, eingabe6, eingabe7, eingabe8, eingabe9, eingabe10);
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
            double i=b;
            b=a;
            a=i;
        }
        System.out.println(a+" ist größer als "+b+".");
    }
    public void Vergleichen3(double a, double b, double c)
    {
        do
        {
            if(b>a)
            {
                double ii=b;
                b=a;
                a=ii;
            }
            if(c>b)
            {
                double ii=c;
                c=b;
                b=ii;
            } 
        } while(c>a|c>b|b>a);
        System.out.println(a+" ist größer als "+b+" ist größer als "+c+".");
    }
    public void Vergleichen4(double a, double b, double c, double d)
    {
        do
        {
            if(b>a)
            {
                double ii=b;
                b=a;
                a=ii;
            }
            if(c>b)
            {
                double ii=c;
                c=b;
                b=ii;
            }
            if(d>c)
            {
                double ii=d;
                d=c;
                c=ii;
            }
        } while(d>c|d>b|d>a|c>b|c>a|b>a);
        System.out.println(a+" ist größer als "+b+" ist größer als "+c+" ist größer als "+d+".");
    }
    public void Vergleichen10(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j)
    {
        do
        {
            if(b>a)
            {
                double ii=b;
                b=a;
                a=ii;
            }
            if(c>b)
            {
                double ii=c;
                c=b;
                b=ii;
            }
            if(d>c)
            {
                double ii=d;
                d=c;
                c=ii;
            }
            if(e>d)
            {
                double ii=e;
                e=d;
                d=ii;
            }
            if(f>e)
            {
                double ii=f;
                f=e;
                e=ii;
            }
            if(g>f)
            {
                double ii=g;
                g=f;
                f=ii;
            }
            if(h>g)
            {
                double ii=h;
                h=g;
                g=ii;
            }
            if(i>h)
            {
                double ii=i;
                i=h;
                h=ii;
            }
            if(j>i)
            {
                double ii=j;
                j=i;
                i=ii;
            }
        } while(j>i|j>h|j>g|j>f|j>e|j>d|j>c|j>b|j>a|i>h|i>g|i>f|i>e|i>d|i>c|i>b|i>a|h>g|h>f|h>e|h>d|h>c|h>b|h>a|g>f|g>e|g>d|g>c|g>b|g>a|f>e|f>d|f>c|f>b|f>a|e>d|e>c|e>b|e>a|d>c|d>b|d>a|c>b|c>a|b>a);
        System.out.println(a+" ist größer als "+b);
        System.out.println(" ist größer als "+c);
        System.out.println(" ist größer als "+d);
        System.out.println(" ist größer als "+e);
        System.out.println(" ist größer als "+f);
        System.out.println(" ist größer als "+g);
        System.out.println(" ist größer als "+h);
        System.out.println(" ist größer als "+i);
        System.out.println(" ist größer als "+j+".");
    }
}
