import greenfoot.*;
public class HPPlayer extends Battle
{
    public HPPlayer()
    {
        setImage("Battle/HPPlayer.png");
    }
    
    public void act()
    {
        if(getY() > 300)
            setLocation(getX(), getY() - 3);
    }
}
