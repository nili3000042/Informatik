import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SCgjswagd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forcefield_timer extends Displays
{
    public Forcefield_timer()
    {
         setImage(new GreenfootImage("Forcefield: ", 50, Color.WHITE, new Color(0,0,0,0)));
    }   
    public void act()
    {
        display_score();
    }
    public void display_score()
    {
        setImage(new GreenfootImage("Forcefield: " + MyWorld.forcefield_active/MyWorld.game_speed, 50, Color.WHITE, new Color(0,0,0,0)));
    }
}
