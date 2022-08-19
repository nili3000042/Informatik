
/**

 * 
 * @author (Master of Schafis) 
 * @version (14.02.2022)
 */
public class Schleifen
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Schleifen
     */
    public Schleifen()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    public static void PrintLine ()
    {
        System.out.println('\u000C'); 
        System.out.println("Der Unterschied zu print ist,");
        System.out.println(" dass es in die nächste Zeile springt.");
    }
    
    public static void Print()
    {
        System.out.println('\u000C'); 
        System.out.print("Der Unterschied zu print Line ist,");
        System.out.print(" dass es in der selben Zeile bleibt.");
    }
    
    public static void Übung()
    {
        System.out.println('\u000C'); 
        for ( int i=0; i<=6; i++)
        {
            System.out.println(i);
        }
    }
    
    public static void Übung2()
    {
        System.out.println('\u000C'); 
        for(int i=0; i<10; i=i+2)
        {
            System.out.println(i+4);
        }
    }
    
    public static void Übung3()
    {
        System.out.println('\u000C'); 
        for(int i=0; i<20; i=i+2)
        {
            System.out.println(i);
        }
    }
    
    public static void Übung4()
    {
        System.out.println('\u000C'); 
        for(int i=1; i<20; i=i+2)
        {
            System.out.println(i);
        }
    }
    
    public static void Übung5(int i)
    {
        System.out.println('\u000C'); 
        for(int j=0; j<=i; j++)
        {
            System.out.println(j);
        }
    }
    
    public static void Übung6()
    {
        System.out.println('\u000C'); 
        for(int i=1; i<=10; i++)
        {
            for (int j=1; j<=10; j++)
            {
                System.out.println(i+ " * " +j+ " = " +i*j);
            }
            System.out.println(" ");
        }
    }
    
    public static void Übung7()
    {
        System.out.println('\u000C'); 
        for (int i=1; i<=3; i++)
        {
            System.out.println("XXXXX");
        }
    }
    
    public static void Übung8()
    {
        System.out.println('\u000C'); 
        for ( int i=1; i<=2; i++)
        {
            for ( int j=1; j==1; j++)
            {
                System.out.println("10101");
            }
            System.out.println("01010");
        }
    }
    
    public static void Übung9()
    {
        System.out.println('\u000C'); 
        for ( int i=1; i<=5; i++)
        {
            for ( int j=1; j<=i; j++)
            {
                System.out.print("X");
            }
            System.out.println(" ");
        }
    }
    
    public static void Übung10()
    {
        System.out.println('\u000C'); 
        for ( int i=1; i<=9; i++)
        {
            if(i<=5)
            {
                for ( int j=1; j<=i; j++)
                {
                    System.out.print("X");
                }
                System.out.println(" ");
            }
            else
            {
                 for ( int j=10; j>i; j--)
                {
                    System.out.print("X");
                }
                System.out.println(" ");
            }
        }
    }
}
