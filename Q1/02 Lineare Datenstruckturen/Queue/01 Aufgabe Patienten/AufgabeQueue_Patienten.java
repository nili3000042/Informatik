import java.util.*;
/**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 **
 * @version 2014-03-13
 */
public class AufgabeQueue_Patienten{
    Queue<String> wartezimmer;
    Queue<String> hold;
    Random rnd= new Random();
    String []V_Namen ={"Matteo","Noah","Leon","Felix","Paul","Elias","Theo","Finn","Ben","Jonas","Luca","Emil","Henry","Leo","Louis","Jakob","Lukas","Anton","Moritz","Maximilian","Liam","Max","Lio","Levi","Jonah","Oskar","Samuel","David","Leonard","Milan","Valentin","Aaron","Julian","Linus","Tom","Karl","Alexander","Raphael","Mika","Niklasl","Nico","Mats","Fabian","Erik","Toni","Tim","Marlon","Joshua","Milo","Philipp","Kilian","Hannes","Vincent","Jonathan","Lian","Gabriel","Konstantin","Carlo","Simon","Tobiasneu","Johannes","Luke","Theodor","Till","Adrian","Jannis","Johann","Julius","Jannikneu","Mattisneu","Matti","Ole","Lenny","Jorisneu","Fiete","Florian","Malte","Leano","Jan","Benedikt","Nickneu","Arthur","Lias","Malik","Emilio","Phil","Maxim","Levin","Benjamin","Matthiasneu","Samneu","Oliver","Pepe","Leopold","Timo","Nils","Bruno","Adamneu","Robin","Kian","Hannah","Emma","Emilia","Ella","Mia","Lea","Marie","Lina","Anna","Mila","Luisa","Clara","Leni","Lia","Sophia","Emily","Ida","Lena","Lara","Leonie","Frieda","Charlotte","Sophie","Johanna","Amelie","Maja","Mathilda","Lilly","Nora","Juna","Laura","Romy","Lotta","Nele","Sara","Zoe","Paula","Marlene","Elisa","Elina","Mara","Mira","Melina","Theresa","Valentina","Paulina","Rosalie","Helena","Elena","Merle","Luna","Alina","Thea","Carla","Victoria","Malia","Antonia","Tilda","Finja","Mina","Olivia","Anni","Isabella","Marthaneu","Josephine","Fiona","Ronja","Pia","Carlotta","Pauline","Julia","Luise","Haileyneu","Luananeu","Jana","Alyaneu","Annika","Amira","Linda","Maleaneu","Elisabethneu","Katharina","Livia","Amalia","Malinaneu","Lisa","Ava","Emmineu","Lotte","Eva","Rosa","Jule","Alma","Marlaneu","Milena","Eleaneu","Maria","Stellaneu","Livneu","Aurelia"};
    String []N_Namen = {"Müller","Schmidt","Schneider","Fischer","Weber","Meyer","Wagner","Becker","Schulz","Hoffmann","Schäfer","Koch","Bauer","Richter","Klein","Wolf","Schröder","Neumann","Schwarz","Zimmermann","Braun","Krüger","Hofmann","Hartmann","Lange","Schmitt","Werner","Schmitz","Krause","Meier","Lehmann","Schmid","Schulze","Maier","Köhler","Herrmann","König","Walter","Mayer","Huber","Kaiser","Fuchs","Peters","Lang","Scholz","Möller","Weiß","Jung","Hahn","Schubert","Vogel","Friedrich","Keller","Günther","Frank","Berger","Winkler","Roth","Beck","Lorenz","Baumann","Franke","Albrecht","Schuster","Simon","Ludwig","Böhm","Winter","Kraus","Martin","Schuhmacher","Krämer","Vogt","Stein","Jäger","Otto","Sommer","Groß","Seidel","Heinrich","Brand","Haas","Schreiber","Graf","Schulte","Dietrich","Ziegler","Kuhn","Kühn","Pohl","Engel","Horn","Busch","Bergmann","Thomas","Voigt","Sauer","Arnold","Wolff","Pfeiffer"};

    public AufgabeQueue_Patienten(){
        wartezimmer = new Queue<String>();
        hold = new Queue<String>();
        wartezimmerFuellen();
        System.out.println('\u000c');
    }

    public void wartezimmerFuellen(){
        for(int i = 0;i<50;i++)
        {
            wartezimmer.enqueue(V_Namen[rnd.nextInt(V_Namen.length)]+" "+N_Namen[rnd.nextInt(N_Namen.length)]);
        }
    }

    public void ausgebenWartezimmer(){
        System.out.println(wartezimmer.front());
    }

    public void wartezimmerLeeren(){
        int zähler = 1;
        while(!wartezimmer.isEmpty())
        {
            System.out.println("Position "+zähler+" : "+wartezimmer.front());
            zähler++;
            wartezimmer.dequeue();
        }
    }

    public void wartezimmerAuflisten(){
        int zähler = 1;
        while(!wartezimmer.isEmpty())
        {
            System.out.println("Position "+zähler+" : "+wartezimmer.front());
            hold.enqueue(wartezimmer.front());
            zähler++;
            wartezimmer.dequeue();
        }
        while(!hold.isEmpty())
        {
            wartezimmer.enqueue(hold.front());
            hold.dequeue();
        }
    }
}
