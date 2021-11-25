import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse PEOPLE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Player extends Movedbyplayer
{
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
        if(MyWorld.upgrade_level<20)
        {
            if(Greenfoot.isKeyDown("space") && MyWorld.Cooldown_Gun<MyWorld.upgrade_level)
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                MyWorld.Cooldown_Gun = 300;
            }
            else if(!Greenfoot.isKeyDown("space"))
            {
                MyWorld.Cooldown_Gun=MyWorld.Cooldown_Gun-1;
            }
        }
        else if (MyWorld.upgrade_level<40)
        {
            if(Greenfoot.isKeyDown("space") && MyWorld.Cooldown_Gun<MyWorld.upgrade_level)
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                MyWorld.Cooldown_Gun = 150;
            }
            else
            {
                MyWorld.Cooldown_Gun=MyWorld.Cooldown_Gun-1;
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