import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SCgjswagd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{
    public ScoreCounter()
    {
         setImage(new GreenfootImage("Score: ", 50, Color.WHITE, new Color(0,0,0,0)));
    }   
    public void act()
    {
        display_score();
    }
    public void display_score()
    {
        String score_string = Integer.toString(MyWorld.Score);
        setImage(new GreenfootImage("Score: " + score_string, 50, Color.WHITE, new Color(0,0,0,0)));
    }
}
