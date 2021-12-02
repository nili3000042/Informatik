import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse PEOPLE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Player extends PC
{
    GreenfootSound Minigun = new GreenfootSound("minigun.wav");
    public void act() 
    {
        wasd_Rotate();
        gun();
        upgrade();
        regen();
    }    
    public void regen()
    {
        if(isTouching(Heart.class))
        {
            MyWorld.Hearts++;
            Greenfoot.playSound("upmid.wav");
            removeTouching(Heart.class);
        }
    }
    public void upgrade()
    {
        if(isTouching(Upgrade.class))
        {
            MyWorld.upgrade_level = MyWorld.upgrade_level+1;
            Greenfoot.playSound("upshort.wav");
            removeTouching(Upgrade.class);
        }
    }
    public void gun()
    {
        if(MyWorld.upgrade_level<20)
        {
            setImage("tanks (4).png");
            if(Greenfoot.isKeyDown("space") && MyWorld.Cooldown_Gun<MyWorld.upgrade_level)
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.wav");
                MyWorld.Cooldown_Gun = 300;
            }
            else if(!Greenfoot.isKeyDown("space"))
            {
                MyWorld.Cooldown_Gun=MyWorld.Cooldown_Gun-1;
            }
        }
        else if (MyWorld.upgrade_level<40)
        {
            setImage("tanks (3).png");
            if(Greenfoot.isKeyDown("space") && MyWorld.Cooldown_Gun<MyWorld.upgrade_level)
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.wav");
                MyWorld.Cooldown_Gun = 150;
            }
            else
            {
                MyWorld.Cooldown_Gun=MyWorld.Cooldown_Gun-1;
            }
        }
        else
        {
            setImage("tanks (2).png");
            if(Greenfoot.isKeyDown("space"))
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Minigun.playLoop();
            }
            else  if(!Greenfoot.isKeyDown("space"))
            {
                Minigun.stop();
            }
        }
    }
}