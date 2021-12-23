import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Biene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rakete extends Actor
{
    boolean schussbereit = true;
    /**
     * Act - do whatever the Biene wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {

        fliege();
        schaden();


    }

    public void fliege()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            this.setLocation(getX(), getY()-3); 
        }
        if(Greenfoot.isKeyDown("a"))
        {
            this.setLocation(getX()-3, getY()); 
        }
        if(Greenfoot.isKeyDown("s"))
        {
            this.setLocation(getX(), getY()+3); 
        }
        if(Greenfoot.isKeyDown("d"))
        {
            this.setLocation(getX()+3, getY()); 
        } 
        if(Greenfoot.isKeyDown("space") && schussbereit == true)
        {
            shoot();   
            schussbereit = false;
        }
        else if(!Greenfoot.isKeyDown("space"))
        {
         schussbereit = true;   
        }
    }

    public void shoot()
    {
        getWorld().addObject(new Schuss(),this.getX()+3, this.getY());
    }
    
    public void schaden()
    {
                    if(this.isTouching(Meteor.class))
        {
            this.removeTouching(Meteor.class);
            
            
            World world = getWorld();
            Hintergrund my = (Hintergrund)world;
            Life life = my.getLife();
            life.setlife();
        }
    }




}
