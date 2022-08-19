import greenfoot.*;
public class WorldMenuScreen extends World
{
    Transition transition = new Transition("fade", new WorldMenuMain());
    
    public WorldMenuScreen()
    {    
        super(700, 520, 1);
        addData();
        addObjects();
        Greenfoot.start();
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
            addObject(transition, 350, 260);
    }
    
    public void addData()
    {
        addObject(new DataSound(), 0, 0);
    }
    
    public void addObjects()
    {
        addObject(new ObjectMenuScreen("ScreenTrash"), 675, 280);
        addObject(new ObjectMenuScreen("ScreenPokemon"), 0, 280);
        addObject(new ObjectMenuScreen("ScreenContinue"), 350, 280);
        addObject(new ObjectMenuScreen("ScreenPowered"), 350, 500);
    }
}
