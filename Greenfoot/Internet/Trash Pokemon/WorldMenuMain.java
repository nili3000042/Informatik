import greenfoot.*;
public class WorldMenuMain extends World
{

    public WorldMenuMain()
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
        addObject(new ObjectMenuMain("MainNewGame"), 350, 165);
        addObject(new ObjectMenuMain("MainGameOptions"), 350, 260);
        addObject(new ObjectMenuMain("MainControls"), 350, 355);
    }
}
