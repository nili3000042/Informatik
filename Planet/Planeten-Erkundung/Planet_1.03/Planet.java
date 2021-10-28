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
    public static int PREPARE = 11;
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
            Rover rover = new Rover();
            addObject(rover,2,6);
            Marke marke = new Marke();
            addObject(marke,5,6);
            Marke marke2 = new Marke();
            addObject(marke2,8,6);
            Marke marke3 = new Marke();
            addObject(marke3,11,6);
        }
        else if (a==11) /** Situation AB: Übungen zu Bedingungen Aufgabe 3 */
        {
            Huegel huegel = new Huegel();
            addObject(huegel,1,3);
            Huegel huegel2 = new Huegel();
            addObject(huegel2,2,3);
            Huegel huegel3 = new Huegel();
            addObject(huegel3,0,3);
            Huegel huegel4 = new Huegel();
            addObject(huegel4,0,4);
            Huegel huegel5 = new Huegel();
            addObject(huegel5,3,3);
            Huegel huegel6 = new Huegel();
            addObject(huegel6,4,3);
            Huegel huegel7 = new Huegel();
            addObject(huegel7,5,3);
            Huegel huegel8 = new Huegel();
            addObject(huegel8,6,3);
            Huegel huegel9 = new Huegel();
            addObject(huegel9,7,3);
            Huegel huegel10 = new Huegel();
            addObject(huegel10,8,3);
            Huegel huegel11 = new Huegel();
            addObject(huegel11,9,3);
            Huegel huegel12 = new Huegel();
            addObject(huegel12,10,3);
            Huegel huegel13 = new Huegel();
            addObject(huegel13,11,3);
            Huegel huegel14 = new Huegel();
            addObject(huegel14,12,3);
            Huegel huegel15 = new Huegel();
            addObject(huegel15,13,3);
            Huegel huegel16 = new Huegel();
            addObject(huegel16,1,4);
            Huegel huegel17 = new Huegel();
            addObject(huegel17,14,3);
            Huegel huegel18 = new Huegel();
            addObject(huegel18,14,4);
            Huegel huegel19 = new Huegel();
            addObject(huegel19,15,4);
            Huegel huegel20 = new Huegel();
            addObject(huegel20,15,3);
            Huegel huegel21 = new Huegel();
            addObject(huegel21,0,2);
            Huegel huegel22 = new Huegel();
            addObject(huegel22,1,2);
            Huegel huegel23 = new Huegel();
            addObject(huegel23,2,2);
            Huegel huegel24 = new Huegel();
            addObject(huegel24,3,2);
            Huegel huegel25 = new Huegel();
            addObject(huegel25,4,2);
            Huegel huegel26 = new Huegel();
            addObject(huegel26,5,2);
            Huegel huegel27 = new Huegel();
            addObject(huegel27,6,2);
            Huegel huegel28 = new Huegel();
            addObject(huegel28,7,2);
            Huegel huegel29 = new Huegel();
            addObject(huegel29,8,2);
            Huegel huegel30 = new Huegel();
            addObject(huegel30,9,2);
            Huegel huegel31 = new Huegel();
            addObject(huegel31,10,2);
            Huegel huegel32 = new Huegel();
            addObject(huegel32,11,2);
            Huegel huegel33 = new Huegel();
            addObject(huegel33,12,2);
            Huegel huegel34 = new Huegel();
            addObject(huegel34,13,2);
            Huegel huegel35 = new Huegel();
            addObject(huegel35,14,2);
            Huegel huegel36 = new Huegel();
            addObject(huegel36,15,2);
            Huegel huegel37 = new Huegel();
            addObject(huegel37,13,5);
            Huegel huegel38 = new Huegel();
            addObject(huegel38,13,6);
            Huegel huegel39 = new Huegel();
            addObject(huegel39,14,6);
            Huegel huegel40 = new Huegel();
            addObject(huegel40,14,5);
            Huegel huegel41 = new Huegel();
            addObject(huegel41,15,5);
            Huegel huegel42 = new Huegel();
            addObject(huegel42,15,7);
            Huegel huegel43 = new Huegel();
            addObject(huegel43,15,6);
            Huegel huegel44 = new Huegel();
            addObject(huegel44,14,7);
            Huegel huegel45 = new Huegel();
            addObject(huegel45,13,7);
            Huegel huegel46 = new Huegel();
            addObject(huegel46,12,7);
            Huegel huegel47 = new Huegel();
            addObject(huegel47,11,7);
            Huegel huegel48 = new Huegel();
            addObject(huegel48,11,6);
            Huegel huegel49 = new Huegel();
            addObject(huegel49,10,6);
            Huegel huegel50 = new Huegel();
            addObject(huegel50,9,6);
            Huegel huegel51 = new Huegel();
            addObject(huegel51,10,7);
            Huegel huegel52 = new Huegel();
            addObject(huegel52,9,7);
            Huegel huegel53 = new Huegel();
            addObject(huegel53,8,7);
            Huegel huegel54 = new Huegel();
            addObject(huegel54,6,7);
            Huegel huegel55 = new Huegel();
            addObject(huegel55,1,7);
            Huegel huegel56 = new Huegel();
            addObject(huegel56,0,7);
            Huegel huegel57 = new Huegel();
            addObject(huegel57,2,7);
            Huegel huegel58 = new Huegel();
            addObject(huegel58,3,7);
            Huegel huegel59 = new Huegel();
            addObject(huegel59,4,7);
            Huegel huegel60 = new Huegel();
            addObject(huegel60,5,7);
            Huegel huegel61 = new Huegel();
            addObject(huegel61,7,7);
            Huegel huegel62 = new Huegel();
            addObject(huegel62,8,6);
            Huegel huegel63 = new Huegel();
            addObject(huegel63,7,6);
            Huegel huegel64 = new Huegel();
            addObject(huegel64,6,6);
            Huegel huegel65 = new Huegel();
            addObject(huegel65,5,6);
            Huegel huegel66 = new Huegel();
            addObject(huegel66,4,6);
            Huegel huegel67 = new Huegel();
            addObject(huegel67,3,6);
            Huegel huegel68 = new Huegel();
            addObject(huegel68,2,6);
            Huegel huegel69 = new Huegel();
            addObject(huegel69,1,6);
            Huegel huegel70 = new Huegel();
            addObject(huegel70,0,6);
            Huegel huegel71 = new Huegel();
            addObject(huegel71,0,5);
            Huegel huegel72 = new Huegel();
            addObject(huegel72,1,5);
            Huegel huegel73 = new Huegel();
            addObject(huegel73,2,5);
            Huegel huegel74 = new Huegel();
            addObject(huegel74,3,5);
            Huegel huegel75 = new Huegel();
            addObject(huegel75,4,5);
            Huegel huegel76 = new Huegel();
            addObject(huegel76,5,5);
            Huegel huegel77 = new Huegel();
            addObject(huegel77,7,5);
            Huegel huegel78 = new Huegel();
            addObject(huegel78,8,5);
            Huegel huegel79 = new Huegel();
            addObject(huegel79,10,5);
            Huegel huegel80 = new Huegel();
            addObject(huegel80,11,5);
            Marke marke = new Marke();
            addObject(marke,12,6);
            Rover rover = new Rover();
            addObject(rover,2,4);
        }
        else if (a==12) /** Situation Aufgabe 25.10.2021 */
        {
            String Hard = "y";
            if (Hard == "n")
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
            if (Hard == "y")
            {
                Huegel huegel = new Huegel();
                addObject(huegel,0,1);
                Huegel huegel2 = new Huegel();
                addObject(huegel2,1,1);
                Huegel huegel3 = new Huegel();
                addObject(huegel3,2,1);
                Huegel huegel4 = new Huegel();
                addObject(huegel4,0,2);
                Huegel huegel5 = new Huegel();
                addObject(huegel5,0,3);
                Huegel huegel6 = new Huegel();
                addObject(huegel6,0,5);
                Huegel huegel7 = new Huegel();
                addObject(huegel7,0,4);
                Huegel huegel8 = new Huegel();
                addObject(huegel8,1,5);
                Huegel huegel9 = new Huegel();
                addObject(huegel9,2,5);
                Huegel huegel10 = new Huegel();
                addObject(huegel10,2,4);
                Huegel huegel11 = new Huegel();
                addObject(huegel11,2,3);
                Huegel huegel12 = new Huegel();
                addObject(huegel12,4,4);
                Huegel huegel13 = new Huegel();
                addObject(huegel13,4,3);
                Huegel huegel14 = new Huegel();
                addObject(huegel14,4,1);
                Huegel huegel15 = new Huegel();
                addObject(huegel15,4,2);
                Huegel huegel16 = new Huegel();
                addObject(huegel16,3,1);
                Huegel huegel17 = new Huegel();
                addObject(huegel17,3,5);
                Huegel huegel18 = new Huegel();
                addObject(huegel18,4,5);
                removeObject(huegel17);
                Huegel huegel117 = new Huegel();
                addObject(huegel17,4,6);
                Huegel huegel19 = new Huegel();
                addObject(huegel19,4,7);
                Huegel huegel20 = new Huegel();
                addObject(huegel20,3,7);
                Huegel huegel21 = new Huegel();
                addObject(huegel21,2,7);
                Huegel huegel22 = new Huegel();
                addObject(huegel22,1,7);
                Huegel huegel23 = new Huegel();
                addObject(huegel23,1,8);
                Huegel huegel24 = new Huegel();
                addObject(huegel24,1,9);
                Huegel huegel25 = new Huegel();
                addObject(huegel25,1,9);
                Huegel huegel26 = new Huegel();
                addObject(huegel26,2,9);
                Huegel huegel27 = new Huegel();
                addObject(huegel27,3,9);
                Huegel huegel28 = new Huegel();
                addObject(huegel28,4,9);
                Huegel huegel29 = new Huegel();
                addObject(huegel29,0,11);
                Huegel huegel30 = new Huegel();
                addObject(huegel30,2,11);
                Huegel huegel31 = new Huegel();
                addObject(huegel31,1,11);
                Huegel huegel32 = new Huegel();
                addObject(huegel32,3,11);
                Huegel huegel33 = new Huegel();
                addObject(huegel33,4,11);
                Huegel huegel34 = new Huegel();
                addObject(huegel34,5,11);
                Huegel huegel35 = new Huegel();
                addObject(huegel35,6,11);
                Huegel huegel36 = new Huegel();
                addObject(huegel36,6,10);
                Huegel huegel37 = new Huegel();
                addObject(huegel37,6,9);
                Huegel huegel38 = new Huegel();
                addObject(huegel38,6,8);
                Huegel huegel39 = new Huegel();
                addObject(huegel39,4,8);
                Huegel huegel40 = new Huegel();
                addObject(huegel40,6,7);
                Huegel huegel41 = new Huegel();
                addObject(huegel41,7,7);
                Huegel huegel42 = new Huegel();
                addObject(huegel42,8,7);
                Huegel huegel43 = new Huegel();
                addObject(huegel43,9,7);
                Huegel huegel44 = new Huegel();
                addObject(huegel44,6,5);
                Huegel huegel45 = new Huegel();
                addObject(huegel45,5,5);
                Huegel huegel46 = new Huegel();
                addObject(huegel46,7,5);
                Huegel huegel47 = new Huegel();
                addObject(huegel47,8,5);
                Huegel huegel48 = new Huegel();
                addObject(huegel48,9,5);
                Huegel huegel49 = new Huegel();
                addObject(huegel49,10,5);
                Huegel huegel50 = new Huegel();
                addObject(huegel50,11,6);
                Huegel huegel51 = new Huegel();
                addObject(huegel51,10,9);
                Huegel huegel52 = new Huegel();
                addObject(huegel52,11,8);
                Huegel huegel53 = new Huegel();
                addObject(huegel53,7,11);
                Huegel huegel54 = new Huegel();
                addObject(huegel54,14,11);
                Huegel huegel55 = new Huegel();
                addObject(huegel55,15,10);
                Huegel huegel56 = new Huegel();
                addObject(huegel56,15,5);
                Huegel huegel57 = new Huegel();
                addObject(huegel57,14,4);
                Huegel huegel58 = new Huegel();
                addObject(huegel58,12,4);
                Huegel huegel59 = new Huegel();
                addObject(huegel59,11,3);
                Huegel huegel60 = new Huegel();
                addObject(huegel60,5,0);
                Huegel huegel61 = new Huegel();
                addObject(huegel61,14,0);
                Huegel huegel62 = new Huegel();
                addObject(huegel62,15,1);
                Huegel huegel63 = new Huegel();
                addObject(huegel63,15,2);
                Huegel huegel64 = new Huegel();
                addObject(huegel64,14,3);
                Huegel huegel65 = new Huegel();
                addObject(huegel65,7,3);
                Huegel huegel66 = new Huegel();
                addObject(huegel66,6,2);
                Marke marke = new Marke();
                addObject(marke,7,0);
                Huegel huegel67 = new Huegel();
                addObject(huegel67,6,0);
                Huegel huegel68 = new Huegel();
                addObject(huegel68,8,0);
                Huegel huegel69 = new Huegel();
                addObject(huegel69,9,0);
                Huegel huegel70 = new Huegel();
                addObject(huegel70,10,0);
                Huegel huegel71 = new Huegel();
                addObject(huegel71,11,0);
                Huegel huegel72 = new Huegel();
                addObject(huegel72,12,0);
                Huegel huegel73 = new Huegel();
                addObject(huegel73,13,0);
                Huegel huegel74 = new Huegel();
                addObject(huegel74,11,7);
                Huegel huegel75 = new Huegel();
                addObject(huegel75,11,5);
                removeObject(huegel75);
                Huegel huegel175 = new Huegel();
                addObject(huegel75,9,9);
                Huegel huegel76 = new Huegel();
                addObject(huegel76,8,9);
                Huegel huegel77 = new Huegel();
                addObject(huegel77,8,11);
                Huegel huegel78 = new Huegel();
                addObject(huegel78,9,11);
                Huegel huegel79 = new Huegel();
                addObject(huegel79,11,11);
                Huegel huegel80 = new Huegel();
                addObject(huegel80,12,11);
                Huegel huegel81 = new Huegel();
                addObject(huegel81,13,11);
                Huegel huegel82 = new Huegel();
                addObject(huegel82,10,11);
                Huegel huegel83 = new Huegel();
                addObject(huegel83,11,9);
                Huegel huegel84 = new Huegel();
                addObject(huegel84,13,9);
                Huegel huegel85 = new Huegel();
                addObject(huegel85,12,9);
                huegel55.setLocation(15,10);
                Huegel huegel86 = new Huegel();
                addObject(huegel86,15,10);
                Huegel huegel87 = new Huegel();
                addObject(huegel87,15,11);
                Huegel huegel88 = new Huegel();
                addObject(huegel88,15,9);
                Huegel huegel89 = new Huegel();
                addObject(huegel89,15,8);
                Huegel huegel90 = new Huegel();
                addObject(huegel90,15,7);
                Huegel huegel91 = new Huegel();
                addObject(huegel91,15,6);
                Huegel huegel92 = new Huegel();
                addObject(huegel92,13,8);
                Huegel huegel93 = new Huegel();
                addObject(huegel93,13,7);
                Huegel huegel94 = new Huegel();
                addObject(huegel94,13,6);
                Huegel huegel95 = new Huegel();
                addObject(huegel95,13,4);
                Huegel huegel96 = new Huegel();
                addObject(huegel96,15,4);
                Huegel huegel97 = new Huegel();
                addObject(huegel97,10,3);
                Huegel huegel98 = new Huegel();
                addObject(huegel98,9,3);
                Huegel huegel99 = new Huegel();
                addObject(huegel99,8,3);
                Huegel huegel100 = new Huegel();
                addObject(huegel100,6,3);
                Huegel huegel101 = new Huegel();
                addObject(huegel101,15,3);
                Huegel huegel102 = new Huegel();
                addObject(huegel102,13,3);
                Huegel huegel103 = new Huegel();
                addObject(huegel103,12,3);
                Huegel huegel104 = new Huegel();
                addObject(huegel104,15,0);
                Huegel huegel105 = new Huegel();
                addObject(huegel105,12,8);
                Huegel huegel106 = new Huegel();
                addObject(huegel106,12,7);
                Huegel huegel107 = new Huegel();
                addObject(huegel107,12,6);
                Huegel huegel108 = new Huegel();
                addObject(huegel108,3,8);
                Huegel huegel109 = new Huegel();
                addObject(huegel109,2,8);
                Huegel huegel110 = new Huegel();
                addObject(huegel110,4,0);
                Huegel huegel111 = new Huegel();
                addObject(huegel111,3,0);
                Huegel huegel112 = new Huegel();
                addObject(huegel112,2,0);
                Huegel huegel113 = new Huegel();
                addObject(huegel113,1,0);
                Huegel huegel114 = new Huegel();
                addObject(huegel114,0,0);
                Rover rover = new Rover();
                addObject(rover,1,4);
                removeObject(huegel25);
                removeObject(huegel24);
                removeObject(huegel23);
                removeObject(huegel22);
                addObject(huegel22,0,6);
                addObject(huegel23,0,7);
                addObject(huegel24,0,8);
                addObject(huegel25,0,9);
                Huegel huegel115 = new Huegel();
                addObject(huegel115,0,10);
                removeObject(marke);
                addObject(marke,7,2);
                Huegel huegel116 = new Huegel();
                addObject(huegel116,7,0);
            }
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