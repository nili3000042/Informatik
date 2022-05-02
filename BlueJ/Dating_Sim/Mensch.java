import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Mensch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mensch
{
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    int IQ = 50;
    int Aussehen = 50;
    int Charm = 50;
    char beziehungsstatus = 's';
    String Vorname;
    String Nachname;
    int Alter;
    int Größe;
    boolean Is_Frau;
    boolean Mag_Mann;
    boolean Mag_Frau;
    Mensch Partner;
    public Mensch(String vorname,String nachname,boolean is_Frau,boolean mag_Frau,boolean mag_Mann,int alter,int größe)
    {
        Größe = größe;
        Vorname = vorname;
        Nachname = nachname;
        Is_Frau = is_Frau;
        Mag_Mann = mag_Mann;
        Mag_Frau = mag_Frau;
        Alter = alter;
    }
    public String wie_heißt_du()
    {
        return Vorname+" "+Nachname;
    }
    public void aaaa(Mensch AA)
    {
        System.out.println(AA.Nachname);
    }
}
