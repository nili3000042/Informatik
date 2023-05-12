 
 
/**
 * 
 */
public class AufgabeListeInt
{
    List<Integer> a1Liste;
    List<Integer> a2Liste;
    List<Boolean> a3Liste;
    /**
     * Konstruktor für Objekte der Klasse Simultion
     */
    public AufgabeListeInt()
    {
        a1Liste =  new List<Integer>(); 
        a2Liste =  new List<Integer>();
        a3Liste =  new List<Boolean>();
    }

    /**
     * Schreiben Sie einen Kommentar was in der Liste passiert
     */
    public void aufgabe1()
    {
        // Befehle hier einfügen!!!!!!!!!
        a1Liste.append(10);
        a1Liste.append(8);
        a1Liste.toFirst();
        a1Liste.insert(1);
        a1Liste.insert(5);
        a1Liste.toLast();
        a1Liste.insert(8);
        a1Liste.toFirst();
        a1Liste.remove();
        a1Liste.next();
        a1Liste.setContent(100);
    }
    
    public void aufgabe2()
    {
        // Befehle hier einfügen!!!!!!!!!
        a2Liste.append(30);
        a2Liste.append(4);
        a2Liste.toFirst();
        a2Liste.insert(3);
        a2Liste.insert(6);
        a2Liste.toLast();
        a2Liste.append(69);
        a2Liste.insert(20);
        a2Liste.toFirst();
        a2Liste.next();
        a2Liste.remove();
        a2Liste.next();
        a2Liste.setContent(420);
        aufgabe1();
        a2Liste.concat(a1Liste);
    }
    
    public void aufgabe3()
    {
        // Befehle hier einfügen!!!!!!!!!
        a3Liste.append(true);
        a3Liste.append(false);
        a3Liste.toFirst();
        a3Liste.insert(false);
        a3Liste.insert(true);
        a3Liste.toLast();
        a3Liste.insert(false);
        a3Liste.toFirst();
        a3Liste.
        remove();
        a3Liste.next();
        a3Liste.setContent(false);
    }
    //Ausgabe Inhalt Liste
    public void ausgabe(){
        aufgabe1();
        
        a1Liste.toFirst();
        
        while(a1Liste.hasAccess()){
            System.out.println(a1Liste.getContent());
            a1Liste.next();
        }

    }
    public void ausgabe3(){
        aufgabe2();
        
        while(!a2Liste.isEmpty()){
            if(a2Liste.hasAccess()){
                a2Liste.toFirst();
            }
            System.out.println(a2Liste.getContent());
            a2Liste.remove();
        }

    }
    public void ausgabe4(){
        aufgabe3();
        
        while(!a3Liste.isEmpty()){
            a3Liste.toFirst();
            System.out.println(a3Liste.getContent());
            a3Liste.remove();
        }

    }
}
