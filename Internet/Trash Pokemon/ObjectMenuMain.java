import greenfoot.*;
public class ObjectMenuMain extends Objects
{
    String name;

    public ObjectMenuMain(String name)
    {
        this.name = name;
        setImage("Objects/Menu/" + name + ".png");
    }
    
    public void act()
    {
        switch(name)
        {
            case "MainNewGame" : 
                if(Greenfoot.mouseClicked(this))
                {
                    DataSound.sounds[0].play();
                    Greenfoot.setWorld(new WorldMenuGender());
                }
                break;
            case "MainGameOptions" : 
                if(Greenfoot.mouseClicked(this))
                {
                    DataSound.sounds[0].play();
                    Greenfoot.setWorld(new WorldMenuGameOptions());
                }
                break;
            case "MainControls" : 
                if(Greenfoot.mouseClicked(this))
                {
                    DataSound.sounds[0].play();
                    Greenfoot.setWorld(new WorldMenuControls());
                }
                break;
        }
    }
}
