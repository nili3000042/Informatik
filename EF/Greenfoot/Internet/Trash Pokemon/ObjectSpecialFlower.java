import greenfoot.*;
public class ObjectSpecialFlower extends Objects
{
    GreenfootImage[] sprites = new GreenfootImage[5];
    int currentImage;
    
    int time;
    
    public ObjectSpecialFlower(String type)
    {
        for(int i = 0; i < 5; i++)
            sprites[i] = new GreenfootImage("Objects/Special/Flower/" + type + i + ".png");
        setImage(sprites[0]);
    }
    
    public void act()
    {
        time++;
        if(time == sprites.length * 15 - 15)
        {
            currentImage = 0;
            time = 0;
        }
        
        if(time % 15 == 0)
            currentImage++;
        setImage(sprites[currentImage]);
    }
}
