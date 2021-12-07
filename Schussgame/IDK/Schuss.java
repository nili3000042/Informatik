import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Schuss.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schuss extends NPC
{
    public void act() 
    {
        this.move(20);
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
            MyWorld.Slimes--;
            MyWorld.Score++;
            Greenfoot.playSound("impactsplat05[].mp3");
            if(Greenfoot.getRandomNumber(101)>20&&MyWorld.upgrade_level<40)
            {
                getWorld().addObject(new Upgrade(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            else if(Greenfoot.getRandomNumber(101)>50&&MyWorld.forcefield_active/MyWorld.game_speed<180)
            {
                getWorld().addObject(new Forcefield_item(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            if(Greenfoot.getRandomNumber(101)>70&&MyWorld.Hearts<5)
            {
                getWorld().addObject(new Heart(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            else if(Greenfoot.getRandomNumber(101)>95&&MyWorld.Hearts<10)
            {
                getWorld().addObject(new Heart(), getOneIntersectingObject(Slime.class).getX(), getOneIntersectingObject(Slime.class).getY());
            }
            this.removeTouching(Slime.class);
        }
    }
}