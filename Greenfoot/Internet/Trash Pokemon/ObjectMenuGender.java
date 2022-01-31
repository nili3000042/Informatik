import greenfoot.*;
public class ObjectMenuGender extends Objects
{
    String name;
    
    boolean genderSelected;
    
    public ObjectMenuGender(String name)
    {
        this.name = name;
        setImage("Objects/Menu/" + name + ".png");
    }
    
    public void act()
    {
        switch(name)
        {
            case "GenderBoy" : 
                if(Greenfoot.mouseClicked(this) && !genderSelected)
                {
                    DataSound.sounds[0].play();
                    DataPlayer.gender = "boy";
                    WorldTownTrash.originalX = 400;
                    WorldTownTrash.originalY = 395;
                    getWorld().addObject(new Transition("fade", new WorldHousePlayerTownTrash()), 350, 260);
                    genderSelected = true;
                }
                break;
            case "GenderGirl" : 
                if(Greenfoot.mouseClicked(this) && !genderSelected)
                {
                    DataSound.sounds[0].play();
                    DataPlayer.gender = "girl";
                    WorldTownTrash.originalX = 400;
                    WorldTownTrash.originalY = 395;
                    getWorld().addObject(new Transition("fade", new WorldHousePlayerTownTrash()), 350, 260);
                    genderSelected = true;
                }
                break;
        }
    }
}
