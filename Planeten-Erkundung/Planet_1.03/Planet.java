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
        this.addObject(new Rover(),3,5);
        this.addObject(new Marke(),6,5);
        this.addObject(new Huegel(),0,8);
        this.addObject(new Huegel(),1,8);
        this.addObject(new Huegel(),9,5);
        this.addObject(new Huegel(),8,9);
        this.addObject(new Huegel(),2,4);
        prepare();
    }

    
    /**
     * Bereite die Welt für den Programmstart vor.
     * Das heißt: Erzeuge die Anfangs-Objekte und füge sie der Welt hinzu.
     */
    private void prepare()
    {
    }
}