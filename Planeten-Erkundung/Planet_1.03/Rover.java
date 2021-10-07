import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Ro.
 * 
 * @nili3000042 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Rover extends Rover_Aufgaben
{
    public void act() 
    {
        if (Planet.PREPARE == 0) /** Situation 0 */
        {
            if (huegelVorhanden("vorne"))
            {
                drehe("rechts");
                fahre();
            }
            else
            {
                fahre();
            }
        }
        else if (Planet.PREPARE == 1) /** Situation SB S.29 nr.9 */
        {
            SBS29NR9_1();
        }
        else if (Planet.PREPARE == 2) /** Situation SB S.33 nr.1 */
        {
            SBS33NR1();
        }
        else if (Planet.PREPARE == 3) /** Situation SB S.33 nr.2 */
        {
            SBS33NR2();
        }
        else if (Planet.PREPARE == 4) /** Situation Aufgabe 1 */
        {
            Aufgabe_1();
        }
        else if (Planet.PREPARE == 5) /** Situation SB S.41-43 nr.1/2 */
        {
            String input = Greenfoot.ask("Situation SB S.41-43 nr.1/2");
            int inputINT = Integer.parseInt(input);
            if (inputINT == 1)
            {
                SBS41_43NR1();
            }
            else if (inputINT == 2)
            {
                SBS41_43NR2();
            }
        }
        else if (Planet.PREPARE == 6) /** Situation SB S.41-43 nr.4/6 */
        {
            String input = Greenfoot.ask("Situation SB S.41-43 nr.4/6");
            int inputINT = Integer.parseInt(input);
            if (inputINT == 4)
            {
                SBS41_43NR4("a");
                /*Greenfoot.ask("Situation SB S.41-43 nr.4 a/b/c")*/
            }
            else if (inputINT == 6)
            {
                SBS41_43NR6();
            }
        }
        else if (Planet.PREPARE == 7) /** Situation SB S.41-43 nr.5 */
        {
            SBS41_43NR5();
        }
        else if (Planet.PREPARE == 8) /** Situation Aufgabe 7.10.2021 */
        {
            int zaehler = 0;
            while (zaehler<4)
            {
                while (huegelVorhanden("rechts"))
                {
                    fahre();
                }
                drehe("rechts");
                fahre();
                zaehler ++;
            }
        }
        else if (Planet.PREPARE == -1) /** Situation __ */
        {
            ;
        }
    }    
}
