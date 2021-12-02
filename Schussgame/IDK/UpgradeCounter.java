import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SCgjswagd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeCounter extends Displays
{
    public UpgradeCounter()
    {
         setImage(new GreenfootImage("Upgrade Lv.Ⅰ: 0 /20", 50, Color.WHITE, new Color(0,0,0,0)));
    }   
    public void act()
    {
        display_upgrade();
    }
    public void display_upgrade()
    {
        if(MyWorld.upgrade_level<20)
        {
            setImage(new GreenfootImage("Upgrade Lv.Ⅰ: " + MyWorld.upgrade_level+" /20", 50, Color.WHITE, new Color(0,0,0,0)));
        }
        else if(MyWorld.upgrade_level<40)
        {
            int test = MyWorld.upgrade_level - 20;
            setImage(new GreenfootImage("Upgrade Lv.Ⅱ: " + test+" /20", 50, Color.WHITE, new Color(0,0,0,0)));
        }
        else
        {
            setImage(new GreenfootImage("Upgrade Lv.Ⅲ: MAX", 50, Color.WHITE, new Color(0,0,0,0)));
        }
    }
}
