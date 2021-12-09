import greenfoot.*;
public class CooldownDisplay extends Displays //Displays the current Cooldown.
{
    public CooldownDisplay() // setting image to colldown: 0 so that no negative values are shown.
    {
         setImage(new GreenfootImage("Cooldown: 0", 50, Color.WHITE, new Color(0,0,0,0))); 
    }   
    public void act()
    {
        if(MyWorld.upgrade_level<40)
        {
            if(MyWorld.Cooldown_Gun-MyWorld.upgrade_level<0)// setting image to colldown: 0 so that no negative values are shown.
            {
                setImage(new GreenfootImage("Cooldown: 0", 50, Color.WHITE, new Color(0,0,0,0)));
            }
            else //set image to current cooldown/worldspeed to get cooldown in seconds.
            {
                setImage(new GreenfootImage("Cooldown: "+(MyWorld.Cooldown_Gun-MyWorld.upgrade_level)/MyWorld.game_speed, 50, Color.WHITE, new Color(0,0,0,0)));
            }
        }
        else // If last upgrade there is no cooldown anymore.
        {
            setImage(new GreenfootImage("No Cooldown", 50, Color.WHITE, new Color(0,0,0,0)));
        }
    }
}
