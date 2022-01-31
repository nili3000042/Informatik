import greenfoot.*;
public class DustCloud extends Actor
{
    int time = 0;
    
    public void act()
    {
        setImage("DustCloud/" + time/2 + ".png");
        time++;
        if(time == 12)
            getWorld().removeObject(this);
    }
}
