import greenfoot.*;
public class WorldMenuGender extends World
{
    public WorldMenuGender()
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
        addObject(new ObjectMenuGender("GenderBoy"), 200, 200);
        addObject(new ObjectMenuGender("GenderGirl"), 500, 200);
        addObject(new ObjectMenuGender("GenderText"), 350, 400);
    }
}
