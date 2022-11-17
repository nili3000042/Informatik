public class Person
{
    private String name;
    private Person nachfolger;

    public Person(String pName)
    {
        name = pName;    
    }

    public String getName()
    {
        return name;
    }
}