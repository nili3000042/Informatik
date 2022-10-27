import greenfoot.*;
public class ObjectMenuGameOptions extends Objects
{
    String type;

    GreenfootImage[] images = new GreenfootImage[4];

    static int soundState = 2;
    static int musicState = 2;
    
    public ObjectMenuGameOptions(String type)
    {
        switch(type)
        {
            case "Sound" :
                for(int i = 0; i < 4; i++)
                    images[i] = new GreenfootImage("Objects/Menu/ControlsSound" + i + ".png");
                setImage(images[soundState]);
                break;
            case "Music" :
                for(int i = 0; i < 4; i++)
                    images[i] = new GreenfootImage("Objects/Menu/ControlsSound" + i + ".png");
                setImage(images[musicState]);
                break;
            default :
                setImage("Objects/Menu/" + type + ".png");
                break;
        }

        this.type = type;
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this) && musicState < 3 && (type.equals("Music") || type.equals("OptionsMusic")))
            musicState++;
        else if(Greenfoot.mouseClicked(this) && (type.equals("Music") || type.equals("OptionsMusic")))
            musicState = 0;
        else if(Greenfoot.mouseClicked(this) && soundState < 3 && (type.equals("Sound") || type.equals("OptionsSound")))
            soundState++;
        else if(Greenfoot.mouseClicked(this) && (type.equals("Sound") || type.equals("OptionsSound")))
            soundState = 0;
        
        if(Greenfoot.mouseClicked(this))
            DataSound.sounds[3].play();
        
        DataSound.soundVolume = soundState * 20;
        DataSound.musicVolume = musicState * 20;
        
        if(type.equals("Music"))
            setImage(images[musicState]);
        else if(type.equals("Sound"))
            setImage(images[soundState]);
    }
}
