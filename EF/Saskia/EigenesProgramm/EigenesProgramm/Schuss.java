import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Schuss.
 * 
 * @author (Saskia) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schuss extends Actor
{
    /**
     * Act - tut, was auch immer Schuss tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        Shoot();
        
    }  
    
    public void Shoot()
    {
        move(15);
        
        if(this.isTouching(Gegner.class))
        {
            this.removeTouching(Gegner.class);
            Hintergrund.score= Hintergrund.score+10;
            Hintergrund.wolken=Hintergrund.wolken-1;
            getWorld().removeObject(this);
        }
        
       else if(this.isAtEdge())
        {
            getWorld().removeObject(this);
        }
       
        
    }
    
    
}