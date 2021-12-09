import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SCgjswagd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OnlyScore extends Displays
{
    public OnlyScore()
    {
        String score_string = Integer.toString(MyWorld.Score);
        setImage(new GreenfootImage(score_string, 50, Color.BLACK, new Color(0,0,0,0)));
    }   
    public void act()
    {
        display_score();
    }
    public void display_score()
    {
        String score_string = Integer.toString(MyWorld.Score);
        setImage(new GreenfootImage(score_string, 100, Color.BLACK, new Color(0,0,0,0)));
    }
}
