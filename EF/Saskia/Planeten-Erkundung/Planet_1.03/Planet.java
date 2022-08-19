import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die einzigen aktiven Akteure in der Roboterwelt sind die Roboter.
 * Die Welt besteht aus 14 * 10 Feldern.
 */

public class Planet extends World
{
    private static int zellenGroesse = 50;

    /**
     * Erschaffe eine Welt mit 15 * 12 Zellen.
     */
    public Planet()
    {
        super(16, 12, zellenGroesse);
        setBackground("images/boden.png");
        setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(20); 
        

       
        prepare();
    }

    
    /**
     * Bereite die Welt f�r den Programmstart vor.
     * Das hei�t: Erzeuge die Anfangs-Objekte und f�ge sie der Welt hinzu.
     */
    private void prepare()
    {
        this.addObject(new Rover(), 2,2);
        

        
        
    }
}