import greenfoot.*;
public class BattleBall extends Battle
{
    GreenfootImage[] sprites = new GreenfootImage[4];
    int currentSprite;
    
    int time;
    
    public BattleBall()
    {
        for(int i = 0; i < sprites.length; i++)
            sprites[i] = new GreenfootImage("BattleBall/" + i + ".png");
    }
    
    public void act()
    {
        time++;
        setImage(sprites[currentSprite]);
        if(time > 75)
        {
            if(time > 90)
            {
                if(time % 3 == 0)
                    currentSprite++;
            }
            else if(time == 76)
                setRotation(0);
        }
        else
        {
            turn(29);
            if(time < 25)
                setLocation(getX() + 2, getY() + 1);
            else if(time < 50)
                setLocation(getX() + 1, getY() + 1);
            else
                setLocation(getX() + 1, getY() + 2);
        }
        if(time == 95)
            getWorld().addObject(new BattleExplosion(), getX(), getY());
        else if(time == 100)
            getWorld().removeObject(this);
    }
}
