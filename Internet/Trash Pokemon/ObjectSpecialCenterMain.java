import greenfoot.*;
public class ObjectSpecialCenterMain extends Objects
{
    GreenfootImage[] sprites = new GreenfootImage[3];
    
    static int time;
    
    public ObjectSpecialCenterMain()
    {
        for(int i = 0; i < 3; i++)
            sprites[i] = new GreenfootImage("Objects/Special/CenterMain/" + i + ".png");
        setImage(sprites[0]);
        
        center = 40;
    }
    
    public void act()
    {
        checkPlayer();
        animate();
    }
    
    public void animate()
    {
        time--;
        if(time > 0)
        {
            if(time == 1)
                setImage(sprites[0]);
            else if(time % 40 == 0)
                setImage(sprites[1]);
            else if(time % 20 == 0)
                setImage(sprites[2]);
        }
    }
}
