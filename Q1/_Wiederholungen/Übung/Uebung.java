import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Scanner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Uebung
{
    public void uebung(int pA, int pB, int pC)
    {
        int d = 0;
        while(d<1000)
        {
            if(pA>pB&&pA>pC)
            {
                d = d + pA;
                pC = pC + pA;
                pB = pB + pA;
            }
            else if(pB>pC)
            {
                d = d + pB;
                pC = pC + pB;
                pA = pA + pB;
            }
            else
            {
                d = d + pC;
                pA = pA + pC;
                pB = pB + pC;
            }
        }
        System.out.println("pA: " + pA);
        System.out.println("pB: " + pB);
        System.out.println("pC: " + pC);
        System.out.println("d: " + d);
    }
}
