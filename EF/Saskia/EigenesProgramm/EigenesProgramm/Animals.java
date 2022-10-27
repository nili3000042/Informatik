import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Animals.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Animals extends Actor
{
    
    boolean Schussbereit = true;
    /**
     * Act - tut, was auch immer Animals tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        Steuerung();
        Schuss();
    } 
    
    public void Steuerung()
    {
        // Ergänzen Sie Ihren Quelltext hier...
        if(Greenfoot.isKeyDown("w"))
        {
            this.setLocation(this.getX(), this.getY()-9);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            this.setLocation(this.getX(),this.getY()+9);
        }
    }
    
    public void Schuss()
    {
        if(Greenfoot.isKeyDown("space")&& Schussbereit==true)
        {
            Schuss peng = new Schuss();
            this.getWorld().addObject(peng,this.getX(),this.getY());
            Schussbereit=false;
        }
        else if(!Greenfoot.isKeyDown("space"))
        {
            Schussbereit=true;
        }
    }
    
}

