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
    String []M_V_Namen ={"Matteo","Noah","Leon","Felix","Paul","Elias","Theo","Finn","Ben","Jonas","Luca","Emil","Henry","Leo","Louis","Jakob","Lukas","Anton","Moritz","Maximilian","Liam","Max","Lio","Levi","Jonah","Oskar","Samuel","David","Leonard","Milan","Valentin","Aaron","Julian","Linus","Tom","Karl","Alexander","Raphael","Mika","Niklasl","Nico","Mats","Fabian","Erik","Toni","Tim","Marlon","Joshua","Milo","Philipp","Kilian","Hannes","Vincent","Jonathan","Lian","Gabriel","Konstantin","Carlo","Simon","Tobiasneu","Johannes","Luke","Theodor","Till","Adrian","Jannis","Johann","Julius","Jannikneu","Mattisneu","Matti","Ole","Lenny","Jorisneu","Fiete","Florian","Malte","Leano","Jan","Benedikt","Nickneu","Arthur","Lias","Malik","Emilio","Phil","Maxim","Levin","Benjamin","Matthiasneu","Samneu","Oliver","Pepe","Leopold","Timo","Nils","Bruno","Adamneu","Robin","Kian"};
    String []F_V_Namen = {"Hannah","Emma","Emilia","Ella","Mia","Lea","Marie","Lina","Anna","Mila","Luisa","Clara","Leni","Lia","Sophia","Emily","Ida","Lena","Lara","Leonie","Frieda","Charlotte","Sophie","Johanna","Amelie","Maja","Mathilda","Lilly","Nora","Juna","Laura","Romy","Lotta","Nele","Sara","Zoe","Paula","Marlene","Elisa","Elina","Mara","Mira","Melina","Theresa","Valentina","Paulina","Rosalie","Helena","Elena","Merle","Luna","Alina","Thea","Carla","Victoria","Malia","Antonia","Tilda","Finja","Mina","Olivia","Anni","Isabella","Marthaneu","Josephine","Fiona","Ronja","Pia","Carlotta","Pauline","Julia","Luise","Haileyneu","Luananeu","Jana","Alyaneu","Annika","Amira","Linda","Maleaneu","Elisabethneu","Katharina","Livia","Amalia","Malinaneu","Lisa","Ava","Emmineu","Lotte","Eva","Rosa","Jule","Alma","Marlaneu","Milena","Eleaneu","Maria","Stellaneu","Livneu","Aurelia"};
    String []N_Namen = {"Müller","Schmidt","Schneider","Fischer","Weber","Meyer","Wagner","Becker","Schulz","Hoffmann","Schäfer","Koch","Bauer","Richter","Klein","Wolf","Schröder","Neumann","Schwarz","Zimmermann","Braun","Krüger","Hofmann","Hartmann","Lange","Schmitt","Werner","Schmitz","Krause","Meier","Lehmann","Schmid","Schulze","Maier","Köhler","Herrmann","König","Walter","Mayer","Huber","Kaiser","Fuchs","Peters","Lang","Scholz","Möller","Weiß","Jung","Hahn","Schubert","Vogel","Friedrich","Keller","Günther","Frank","Berger","Winkler","Roth","Beck","Lorenz","Baumann","Franke","Albrecht","Schuster","Simon","Ludwig","Böhm","Winter","Kraus","Martin","Schuhmacher","Krämer","Vogt","Stein","Jäger","Otto","Sommer","Groß","Seidel","Heinrich","Brand","Haas","Schreiber","Graf","Schulte","Dietrich","Ziegler","Kuhn","Kühn","Pohl","Engel","Horn","Busch","Bergmann","Thomas","Voigt","Sauer","Arnold","Wolff","Pfeiffer"};
    int IQ = rnd.nextInt(21)+40;
    int Aussehen = rnd.nextInt(21)+40;
    int Charm = rnd.nextInt(21)+40;
    int Anspruch_an_Partner = rnd.nextInt(21)+40;
    int Euro = rnd.nextInt(2001)+4000;
    int Alter = rnd.nextInt(100)+18;
    int Größe = rnd.nextInt(100)+125;
    int Alkoholpegel = 0;
    boolean Is_Frau = rnd.nextBoolean();
    boolean Mag_Mann = rnd.nextBoolean();
    boolean Mag_Frau = rnd.nextBoolean();
    String Vorname;
    String Nachname = N_Namen[rnd.nextInt(N_Namen.length)];
    Mensch Partner;
    public Mensch()
    {
        if(Is_Frau == true)
        {
            Vorname = F_V_Namen[rnd.nextInt(F_V_Namen.length)];
        }
        else
        {
            Vorname = M_V_Namen[rnd.nextInt(M_V_Namen.length)];
        }
        if(Mag_Mann==false&&Mag_Frau==false&&Is_Frau==true&&rnd.nextInt(102)<=100)
        {
            Mag_Mann=true;
        }
        else if(Mag_Mann==false&&Mag_Frau==false&&Is_Frau==false&&rnd.nextInt(102)<=100)
        {
            Mag_Frau=true;
        }
    }
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
    public void mensch()
    {
        new Mensch();
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
