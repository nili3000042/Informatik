import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blume here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteor extends Actor
{

    /**
     * Act - do whatever the Blume wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        setRotation(180);
        move(5);

        despawn();

    }
    


    public void despawn()
    {
        if(this.getX()<20)
        {
            World world = getWorld();
            Hintergrund my = (Hintergrund)world;
            Life life = my.getLife();
            life.setlife();

            getWorld().removeObject(this);
        }
    }
}
