 
 
/**
 * 
 */
public class AufgabeListeInt
{
    List<Integer> a1Liste;

    /**
     * Konstruktor für Objekte der Klasse Simultion
     */
    public AufgabeListeInt()
    {
         a1Liste =  new List<Integer>();
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
        aufgabe1();
        
        while(!a1Liste.isEmpty()){
            if(a1Liste.hasAccess()){
                a1Liste.toFirst();
            }
            System.out.println(a1Liste.getContent());
            a1Liste.remove();
        }

    }
}
