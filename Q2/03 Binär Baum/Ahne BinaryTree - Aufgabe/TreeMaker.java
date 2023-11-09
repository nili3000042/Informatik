import java.util.*;
/**
 * Beschreiben Sie hier die Klasse TreeMaker.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TreeMaker
{
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    public TreeMaker()
    {
        println("Baue Integer Baum?");
        if(scan.next().charAt(0) == 'y')
        {
            make_note_int();
        }
    }
    
    private void make_note_int()
    {
        println("Welchen Wert hat diese Wurzel?");
        int wert = scan.nextInt();
        println("Hat Wurzel linke weiterführung?");
        if(scan.next().charAt(0) == 'y')
        {
            make_note_int();
        }
        println("Hat Wurzel rechte weiterführung?");
        if(scan.next().charAt(0) == 'y')
        {
            make_note_int();
        }
    }
    
    private  void print(String a)
    {
        System.out.print(a);
    }
    private  void println(String a)
    {
        System.out.println(a);
    }
}
