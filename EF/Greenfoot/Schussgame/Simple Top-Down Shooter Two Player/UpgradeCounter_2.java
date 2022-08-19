import greenfoot.*;
public class UpgradeCounter_2 extends Displays //Displays the Current Upgrade Lv.
{
    public UpgradeCounter_2() // Shows the Lv. at the Start of the Game (0).
    {
         setImage(new GreenfootImage("Upgrade Lv.Ⅰ: 0 /20", 50, Color.WHITE, new Color(0,0,0,0)));
    }   
    public void act() //Updates the Lv.
    {
        if(getWorld().getObjects(Player_2.class).get(0).upgrade_level<20)
        {
            setImage(new GreenfootImage("Upgrade Lv.Ⅰ: " + getWorld().getObjects(Player_2.class).get(0).upgrade_level+" /20", 50, Color.WHITE, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_2.class).get(0).upgrade_level<40)
        {
            int test = getWorld().getObjects(Player_2.class).get(0).upgrade_level - 20;
            setImage(new GreenfootImage("Upgrade Lv.Ⅱ: " + test+" /20", 50, Color.WHITE, new Color(0,0,0,0)));
        }
        else if(getWorld().getObjects(Player_2.class).get(0).upgrade_level<60)
        {
            int test = getWorld().getObjects(Player_2.class).get(0).upgrade_level - 40;
            setImage(new GreenfootImage("Upgrade Lv.Ⅲ: " + test+" /20", 50, Color.WHITE, new Color(0,0,0,0)));
        }
        else //Shows the level cap.
        {
            setImage(new GreenfootImage("Upgrade Lv.Ⅲ: MAX", 50, Color.WHITE, new Color(0,0,0,0)));
        }
    }
}
