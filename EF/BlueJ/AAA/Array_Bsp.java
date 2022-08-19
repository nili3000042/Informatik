import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Array_Bsp
{
    Scanner scan = new Scanner(System.in);
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    public Array_Bsp()
    {
        System.out.println('\u000c');
    }
    public void Bsp1()
    {
        String[] name={"Manuel","Nadine","Anne","Franz","Leni"};
        int[] alter=new int [5];
        int[] startpos=new int[5];
        alter[0]=30;
        alter[1]=31;
        alter[2]=64;
        alter[3]=67;
        alter[4]=2;
        
        for (int i=0;i<startpos.length;i++)
        {
            startpos[i]=i+1;
        }
        for (int i=0;i<name.length;i++)
        {
            System.out.println(name[i]+" Vortkamp ist "+alter[i]+" Jahre alt und startet heute auf Position "+startpos[i]);
        }
    }
}
