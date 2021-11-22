import greenfoot.*;
public class ObjectZone extends Objects
{
    int time;
    
    boolean swap;
    int swapTime;
    
    public ObjectZone(String name)
    {
        setImage("Objects/Zone/" + name + ".png");
        getImage().setTransparency(0);
    }
    
    public void act()
    {
        if(time > 250)
        {
            swapTime++;
            time -= 4;
        }
        if(swapTime == 100)
            swap = true;
        if(!swap)
            time += 4;
        else
            time -= 4;
        getImage().setTransparency(time);
        if(time == 0 && swap)
            getWorld().removeObject(this);
    }
    
    @Override
    public void setLocation(int x, int y)
    {}
}
