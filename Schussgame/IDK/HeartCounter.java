import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SCgjswagd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeartCounter extends Actor
{
    public HeartCounter()
    {
         setImage(new GreenfootImage("♥ ♥ ♥ ❤️", 50, Color.RED, new Color(0,0,0,0)));
    }   
    public void act()
    {
        aktualisieren();
    }
    public void aktualisieren()
    {
        if(MyWorld.Hearts==3)
        {
            setImage(new GreenfootImage("♥ ♥ ♥ ❤️", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(MyWorld.Hearts==2)
        {
            setImage(new GreenfootImage("♥ ♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(MyWorld.Hearts==1)
        {
            setImage(new GreenfootImage("♥", 50, Color.RED, new Color(0,0,0,0)));
        }
        else if(MyWorld.Hearts==0)
        {
            setImage(new GreenfootImage("", 50, Color.RED, new Color(0,0,0,0)));
        }
    }
}
