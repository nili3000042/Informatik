
import java.util.*;
public class Mann
{
    String Name;
    int Größe;
    int Alter;
    
    int IQ = 50;
    int Aussehen = 50;
    int Hygiene = 50;
    int Charme = 50;
    int Geld= 500;
    char Beziehungsstatus = 's';
    
    int Zuneigung = 0;
    String []Sprüche = new String[2];
    
    Frau Partner;
    
    
    
    public Mann(int groß, String name, int alter, String Spruch1, String Spruch2, String Spruch3 )//Konstruktor
    {
        Größe = groß;
        Name = name;
        Alter = alter;
        Sprüche[0]= Spruch1;
        Sprüche[1]= Spruch2;
        Sprüche[2]= Spruch3;
    }
    
    
    public void abchecken(Frau dame)
    {
        System.out.println('\u000c');
        
        if (dame.get_Größe()<Größe && dame.get_Aussehen()>=70)
        {
            System.out.println(Name+": OUH, die checke ich mal aus!");
            dame.abgecheckt(this);
        }
        else
        {
            System.out.println(Name+": Nee, die ist nichts für mich.");
        }
    }
    
    public void abgecheckt (Frau dame)
    {
        if (dame.get_Größe()<Größe && dame.get_Aussehen()>=70)
        {
            System.out.println(Name+": Hallo, sexy Frau, öfters hier?");
            dame.flirt(this);
        }
        else
        {
            System.out.println(Name+": Sorry, ich wollte eh grad gehen!");
        }
    }
    
    
    public void flirt(Frau dame)
    {
        Scanner scan = new Scanner (System.in);
        Random zufall = new Random();
        
        System.out.println(Name+ " (denkt): Was soll ich machen?");
        System.out.println("1. Drink ausgeben (1)");
        System.out.println("2. Anmachspruch (2)");
        System.out.println("3. Kompliment machen (3)");
        System.out.println("4. Small Talk (4)");
        System.out.println("5. Gespräch abbrechen (5)");
        if (Zuneigung >= 50)
        {
            System.out.println("6. Nach Nummer fragen (6)");
        }
        
        int antwort=scan.nextInt();
        if (antwort == 1)
        {
            set_Aussehen(zufall.nextInt(20)-10);
            System.out.println(Name+" : Lass uns doch ein Kaltgetränk zu uns nehmen.");
            set_Zuneigung(zufall.nextInt(10)-5);
            dame.flirt(this);
        }
        else if (antwort == 2)
        {
            set_Charme(zufall.nextInt(10)-10);
            System.out.println(Name+" : " + Sprüche[zufall.nextInt(2)]);
            set_Zuneigung(zufall.nextInt(10)-5);
            dame.flirt(this);
        }
        else if ( antwort == 3)
        {
            set_Charme(zufall.nextInt(30)-10);
            System.out.println(Name+" : Ich mag deine Haare, die Frisur steht dir.");
            set_Zuneigung(zufall.nextInt(10)-5);
            dame.flirt(this);
        }
        else if ( antwort == 4)
        {
            set_IQ(zufall.nextInt(20)-20);
            System.out.println(Name+" : Schönes Wetter heute, oder?");
            set_Zuneigung(zufall.nextInt(10)-5);
            dame.flirt(this);
        }
        else if ( antwort == 5)
        {
            System.out.println(Name+" : *ring *ring 'Sorry, mein Handy klingelt, da muss ich ran!");
        }
        else if (antwort == 6)
        {
            System.out.println(Name+" : Kann ich deine Nummer haben?");
            dame.Nummer();
        }
    }
    
    public void Nummer()
    {
        if(Zuneigung>=50)
        {
            System.out.println(Name+" : Ja klar, kannst du haben.");
            set_Beziehungsstatus('v');
        }
        else if(Zuneigung <50)
        {
            System.out.println(Name+" : *ring *ring 'Sorry, mein Handy klingelt, da muss ich ran!");
        }
        
    }
    
    public String get_Name()
    {
        return Name;
    }
    
    public int get_Größe()
    {
        return Größe;
    }
    
    public int get_Alter()
    {
        return Alter;
    }
    
    public int get_IQ()
    {
        return IQ;
    }
    
    public int get_Aussehen()
    {
        return Aussehen;
    }
    
    public int get_Hygiene()
    {
        return Hygiene;
    }
    
    public int get_Charme()
    {
        return Charme;
    }
    
    public char get_Beziehungsstaus()
    {
        return Beziehungsstatus;
    }
    
    public int get_Geld()
    {
        return Geld;
    }
    
    
    
    public void set_Aussehen(int Wert)
    {
        Aussehen= Aussehen + Wert;
    }
    
    public void set_Hygiene(int Wert)
    {
        Hygiene= Hygiene + Wert;
    }
    
    public void set_IQ(int Wert)
    {
        IQ= IQ + Wert;
    }
    
    public void set_Charme(int Wert)
    {
        Charme= Charme + Wert;
    }
    
    public void set_Geld(int Wert)
    {
        Geld= Geld + Wert;
    }
    
    public void set_Zuneigung(int Wert)
    {
        Zuneigung= Zuneigung + Wert;
    }
    
    public void set_Beziehungsstatus(char Wert)
    {
        Beziehungsstatus= Wert;
    }
}

    
