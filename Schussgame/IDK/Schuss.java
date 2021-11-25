import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Schuss.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schuss extends Actor
{
    public void act() 
    {
        this.move(6);
        Kill_Slime();
        if(this.isAtEdge())
        {
            suicide();
        }
    }    
    public void suicide()
    {
        this.getWorld().removeObject(this);
    }
    public void Kill_Slime()
    {
        if(this.isTouching(Slime.class))
        {
            MyWorld.Slimes=MyWorld.Slimes-1;
            MyWorld.Score=MyWorld.Score+1;
            if(Greenfoot.getRandomNumber(101)>50&&MyWorld.upgrade_level<40)
            {
                getWorld().addObject(new Upgrade(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            this.removeTouching(Slime.class);
        }
    }
}