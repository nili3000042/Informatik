import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Movedbyplayer.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Movedbyplayer extends Actor
{
    public void wasd_Rotate()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            this.move(3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            this.move(-3);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            this.turn(-5);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            this.turn(5);
        }
    }
    public void wasd_Grid()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            this.setLocation(this.getX(), this.getY()-3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            this.setLocation(this.getX(), this.getY()+3);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            this.setLocation(this.getX()-3, this.getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            this.setLocation(this.getX()+3, this.getY());
        }
    }
    public void Dragging()
    {
        if(Greenfoot.mouseDragged(this))
        {
            int mx = 10;
            int my = 10;
            while(!Greenfoot.mouseDragEnded(this))
            {
                MouseInfo mouse = Greenfoot.getMouseInfo();
                if(mouse!=null)
                {
                    mx = mouse.getX();
                    my = mouse.getY();
                }
                this.setLocation(mx,my);
            }
        }
    }
}