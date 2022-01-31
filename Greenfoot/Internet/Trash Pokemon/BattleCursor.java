import greenfoot.*;
public class BattleCursor extends Battle
{
    public BattleCursor()
    {
        setImage("Blank.png");
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("up") && getY() > 450 && DataPlayer.canInteract())
            setLocation(getX(), getY() - 50);
        else if(Greenfoot.isKeyDown("down") && getY() < 450 && DataPlayer.canInteract())
            setLocation(getX(), getY() + 50);
        else if(Greenfoot.isKeyDown("left") && getX() > 150 && DataPlayer.canInteract())
            move(-230);
        else if(Greenfoot.isKeyDown("right") && getX() < 150 && DataPlayer.canInteract())
            move(230);
    }
}
