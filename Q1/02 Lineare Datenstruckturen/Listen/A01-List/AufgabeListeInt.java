 
 
/**
 * 
 */
public class AufgabeListeInt
{
    List<Integer> a1Liste;
    List<Integer> a2Liste;
    /**
     * Konstruktor für Objekte der Klasse Simultion
     */
    public AufgabeListeInt()
    {
        a1Liste =  new List<Integer>(); 
        a2Liste =  new List<Integer>();
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
}
