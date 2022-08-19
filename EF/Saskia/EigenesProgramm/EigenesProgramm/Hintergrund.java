import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse MyWorld.
 * 
 * @author (Saskia ) 
 * @version (V1)
 */
public class Hintergrund extends World
{
    public static int score =0;
    public static int wolken =0;
    public static int leben =5;
    /**
     * Konstruktor für Objekte der Klasse MyWorld
     * 
     */
    public Hintergrund()
    {    
        // Erstellt eine neue Welt mit 600x400 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(960, 640, 1); 
        this.addObject(new Animals(),100, 400);
        score =0;
        wolken=0;
        leben=5;
    }
    
    public void act()
    {
        this.showText("Score "+score, 100, 100);
        if(wolken< 3)
        {
            this.addObject(new Gegner(), 960, Greenfoot.getRandomNumber(640)); 
            wolken++;
            
        }
        Leben();
    }
    
    public void Leben()
    {
        if(leben==5)
        {
            this.showText("🐑🐑🐑🐑🐑", 100, 130);
        }
        
        else if(leben==4)
        {
            this.showText("🐑🐑🐑🐑", 100, 130);
        }
        
        else if(leben==3)
        {
            this.showText("🐑🐑🐑", 100, 130);
        }
        
        else if(leben==2)
        {
            this.showText("🐑🐑", 100, 130);
        }
        
        else if(leben==1)
        {
            this.showText("🐑", 100, 130);
        }
        
        else if(leben==0)
        {
            this.showText("", 100, 130);
            removeObjects(getObjects(Actor.class));
            
        }
    }
  
}