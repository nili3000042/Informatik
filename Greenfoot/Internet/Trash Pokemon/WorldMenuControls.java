import greenfoot.*;
public class WorldMenuControls extends World
{
    public WorldMenuControls()
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
    }
}
