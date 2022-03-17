import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Scanner_While_Bsp_Game
{
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    //String eingabe = scan.nextLine();
    //double eingabe = scan.nextDouble();
    //char eingabe = scan.next().charAt(0);
    //System.out.println("Was soll ich Rechnen?");
    //System.out.println('\u000c');
    int max_zahl = 100;
    int start_versuche = 10;
    int punkte_m = 0;
    int punkte_c = 0;
    char eingabe_tips = 'y';
    char eingabe_versuche = 'y';
    int Spieleranzahl = 0;
    int max_score = 0;
    int pos_max_p = -1;
    String [] Spieler =new String[99];
    int[] Score =new int[99];
    public Scanner_While_Bsp_Game()
    {
        System.out.println('\u000c');
        System.out.println("Möchtest du denn T = Turniermodus(2-99p), C = Gegencommodus(1p) oder Z = Computerratenmodus(1p) Spielen?");
        for(int i=0;i==0;)
        {
            char eingabe = scan.next().charAt(0);
            if(eingabe == 'C')
            {
                Chose(false);
                i++;
            }
            else if(eingabe == 'T')
            {
                Turnier(false);
                i++;
            }
            else if(eingabe == 'Z')
            {
                Computerraten();
                i++;
            }
            else
            {
                System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit den Angegebenen Zeichen.");
            }
        }
    }
    public void Computerraten()
    {
        
    }
    public void Turnier(boolean fast_start)
    {
        System.out.println("Du spielst jetzt den TURNIERMODUS.");
        if(fast_start==false)
        {
           Turnier_Settings(); 
        }
        Turnier_Game();
        System.out.println('\u000c');
        System.out.println("Möchtet ihr nochmal spielen?");
        for(int i=0;i==0;)
        {
            char eingabe = scan.next().charAt(0);
            if(eingabe == 'y')
            {
                System.out.println("Möchtet ihr die Einstellungen ändern?");
                for(int j=0;i==0;)
                {
                    char eingabe1 = scan.next().charAt(0);
                    if(eingabe1 == 'y')
                    {
                        Turnier_Settings();
                        Turnier(true);
                        i++;
                    }
                    else if(eingabe1=='n')
                    {
                        Turnier(true);
                        i++;
                    }
                    else
                    {
                        System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
                    }
                }
            }
            else if(eingabe == 'n')
            {
                System.out.println("Schöö");
                i++;
            }
            else
            {
                System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
            }
        }
    }
    public void Turnier_Settings()
    {
        System.out.println("Was soll die maximale Zahl sein?");
        max_zahl = scan.nextInt();
        System.out.println("Möchtest du deine Versuche begrenzen?");
        for(int a=0;a==0;)
        {
            eingabe_versuche = scan.next().charAt(0);
            if(eingabe_versuche == 'y')
            {
                System.out.println("Wieviele Versuche möchtest du haben?");
                start_versuche = scan.nextInt();
                System.out.println("Möchtet ihr Tips aktivieren?");
                for(int i=0;i==0;)
                {
                    eingabe_tips = scan.next().charAt(0);
                    if(eingabe_tips == 'y'|eingabe_tips=='n')
                    {
                        i++;
                    }
                    else
                    {
                        System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
                    }
                }
                a++;
            }
            else if(eingabe_versuche == 'n')
            {
                start_versuche=1999999999;
                System.out.println("Möchtet ihr Tips aktivieren?");
                for(int i=0;i==0;)
                {
                    eingabe_tips = scan.next().charAt(0);
                    if(eingabe_tips == 'y'|eingabe_tips=='n')
                    {
                        i++;
                    }
                    else
                    {
                        System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
                    }
                }
                a++;
            }
            else
            {
                System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
            }
        }
        System.out.println("Wieviele Spieler soll es geben?");
        for(int i=0;i==0;)
        {
            Spieleranzahl = scan.nextInt();
            if(1<Spieleranzahl&&Spieleranzahl<100)
            {
                i++;
            }
            else
            {
                System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit einer Zahl zwischen 2 und 99 an.");
            }
        }
        for(int i=1;i<=Spieleranzahl;i++)
        {
            System.out.println("Wie heißt Spieler "+i+"?");
            Spieler[i-1] = scan.next();
        }
    }
    public void Turnier_Game()
    {
        for(int i=0; i<Spieleranzahl;i++)
        {
            System.out.println(Spieler[i]+" fängt an.");
            Score[i] = Turnier_Round();
            if(Score[i]< max_score)
            {
                max_score= Score[i];
                pos_max_p= i;
            }
            System.out.println(Spieler[i]+" hat "+Score[i]+" Versuche gebraucht.");
        }
        System.out.println(Spieler[pos_max_p]+" hat mit "+Score[pos_max_p]+" Versuchen gewonnen!!!");
        System.out.println("Herzlichen Glückwunsch");
        String eingabe = scan.next();
    }
    public int Turnier_Round()
    {
        double lösung = rnd.nextInt(max_zahl+1);
        double raten = -1;
        int versuche =0;
        System.out.println("Lass uns ein Spiel spielen.");
        System.out.println("Ich habe mir eine Zufählige Zahl zwischen 0 und "+max_zahl+" ausgedacht,");
        System.out.println("und du musst sie erraten.");
        if(eingabe_versuche=='y')
        {
            System.out.println("Du hast "+start_versuche+" Versuche.");
        }
        if(eingabe_tips=='y')
        {
            System.out.println("Weil ich nett bin, werde ich dir Tips geben.");
        }
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung&&versuche<start_versuche)
        {
            raten = scan.nextDouble();
            if(raten==lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
                versuche++;
            }
            else if(raten<lösung&&eingabe_tips=='y')
            {
                System.out.println("Schade, deine Zahl ist zu klein, versuche nochmal.");
                versuche++;
                if(eingabe_versuche=='y')
                {
                    System.out.println("Du hast noch "+(start_versuche-versuche)+" Versuche.");
                }
            }
            else if(raten>lösung&&eingabe_tips=='y')
            {
                System.out.println("Schade, deine Zahl ist zu groß, versuche nochmal.");
                versuche++;
                if(eingabe_versuche=='y')
                {
                    System.out.println("Du hast noch "+(start_versuche-versuche)+" Versuche.");
                }
            }
            else if(raten!=lösung)
            {
                System.out.println("Schade, dass ist nicht richtig, versuche nochmal.");
                versuche++;
                if(eingabe_versuche=='y')
                {
                    System.out.println("Du hast noch "+(start_versuche-versuche)+" Versuche.");
                }
            }
        }
        if(versuche>=start_versuche)
        {
            System.out.println("Ha du hast keine Versuche mehr, du hast verloren.");
            System.out.println("Meine Zahl wäre "+lösung+" gewesen");
        }
        return versuche;
    }
    public void Chose(boolean fast_start)
    {
        if(fast_start==false)
        {
            System.out.println("Was soll die maximale Zahl sein?");
            max_zahl = scan.nextInt();
            System.out.println("Möchtest du deine Versuche begrenzen?");
        }
        for(int a=0;a==0;)
        {
            if(fast_start==false)
            {
                eingabe_versuche = scan.next().charAt(0);
            }
            if(eingabe_versuche == 'y')
            {
                if(fast_start==false)
                {
                    System.out.println("Wieviele Versuche möchtest du haben?");
                    start_versuche = scan.nextInt();
                    System.out.println("Möchtest du Tips aktivieren?");
                }
                for(int i=0;i==0;)
                {
                    if(fast_start==false)
                    {
                        eingabe_tips = scan.next().charAt(0);
                    }
                    if(eingabe_tips == 'y')
                    {
                        Raten_limit_tips();
                        i++;
                    }
                    else if(eingabe_tips == 'n')
                    {
                        Raten_limit();
                        i++;
                    }
                    else
                    {
                        System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
                    }
                }
                a++;
            }
            else if(eingabe_versuche == 'n')
            {
                if(fast_start==false)
                {
                    System.out.println("Möchtest du Tips aktivieren?");
                }
                for(int i=0;i==0;)
                {
                    if(fast_start==false)
                    {
                        eingabe_tips = scan.next().charAt(0);
                    }
                    if(eingabe_tips == 'y')
                    {
                        Raten_tips();
                        i++;
                    }
                    else if(eingabe_tips == 'n')
                    {
                        Raten();
                        i++;
                    }
                    else
                    {
                        System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
                    }
                }
                a++;
            }
            else
            {
                System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
            } 
        }
        System.out.println("Bisher habe ich "+punkte_c+" mal, und du "+punkte_m+" mal Gewonnen.");
        if(punkte_c>punkte_m)
        {
            System.out.println("Ich bin besser als du.");
        }
        else
        {
            System.out.println("Du bist besser als ich.");
        }
        System.out.println("Möchtest du nochmal Spielen?");
        for(int i=0;i==0;)
        {
            char eingabe = scan.next().charAt(0);
            if(eingabe == 'y')
            {
                System.out.println('\u000c');
                Chose(true);
                i++;
            }
            else if(eingabe == 'n')
            {
                System.out.println("Schöö");
                i++;
            }
            else
            {
                System.out.println("Ich konnte dich nicht verstehen, bitte antworte nur mit y und n.");
            }
        }
    }
    public void Raten_tips()
    {
        double lösung = rnd.nextInt(max_zahl+1);
        double raten = -1;
        System.out.println("Lass uns ein Spiel spielen.");
        System.out.println("Ich habe mir eine Zufählige Zahl zwischen 0 und "+max_zahl+" ausgedacht,");
        System.out.println("und du musst sie erraten.");
        System.out.println("Weil ich nett bin, werde ich dir Tips geben.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung)
        {
            raten = scan.nextDouble();
            if(raten==lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
            }
            else if(raten<lösung)
            {
                System.out.println("Schade, deine Zahl ist zu klein, versuche nochmal.");
            }
            else if(raten>lösung)
            {
                System.out.println("Schade, deine Zahl ist zu groß, versuche nochmal.");
            }
        }
    }
    public void Raten()
    {
        double lösung = rnd.nextInt(max_zahl+1);
        double raten = -1;
        System.out.println("Lass uns ein Spiel spielen.");
        System.out.println("Ich habe mir eine Zufählige Zahl zwischen 0 und "+max_zahl+" ausgedacht,");
        System.out.println("und du musst sie erraten.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung)
        {
            raten = scan.nextDouble();
            if(raten==lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
            }
            else
            {
                System.out.println("Schade, dass ist nicht richtig, versuche nochmal.");
            }
        }
    }
    public void Raten_limit_tips()
    {
        double lösung = rnd.nextInt(max_zahl+1);
        double raten = -1;
        int versuche = start_versuche;
        System.out.println("Lass uns ein Spiel spielen.");
        System.out.println("Ich habe mir eine Zufählige Zahl zwischen 0 und "+max_zahl+" ausgedacht,");
        System.out.println("und du musst sie erraten.");
        System.out.println("Du hast "+versuche+" Versuche.");
        System.out.println("Weil ich nett bin, werde ich dir Tips geben.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung&&versuche>0)
        {
            raten = scan.nextDouble();
            if(raten==lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
                punkte_m ++;
            }
            else if(raten<lösung)
            {
                System.out.println("Schade, deine Zahl ist zu klein, versuche nochmal.");
                versuche--;
                System.out.println("Du hast noch "+versuche+" Versuche.");
            }
            else if(raten>lösung)
            {
                System.out.println("Schade, deine Zahl ist zu groß, versuche nochmal.");
                versuche--;
                System.out.println("Du hast noch "+versuche+" Versuche.");
            }
        }
        if(versuche<=0)
        {
            System.out.println("Ha du hast keine Versuche mehr, du hast verloren.");
            System.out.println("Meine Zahl wäre "+lösung+" gewesen");
            punkte_c ++;
        }
    }
    public void Raten_limit()
    {
        double lösung = rnd.nextInt(max_zahl+1);
        double raten = -1;
        int versuche = start_versuche;
        System.out.println("Lass uns ein Spiel spielen.");
        System.out.println("Ich habe mir eine Zufählige Zahl zwischen 0 und "+max_zahl+" ausgedacht,");
        System.out.println("und du musst sie erraten.");
        System.out.println("Du hast "+versuche+" Versuche.");
        System.out.println("Alles verstanden?");
        char eingabe = scan.next().charAt(0);
        System.out.println("Na dann, Lass das Raten beginnen.");
        while (raten!=lösung&&versuche>0)
        {
            raten = scan.nextDouble();
            if(raten==lösung)
            {
                System.out.println("Dass ist richtig, meine Zahl ist "+lösung+".");
                punkte_m ++;
            }
            else
            {
                System.out.println("Schade, dass ist nicht richtig, versuche nochmal.");
                versuche--;
                System.out.println("Du hast noch "+versuche+" Versuche.");
            }
        }
        if(versuche<=0)
        {
            System.out.println("Ha du hast keine Versuche mehr, du hast verloren.");
            System.out.println("Meine Zahl wäre "+lösung+" gewesen");
            punkte_c ++;
        }
    }
}
