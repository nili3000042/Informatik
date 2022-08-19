import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Sort_Bsp
{
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    int [] input=new int[100];
    public Sort_Bsp()
    {
        System.out.println('\u000c');
        for(int i=1;i<=input.length;i++)
        {
            input[i-1] = rnd.nextInt(1000000);
        }
        Display_Array_input();
    }
    public void Display_Array_input()
    {
        System.out.println("Input:");
        int a = 0;
        for(int i=0;i+1<=input.length;i++)
        {
            if(input[i]<10)
            {
                String nullen = "00000";
                if(i<10)
                {
                    System.out.print("0"+i+": "+nullen+input[i]+"; ");
                }
                else
                {
                    System.out.print(i+": "+nullen+input[i]+"; ");
                }
            }
            else if(input[i]<100)
            {
                String nullen = "0000";
                if(i<10)
                {
                    System.out.print("0"+i+": "+nullen+input[i]+"; ");
                }
                else
                {
                    System.out.print(i+": "+nullen+input[i]+"; ");
                }
            }
            else if(input[i]<1000)
            {
                String nullen = "000";
                if(i<10)
                {
                    System.out.print("0"+i+": "+nullen+input[i]+"; ");
                }
                else
                {
                    System.out.print(i+": "+nullen+input[i]+"; ");
                }
            }
            else if(input[i]<10000)
            {
                String nullen = "00";
                if(i<10)
                {
                    System.out.print("0"+i+": "+nullen+input[i]+"; ");
                }
                else
                {
                    System.out.print(i+": "+nullen+input[i]+"; ");
                }
            }
            else if(input[i]<100000)
            {
                String nullen = "0";
                if(i<10)
                {
                    System.out.print("0"+i+": "+nullen+input[i]+"; ");
                }
                else
                {
                    System.out.print(i+": "+nullen+input[i]+"; ");
                }
            }
            else
            {
                String nullen = "";
                if(i<10)
                {
                    System.out.print("0"+i+": "+nullen+input[i]+"; ");
                }
                else
                {
                    System.out.print(i+": "+nullen+input[i]+"; ");
                }
            }
            a++;
            if(a==5)
            {
                System.out.println("");
                a=0;
            }
        }
        System.out.println("");
    }
    public void Insertion_Sort()
    {
        
    }
}
