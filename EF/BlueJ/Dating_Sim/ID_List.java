
/**
 * Beschreiben Sie hier die Klasse ID_List.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ID_List
{
    static public int x;
    public ID_List()
    {
        x=0;
    }
    static public int get_ID()
    {
        x++;
        return x;
    }
}
