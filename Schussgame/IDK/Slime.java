import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Actor
{
    public int normal=0;
    public void act()
    {
        rnd_Move();
        Kill_Player();
    }
    public void Kill_Player()
    {
        if(isTouching(Player.class))
        {
            MyWorld.Hearts=MyWorld.Hearts-1;
            suicide();
        }
    }
    public void rnd_Move()
    {
        if (normal<10)
        {
            this.move(2);
            normal=normal+1;
        }
        else
        {
            setRotation(MyWorld.getRandomNumber(0,360));
            normal=0;
        }
    }
    public void suicide()
    {
        this.getWorld().removeObject(this);
    }
}
