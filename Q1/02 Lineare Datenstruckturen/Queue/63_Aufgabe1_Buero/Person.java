public class Person
{
    private String name;
    private Person nachfolger;
    private int alter;

    public Person(String pName, int pAlter)
    {
        name = pName;    
        alter = pAlter;
    }

    public String getName()
    {
        return name;
    }
    
    public int getAlter()
    {
        return alter;
    }
}