import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse PEOPLE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class People extends Actor
{
    /**
     * Act - tut, was auch immer PEOPLE tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
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
}