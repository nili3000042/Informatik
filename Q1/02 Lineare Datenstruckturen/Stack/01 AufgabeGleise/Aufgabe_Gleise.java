import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Stack_Int.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Aufgabe_Gleise
{
    Stack<String> gleis1;
    Stack<String> gleis2;
    Stack<String> gleis3;
    Stack<String> warten;
    String [] Ziele = {"Gießen","Regensburg","Bonn"};
    Random rnd = new Random();
    public Aufgabe_Gleise()
    {
        gleis1 = new Stack<String>();
        gleis2 = new Stack<String>();
        gleis3 = new Stack<String>();
        warten = new Stack<String>();
        fuellen(gleis1,50);
    }

    public void fuellen(Stack pGleis,int pAnzahl)
    {
        for(int i = 0; i>pAnzahl;i++)
        {
            pGleis.push(Ziele[rnd.nextInt(Ziele.length)]);
        }
    }
    
    private void rangieren(Stack<String> pVon,Stack<String> pZu)
    {
        if(!pVon.isEmpty())
        {
            pZu.push(pVon.top());
            pVon.pop();
        }
    }
    
    public void sortieren()
    {
        // Alle Waggons von Regensburg aus Gleis 1 und von Gießen auf Gleis 2 und von Bonn auf Gleis 3 bringen
        while(!gleis1.isEmpty()) // Solange R1 nicht Leer ist
        {
            if(gleis1.top()=="Gießen") // Wenn der vorderste Waggon von R1 Grün ist
            {
                while(gleis2.top()=="Regensburg") // Solange der vorderste Waggon von G2 Rot ist
                {
                    rangieren(gleis2,gleis3); // Schiebe von G2 auf B3
                } // Ende von Solange
                rangieren(gleis1,gleis2); // Schiebe von R1 auf G2
            }
            else if(gleis1.top()=="Bonn") // Ansonst wenn der vorderste Waggon von R1 Blau ist
            {
                while(gleis3.top()=="Regensburg") // Solange der vorderste Waggon von B3 Rot ist
                {
                    rangieren(gleis3,gleis2); // Schiebe von B3 auf G2
                } // Ende von Solange
                rangieren(gleis1,gleis2); // Schiebe von R1 auf B3
            }
            else if(gleis1.top()=="Regensburg") // Ansonst wenn der vorderste Waggon von R1 Rot ist
            {
                if(gleis2.top()=="Regensburg") // Wenn der vorderste Waggon von G2 Rot ist
                {
                    rangieren(gleis1,gleis2); // Schiebe von R1 auf G2
                }
                else // Ansonsten
                {
                    rangieren(gleis1,gleis3); // Schiebe von R1 auf B3
                }
            }
        } // Ende von Solange
        while(gleis2.top()=="Regensburg") // Solange der vorderste Waggon von G2 Rot ist
        {
            rangieren(gleis2,gleis1); // Schiebe von G2 auf R1
        } // Ende von Solange
        while(gleis3.top()=="Regensburg") // Solange der vorderste Waggon von B3 Rot ist
        {
            rangieren(gleis3,gleis1); // Schiebe von B3 auf R1
        } // Ende von Solange
    }
    public void ausgeben()
    {
        ausgabe(gleis1,"Gleis 1");
        ausgabe(gleis2,"Gleis 2");
        ausgabe(gleis3,"Gleis 3");
    }
    private void ausgabe(Stack<String> pGleis,String pName)
    {
        System.out.println("Auf "+pName+" stehen folgende Waggons:");
        int zaehler = 1;
        while(!pGleis.isEmpty())
        {
            System.out.println("Position: "+zaehler);
            System.out.println("Ziel: "+pGleis.top());
            warten.push(pGleis.top());
            pGleis.pop();
        }
        while(!warten.isEmpty())
        {
            pGleis.push(warten.top());
            warten.pop();
        }
    }
}

