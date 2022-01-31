import greenfoot.*;
public class WorldMenuGameOptions extends World
{

    public WorldMenuGameOptions()
    {    
        super(700, 520, 1);
        addData();
        addObjects();
    }
    
    public void addData()
    {
        addObject(new DataSound(), 0, 0);
        addObject(new DataPlayer(), 0, 0);
    }
    
    public void addObjects()
    {
        addObject(new ObjectMenuArrowBack(), 30, 30);
        addObject(new ObjectMenuGameOptions("OptionsSound"), 310, 218);
        addObject(new ObjectMenuGameOptions("OptionsMusic"), 310, 313);
        addObject(new ObjectMenuGameOptions("Sound"), 600, 218);
        addObject(new ObjectMenuGameOptions("Music"), 600, 313);
    }
}
