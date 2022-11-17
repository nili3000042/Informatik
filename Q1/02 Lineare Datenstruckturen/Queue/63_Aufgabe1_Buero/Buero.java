public class Buero
{
    Queue<Person> warteschlange;

    public Buero()
    {
        warteschlange = new Queue<Person>();
    }

    /**
     * Ein Patient wird der Schlange hinzugefügt, indem er als hinterstes Element
     * der Schlange eingefügt wird.
     * @param: pPerson: einzufügender Patient
     */
    public void hintenAnstellen(Person pPerson)
    {
        warteschlange.enqueue(pPerson);
        System.out.println("Patient " + pPerson.getName() + " geht ins Wartezimmer");
    }

    /**
     * Der erste Patient der Schlange wird zum Arzt gelassen und anschließend
     * aus der Schlange entfernt.
     */
    public void einlassen()
    {
        Person pPerson = warteschlange.front();
        System.out.println(pPerson.getName() + " geht zum Arzt");
        warteschlange.dequeue();
    }

    /** Die Warteschlange wird geleert, indem der jeweils erste Patient ausgegeben und dann
     * aus der Schlange entfernt wird. Wenn die Schlange leer ist wird dies durch eine Meldung 
     * angezeigt.
     */
    public void sprechstundeBeenden()
    {
        while (!warteschlange.isEmpty())
        {
            Person pPerson = (Person) warteschlange.front();
            System.out.println(pPerson.getName() + " muss ein anderes Mal wiederkommen.");
            warteschlange.dequeue();
        }
        System.out.println("Alle weg!");
    }
}