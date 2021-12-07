import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forcefield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forcefield extends NPC
{
    public int image =0;
    public int kills=0;
    public void act()
    {
        change_image();
        Kill_Slime();
        move();
    }
    public void move()
    {
        this.setLocation(getWorld().getObjects(Player.class).get(0).getX(),getWorld().getObjects(Player.class).get(0).getY());
    }
    public void Kill_Slime()
    {
        if(this.isTouching(Slime.class))
        {
            MyWorld.Slimes--;
            kills++;
            if(kills==2)
            {
                MyWorld.Score++;
                kills=0;
            }
            Greenfoot.playSound("zap14.mp3");
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
    public void change_image()
    {
        if(image==0)
        {
            setImage("SpellBoundemptya1.png");
            image=1;
        }
        else if(image==1)
        {
            setImage("SpellBoundemptya2.png");
            image=2;
        }
        else if(image==2)
        {
            setImage("SpellBoundemptya3.png");
            image=3;
        }
        else if(image==3)
        {
            setImage("SpellBoundemptya2.png");
            image=0;
        }
    }
}
