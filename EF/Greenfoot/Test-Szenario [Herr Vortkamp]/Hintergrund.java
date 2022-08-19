import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hintergrund extends World
{
    Counter counter = new Counter();
    Life life = new Life();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Hintergrund()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1);

        prepare();
    }
    
    public Counter getScore()
    {
     return counter;   
    }
    
        public Life getLife()
    {
     return life;   
    }
    
    public void act()
    {
     if(Greenfoot.getRandomNumber(50)<1)
     {
         addObject(new Meteor(), 980, Greenfoot.getRandomNumber(500));
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rakete rocket = new Rakete();
        addObject(counter, 50, 45);
        addObject(life, 50, 15);
        addObject(rocket,52,183);

    }
    

    
    
}
