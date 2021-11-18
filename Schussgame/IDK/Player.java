import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse PEOPLE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Player extends Movedbyplayer
{
    public int Cooldown =100000001;
    /**
     * Act - tut, was auch immer PEOPLE tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        wasd_Rotate();
        gun();
        upgrade();
    }    
    public void upgrade()
    {
        if(isTouching(Upgrade.class))
        {
            MyWorld.upgrade_level = MyWorld.upgrade_level+1;
            removeTouching(Upgrade.class);
        }
    }
    public void gun()
    {
        if(MyWorld.upgrade_level<100)
        {
            if(Greenfoot.isKeyDown("space") && Cooldown>MyWorld.upgrade_level*-1+200)
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Cooldown = 0;
            }
            else if(!Greenfoot.isKeyDown("space"))
            {
                Cooldown=Cooldown+1;
            }
        }
        else if (MyWorld.upgrade_level<200)
        {
            if(Greenfoot.isKeyDown("space") && Cooldown>MyWorld.upgrade_level*-1+210)
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Cooldown = 0;
            }
            else
            {
                Cooldown=Cooldown+1;
            }
        }
        else
        {
            if(Greenfoot.isKeyDown("space"))
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
            }
        }
    }
}