import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SCgjswagd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cooldown extends Displays
{
    public Cooldown()
    {
         setImage(new GreenfootImage("Cooldown: 0", 50, Color.WHITE, new Color(0,0,0,0)));
    }   
    public void act()
    {
        display_cooldown();
    }
    public void display_cooldown()
    {
        int Cooldown_Short = MyWorld.Cooldown_Gun-MyWorld.upgrade_level;
        if(MyWorld.upgrade_level<40)
        {
            if(Cooldown_Short<0)
            {
                setImage(new GreenfootImage("Cooldown: 0", 50, Color.WHITE, new Color(0,0,0,0)));
            }
            else
            {
                setImage(new GreenfootImage("Cooldown: "+Cooldown_Short/MyWorld.game_speed, 50, Color.WHITE, new Color(0,0,0,0)));
            }
        }
        else
        {
            setImage(new GreenfootImage("No Cooldown", 50, Color.WHITE, new Color(0,0,0,0)));
        }
    }
}
