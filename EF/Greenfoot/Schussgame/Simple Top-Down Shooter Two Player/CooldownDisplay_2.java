import greenfoot.*;
public class CooldownDisplay_2 extends Displays //Displays the current Cooldown.
{
    public CooldownDisplay_2() // setting image to cooldown: 0 so that no negative values are shown.
    {
         setImage(new GreenfootImage("Cooldown: 0", 50, Color.WHITE, new Color(0,0,0,0))); 
    }   
    public void act()
    {
        if(getWorld().getObjects(Player_2.class).get(0).upgrade_level<60)
        {
            if(getWorld().getObjects(Player_2.class).get(0).Cooldown_Gun-getWorld().getObjects(Player_2.class).get(0).upgrade_level<0)// setting image to cooldown: 0 so that no negative values are shown.
            {
                setImage(new GreenfootImage("Cooldown: 0", 50, Color.WHITE, new Color(0,0,0,0)));
            }
            else //set image to current cooldown/worldspeed to get cooldown in seconds.
            {
                setImage(new GreenfootImage("Cooldown: "+(getWorld().getObjects(Player_2.class).get(0).Cooldown_Gun-getWorld().getObjects(Player_2.class).get(0).upgrade_level)/MyWorld.game_speed, 50, Color.WHITE, new Color(0,0,0,0)));
            }
        }
        else // If last upgrade there is no cooldown anymore.
        {
            setImage(new GreenfootImage("No Cooldown", 50, Color.WHITE, new Color(0,0,0,0)));
        }
    }
}
