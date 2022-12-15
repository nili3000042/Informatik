import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Stack_Int.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Aufgaben
{
    Stack<Integer> zStack1;
    Stack<Integer> zStack2;
    Stack<Integer> zStack3;
    Random rnd = new Random();
    Scanner scan = new Scanner(System.in);
    public Aufgaben()
    {
        zStack1 = new Stack<Integer>();
        zStack2 = new Stack<Integer>();
        zStack3 = new Stack<Integer>();
        System.out.print('\u000c');
    }
    public void tryout()
    {
        zufall_füllen(zStack2,50,1,8);
        aufgabe1_verschieben();
        alle_ausgeben();
    }
    public void aufgabe1()
    {
        aufgabe1_fuellen();
        aufgabe1_verschieben();
        alle_ausgeben();
    }
        private void aufgabe1_fuellen()
        {
            zStack2.push(1);
            zStack2.push(3);
            zStack2.push(7);
            zStack2.push(5);
            zStack2.push(4);
        }
        private void aufgabe1_verschieben()
        {
            while(!zStack2.isEmpty())
            {
                if(zStack2.top() < 5)
                {
                    zStack1.push(zStack2.top());
                    zStack2.pop();
                }
                else
                {
                    zStack3.push(zStack2.top());
                    zStack2.pop();
                }
            }
            while(!zStack3.isEmpty())
            {
                zStack2.push(zStack3.top());
                zStack3.pop();
            }
        }
        private void alle_ausgeben()
        {
            ausgabe(zStack1,"zStack1");
            ausgabe(zStack2,"zStack2");
            ausgabe(zStack3,"zStack3");
        }
            private int ausgabe(Stack pStack,String pName)
            {
                Stack warten = new Stack();
                int zaehler = 0;
                System.out.println("Stack "+pName+" beinhaltet:");
                while(!pStack.isEmpty())
                {
                    zaehler++;
                    System.out.println("Position "+zaehler+": "+pStack.top());
                    warten.push(pStack.top());
                    pStack.pop();
                }
                while(!warten.isEmpty())
                {
                    pStack.push(warten.top());
                    warten.pop();
                }
                System.out.println("----------");
                return zaehler;
            }
    public void aufgabe2()
    {
        aufgabe2_fuellen();
        aufgabe2_ausgabe();        
    }
        private void aufgabe2_fuellen()
        {
            zStack1.push(2);
            zStack1.push(4);
            zStack1.push(4);
            zStack1.push(7);
            zStack1.push(3);
            
            zStack2.push(1);
            zStack2.push(3);
            zStack2.push(7);
            zStack2.push(5);
            zStack2.push(4);
            
            zStack3.push(2);
            zStack3.push(2);
            zStack3.push(8);
            zStack3.push(4);
            zStack3.push(1);
        }
        private void aufgabe2_ausgabe()
        {
            Stack<Integer> warten = new Stack<Integer>();
            System.out.println("zStack1 beinhaltet "+vierenZaehlen(zStack1)+" Vieren.");
            System.out.println("zStack2 beinhaltet "+vierenZaehlen(zStack2)+" Vieren.");
            System.out.println("zStack3 beinhaltet "+vierenZaehlen(zStack3)+" Vieren.");
        }
             private int vierenZaehlen(Stack<Integer> pStack)
            {
                Stack<Integer> warten = new Stack<Integer>();
                int zaehler = 0;
                while(!pStack.isEmpty())
                {
                    if(pStack.top()==4)
                    {
                        zaehler++;
                    }
                    warten.push(pStack.top());
                    pStack.pop();
                }
                while(!warten.isEmpty())
                {
                    pStack.push(warten.top());
                    warten.pop();
                }
                return zaehler;
            }
    private void zufall_füllen(Stack<Integer> pStack, int pAnzahl, int pMin, int pMax)
    {
        for(int i = 0; i<pAnzahl;i++)
        {
            pStack.push(rnd.nextInt(pMax)+pMin);
        }
    }
}

