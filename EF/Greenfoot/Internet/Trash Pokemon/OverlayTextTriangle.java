import greenfoot.*;
public class OverlayTextTriangle extends Actor
{
    int time;
    
    GreenfootImage image0 = new GreenfootImage("OverlayTextTriangle0.png");
    GreenfootImage image1 = new GreenfootImage("OverlayTextTriangle1.png");
    
    public OverlayTextTriangle()
    {
        time = 20;
        setImage(image0);
    }
    
    public void act()
    {
        time--;
        if(time == 10)
            setImage(image0);
        else if(time == 0)
        {
            setImage(image1);
            time = 20;
        }
        if(DataPlayer.interactInput() || getWorld().getObjects(OverlayText.class).isEmpty())
        {
            time = 20;
            getWorld().removeObject(this);
        }
    }
    
    public void setLocation(int x, int y)
    {}
}
