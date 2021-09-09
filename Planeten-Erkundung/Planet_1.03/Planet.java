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
        prepare(3);
    }

    
   /**
     * Bereite die Welt für den Programmstart vor.
     * Das heißt: Erzeuge die Anfangs-Objekte und füge sie der Welt hinzu.
     */
   public void prepare(int a)
   {
        if (a==0) /** Situation 0 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Marke(),6,5);
            this.addObject(new Gestein(),7,5);
            this.addObject(new Huegel(),0,8);
            this.addObject(new Huegel(),1,8);
            this.addObject(new Huegel(),9,5);
            this.addObject(new Huegel(),8,9);
            this.addObject(new Huegel(),2,4);
            int PREPARE = a;
        }
        if (a==1) /** Situation SB S.29 nr.9 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),5,5);
            this.addObject(new Gestein(),6,5);
            this.addObject(new Gestein(),5,6);
            this.addObject(new Gestein(),6,6);
            int PREPARE = a;
        }
        if (a==2) /** Situation SB S.33 nr.1 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),3,9);
            this.addObject(new Rover(),5,5);
            this.addObject(new Gestein(),5,9);
            int PREPARE = a;
        }
        if (a==3) /** Situation SB S.33 nr.2 */
        {
            this.addObject(new Rover(),3,5);
            int PREPARE = a;
        }
   }
   }