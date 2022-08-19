import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Gegner.
 * 
 * @author (Saskia) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Gegner extends Actor
{
    /**
     * Act - tut, was auch immer Gegner tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        this.move(-6);
         if(this.isAtEdge())
        {
            Hintergrund.wolken--;
            Hintergrund.leben--;
            getWorld().removeObject(this);
            
        }
    }    
}