import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Schuss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Schuss extends Actor
{

    /**
     * Act - do whatever the Schuss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.move(10);// Add your action code here.
        hit();
           
            
    } 
    
    public void hit()
    {
                if(this.isTouching(Meteor.class))
        {
            this.removeTouching(Meteor.class);
            
            
            World world = getWorld();
            Hintergrund my = (Hintergrund)world;
            Counter counter = my.getScore();
            counter.setScore();

            getWorld().removeObject(this);
        }
        else if(this.getX()>980)
        {
            getWorld().removeObject(this);
        }
    }

}
