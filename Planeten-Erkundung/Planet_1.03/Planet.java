import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die einzigen aktiven Akteure in der Roboterwelt sind die Roboter.
 * Die Welt besteht aus 14 * 10 Feldern.
 */

public class Planet extends World
{
    private static int zellenGroesse = 50;
    public static int PREPARE = 6;

   /**
    * Erschaffe eine Welt mit 15 * 12 Zellen.
    */
   public Planet()
   {
        super(16, 12, zellenGroesse);
        setBackground("images/boden.png");
        setPaintOrder(String.class, Rover.class, Marke.class, Gestein.class, Huegel.class);
        Greenfoot.setSpeed(20);
        prepare(PREPARE);
   }
   
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
        }
        if (a==1) /** Situation SB S.29 nr.9 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),5,5);
            this.addObject(new Gestein(),6,5);
            this.addObject(new Gestein(),5,6);
            this.addObject(new Gestein(),6,6);
        }
        if (a==2) /** Situation SB S.33 nr.1 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),3,9);
            this.addObject(new Rover(),5,5);
            this.addObject(new Gestein(),5,9);
        }
        if (a==3) /** Situation SB S.33 nr.2 */
        {
            this.addObject(new Rover(),3,5);
        }
        if (a==4) /** Situation Aufgabe 1 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),3,5);
            this.addObject(new Gestein(),4,5);
            this.addObject(new Gestein(),5,5);
            this.addObject(new Gestein(),6,5);
            this.addObject(new Gestein(),7,5);
            this.addObject(new Gestein(),9,5);
            this.addObject(new Gestein(),10,5);
            this.addObject(new Gestein(),11,5);
        }
        if (a==5) /** Situation SB S.41-43 nr.1/2 */
        {
            this.addObject(new Rover(),6,1);
            this.addObject(new Marke(),5,1);
            this.addObject(new Huegel(),7,2);
            this.addObject(new Huegel(),6,2);
            this.addObject(new Huegel(),5,2);
            this.addObject(new Huegel(),6,3);
            for ( int i=0; i<30; i++)
            {
                int x = getRandomNumber(0,15);
                int y = getRandomNumber(2,11);
                if (getObjectsAt(x, y, null).isEmpty())
                {
                    this.addObject(new Huegel(),x,y);
                }
            }
            for ( int i=0; i<20; i++)
            {
                int x = getRandomNumber(0,15);
                int y = getRandomNumber(2,11);
                if (getObjectsAt(x, y, null).isEmpty())
                {
                    this.addObject(new Gestein(),x,y);
                }
            }
        }
        if (a==6) /** Situation SB S.41-43 nr.4/6 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Huegel(),3,4);
            this.addObject(new Huegel(),4,4);
            this.addObject(new Huegel(),5,4);
            this.addObject(new Huegel(),6,4);
            this.addObject(new Huegel(),7,4);
            this.addObject(new Huegel(),4,6);
            this.addObject(new Huegel(),5,6);
            this.addObject(new Huegel(),6,6);
        }
        if (a==7) /** Situation SB S.41-43 nr.5 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),3,5);
            this.addObject(new Gestein(),4,5);
            this.addObject(new Gestein(),5,5);
            this.addObject(new Gestein(),6,5);
            this.addObject(new Gestein(),7,5);
            this.addObject(new Gestein(),8,5);
        }
   }
   public static int getRandomNumber(int start,int end)
   {    /*getRandomNumber(20,30);*/
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
   }
   }