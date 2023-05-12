public class Person
{
    private String name;
    private Person nachfolger;
    private int alter;
    private boolean maenlich;

    public Person(String pName, int pAlter, boolean pMaenlich)
    {
        name = pName;    
        alter = pAlter;
        maenlich = pMaenlich;
    }

    public String getName()
    {
        return name;
    }
    
    public int getAlter()
    {
        return alter;
    }
    
    public boolean getMaenlich()
    {
        return maenlich;
    }
}