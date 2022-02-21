import java.util.Scanner;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Verschachtelte_Schleifen_Bsp
{
    Scanner scan = new Scanner(System.in);
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public Verschachtelte_Schleifen_Bsp()
    {
        System.out.println('\u000c');
        einmaleins();
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Wie hoch soll das Rechteck sein?");
        double eingabe1 = scan.nextDouble();
        System.out.println("Wie breit soll das Rechteck sein?");
        double eingabe2 = scan.nextDouble();
        XRechteck(eingabe1,eingabe2);
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Wie hoch soll das Rechteck sein?");
        double eingabe3 = scan.nextDouble();
        System.out.println("Wie breit soll das Rechteck sein?");
        double eingabe4 = scan.nextDouble();
        Rechteck01(eingabe3,eingabe4);
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Wie  groß soll das Dreieck sein?");
        double eingabe5 = scan.nextDouble();
        Dreieck1(eingabe5);
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Wie  groß soll das Dreieck sein?");
        double eingabe6 = scan.nextDouble();
        Dreieck2(eingabe6);
    }
    public void einmaleins()
    {
        for(double i=1;i<=10;i++)
        {
            for(double j=1;j<=10;j++)
            {
                System.out.println(i+" * "+j+" = "+i*j);
            }
            System.out.println("");
        }
    }
    public void XRechteck(double höhe, double länge)
    {
        for(double i=1;i<=höhe;i++)
        {
            for(double j=1;j<=länge;j++)
            {
                System.out.print("X");
            }
            System.out.println("");
        }
    }
    public void Rechteck01(double höhe, double länge)
    {
        double a=0;
        for(double i=1;i<=höhe;i++)
        {
            if(a==0)
            {
                int b=0;
                for(double j=1;j<=länge;j++)
                {
                    if(b==0)
                    {
                        System.out.print("1");
                        b =1;
                    }
                    else if(b==1)
                    {
                        System.out.print("0");
                        b =0;
                    }
                }
                a =1;
            }
            else if(a==1)
            {
                int b=0;
                for(double j=1;j<=länge;j++)
                {
                    if(b==0)
                    {
                        System.out.print("0");
                        b =1;
                    }
                    else if(b==1)
                    {
                        System.out.print("1");
                        b =0;
                    }
                }
                a =0;
            }
            System.out.println("");
        }
    }
    public void Dreieck1(double größe)
    {
        for(double i=1;i<=größe;i++)
        {
            for(double j=1;j<=i;j++)
            {
                System.out.print("X");
            }
            System.out.println("");
        }
    }
    public void Dreieck2(double größe)
    {
        for(double i=1;i<=(größe+größe-1);i++)
        {
            if(i<=größe)
            {
                for(double j=1;j<=i;j++)
                {
                    System.out.print("X");
                }
                System.out.println("");
            }
            else
            {
                for(double j=1;j<(größe*2);j++)
                {
                    System.out.print("X");
                }
                System.out.println("");                
            }
        }
    }
}
