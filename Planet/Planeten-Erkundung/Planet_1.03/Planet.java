import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die einzigen aktiven Akteure in der Roboterwelt sind die Roboter.
 * Die Welt besteht aus 14 * 10 Feldern.
 */

public class Planet extends World
{
    private static int zellenGroesse = 50;
    /*private static String pREPARE = Greenfoot.ask("Please Input Code Coresponding to situation");
    public static int PREPARE = Integer.parseInt(pREPARE);*/
    public static int PREPARE = 12;
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
        else if (a==1) /** Situation SB S.29 nr.9 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),5,5);
            this.addObject(new Gestein(),6,5);
            this.addObject(new Gestein(),5,6);
            this.addObject(new Gestein(),6,6);
        }
        else if (a==2) /** Situation SB S.33 nr.1 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),3,9);
            this.addObject(new Rover(),5,5);
            this.addObject(new Gestein(),5,9);
        }
        else if (a==3) /** Situation SB S.33 nr.2 */
        {
            this.addObject(new Rover(),3,5);
        }
        else if (a==4) /** Situation Aufgabe 1 */
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
        else if (a==5) /** Situation SB S.41-43 nr.1/2 */
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
        else if (a==6) /** Situation SB S.41-43 nr.4/6 */
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
        else if (a==7) /** Situation SB S.41-43 nr.5 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),3,5);
            this.addObject(new Gestein(),4,5);
            this.addObject(new Gestein(),5,5);
            this.addObject(new Gestein(),6,5);
            this.addObject(new Gestein(),7,5);
            this.addObject(new Gestein(),8,5);
        }
        else if (a==8) /** Situation Aufgabe 7.10.2021 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Huegel(),3,6);
            this.addObject(new Huegel(),4,6);
            this.addObject(new Huegel(),5,6);
            this.addObject(new Huegel(),6,6);
            this.addObject(new Huegel(),3,7);
            this.addObject(new Huegel(),4,7);
            this.addObject(new Huegel(),5,7);
            this.addObject(new Huegel(),6,7);
        }
        else if (a==9) /** Situation AB: Übungen zu Bedingungen Aufgabe 1 */
        {
            this.addObject(new Rover(),3,5);
            this.addObject(new Gestein(),4,5);
            this.addObject(new Gestein(),6,5);
            this.addObject(new Gestein(),8,5);
            this.addObject(new Gestein(),9,5);
            this.addObject(new Gestein(),12,5);
            this.addObject(new Gestein(),13,5);
        }
        else if (a==10) /** Situation AB: Übungen zu Bedingungen Aufgabe 2 */
        {
            ;
        }
        else if (a==11) /** Situation AB: Übungen zu Bedingungen Aufgabe 3 */
        {
            ;
        }
        else if (a==12) /** Situation Aufgabe 25.10.2021 */
        {
            addObject(new Rover(),2,2);
            Huegel huegel = new Huegel();
            addObject(huegel,1,1);
            Huegel huegel2 = new Huegel();
            addObject(huegel2,2,1);
            Huegel huegel3 = new Huegel();
            addObject(huegel3,3,1);
            Huegel huegel4 = new Huegel();
            addObject(huegel4,4,1);
            Huegel huegel5 = new Huegel();
            addObject(huegel5,6,1);
            Huegel huegel6 = new Huegel();
            addObject(huegel6,5,1);
            Huegel huegel7 = new Huegel();
            addObject(huegel7,7,1);
            Huegel huegel8 = new Huegel();
            addObject(huegel8,8,1);
            Huegel huegel9 = new Huegel();
            addObject(huegel9,9,1);
            Huegel huegel10 = new Huegel();
            addObject(huegel10,9,2);
            Huegel huegel11 = new Huegel();
            addObject(huegel11,2,3);
            Huegel huegel12 = new Huegel();
            addObject(huegel12,3,3);
            Huegel huegel13 = new Huegel();
            addObject(huegel13,5,3);
            Huegel huegel14 = new Huegel();
            addObject(huegel14,4,3);
            Huegel huegel15 = new Huegel();
            addObject(huegel15,6,3);
            Huegel huegel16 = new Huegel();
            addObject(huegel16,7,3);
            Huegel huegel17 = new Huegel();
            addObject(huegel17,9,3);
            Huegel huegel18 = new Huegel();
            addObject(huegel18,9,4);
            Huegel huegel19 = new Huegel();
            addObject(huegel19,1,2);
            Huegel huegel20 = new Huegel();
            addObject(huegel20,1,3);
            Huegel huegel21 = new Huegel();
            addObject(huegel21,1,4);
            Huegel huegel22 = new Huegel();
            addObject(huegel22,1,5);
            Huegel huegel23 = new Huegel();
            addObject(huegel23,9,5);
            Huegel huegel24 = new Huegel();
            addObject(huegel24,8,5);
            Huegel huegel25 = new Huegel();
            addObject(huegel25,6,5);
            Huegel huegel26 = new Huegel();
            addObject(huegel26,5,5);
            Huegel huegel27 = new Huegel();
            addObject(huegel27,3,5);
            Huegel huegel28 = new Huegel();
            addObject(huegel28,4,5);
            Huegel huegel29 = new Huegel();
            addObject(huegel29,7,5);
            Huegel huegel30 = new Huegel();
            addObject(huegel30,1,6);
            Huegel huegel31 = new Huegel();
            addObject(huegel31,1,7);
            Huegel huegel32 = new Huegel();
            addObject(huegel32,2,7);
            Huegel huegel33 = new Huegel();
            addObject(huegel33,7,6);
            Huegel huegel34 = new Huegel();
            addObject(huegel34,7,7);
            Huegel huegel35 = new Huegel();
            addObject(huegel35,7,8);
            Huegel huegel36 = new Huegel();
            addObject(huegel36,8,8);
            Huegel huegel37 = new Huegel();
            addObject(huegel37,9,8);
            Huegel huegel38 = new Huegel();
            addObject(huegel38,9,9);
            Huegel huegel39 = new Huegel();
            addObject(huegel39,9,10);
            Huegel huegel40 = new Huegel();
            addObject(huegel40,8,10);
            Huegel huegel41 = new Huegel();
            addObject(huegel41,7,10);
            Huegel huegel42 = new Huegel();
            addObject(huegel42,5,10);
            Huegel huegel43 = new Huegel();
            addObject(huegel43,6,10);
            Huegel huegel44 = new Huegel();
            addObject(huegel44,5,9);
            Huegel huegel45 = new Huegel();
            addObject(huegel45,5,8);
            Huegel huegel46 = new Huegel();
            addObject(huegel46,5,7);
            Huegel huegel47 = new Huegel();
            addObject(huegel47,3,7);
            Huegel huegel48 = new Huegel();
            addObject(huegel48,4,7);
            Marke marke = new Marke();
            addObject(marke,8,9);
        } 
        else if (a==-1) /** Situation __ */
        {
            ;
        } 
    }

   public static int getRandomNumber(int start,int end)
   {    /*getRandomNumber(20,30);*/
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
   }
   }