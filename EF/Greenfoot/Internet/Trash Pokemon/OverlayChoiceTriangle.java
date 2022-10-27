import greenfoot.*;
public class OverlayChoiceTriangle extends Actor
{
    int optionNumber;
    int currentChoice;
    
    int interactTimer;
    
    public OverlayChoiceTriangle(int optionNumber)
    {
        this.optionNumber = optionNumber;
    }
    
    public void act()
    {
        Player.speed = 0;
        interactTimer--;
        if(Greenfoot.isKeyDown("down") && canMoveDown())
        {
            setLocation(getX(), getY() + 36);
            currentChoice++;
            interactTimer = 10;
        }
        if(Greenfoot.isKeyDown("up") && canMoveUp())
        {
            setLocation(getX(), getY() - 36);
            currentChoice--;
            interactTimer = 10;
        }
    }
    
    public boolean canMoveDown()
    {
        return interactTimer < 0 && currentChoice < (optionNumber - 1);
    }
    
    public boolean canMoveUp()
    {
        return interactTimer < 0 && currentChoice > 0;
    }
}
