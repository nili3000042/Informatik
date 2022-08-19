import greenfoot.*;
public class ObjectMenuArrowBack extends Objects
{
    public ObjectMenuArrowBack()
    {
        setImage("Objects/Menu/ArrowBack.png");
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown("escape"))
        {
            DataSound.sounds[3].play();
            Greenfoot.setWorld(new WorldMenuMain());
        }
    }
}
