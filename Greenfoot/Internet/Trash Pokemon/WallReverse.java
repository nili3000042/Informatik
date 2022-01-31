import greenfoot.*;
public class WallReverse extends Actor
{
    public WallReverse(int width, int height)
    {
        getImage().scale(width, height);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("y"))
        {
            int width = getImage().getWidth();
            int height = getImage().getHeight();
            setImage("BlankDebug.png");
            getImage().scale(width, height);
        }
        else
        {
            int width = getImage().getWidth();
            int height = getImage().getHeight();
            setImage("Blank.png");
            getImage().scale(width, height);
        }
    }
}
