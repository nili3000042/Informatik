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
    public int wait=0;
    public int wait_2=0;
    public int a=0;
    public int b=0;
    public int c=0;
    public void act()
    {
        rnd_Move();
        Kill_Player();
    }
    public void Kill_Player()
    {
        if(isTouching(Player.class))
        {
            MyWorld.Hearts--;
            MyWorld.Slimes--;
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
        else if(Greenfoot.getRandomNumber(100)>50&&wait_2==0|wait_2==1)
        {
            if(wait==0)
            {
                a= MyWorld.getRandomNumber(0,360);
                b=this.getRotation();
                c=a-b;
                wait=1;
                wait_2=1;
            }
            if(c<0)
            {
                this.turn(-1);
                this.move(1);
                c++;
            }
            else if(c>0)
            {
                this.turn(+1);
                this.move(1);
                c--;
            }
            else
            {
                normal=0;
                wait=0;
                wait_2=0;
            }
        }
        else if(wait_2==0|wait_2==2)
        {
            if(wait==0)
            {
                a=this.getRotation();
                b=this.getRotation();
                c=a-b;
                wait=1;
                wait_2=2;
            }
            if(c<0)
            {
                this.turn(-1);
                this.move(1);
                c++;
            }
            else if(c>0)
            {
                this.turn(+1);
                this.move(1);
                c--;
            }
            else
            {
                normal=0;
                wait=0;
                wait_2=0;
            }
        }
        else
        {
            naormal=0;
        }
    }
    public void suicide()
    {
        this.getWorld().removeObject(this);
    }
}
