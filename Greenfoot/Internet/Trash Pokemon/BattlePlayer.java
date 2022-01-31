import greenfoot.*;
public class BattlePlayer extends Battle
{
    GreenfootImage[] sprites = new GreenfootImage[5];
    int currentImage;
    
    int time;
    boolean canContinue;
    
    public BattlePlayer()
    {
        for(int i = 0; i < sprites.length; i++)
            sprites[i] = new GreenfootImage("BattlePlayer/" + DataPlayer.gender + i + ".png");
        setImage(sprites[0]);
    }
    
    public void act()
    {
        time++;
        if(time > 125 && canContinue)
        {
            move(-5);
            if(time % 10 == 0)
                currentImage++;
            setImage(sprites[currentImage]);
        }
        else if(time > 125)
            time--;
        if(time == 150)
            getWorld().addObject(new BattleBall(), 100, 280);
        else if(time == 169)
            getWorld().removeObject(this);
        else if(time == 125 && DataPlayer.interactInput())
            canContinue = true;
    }
}
