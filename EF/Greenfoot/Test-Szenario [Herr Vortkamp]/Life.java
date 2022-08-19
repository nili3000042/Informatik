import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    int life = 5;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Life()
    {
        setImage(new GreenfootImage("Leben: "+life, 30, Color.GREEN, Color.BLACK));
    }
    public void act() 
    {
        setImage(new GreenfootImage("Leben: "+life, 30, Color.GREEN, Color.BLACK));
    }   
    


    
    public void setlife()
    {
     life--;
     if(life == 0)
     Greenfoot.stop();
    }
}
