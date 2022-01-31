import greenfoot.*;
public class Transition extends Actor
{
    GreenfootImage[] images;
    int currentImage;
    
    String type;
    World destinationWorld;
    
    int time;
    
    public Transition(String type, World destinationWorld)
    {
        time = 0;
        this.type = type;
        this.destinationWorld = destinationWorld;
        switch(type)
        {
            case "inWild" : images = new GreenfootImage[16];
                break;
            case "outWild" : images = new GreenfootImage[19];
                break;
            case "fade" : 
            case "fadeFaint" : images = new GreenfootImage[1];
                break;
        }
        for(int i = 0; i < images.length; i++)
            images[i] = new GreenfootImage("Transition/" + type + "/" + i + ".png");
        setImage(images[0]);
        if(type.equals("fade") || type.equals("fadeFaint"))
        {
            getImage().setTransparency(0);
            getImage().scale(700, 520);
        }
        Player.speed = 0;
    }
    
    public void act()
    {
        DataPlayer.interactTimer = 10;
        DataSound dataSound = getWorld().getObjects(DataSound.class).get(0);
        switch(type)
        {
            case "inWild" : time++;
                if(time == 1)
                {
                    dataSound.stopMusics();
                    DataSound.musics[4].play();
                }
                if(time % 3 == 0)
                    currentImage++;
                setImage(images[currentImage]);
                if(time == images.length * 3 - 1)
                {
                    DataPlayer.previousWorld = getWorld().getClass().getName();
                    Greenfoot.setWorld(destinationWorld);
                }
                break;
            case "outWild" : time++;
                if(time % 3 == 0)
                    currentImage++;
                setImage(images[currentImage]);
                if(time == images.length * 3 - 1)
                    getWorld().removeObject(this);
                break;
            case "fade" : time += 3;
                getImage().setTransparency(time);
                if(time == 249)
                {
                    DataPlayer.previousWorld = getWorld().getClass().getName();
                    Player.speed = 2;
                    Greenfoot.setWorld(destinationWorld);
                }
                break;
            case "fadeFaint" : time += 3;
                getImage().setTransparency(time);
                if(time == 249)
                {
                    DataPlayer.previousWorld = getWorld().getClass().getName();
                    Player.speed = 2;
                    WorldCenterTownTrash.originalX = 250;
                    WorldCenterTownTrash.originalY = 120;
                    ObjectSpecialNPCCenterNurse.forcedInteraction = true;
                    Greenfoot.setWorld(new WorldCenterTownTrash());
                }
                break;
        }
    }
    
    @Override
    public void setLocation(int x, int y)
    {}
}
