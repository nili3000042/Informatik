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
        if(Greenfoot.isKeyDown("space") && Cooldown>5)
        {
            Schuss Peng = new Schuss();
            Peng.setRotation(getRotation());
            this.getWorld().addObject(Peng, this.getX(), this.getY());
            Cooldown = 1;
        }
        Cooldown=Cooldown+1;
    }    
}