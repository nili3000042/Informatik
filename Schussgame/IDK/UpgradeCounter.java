import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SCgjswagd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeCounter extends Actor
{
    public UpgradeCounter()
    {
         setImage(new GreenfootImage("Upgrade Gun: 0 /20", 50, Color.WHITE, new Color(0,0,0,0)));
    }   
    public void act()
    {
        display_score();
    }
    public void display_score()
    {
        if(MyWorld.upgrade_level<20)
        {
            setImage(new GreenfootImage("Upgrade Gun: " + MyWorld.upgrade_level+" /20", 50, Color.WHITE, new Color(0,0,0,0)));
        }
        else if(MyWorld.upgrade_level<40)
        {
            int test = MyWorld.upgrade_level - 20;
            setImage(new GreenfootImage("Upgrade Minigun: " + test+" /20", 50, Color.WHITE, new Color(0,0,0,0)));
        }
        else
        {
            setImage(new GreenfootImage("Upgrade Automaschinegun", 50, Color.WHITE, new Color(0,0,0,0)));
        }
    }
}
