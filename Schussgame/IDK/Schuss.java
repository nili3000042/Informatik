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
            this.removeTouching(Slime.class);
            MyWorld.Slimes=MyWorld.Slimes-1;
            MyWorld.Score=MyWorld.Score+1;
        }
    }
}