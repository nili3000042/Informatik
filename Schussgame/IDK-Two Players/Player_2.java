import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse PEOPLE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Player_2 extends PC
{
    GreenfootSound Minigun = new GreenfootSound("minigun.mp3");
    public int wait=0;
    public int wait_2=0;
    public void act() 
    {
        wasd_Rotate();
        gun();
        upgrade();
        regen();
        lose_immortality();
        forcefield();
    }    
    public void forcefield()
    {
        if(isTouching(Forcefield_item.class))
        {
            if(!MyWorld.forcefield)
            {
                getWorld().addObject(new Forcefield(), this.getX(), this.getY());
                getWorld().addObject(new Forcefield_timer(), 640, 610);
                MyWorld.forcefield=true;
            }
            MyWorld.forcefield_active = MyWorld.forcefield_active+1000;
            Greenfoot.playSound("upmid.mp3");
            removeTouching(Forcefield_item.class);
        }
    }
    public void lose_immortality()
    {
        if(MyWorld.player_immortal>0)
        {
            MyWorld.player_immortal--;
            if(MyWorld.even(MyWorld.player_immortal)&&wait_2==0)
            {
                setImage(new GreenfootImage("", 50, Color.RED, new Color(0,0,0,0)));
                wait_2=1;
            }
            else if(MyWorld.even(MyWorld.player_immortal))
            {
                wait_2=0;
            }
        }
    }
    public void regen()
    {
        if(isTouching(Heart.class)&&MyWorld.Hearts<10)
        {
            MyWorld.Hearts++;
            Greenfoot.playSound("upmid.mp3");
            removeTouching(Heart.class);
        }
        else if(isTouching(Heart.class))
        {
            getWorld().showText("Max Lives Reached", 640, 360);
            wait=1;
        }
        if(wait>0)
        {
            wait++;
        }
        if(wait>10)
        {
            getWorld().showText("", 640, 360);
            wait=0;
        }
    }
    public void upgrade()
    {
        if(isTouching(Upgrade.class))
        {
            MyWorld.upgrade_level = MyWorld.upgrade_level+1;
            Greenfoot.playSound("upshort.mp3");
            removeTouching(Upgrade.class);
        }
    }
    public void gun()
    {
        if(MyWorld.upgrade_level<20)
        {
            setImage("tanks (R4).png");
            if(Greenfoot.isKeyDown("space") && MyWorld.Cooldown_Gun<MyWorld.upgrade_level)
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.mp3");
                MyWorld.Cooldown_Gun = 300;
            }
            else if(!Greenfoot.isKeyDown("space"))
            {
                MyWorld.Cooldown_Gun=MyWorld.Cooldown_Gun-1;
            }
        }
        else if (MyWorld.upgrade_level<40)
        {
            setImage("tanks (R3).png");
            if(Greenfoot.isKeyDown("space") && MyWorld.Cooldown_Gun<MyWorld.upgrade_level)
            {
                Schuss Peng = new Schuss();
                Peng.setRotation(getRotation());
                this.getWorld().addObject(Peng, this.getX(), this.getY());
                Greenfoot.playSound("lmg_fire01.mp3");
                MyWorld.Cooldown_Gun = 150;
            }
            else
            {
                MyWorld.Cooldown_Gun=MyWorld.Cooldown_Gun-1;
            }
        }
        else
        {
            setImage("tanks (R2).png");
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
