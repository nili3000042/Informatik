import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Ro.
 * https://www.bing.com/search?q=greenfoot+user+input+with+dialog+box&cvid=e5ef8bf44fe6438c985837a76a4002ad&aqs=edge..69i57.11639j0j4&FORM=ANAB01&DAF0=1&PC=U531
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
            ;
        }
        else if (Planet.PREPARE == 6) /** Situation SB S.41-43 nr.4/6 */
        {
            ;
        }
        else if (Planet.PREPARE == 7) /** Situation SB S.41-43 nr.5 */
        {
            SBS41_43NR5();
        }
        else if (Planet.PREPARE == -1) /** Situation __ */
        {
            ;
        }
    }    
}
